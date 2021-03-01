package gr.unipi.client.entity;

import java.util.Objects;

public class Input {
  private String text;
  private String trigger_word;

  public Input() {
  }

  public Input(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTrigger_word() {
    return trigger_word;
  }

  public void setTrigger_word(String trigger_word) {
    this.trigger_word = trigger_word;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Input)) {
      return false;
    }

    Input other = (Input) obj;

    return Objects.equals(other.text, this.text) && Objects.equals(other.trigger_word, this.trigger_word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.text, this.trigger_word);
  }

}
