var express = require('express');
var app = express();

var bodyParser = require('body-parser');			// POST 파라미터 파싱
app.use(bodyParser.json());							// support json encoded bodies
app.use(bodyParser.urlencoded({ extended: true }));	// support encoded bodies
var cookieParser = require('cookie-parser');		// 쿠키 파싱
app.use(cookieParser());

app.use(express.static('public'));
app.engine('html', require('ejs').renderFile);

//var config = require('./config.json');
//app.set('config', config);

// socket 관련 설정
var appListen = app.listen('8188', function () {
	console.log('app listening on port 8188');
});

require('./routes/sampleRequest')(app);

/*
app.use(function(err, req, res, next) {
	console.log('ERROR');
	res.status(500);
  	res.render('error', { error: err });
})
*/
//require('./routers/mapidoc')(app);


// function parseCookies (cookief) {
//     var list = {}

//     cookief && cookief.split(';').forEach(function( cookie ) {
//         var parts = cookie.split('=');
//         list[parts.shift().trim()] = parts.join('=');
//     });

//     return list;
// }
