package mechero.lab2_franciscoalvarez;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "userId",
        childColumns = "userId"))

public class Form {
    @NonNull
    @PrimaryKey (autoGenerate = true)
    private int pollId;
    private int userId;
    private String name;
    private String date;
    private String category;
    private String comment;

    public Form() {}

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getPollId() { return pollId; }
    public void setPollId(int pollId) { this.pollId = pollId; }
    public String getDate() { return date; }
    public void setDate (String date) { this.date = date; }
    public String getCategory() { return category; }
    public void setCategory (String category) { this.category = category; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
