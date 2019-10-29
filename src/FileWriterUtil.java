public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String filename) {
        this.filename = filename;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return "FileWriterUtil{" +
                "filename='" + filename + '\'' +
                ", content=" + content.toString() +
                '}';
    }

    public void write(String str) {
        this.content.append(str);
    }

    public Momento save() {
        return new Momento(this.filename, this.content);
    }

    public void undoToLastSave(Object obj) {
        Momento momento = (Momento) obj;
        this.filename = momento.filename;
        this.content = momento.content;
    }

    private class Momento {
        private String filename;
        private StringBuilder content;

        public Momento(String filename, StringBuilder content) {
            this.filename = filename;
            this.content = new StringBuilder(content);
        }
    }
}
