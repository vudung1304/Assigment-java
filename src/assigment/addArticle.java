package assigment;

public class addArticle {
    public void addArticle() {
        System.out.print("Nhập mã bài viết: ");
        int code = input.nextInt();
        input.nextLine(); // consume newline character
        System.out.print("Nhập tiêu đề bài viết: ");
        String title = input.nextLine();
        System.out.print("Nhập mô tả bài viết: ");
        String description = input.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = input.nextLine();
        System.out.print("Nhập ngày viết (dd/MM/yyyy): ");
        String date = input.nextLine();
        System.out.print("Nhập đường dẫn ảnh đại diện: ");
        String imagePath = input.nextLine();
        System.out.print("Nhập nội dung chính: ");
        String content = input.nextLine();
        Article article = new Article(code, title, description, author, date, imagePath, content);
        articles.add(article);
}
