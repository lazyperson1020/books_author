<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .button {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 3px;
        }
    </style>
</head>
<body>
    <h1>Books</h1>
    <a href="/books/add" class="button">Add New Book</a>
    <table>
        <tr>
            <th>Title</th>
            <th>ISBN</th>
            <th>Publication Year</th>
            <th>Price</th>
            <th>Genre</th>
            <th>Author</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.title}</td>
                <td>${book.isbn}</td>
                <td>${book.publicationYear}</td>
                <td>${book.price}</td>
                <td>${book.genre}</td>
                <td>${book.author.name}</td>
                <td>
                    <a href="/books/edit/${book.id}" class="button">Edit</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
