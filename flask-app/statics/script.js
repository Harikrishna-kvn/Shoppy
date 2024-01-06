document.addEventListener('DOMContentLoaded', function() {
    var greetingElement = document.getElementById('greeting');

    greetingElement.addEventListener('click', function() {
        var newMessage = 'Greetings from Flask App!';
        greetingElement.innerHTML = newMessage;
    });
});
