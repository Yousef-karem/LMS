package net.java.lms_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.java.lms_backend.entity.Instructor;
import net.java.lms_backend.entity.Lesson;
import net.java.lms_backend.entity.MediaFiles;
import net.java.lms_backend.entity.User;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coursedto {
    private Long id;
    private String title;
    private String description;
    private String duration;
    private Long instructorId;
    private User user;
    private Long userId;
    private Instructor instructor;
    private List<Lesson> lessons;
    private List<Long> lessonIds;
    private List<MediaFiles> mediaFiles;



    public Coursedto(long id, String title, String description, String duration, List<MediaFiles> mediaFiles, Long userid ,Long instructorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.mediaFiles = mediaFiles;
        this.userId = userid;
        this.instructorId = instructorId;
    }

    public Coursedto(long id, String title, String description, String duration, List<MediaFiles> mediaFiles, Long id1, Long id2, List<Long> lessonIds) {
    }


    public User getUser() {
        return user;
    }
    public Instructor getInstructor() {
        return instructor;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public List<MediaFiles> getMediaFiles() {
        return mediaFiles;
    }

    public String getDuration() {
        return duration;
    }

    public Long getInstructorId() {
        return instructorId;
    }

    public Long getUserId() {
        return userId;
    }
}
