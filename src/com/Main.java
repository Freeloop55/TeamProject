package com;



public class Main {

	public static void main(String[] args) throws Exception {
		
//		IBookDao dao = (IBookDao) BeanFactory.getBean("bookDao");
//		Book book = new Book("1002","线性代数","李子鬼",(double) 125,2,"x101","很不好");
//		dao.insertBook(book);
//		Book b = dao.findBookByNo(1002);
//		System.out.println(b);
		
//		IBookshelfDao bookshelf = new BookshelfDaoImpl();
//		
//		Bookshelf b = bookshelf.findBookshelfByNo("x101");
		
//		Class.forName("com.config.BeanFactory");

		
//		 IBookService bookService = (IBookService) BeanFactory.getBean("bookService");
//		 
//		 BookController bookController =  (BookController) BeanFactory.getBean("bookController");
		
//		System.out.println(bookService);
//		System.out.println(bookController);
//		 BookServiceImpl b = new BookServiceImpl();
//		 BookServiceImpl b =  (BookServiceImpl) BeanFactory.getBean("bookService");
//		
//		 BookController bookController2 = new BookController();
//		System.out.println(b);
//		List<Book> books = b.findAllBook();
//		System.out.println(bookController2.getBookService());
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//		
//		String book1 = "1234";
//		String book2 = "asd";
//		System.out.println(book1);
//		System.out.println(book2);
		
//		String 	sql = "select * from student_book_relation where Sno = ?";
//		PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql);
//		
//
//		
//		ps.setInt(1,2018212534);
//		
//
//		ResultSet r = ps.executeQuery();
//		
//		r.next();
//		
//		int num = r.getInt(5);
//		
//		System.out.println(num);
//
//		sql = "select * from student where Sno = ?";
//		
//		ps.addBatch(sql);
//		
//		ps.setInt(1,2018212534);
//		
//		r = ps.executeQuery();
//		
//		if(r.next()) {
//			
//			int studentNo = r.getInt(2);
//			String name = r.getString(3);
//			int age = r.getInt(4);
//			String sex = r.getString(5);
//			String telephone = r.getString(6);
//			String major = r.getString(7);
//			
//			Student student = new Student(studentNo,name, age, sex, telephone,major);
//			
//			System.out.println(student);
//
//			
//			}
		
	//	String date = 
		
//		Date date1 = new Date(0);
//		Date date2 = Date.valueOf("2020-01-23");
//		
//
//		Date date = new Date(date2.getTime()+30*24*60*60*1000L);
//		
//		System.out.println(date2.getTime());
//		
//		System.out.println(date);
		
//		Connection connection = DatabaseConnection.getConnection();
//		
//		
//		System.out.println(connection);
//		System.out.println(connection.isClosed());
//		
//		connection.close();
//		
//		System.out.println(connection);
//		System.out.println(connection.isClosed());
		
//		PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("select * from student");
//		System.out.println(ps);
//		System.out.println(ps.getConnection());
//		System.out.println(ps.getConnection().isClosed());
//		
//		ps.close();
//		System.out.println(ps.getConnection().isClosed());
		
		String a = "123";
		Integer s = Integer.valueOf(a);
		
		System.out.println(s);
		
	}

}
