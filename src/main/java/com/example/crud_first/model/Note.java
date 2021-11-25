package com.example.crud_first.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "notes")//đánh dấu class này sẽ mapping vs bảng trong CSDL, bảng này có tên là Task
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Note implements Serializable {
    @Id// đánh dấu trường sẽ là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)// giá trị sẽ tự sinh ra
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Object getId() {
        return this.id;
    }
    public void setId(Object id) {
        this.title= (String) id;
    }
    public Object getContent() {
        return this.content;
    }

    public Object getTitle() {
        return this.title;
    }

    public void setTitle(Object title) {
        this.title= (String) title;
    }

    public void setContent(Object content) {
        this.content= (String) content;
    }

    public Object getCreatedAt() {
        return this.createdAt;
    }
    public void setCreatedAt(Object createdAt) {
        this.createdAt= (Date) createdAt;
    }
    public Object getUpdatedAt() {
        return this.updatedAt;
    }
    public void setupdatedAt(Object updatedAt) {
        this.updatedAt= (Date) updatedAt;
    }
    // Getters and Setters ... (Omitted for brevity)
}
