import java.util.Arrays;

public class varArg {
    public static void main(String[] args) {
      VarArgs(1,2,5,5,8,52,4,5); // i can add as much values i want
    }
    static void VarArgs(int ...v ){ // this three dots in method arguments known as variables  arguments it uses when we don't know the input values
        System.out.println(Arrays.toString(v));

    }
}
