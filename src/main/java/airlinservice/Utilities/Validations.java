package airlinservice.Utilities;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Pattern;

public class Validations {

    //validations for ID TextField
    public static boolean IdNotEmpty(TextField idTextField){
        if(idTextField.getText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean idLength(TextField idTextField){
        if(idTextField.getText().length() == 13){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean idNumberValid(TextField idTextField){
        Pattern pattern = Pattern.compile(".*^([0-9]){2}([0-1][0-9])([0-3][0-9])([0-9]){4}([0-1])([0-9]){2}?.*");
        if(pattern.matcher(idTextField.getText()).matches()){
            return true;
        }
        else {
            return false;
        }
    }

    //validate personal details is empty
    public static boolean isNameEmpty(TextField nameTextField){
        if(nameTextField.getText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isSurnameEmpty(TextField surnameTextField){
        if(surnameTextField.getText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isCellNumEmpty(TextField cellNumTextField){
        if(cellNumTextField.getText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEmailEmpty(TextField emailTextField){
        if(emailTextField.getText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isGennderEmpty(ComboBox gender){
        if(gender.getSelectionModel().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    //validation of personal details
    public static boolean nameStartsWithCapital(TextField nameTextField){
        Pattern pattern = Pattern.compile(".*^[A_Z]*.");
        if(pattern.matcher(nameTextField.getText(0, 1)).matches()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean surnameStartsWithCapital(TextField surnameTextField){
        Pattern pattern = Pattern.compile(".*^[A_Z]*.");
        if(pattern.matcher(surnameTextField.getText(0, 1)).matches()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean cellNumLength(TextField cellNumTextField){
        if(cellNumTextField.getText().length() == 10){
            return true;
        }
        else{
            return true;
        }
    }

    public static boolean cellNumValid(TextField cellTextField){
        Pattern pattern = Pattern.compile(".*[0](\\d{9})|([0](\\d{2})( |-)((\\d{3}))( |-)(\\d{4}))|[0](\\d{2})( |-)(\\d{7})*.");

        if (pattern.matcher(cellTextField.getText()).matches()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEmailValid(TextField emailTextField){
        try{
            InternetAddress email = new InternetAddress(emailTextField.getText());
            email.validate();
            return true;
        }
        catch (AddressException e){
            e.printStackTrace();
            return false;
        }
    }

}
