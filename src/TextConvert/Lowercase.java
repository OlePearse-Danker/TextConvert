package TextConvert;

public class Lowercase extends TextConverter{

    @Override
    public String convert(String eingabe) {
        return eingabe.toLowerCase();
    }
}
