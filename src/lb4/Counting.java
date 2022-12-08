package lb4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counting {

    public void ReadFile(String fileName) {
        try {
            String path = new File("src/lb4/" + fileName).getAbsolutePath();
            File file = new File(path);
            FileReader frd = new FileReader(file);
            BufferedReader reader = new BufferedReader(frd);
            String line = reader.readLine();
            while (line != null) {
                findArithmeticExpression(line);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findArithmeticExpression(String line) {
        int firstParth = 0;
        int secondParth = 0;
        int result = 0;
        Pattern ptn = Pattern.compile("(\\d+)([-+*/])(\\d*)");
        Matcher matcher = ptn.matcher(line);
        String operation;
        while (matcher.find()) {
            firstParth = Integer.parseInt(matcher.group(1));
            secondParth = Integer.parseInt(matcher.group(3));
            operation = matcher.group(2);
            switch (operation) {
                case "+":
                    result = firstParth + secondParth;
                    break;
                case "-":
                    result = firstParth - secondParth;
                    break;
                case "*":
                    result = firstParth * secondParth;
                    break;
                case "/":
                    if (secondParth != 0) {
                        result = firstParth / secondParth;
                        break;
                    }
                    else {
                        System.out.println(firstParth + operation + secondParth + ": Error!!!!!!!!");
                        continue;
                    }
            }
            System.out.println(firstParth + operation + secondParth + " = " + result);
        }
    }
}
