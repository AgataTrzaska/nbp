$(document).ready(function () {

    getCourse("eur");
    getCourse("usd");
    getGoldPrice();

    function getCourse(name) {

        $.ajax({
            url: "http://localhost:8080/exchangerates/" + name + "/today"
        }).then(function (data) {
            $('.' + name + "-bid").append(data.rates[0].bid);
            $('.' + name + "-ask").append(data.rates[0].ask);
        });

    }

    function getGoldPrice() {

        $.ajax({
            url: "http://api.nbp.pl/api/cenyzlota/today/?format=json"
        }).then(function (data) {
            $(".gold-price").append(data[0].cena);
        });

    }

});