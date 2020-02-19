
$(function(){
      $(".typed").typed({
        strings: ["alegi ce iti place.", "iti explorezi creativitatea legata de tunning.", "iti dezvolti un proiect de tip Project Car"],
        typeSpeed: 1,
        loop: true,
        backDelay: 1000
      });
  });

  
  $('a.page-scroll').bind('click', function(event) {
    var $anchor = $(this);
    $('html, body').stop().animate({
        scrollTop:  ($($anchor.attr('href')).offset().top - 50)
    }, 1250, 'easeInOutExpo');
    event.preventDefault();
});