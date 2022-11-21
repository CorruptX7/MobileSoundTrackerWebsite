//var map;
//
//        //The location of the map
//        function initMap(){
//        map = new google.maps.Map(document.getElementById('map'),
//        { center: {lat: 51.903614, lng: -8.468399} , zoom:12});
//
//        setMarkers(map);
//        }
//
//        var longitudes = [];
//
//          var lng = document.getElementById("longitude42").value;
//          var lng2 = document.getElementById("longitude39").value;
//          longitudes.push(lng);
//          longitudes.push(lng2);
//          console.log(lng);
//          console.log(longitudes);
//
//
//        var latitudes = [];
//
//        var lat = document.getElementById("latitude42").value;
//        var lat2 = document.getElementById("latitude39").value;
//          latitudes.push(lat);
//          latitudes.push(lat2);
//          console.log(lat);
//          console.log(latitudes);
//
//        var samples = [];
//
//        var samp = document.getElementById("sample42").value;
//        var samp2 = document.getElementById("sample39").value;
//          samples.push(samp);
//          samples.push(samp2);
//          console.log(samp);
//          console.log(samples);
//
//        var levels = [];
//
//        var level = document.getElementById("db42").value;
//        var level2 = document.getElementById("db39").value;
//          levels.push(level);
//          levels.push(level2);
//          console.log(level);
//          console.log(levels);
//
//        function setMarkers(map) {
//
//        const infoWindow = new google.maps.InfoWindow();
//
//        for (let i = 0; i < longitudes.length; i++) {
//         const lng = Number(longitudes[i]);
//         const lat = Number(latitudes[i]);
//
//         const sample = samples[i];
//         const db = Number(levels[i]);
//
//         const marker = new google.maps.Marker({
//          position: { lat: lat, lng: lng },
//          map,
//          animation: google.maps.Animation.BOUNCE,
//          animation: google.maps.Animation.DROP,
//          title: '<br><b>Sample: </b>' + samp + '<br><br><b>Sound Level: </b>' + db + '<br><br><b>Longitude: </b>' + lng + '<br><b>Latitude: </b>' + lat + '<br>',
//        });
//
//            marker.addListener("click", () => {
//              infoWindow.close();
//              infoWindow.setContent(marker.getTitle());
//              infoWindow.open(marker.getMap(), marker);
//
//            });
//       }
//
//      }




//const elements = [];
//            for (let i = 1; i <= ; i++) {
//            elements.push(document.getElementById("'longitude'+${sample.id}" + i).value);
//            console.log(elements);
//            }
