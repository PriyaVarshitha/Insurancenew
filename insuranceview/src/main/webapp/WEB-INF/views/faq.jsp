<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>FAQs</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#fetchButton").click(function() {
                $.ajax({
                    type: "GET",
                    url: "/getFAQS",
                    dataType: "json",
                    success: function(data) {
                        displayData(data);
                    },
                    error: function() {
                        alert("An error occurred while fetching data.");
                    }
                });
            });

            function displayData(data) {
                // Clear previous data
                $("#faqData").empty();

                // Append new data
                $.each(data, function(index, faq) {
                    $("#faqData").append("<p>ID: " + faq.id + "<br>Question: " + faq.question + "<br>Answer: " + faq.answer + "</p>");
                });
            }
        });
    </script>
</head>
<body>
    <h1>FAQs</h1>
    <button id="fetchButton">Fetch FAQs</button>
    <div id="faqData"></div>
</body>
</html>
