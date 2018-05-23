package com.example.ebook.bookstore.models


class MyBookRepository : FilterableBookRepository() {

    override fun loadAllBooks() {
        bookList.clear()
        bookList.add(Book(1,"ABCD",1.99))
        bookList.add(Book(2,"Be the Champion",9.99))
        bookList.add(Book(5,"Steve Jobs",29.99))
        setChanged()
        notifyObservers()
    }

    fun addBook(book: Book): Boolean {
        if (!bookList.contains(book)) {
            bookList.add(book)
            setChanged()
            notifyObservers()
            return true
        }
        return false
    }

}