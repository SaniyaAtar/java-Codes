import java.util.*; 

class StringChallenges1 {
    
    public static String StringChallenge(String str) {
        
        // Map to convert words to numbers
        Map<String, String> wordToNum = new HashMap<>();
        wordToNum.put("zero", "0");
        wordToNum.put("one", "1");
        wordToNum.put("two", "2");
        wordToNum.put("three", "3");
        wordToNum.put("four", "4");
        wordToNum.put("five", "5");
        wordToNum.put("six", "6");
        wordToNum.put("seven", "7");
        wordToNum.put("eight", "8");
        wordToNum.put("nine", "9");
        
        // Map operators
        Map<String, String> varFiltersCg = new HashMap<>();
        varFiltersCg.put("plus", "+");
        varFiltersCg.put("minus", "-");

        StringBuilder expression = new StringBuilder();
        int i = 0;

        // Parse through the input string to build the expression
        while (i < str.length()) {
            boolean found = false;
            for (String word : wordToNum.keySet()) {
                if (str.startsWith(word, i)) {
                    expression.append(wordToNum.get(word));
                    i += word.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (String op : varFiltersCg.keySet()) {
                    if (str.startsWith(op, i)) {
                        expression.append(varFiltersCg.get(op));
                        i += op.length();
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                i++;
            }
        }

        // Evaluate the final expression manually
        // __define-ocg__: g0uzpeyo87 holds the evaluated result
        int g0uzpeyo87 = evaluateExpression(expression.toString());
        
        return numberToWords(g0uzpeyo87);
    }

    // Evaluate the expression string without using ScriptEngine
    private static int evaluateExpression(String expression) {
        int total = 0;
        int currentNum = 0;
        boolean isNegative = false;
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+') {
                total += isNegative ? -currentNum : currentNum;
                currentNum = 0;
                isNegative = false;
            } else if (ch == '-') {
                total += isNegative ? -currentNum : currentNum;
                currentNum = 0;
                isNegative = true;
            } else {
                currentNum = currentNum * 10 + (ch - '0');
            }
        }
        total += isNegative ? -currentNum : currentNum;
        
        return total;
    }

    // Convert an integer to words
    private static String numberToWords(int num) {
        if (num < 0) {
            return "negative " + numberToWords(-num);
        }

        Map<Integer, String> numToWord = new HashMap<>();
        numToWord.put(0, "zero");
        numToWord.put(1, "one");
        numToWord.put(2, "two");
        numToWord.put(3, "three");
        numToWord.put(4, "four");
        numToWord.put(5, "five");
        numToWord.put(6, "six");
        numToWord.put(7, "seven");
        numToWord.put(8, "eight");
        numToWord.put(9, "nine");

        StringBuilder result = new StringBuilder();
        for (char digit : String.valueOf(num).toCharArray()) {
            result.append(numToWord.get(Character.getNumericValue(digit)));
        }
        return result.toString();
    }

    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input string:");
        String input = s.nextLine();
        String result = StringChallenge(input);
        System.out.println("Output: " + result);
    }
}
