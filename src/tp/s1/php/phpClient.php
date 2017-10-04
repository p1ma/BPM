<?php

$amount = $_GET['amount'];
$clientSoap = new SoapClient("http://localhost:8080/?wsdl");
$param= new stdClass();
$param->amount=$amount;
$res = $clientSoap->__soapCall("conversion", array($param));
$res=0;
?>

<html>
    <title> TP1 BPM </title>
<body>
    <form action="phpClient.php" method="get">
    <input type="text" name="amount">
    <button>Convert</button>
    </input>
    </form>
<?php
    echo "Result is $res->return";
?>
</body>

</html>
