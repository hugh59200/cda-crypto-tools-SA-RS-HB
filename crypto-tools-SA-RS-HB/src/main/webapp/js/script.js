$(function () {

  $('.acceuil').show();
  $('.allCrypto').hide();
  $('.mesCryptos').hide();

  afficherListes()

});

function afficherListes() {

  $('.cryptomonnaies').on('click', function () {
    $('.acceuil').hide();
    $('.mesCryptos').hide();
    $('.allCrypto').show();
  })

  $('.portefeuille').on('click', function () {
    $('.acceuil').hide();
    $('.allCrypto').hide();
    $('.mesCryptos').show();
  })

  $('.Acceuil').on('click', function () {
    $('.acceuil').show();
  $('.allCrypto').hide();
  $('.mesCryptos').hide();
  })
}