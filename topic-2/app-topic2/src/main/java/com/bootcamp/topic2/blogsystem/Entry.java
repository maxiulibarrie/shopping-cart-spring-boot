package com.bootcamp.topic2.blogsystem;

import java.time.LocalDateTime;
import java.util.Objects;

public class Entry {
  private String title;
  private String topic;
  private String body;
  private LocalDateTime datetime;

  public Entry(String title, String topic, String body) {
    this.title = title;
    this.topic = topic;
    this.body = body;
    this.datetime = LocalDateTime.now();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public LocalDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDateTime datetime) {
    this.datetime = datetime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entry entry = (Entry) o;
    return title.equals(entry.title) &&
        topic.equals(entry.topic) &&
        body.equals(entry.body) &&
        datetime.equals(entry.datetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, topic, body, datetime);
  }

  @Override
  public String toString() {
    return "Entry{" +
        "title='" + title + '\'' +
        ", topic='" + topic + '\'' +
        ", body='" + body + '\'' +
        ", datetime=" + datetime +
        '}';
  }
}
