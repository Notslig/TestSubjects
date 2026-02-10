
<!DOCTYPE html>
<html>
<head>
<title>Event Registration</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <h2> Event Registration</h2>
    <?php
    if (isset($success)) {
        echo "<p style='color: green;'><b>$success</b></p>";
    }
    ?>
    <form method="POST">
     <input type="text" name="name" placeholder="Enter Your Name" required>
     <input type="email" name="email" placeholder="Enter Your Email" required>
     <select name="event" required>
        <option value="">Select Event</option>
        <option value="Singing Competition">Singing Competition</option>
        <option value="Dance Battle">Dance Battle</option>
        <option value="Quiz Contest">Quiz Contest</option>
        <option value="Drama Show">Drama Show</option>
     </select>
<button type="submit">Register</button>
   </form>
<br>
<a href="view.php">View All Registrations</a>
</div>
</body>
</html>
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $name = $_POST['name'];
  $email = $_POST['email'];
  $event = $_POST['event'];
$data = "Name: $name | Email: $email | Event: $event\n";
file_put_contents("registrations.txt", $data, FILE_APPEND);
$success = "Registration Successful!";
}
?>