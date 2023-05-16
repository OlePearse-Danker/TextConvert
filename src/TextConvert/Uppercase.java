package TextConvert;

public class Uppercase extends TextConverter{
    @Override
    public String convert(String eingabe) {
        return eingabe.toUpperCase();
    }
}
