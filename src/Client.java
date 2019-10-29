public class Client {
    public static void main(String[] args) {

        FileWriterCareTake careTaker = new FileWriterCareTake();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data:\nzouhaire\nelakioui\n");

        System.out.println(fileWriter + "\n\n");

        careTaker.save(fileWriter);
        fileWriter.write("First Set of Data:\nzouhaire\nelakioui\ncool");

        System.out.println(fileWriter + "\n\n");
        careTaker.undo(fileWriter);

        System.out.println(fileWriter + "\n\n");
    }
}
