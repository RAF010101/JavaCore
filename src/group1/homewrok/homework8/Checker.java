package group1.homewrok.homework8;

public class Checker {
    Stack stack = new Stack();

    String text;

    Checker(String text1) {
        text = text1;
    }

    void check() {
        char c;
        char lastsimvole;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);

            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    lastsimvole = stack.pop();
                    if (lastsimvole != '(') {
                        System.out.println(" Error " + i + " open " + lastsimvole + " but closed " + c);
                    } else {
                        System.out.println("True");
                    }
                    break;
                case '}':
                    lastsimvole = stack.pop();
                    if (lastsimvole != '{') {
                        System.out.println(" Error " + i + " open " + lastsimvole + "but closed " + c);
                    } else {
                        System.out.println("True");
                    }
                    break;
                case ']':
                    lastsimvole = stack.pop();
                    if (lastsimvole != '[') {
                        System.out.println("Error " + i + " open " + lastsimvole + " but closed " + c);
                    } else {
                        System.out.println("True");
                    }
                    break;
            }
        }
    }

}

