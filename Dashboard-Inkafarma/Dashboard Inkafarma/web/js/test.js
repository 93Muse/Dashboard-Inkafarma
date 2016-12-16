var canvas = document.getElementById('myChart');
var data = {
    labels: ["Servidor", "Ordenadores", "Impresora", "Scanner", "POS"],
    datasets: [
        {
            label: "Reporte de equipos",
            backgroundColor: "rgba(255,99,132,0.2)",
            borderColor: "rgba(255,99,132,1)",
            borderWidth: 2,
            hoverBackgroundColor: "rgba(255,99,132,0.4)",
            hoverBorderColor: "rgba(255,99,132,1)",
            data: [65, 59, 30, 81, 56]
        }
    ]
};
var option = {
    animation: {
        duration: 5000
    }

};

var myBarChart = Chart.Bar(canvas, {
    data: data,
    options: option
});


