package student_ilya_tihonov.lesson_10.BookLibraryApplication.search;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;

public class AuthorSearchCriteria implements SearchCriteria {

        private String authorToSearch;

        public AuthorSearchCriteria(String authorToSearch) {
                this.authorToSearch = authorToSearch;
        }

        public boolean match(Book book) {
                if(book.getAuthor().equals(this.authorToSearch)){
                        return true;
                } else {
                        return false;
                }
        }

}

