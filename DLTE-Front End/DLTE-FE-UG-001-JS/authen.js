function authen(){
    let sk=[
        {
            "id": "kethan",
            "password":"22222"
        },
{
    "id": "kethan",
    "password":"22222"

}
    ]
    let uid=document.forms['login'].id.value;
    let upass=document.forms['login'].pass.value;

    sk.forEach((item)=> {
        if(item.id == uid && item.password == upass){
           
            window.location.href ="http://127.0.0.1:5500/DLTE-FE-UG-001-JS/online.html"
        }
    });
}