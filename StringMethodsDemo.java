public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("Original: " + name);

        // Basic string properties and casing
        System.out.println("Length: " + name.length());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Uppercase: " + name.toUpperCase());

        // Trimming whitespace
        String nonTrimmed = "      harry      ";
        System.out.println("Trimmed: " + nonTrimmed.trim());

        // Substrings and replacement
        System.out.println("Substring (index 2 to 4): " + name.substring(2, 5));
        System.out.println("Replaced 'r' with 'j': " + name.replace('r', 'j'));

        // Prefix and suffix checks
        System.out.println("Starts with 'Ha': " + name.startsWith("Ha"));
        System.out.println("Ends with 'ry': " + name.endsWith("ry"));

        // Character lookup and searching
        System.out.println("Char at index 2: " + name.charAt(2));
        System.out.println("Index of 't' (returns -1 if absent): " + name.indexOf("t"));

        String modifiedName = "Harryrry";
        System.out.println("Index of 'rry' starting from index 4: " + modifiedName.indexOf("rry", 4));
        System.out.println("Last index of 'r': " + name.lastIndexOf("r"));
        System.out.println("Last index of 'r' before index 3: " + name.lastIndexOf("r", 3));

        // Content equality checks
        System.out.println("Equals 'Harry': " + name.equals("Harry"));
        System.out.println("Equals ignore case 'harry': " + name.equalsIgnoreCase("harry"));
    }
}