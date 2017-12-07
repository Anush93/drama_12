$(document).ready(function(){
    for (var i = 0; i < 3; i++) {
        $('.creative-feed').append(
            '<div class="box border">'+
            '<div class="box-image"></div>'+
            '<div class="box-info">'+
            '<div class="profile-image"></div>'+
            '<div class="box-desc">'+
            '<div class="profile-name">Lahiru Hashan</div>'+
            '<div class="post-desc">This is how i train to work with new systems</div>'+
            '</div>'+
            '</div>'+
            '</div>'
        );
    }

    for (var i = 0; i < 5; i++) {
        $('.right-content').append(
            '<div class="list-item">'+
            '<div class="item-image"></div>'+
            '<div class="item-desc">Miming Beginner Course</div>'+
            '</div>'
        );
    }
});

$(document).on("click",".drop-icon",function(){
    $(".drop-menu").toggle();
});

