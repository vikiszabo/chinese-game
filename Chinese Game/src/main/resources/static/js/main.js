function showWordsPopup(hanziId) {
    var popup = document.getElementById("myPopup");

    $.getJSON('/wordsByHanziId/' + hanziId, function (data) {
        let popupText = 'words: ';
        $.each(data, function (key, val) {
            popupText += val.chineseMeaning + ' '
        })
        $(popup).text(popupText);
        popup.classList.toggle("show");
    });

}

$( document ).ready(function () {
    console.log("ready");
    $(".chinchar").click(function () {
        var hanziId = $(this).data('id');
        showWordsPopup(hanziId);
    })
});