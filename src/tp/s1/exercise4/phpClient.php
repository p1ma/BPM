<?php

if(isset($_GET['mt'])) {
	$amount = $_GET['mt'];
	$clientSoap = new SoapClient("http://localhost:8080/?wsdl");
	$param= new stdClass();
	$param->mt=$amount;
	$res = $clientSoap->__soapCall('conversion', array($param));
} else {
  $res->return = 'undefined';
}
?>

<html>
    <title> TP1 BPM </title>
<body>
    <form action="phpClient.php" method="get">
    <input type="text" name="mt"/>
    <button>Convert</button>
    </form>
<?php
    echo "Result is $res->return";
?>
</body>

</html>
