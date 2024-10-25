<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Form</title>
    <style>
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input, select {
            width: 200px;
            padding: 5px;
        }
        .button {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>${book.id == null ? 'Add Book' : 'Edit Book'}</h1>
    <form:form action="${book.id == null ? '/books' : '/books/update'}" method="post" modelAttribute="book">
        <form:hidden path="id"/>
        
        <div class="form-group">
            <label>Title:</label>
            <form:input path="title"/>
        </div>
        
        <div class="form-group">
            <label>ISBN:</label>
            <form:input path="isbn"/>
        </div>
        
        <div class="form-group">
            <label>Publication Year:</label>
            <form:input path="publicationYear" type="number"/>
        </div>
        
        <div class="form-group">
            <label>Price:</label>
            <form:input path="price" type="number" step="0.01"/>
        </div>
        
        <div class="form-group">
            <label>Genre:</label>
            <form:input path="genre"/>
        </div>
        
        <div class="form-group">
            <label>Author:</label>
            <form:select path="author.id">
                <form:options items="${authors}" itemValue="id" itemLabel="name"/>
            </form:select>
        </div>
        
        <input type="submit" value="Save" class="button"/>
    </form:form>
</body>
</html>