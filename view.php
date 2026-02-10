<?php
if (isset($_POST['delete'])) {
    file_put_contents("registrations.txt", "");
}
?>
<!DOCTYPE html>
<html>
<head>
<title>Registered Participants</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<h2>Registered Participants</h2>
<?php
if (file_exists("registrations.txt")) {
$lines = file("registrations.txt");
if (count($lines) > 0) {
foreach ($lines as $line) {
if (trim($line) != "") {
  echo "<div class='card'>$line</div>";
 }
}
} else {
   echo "<p>No registrations yet.</p>";
  }
 }
?>
<br>
<form method="POST">
<button type="submit" name="delete"
onclick="return confirm('Are you sure you want to delete all registrations?');">
   Clear All Registrations
</button>
</form>
<br>
<a href="index1.php">Back to Registration</a>
</div>
</body>
</html>