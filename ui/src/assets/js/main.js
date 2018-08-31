function showWordsPopup(hanziId) {
    var popup = document.getElementById("myPopup");

    $.getJSON('http://localhost:9003/api/v1/chars/' + hanziId, function (data) {
        let popupText = 'Words: ';
        $.each(data, function (key, val) {
            popupText += val.chineseMeaning + ' - ' + val.englishMeaning + ' '
        })
        $(popup).text(popupText);
        popup.classList.toggle("show");
    });

}

$( document ).ready(function () {
  console.log("ready");
  $(document).on("click", ".chinchar", function () {
    var hanziId = $(this).data('id');
    showWordsPopup(hanziId);
  })

});
