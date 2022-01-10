

/* global Utils */
function pChart(id, pLabels = [], pInfo = []) {
//    let colors = [];
//    for (let i = 0; i < pInfo.length; i++)
//        colors.push(generateColor());
    const data = {
        labels: pLabels,
        datasets: [{
                label: 'Thống kê số lượng bệnh nhân theo tháng',
                data: pInfo,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 205, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)'
                ],
                borderColor: [
                    'rgb(255, 99, 132)',
                    'rgb(255, 159, 64)',
                    'rgb(255, 205, 86)',
                    'rgb(75, 192, 192)'
                ],
                hoverOffset: 4
            }]
    };
    const config = {
        type: 'bar',
        data: data,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        },
    };
    let ctx = document.getElementById(id).getContext("2d");
    new Chart(ctx, config);

}
function bChart(id, pLabels = [], pInfo = []) {
//    let colors = [];
//    for (let i = 0; i < pInfo.length; i++)
//        colors.push(generateColor());
    const data = {
        labels: pLabels,
        datasets: [{
                label: 'Thống kê số lượng bệnh nhân theo tháng',
                data: pInfo,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 205, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)'
                ],
                borderColor: [
                    'rgb(255, 99, 132)',
                    'rgb(255, 159, 64)',
                    'rgb(255, 205, 86)',
                    'rgb(75, 192, 192)'
                ],
                hoverOffset: 4
            }]
    };
    const config = {
        type: 'line',
        data: data,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        },
    };
    let ctx = document.getElementById(id).getContext("2d");
    new Chart(ctx, config);

}
