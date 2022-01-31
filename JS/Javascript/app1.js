function disp_details(id, name, mail_id) {
    console.log("ID:", id);
    console.log("Name", name);
    if (mail_id != undefined)
        console.log("Email Id", mail_id);
}
function disp(n1, n2) {
    console.log(n1 + "  " + n2);
}
disp("abc", "xyz");
disp_details(123, "John");
disp_details(111, "mary", "mary@xyz.com");
var city = new String("Hyderabad");
console.log(city.length);
