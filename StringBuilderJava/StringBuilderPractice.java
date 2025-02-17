package StringBuilderJava;

public class StringBuilderPractice
{
    public static void main(String[] args) {
        // for adding a word in a existing String by creating a new String
        String line = "Hello I am Mishra";
        StringBuilder sbnew = new StringBuilder(line);
        sbnew.insert(line.indexOf("Mishra"),"Ujjwal ");
        System.out.println(sbnew);
        StringBuilder name = new StringBuilder("Ujjwal Mishra");
        // to print name
        System.out.println(name);
        // get a char from an index
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(8));
        // set character
        name.setCharAt(0,'H');
        System.out.println(name);
        name.setCharAt(0,'U');
        System.out.println(name);

        StringBuilder newname = new StringBuilder("Tony");
        // insert character at some index
        newname.insert(1,'S');
        System.out.println(newname);
        // delete character from string
        newname.delete(0,1);
        name.delete(3,8);
        System.out.println(newname);
        System.out.println(name);
        // Append character [ it means to add char at the end ]
        newname.append(" Stark");
        System.out.println(newname);
        // printing length of string
        System.out.println(newname.length());
        // delete char experiment
        StringBuilder newname1 = new StringBuilder("Tony");
        newname1.delete(2,6);
        System.out.println(newname1);
        newname1.delete(0,1);
        System.out.println(newname1);
    }
}
