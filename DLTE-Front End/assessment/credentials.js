let details=[{
    "ID":"92068",
    "password":"2512",
   
    
},
{
    "ID":"789877",
    "password":"8192",
    
}]
function authentication(){
    let uname = document.forms['login'].id.value
    let upass = document.forms['login'].password.value

    details.forEach((item)=>{
        if(item.ID == uname && item.password == upass){
            window.location.href = "http://127.0.0.1:5500/home.html"
        }
    })
}
