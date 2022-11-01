package com.ivan_kauchuha.todoapp;

import com.ivan_kauchuha.todoapp.datamodel.TodoData;
import com.ivan_kauchuha.todoapp.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(new TodoItem(shortDescription, details, deadlineValue));
        return newItem;
    }

    public void modifyItemDetails(TodoItem item) {
        item.setShortDescription(shortDescriptionField.getText());
        item.setDetails(detailsArea.getText());
        item.setDeadline(deadlinePicker.getValue());
    }

    public void containItemDetails(TodoItem item) {
        shortDescriptionField.setText(item.getShortDescription());
        detailsArea.setText(item.getDetails());
        deadlinePicker.setValue(item.getDeadline());
    }
}
