$(function () {

  $('.acceuil').show();
  $('.allCrypto').hide();
  $('.mesCryptos').hide();
  $('.popupliste').hide();
  $('.popupwallet').hide();

  gestionClic()

});

function gestionClic() {


// clic  -> header

  $('.Acceuil').on('click', function () {
    $('.acceuil').show();
    $('.allCrypto').hide();
    $('.mesCryptos').hide();
    $('.popupliste').hide();
    $('.popupwallet').hide();
  })

  $('.cryptomonnaies').on('click', function () {
    $('.acceuil').hide();
    $('.mesCryptos').hide();
    $('.allCrypto').show();
    $('.popupliste').hide();
    $('.popupwallet').hide();
  })

  $('.portefeuille').on('click', function () {
    $('.acceuil').hide();
    $('.allCrypto').hide();
    $('.mesCryptos').show();
    $('.popupliste').hide();
    $('.popupwallet').hide();
  })



// clic -> ajouter

  $('.btnAjouter').on('click', function () {
    $('.popupliste').show();
    $('.allCrypto').hide();
  })

  $('.boutonsliste>.valider').on('click', function () {
    $('.allCrypto').show();
    $('.popupliste').hide();
  })

  $('.boutonsliste>.annuler').on('click', function () {
    $('.allCrypto').show();
    $('.popupliste').hide();
  })



// clic -> wallet

  $('.crud>.acheter').on('click', function () {
    $('.popupwallet').show();
    $('.mesCryptos').hide();
  })

  $('.crud>.vendre').on('click', function () {
    $('.popupwallet').show();
    $('.mesCryptos').hide();
  })

  $('.boutonswallet>.valider').on('click', function () {
    $('.mesCryptos').show();
    $('.popupwallet').hide();
  })

  $('.boutonswallet>.annuler').on('click', function () {
    $('.mesCryptos').show();
    $('.popupwallet').hide();
  })
  
  
}