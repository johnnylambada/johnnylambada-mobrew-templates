package app.data

data class Winery(val name: String, val addr: String, val phone: String, val url: String, val logo: String?=null) {
    companion object {
        val data: List<Winery> = listOf(
                Winery("1968 Cellars", "40134 Calle Cabernet\nTemecula CA 92591", "909-573-5045", "http://www.1968cellars.com/","https://www.1968cellars.com/assets/logo/webtab_logo.png"),
                Winery("Akash Winery","39730 Calle Contento\nTemecula CA 92590","951-888-1393","https://www.akashwinery.com/","https://static1.squarespace.com/static/58a78d7a3e00be9b7ebaf687/t/5bf0528c4ae237221b0e58e1/1542476434672/green1.png"),
                Winery("Alex's Red Barn Winery","39820 Calle Contento\nTemecula CA - 92591","951-693-3201","http://www.redbarnwine.com/","https://www.redbarnwine.com/wp-content/uploads/2020/11/cropped-1YrKrc4b2nxF-192x192.png"),
                Winery("Avensole Winery","34567 Rancho California Rd\nTemecula CA - 92591","951-252-2003","http://www.avensolewinery.com/","https://www.avensolewinery.com/assets/images/logo.svg"),
                Winery("Baily Vineyard & Winery","33440 La Serena Way\nTemecula CA - 92591","951-676-9463","http://www.bailywinery.com/","https://www.bailywinery.com/wp-content/uploads/2013/10/bailywinerylogo1.png"),
                Winery("BATCH MEAD","42225 REMINGTON AVE STE A25\nTEMECULA CA - 92590","","https://www.batchmead.com/","https://static1.squarespace.com/static/5c1c608389c1722eadd5595b/t/5e9e04d5a4f27f198fa2a929/1610839197225/?format=1500w"),
                Winery("BelVino Winery","33515 Rancho California Road\nTemecula CA - 92591","951-676-6414","http://www.belvinowinery.com/","https://www.belvinowinery.com/images/Logo-Gold-Foil-4-In.-Wide_use-this-one-07202018.png"),
                Winery("Bottaia Winery","35601 RANCHO CALIFORNIA ROAD\nTEMECULA CA - 92591","951-365-3388","https://www.bottaiawinery.com/","https://www.bottaiawinery.com/assets/client/Image/BOTTAIABHomepageLineBreak-092.png"),
                Winery("Brian Edward Wines","55410 Cherry Hills Drive\nLa Quinta CA - 92253","707-927-3459","http://www.brianedwardwines.com/","http://www.brianedwardwines.com/graphics/logo_web.png"),
                Winery("Briar Rose Winery","41720 Calle Cabrillo\nTemecula CA - 92592","951-308-1098","http://www.briarrosewinery.com/","https://www.briarrosewinery.com/uploads/7/3/1/9/73191595/1455250786.png"),
                Winery("Callaway Vineyard & Winery","32720 Rancho California Road\nTemecula CA - 92591","951-676-4001","http://www.callawaywinery.com/","http://www.callawaywinery.com/assets/images/logo.png"),
                Winery("Canyon Crest Winery","5225 Canyon Crest Drive\nSte 7A, Riverside CA - 92507","951-369-9463","http://canyoncrestwinery.com/","http://www.canyoncrestwinery.com/developer/wp-content/uploads/2018/09/cropped-favicon-dark-bg-192x192.png"),
                Winery("Carter Estate Wineyr & Resort","34450 Rancho California Road\nTemecula CA - 92591","888.364.5709","https://www.carterestatewinery.com/","https://www.carterestatewinery.com/skins/carter-estate-winery-and-resort/assets/desktop/images/carter-hospitality.svg"),
                Winery("Chapin Family Vineyards","36084 Summitville St\nTemecula Valley CA - 92592","951-506-2935","http://chapinfamilyvineyards.com/","https://www.chapinfamilyvineyards.com/apple-touch-icon.png"),
                Winery("Cougar Vineyard & Winery","39870 De Portola Road\nTemecula CA - 92592","951-491-0825","http://cougarvineyards.com/","https://www.cougarvineyards.com/assets/images/icon-paw.png"),
                Winery("Coyote Creek Orchards","26690 Skyrocket Dr\nTemecula CA - 92590","951-695-7067","http://www.ccoinc.us/","https://sep.yimg.com/ca/I/yhst-141088004065579_2546_5422279"),
                Winery("Curry Vineyards & Winery","42100 Marin Street\nTemecula CA - 92590","909-821-1282","http://www.curryvineyard.com/","http://curryvineyard.com/wp-content/uploads/2019/04/cropped-img-bunner-1-192x192.png"),
                Winery("Danza Del Sol Winery","39050 De Portola Rd\nTemecula CA - 92592","951-302-6363","http://www.danzadelsolwinery.com/","https://www.danzadelsolwinery.com/assets/images/logo-icon.png"),
                Winery("Doffo Winery","36083 Summitville St\nTemecula CA - 92592","951-676-6989","http://www.doffowines.com/","https://www.doffowines.com/wp-content/uploads/2019/03/Doffo_Website_Homepage_Logo-1.png"),
                Winery("Europa Village","33475 La Serena Way\nTemecula CA - 92591","951-506-1818","http://www.europavillage.com/","https://dszed1faa2v26umzj2qephfp-wpengine.netdna-ssl.com/wp-content/uploads/2018/12/cropped-Europa-Village-favicon-208c-300px-192x192.png"),
                Winery("Falkner Winery","40620 Calle Contento\nTemecula CA - 92591","951-676-8231","http://www.falknerwinery.com/","https://www.falknerwinery.com/images/logo%20have%20circle.png"),
                Winery("Fazeli Cellars","37320 De Portola Road\nTemecula CA - 92592","951-303-3366","http://www.fazelicellars.com/","https://fazelicellars.com/wp-content/uploads/2019/12/fazeli_icon-300x300.png"),
                Winery("Ferro Family Wines","27495 Diaz Rd\nTemecula CA - 92590","951-225-8237","http://www.ferrofamilywinestore.com/","http://d3659vtrapyrip.cloudfront.net/wp-content/uploads/2011/07/logo5.png"),
                Winery("Foot Path Winery","36650 Glenoaks Road\nTemecula CA - 92592","951-265-9951","http://www.footpathwinery.com/","https://footpathwinery.com/wp-content/uploads/2020/06/cropped-android-chrome-512x512-1-192x192.png"),
                Winery("Frangipani Winery","39750 De Portola Road\nTemecula CA - 92592","951-699-8845","http://frangipaniwinery.com/","https://www.frangipaniwinery.com/images/frangipani-winery-logo.png"),
                Winery("Gagnon Cellars","27495 Diaz Road\nTemecula CA - 92590","818-422-9327","http://www.gagnoncellars.com/","https://images.squarespace-cdn.com/content/v1/57ec6126d1758e49587288f8/1475118845457-GY476NGHS2E6I99PNWEN/ke17ZwdGBToddI8pDm48kHhlTY0to_qtyxq77jLiHTtZw-zPPgdn4jUwVcJE1ZvWhcwhEtWJXoshNdA9f1qD7T-j82ScS_xjTqFYGqFrT72qZ_E0ELtHpOZiWcSG1QwIMeEVreGuQ8F95X5MZTW1Jw/favicon.ico?format=100w"),
                Winery("Galleano Winery","4231 Wineville Rd\nMira Loma CA - 91752","951-685-5376","http://www.galleanowinery.com/","https://static.wixstatic.com/media/982cf0_a9241665e3a54bc0b1453cc0a827831b~mv2.png/v1/fill/w_148,h_129,al_c,q_85,usm_0.66_1.00_0.01/GW%20Logo%20(No%201927).webp"),
                Winery("Gershon Bachus Vintners","37750 De Portola Rd\nTemecula CA - 92592","877-458-8428","http://static1.squarespace.com/static/536441b0e4b03d7703d2255e/t/536c2b93e4b0095a3b3d6fd0/1601745073278/?format=1500w"),
                Winery("Gouvion Vineyards","43780 Camino de las Brisas\nMurrieta CA - 92562","949-673-3635","http://gouvionvineyards.com/","http://www.gouvionvineyards.com/wp-content/uploads/2018/01/withtext-1-300x201.png"),
                Winery("Hart Family Winery","41300 Avenida Biona\nTemecula CA - 92591","951-676-6300","http://vinhart.com/","https://secureservercdn.net/45.40.155.175/fpy.31a.myftpupload.com/wp-content/uploads/2019/05/hart.logo_.white_.png"),
                Winery("Inn at Churon Winery","33233 Rancho California Road\nTemecula CA - 92591","951-694-9070","http://www.innatchuronwinery.com/","https://cdn.shopify.com/s/files/1/0070/8834/1045/files/logo-large_250x.png?v=1559663826"),
                Winery("Kenco Company","18451 Collier Avenue\nSuite B, Lake Elsinore CA - 92530","800-622-7346","http://www.gershonbachus.com/","http://static1.squarespace.com/static/536441b0e4b03d7703d2255e/t/536c2b93e4b0095a3b3d6fd0/1601745073278/?format=1500w"),
                Winery("La Rebelde Winery","530 Crane Street\n#G, Lake Elsinore CA - 92530","951-741-7337","http://www.larebeldewines.com/","http://nebula.wsimg.com/fcf935b123f8d77935bd76e41dfc9f6a?AccessKeyId=A2F2CBC226354797A1CE&disposition=0&alloworigin=1"),
                Winery("Le Grange Grill And Cellars","24683 Washington Ave\nMurrieta CA - 92562","951-600-2800","https://www.thewineranch.com/","https://popmenucloud.com/cdn-cgi/image/width=1440,height=1440,fit=scale-down,format=auto,quality=60/xldkuscp/628c1b6e-75c5-492f-ba97-604c7ce378f7.jpg"),
                Winery("Leoness Cellars","38311 De Portola Road\nTemecula CA - 92592","951-302-7601","http://www.leonesscellars.com/","https://www.leonesscellars.com/assets/images/icon-ta.jpg"),
                Winery("Longshadow Ranch Vineyard and Winery","39847 Calle Contento\nTemecula CA - 92591","951-587-6221","http://www.longshadowranchwinery.com/","https://www.longshadowranchwinery.com/assets/images/firehorse.jpg"),
                Winery("Lorenzi Estate Vineyards And Winery","36095 Monte De Oro Rd\nTemecula CA - 92592","951-506-1300","http://www.lorenziestatewines.com/","https://lorenziestatewines.com/wp-content/uploads/2020/11/LorenziWebMainPicbw.jpg"),
                Winery("Lorimar Vineyards and Winery","39990 Anza Road\nTemecula CA - 92591","951-694-6699","http://www.lorimarwinery.com/","https://www.lorimarwinery.com/wp-content/themes/lorimar/images/logo.png"),
                Winery("Lumiere Winery","39555 Calle Contento\nTemecula CA - 92591","951-972-0585","http://lumierewinery.com/","https://img1.wsimg.com/isteam/ip/static/pwa-app/logo-default.png/:/rs=w:60,h:60,m"),
                Winery("Masia de la Vinya Winery","40230 De Portola Road\nTemecula CA - 92592","951-303-3860","http://www.masiadelavinya.com","https://www.masiadelavinya.com/assets/images/Logo.png"),
                Winery("Matin Du Bois Vintners","27495 Diaz Rd\nTemecula CA - 92590","","http://www.matindubois.com/","http://matindubois.com/mdb/wp-content/themes/mdb-theme/images/layout/mdb-logo.jpg"),
                Winery("Maurice Car'rie Winery","34225 Rancho California Rd\nTemecula CA - 92591","951-676-1711","http://www.mauricecarriewinery.com/",""),
                Winery("Middle Ridge Winery","54301 N. Circle Dr\nIdyllwild CA - 92549","951-659-9000","https://www.middleridge.com","https://www.middleridge.com/assets/images/logo.png"),
                Winery("Miramonte Winery","33410 Rancho California Rd\nTemecula CA - 92591-4928","951-506-5500","http://www.miramontewinery.com/","https://cdn.shopify.com/s/files/1/2038/0045/files/Newlogo-MW-header_4bb0bfd2-c2f5-4645-907b-0f03649d1b79_400x.jpg?v=1522962028"),
                Winery("Monte De Oro Winery & Vineyards","35820 Rancho California Road\nTemecula CA - 92591","951-491-6551","http://montedeoro.com/","https://cdn.shopify.com/s/files/1/0089/6018/0287/files/ALTERNATE_2_LOGO_WHT_x110.png?v=1562017167"),
                Winery("Monte De Oro Winery & Vineyards","35820 Rancho California Road\nTemecula CA - 92591","951-491-6557","http://montedeoro.com/","https://app.lifteragecheck.com//img/uploads1/157902873219.png"),
                Winery("Mount Palomar Winery","33820 Rancho California Road\nTemecula CA - 92591","951-676-5047","http://www.mountpalomarwinery.com/","https://www.mountpalomarwinery.com/assets/images/logo.png"),
                Winery("Oak Mountain Winery","36522 Via Verde\nTemecula CA - 92592","951-699-9102","http://oakmountainwinery.com/","https://oakmountainwinery.com/images/cave%20logo-u60579.png?crc=172202338"),
                Winery("Palumbo Family Vineyard","40150 Barksdale Circle\nTemecula CA - 92591","951-676-7900","http://www.palumbowines.com/","https://cdn.shopify.com/s/files/1/0091/0488/3772/files/aplumbo_logo_w_697e99a0-fa9c-4c2c-9f5d-2054319ae723_450x.png?v=1587496666"),
                Winery("Peltzer Winery","40275 Calle Contento\nTemecula CA - 92591","951-888-2008","http://www.peltzerwinery.com/","https://www.peltzerwinery.com/wp-content/uploads/2017/09/logo-updated.png"),
                Winery("Plateau Vineyards","20170 Sierra Soto Rd\nMurrietta CA - 92562","951-304-0205","http://www.plateauvineyards.com/","http://plateauvineyards.com/images/plateau_vineyards_logo.png"),
                Winery("Poggio Leano Winery","27499 Ynez Rd\nTemecula CA - 92592","951-446-9908","https://www.poggioleano.com/","https://static.wixstatic.com/media/c3c5f8_f02f69bebd194d8997d1cfb197408430.png/v1/fill/w_108,h_96,al_c,q_85,usm_0.66_1.00_0.01/c3c5f8_f02f69bebd194d8997d1cfb197408430.webp"),
                Winery("Ponte Winery","35053 Rancho California Road\nTemecula CA - 92591","951-694-8855","http://www.pontewinery.com/","https://www.pontewinery.com/wp-content/themes/ponte/images/logo.svg"),
                Winery("Robert Renzoni Vineyards & Winery","37350 De Portola Road\nTemecula CA - 92592","951-302-8466","http://www.robertrenzonivineyards.com/",""),
                Winery("SC Cellars","PO BOX 893713\nTemecula CA - 92589","951-265-2678","http://www.sccellars.com/","http://www.sccellars.com/uploads/1/7/1/3/17138158/950508.jpg"),
                Winery("Silvia Cellars","29910 Murrieta Hot Spring Rd., Ste. G121\nMurrieta CA - 92563","707-217-5174","http://www.silviacellars.com/","https://399394-1257611-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2020/04/silvia_logo_240px.png"),
                Winery("SOMERSET VINEYARD","37338 DE PORTOLA\nTemecula CA - 92592","951-365-5522","http://www.somersetvineyard.com/","http://www.somersetvineyard.com/wp-content/uploads/2019/01/Somerset_Logo_Gold.png"),
                Winery("South Coast Winery","34843 Rancho California Road\nTemecula CA - 92591","951-587-9463","http://www.wineresort.com/","https://www.wineresort.com/assets/images/scw.png"),
                Winery("Sweet Oaks Wine","43240 Los Corralitos Road\nTemecula CA - 92590","951-414-5178","https://sweetoaks.com/","https://sweetoaks.com/wp-content/uploads/2019/12/sweetoaks_logo_200px-opt.png"),
                Winery("Temecula Hills Winery","47200 De Portola Rd\nTemecula CA - 92592","951-767-3450","",""),
                Winery("The Mara Wine Group","2400 N Hermosa Drive\nPalm Spring CA - 10576","760-318-0340","https://www.marawines.com","https://www.marawines.com/images/a_mara_logo.gif"),
                Winery("Thornton Winery","32575 Rancho California Rd\nTemecula CA - 92589","951-699-0099","https://www.thorntonwine.com/","https://www.thorntonwine.com/wp/wp-content/uploads/2020/03/Thornton-Winery-Logo-300.jpg"),
                Winery("Tranquil Heart Vineyard & Winery","42191 Little Lake Rd\nHemet CA - 92544","951-313-5387","http://tranquilheartvineyard.com/","https://tranquilheartvineyard.com/wp-content/uploads/2020/07/THV.02-e1597714214883-600x600.png"),
                Winery("Tucalota Creek Ranch","39560 E Benton Rd\nTemecula CA - 92592","714-914-9378","http://www.ranchlifestyle.com/","http://www.ranchlifestyle.com/uploads/1/9/3/6/19363725/5953150_orig.jpg"),
                Winery("Vindemia Winery","33133 Vista Del Monte\nTemecula CA - 92591","951-760-9334","http://www.vindemia.com/","https://vindemia.com/wp-content/uploads/2017/01/welcometovindemia.jpg"),
                Winery("Vitagliano Vineyards & Winery","36101 Glenoaks Road\nTemecula CA - 92591","951-694-8466","http://www.vitaglianowines.com/","https://vitaglianowines.com/wp-content/uploads/2020/08/Vitagliano-Wines-Logo-White.png"),
                Winery("Wiens Family Cellars","35055 Via Del Ponte\nTemecula CA - 92592","951-694-9892","http://www.wienscellars.com/","https://static1.squarespace.com/static/5d599300c8fcf200010db708/t/5d5dd9ef22dfd50001156c67/1611088832281/?format=1500w"),
                Winery("Wilson Creek Winery & Vineyards","35960 Rancho California Road\nTemecula CA - 92591","951-699-9463","http://www.wilsoncreekwinery.com/","https://www.wilsoncreekwinery.com/wp-content/uploads/2018/12/logo.png"),
                Winery("Windy Ridge Cellars","47200 De Portola Road\nTemecula CA - 92592","951-767-2116","http://oakmountainwinery.com/","https://oakmountainwinery.com/images/cave%20logo-u60579.png?crc=172202338"),
                Winery("Wineroad, LLC."," 35053 Rancho California Road\nTemecula CA - 02501","951-694-8883","http://www.pontewinery.com/","https://www.pontewinery.com/wp-content/themes/ponte/images/logo.svg"),
                Winery("Woodworth Vineyards","28544 Old Town Front St\nSuite 101, Temecula CA 92591","951-699-8896","http://www.woodworthwine.com/","http://www.woodworthwine.com/assets/images/btn-wineclub.png"),
        )
    }
}