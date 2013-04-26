package com.happy.widasemariam;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Monday extends Activity
{
	TextView mondayPrayer;
	
	String prayer = "«ሰው በዘመኑ እንደ ሳር ነው " +
							"እንደ ዱር አበባ እንዲሁ ያብባል " +
							"ነፋስ በነፈሰበት ጊዜ ያልፋልና " +
							"ስፍራውንም ደግሞ አያውቀውምና» " +
							"የእግዚአብሔር ምህረት ግን ከዘላለም እስከ ዘላለም በሚፈሩት ላይ ነው፡፡» " +
							" /መዝ.102-11/";
	String englishPrayer = "A HYMN OF PRAISE FOR THE FIRST DAY OF THE WEEK (SUNDAY) " +
							"1.  THOU wast named \"Beloved Woman\", O blessed among women. " +
							"Thou art the second chamber, in that thou wast called \"Holiest of Holies\", " +
							"and in it was the table of the Covenant and on it were the Ten Words which " +
							"were written by the fingers of God. He (i.e. the Father) made known this to " +
							"us first of all by \"Yawtâ\" (i.e. Iota), which is the first [letter] of the " +
							"Name of our Redeemer JESUS CHRIST, Who became incarnate of thee without change, " +
							"and became the mediator of the New Covenant, and by the shedding of His Holy Blood " +
							"He purified the believers and the people who were pure. And because of this we all " +
							"magnify thee, O our Lady, thou ever pure God-bearer. We beseech thee and lift our eyes " +
							"to thee, so that we may find mercy and compassion with the Lover of Men.";
	
	String zewerede = "በስመ አብ ወወልድ ወመንፈስ ቅዱስ አሐዱ አምላክ አሜን" +
			"ዘያከብሮሙ  ለፈራህያን እግዚአብሔር - እግዚአብሔርን የሚፈሩትን የሚያከብር ይከብራል  መዝ . 14 ፥4" +
			"ለልዕልናዉ ከልዑላን ይልቅ ከፍ ያለ በቅድስናዉ ከቅዱሳን ይልቅ ቅዱስ የኾነ በግርማዉም ከኣስፈሪዎች ኹሉ የሚያስፈራ በማስተዋሉም የጥበበኞች ጥበበኛ ስለርሱ መገኘቱ ከመቼ ዝምሮ ነዉ ወርዱም ይህ ያኸል ነዉ ራስጌዉ በዚያ በኹል ነዉ መምጫዉም ከዚኸ በኹል መድረሻዉም እስከዚኸ ድረስ ነዉ በማይባል በእግዚአብሔር ስም በሥፍራ ኹሉ መልቶ የሚኖር በየቀኑም ድንቆችን የሚያደርግ ለዘላለሙ ኣሜን ፡፡" +
			"በዚኸ ታላቅ ጾም / ጾመ ክርስቶስ / ክርስቶስ ከመጥምቁ ዮሐንስ ሥርዓት / ምስጢረ / ጥምቀትን ከፈጸመ በኋላ በዕለቱም ተነሥቶ ወደ ገዳመ ቆሮንጦስ በመኄድ አርባ ቀንና ሌሊት የመጾሙን ወራትና ጊዜ የምናስብበት ቢኾንም ቅድስት ቤተክርስቲያናችንም በቅዱስ ያሬድ የዜማ ድርሰት ኣማካይነት የዚኸን የጾም ወራት በስምንት ሳምንታት በመከፋፈል ለሳምንታቱም ስያሜ በመስጠት ከመዠመሪያዉ ሳምንት እስከ መጨረሻዉ ሳምንት ድረስ ዘቅምመደገኒሆ በማለት ስያሜ ትሰጣቸዋለች፡፡"+
			"ዘቅምመደገኒሆ ማለትም ዘ-ማለት ዘወረደ ፥ ቅ-ማለት ቅድስት ፥ ም- ማለት ምኩራብ ፥ መ - ማለት መጽጉዕ ፥ ደ - ማለት ደብረዘይት ፥ ገ - ማለት ገብርኄር ፥ ኒ - ኒቆዲሞስ ፥ ሆ - ማለት ሆሣዕና በማለት ይጠራሉ ፡፡"+
			"እኛም ለዛሬ ጽሑፋችንን የምንዠምረዉ በመዠመሪያዉ ሳምንት በዘወረደ ይኾናል ፣፣ ዘወረደ ማለት እግዚአብሔር ወልድ ክርስቶስ ከሰማየ ሰማያት መዉረዱን የምናስብበት ዕለት ነዉ፡፡" +
			"ወረደ ስንል ከላይ ወደታች መጣ ፥ በሰዉ ኣስተያየት እግዚአብሔር በኹሉ ቦታ የሚገኝ ሲኾን ከሰማይ ወዶ ምድር ወረደ ይባላል፡፡ መዉረድም በክርስቶስ /በእግዚአብሔር ወልድ/ ብቻ ሳይኾን ምስጢረ ጥምቀትም ሲፈጸም እግዚአብሔር መንፈስ ቅዱስ በላዩ ወርዷል ዘፍ. 11፥7  ̧  ዘጸ. 19፥18 ̧ዘጸ. 34፥5 ̧ሉቃ. 3፥22 ̧ሐዋ. 10፥44 ̧ 1ተሰ. 4፥16 ̧ ቅዱሳን መላዕክትም ከሰማይ ወደ ምድር መዉረዳቸዉን መጽሐፍ ያስተምረናል ፡፡ ዘፍ. 28፥12 ̧ማቴ. 11፥52 ክርስቶስም ከሰማይ መዉረዱም በዮሐ. 3፥13 ላይ እናገኛለን፡፡" +
			"እንደ ቅዱስ ያሬድ ትምህርት መሠረት በዚኸ ዕለት ‘ተቀነዩ ለእግዚአብሔር በፍርሐት - እግዚአብሔርን በመፍራት አመስግኑ ተገዙለትም‘ በማለት ያስተምርና ይዘምር ስለነበር ቤተክርስቲያንም በዚኸ ዕለት ትምህርቷ እግዚአብሔር ወልድ ክርስቶስ ከሰማያት መዉረዱንና ርሱን በመፍራት እንድናከብርና እንድንገዛለት ታስተምረናለች ፡፡ ዮሐ.3፥1-21 ̧ዕብ.13፥7-17 ̧ያዕ.4፥6- ፍጻሜ  ̧ ሐዋ.25፥13-ፍጻሜ ̧ መዝ.2፥11 ፡፡" +
			"የጥበብ ኹሉ መዠመሪያ እግዚአብሔርን መፍራት ነዉ‘ ምሳ.1፥7 ̧ምሳ.9፥10 የጥበብ ኹሉ መዠመሪያዉ የተባለችበት ምክንያት ሰዉ እግዚአብሔርን ከፈራ እንደ ኣብርሃም የታዘዘዉን ኹሉ ያደርጋል፡፡ /ዘፍ.22፥12-23 / እግዚአብሔርን ፈርቶ የሠራዉሥራም ሞገስ ይኾነዋል፡፡ዘፍ.31፥42 ልበኣምላክ ቅዱስ ዳዊትም ‘ ኑ ፈሪሃ እግዚአብሔርን ላስተምራችኹ‘‘ መዝ.33፥1 ካለ በኋላ ልጆቹንም በመጥራት ‘የእግዚአብሔር መልኣክ እግዚአብሔርን በሚፈሩት ሰዎች ዙሪያ ይከባል ያድናቸዉማል ” በማለት እግዚአብሔርን በመላእክተ እግዚአብሔርእንደምታስጠብቀን ተናገረ፡፡ መዝ.33፥7 ቅዱስ ጳዉሎስም ‘‘ በፍርሃትና በመንቀጥቀጥ የራሳችኹን መዳን ፈፅሙ ” ይላል /ፊል.2፥12/ ቅዱስ ጴጥሮስም “ በአንድነታችኹ ዘመን በፍርሃትና በፍቅሩ ኑሩ ” ይላል /1ጴጥ.1፥17/ ወደ ዕብራዉያን መልእክትም “ የማይናወጥን መንግሥት ስለምንቀበል በማክበርና በፍርሃት እግዚአብሔርን ደስ እያሰኘን የምናመልክበትን ፀጋ እንያዝ ኣምላካችን በእዉነት የማይጠፋ እሳት ነዉና ” በማለት ይናገራል ዕብ.13፥7-17፡፡" +
			"በመለኮታዊ ጥበቡ /ጥባቆቱ/ ከድፍረት ኃጢአት እግዚአብሔር እንዲያድነን እንጸልይ እንማጸነዉ /መዝ. 18፥13/ “ . . . .  ከእኔም ፈቀቅ እንዳይሉ መፈራቴን በልባቸዉ ዉስጥ ኣኖራለኹ ለእነሱም መልካም በማድረግ ደስ ይለኛል ” ብሎ የነገረዉን ተስፋ እንዲያወርሰን /ኤር. 32፥40/ ከፍቅር የተነሣ እንፍራዉ እናክብረዉ እንገዛለት እናም ልከዉ የኣጋንንት ዓይነት ፣ ፍርሃት ሳይኾን ኣባታችን ስለኾነ ክብርን ፣ ንጉሣችን ስልኾነ" +
			"“ልጅ አባቱን ያከብራል ባርያም ጌታዉን ይፈራል እኔስ ኣባት ከኾንኹ ክብሬ ወዴት ኣለ? ጌታስ ከኾንኹ መፈራቴ ወዴት ኣለ ? ” እንዳንባል /ሚል. 1፥ 6- 7/ ,ምሳ. 8፥7 , ሐዋ. 10፥20 , ሐዋ. 6፥29 , ሐዋ. 24፥25 , ዕብ. 10፥26 , ራዕ. 21፥8 , መዝ. 33፥14 , ዘፍ. 3፥10 , ምሳ. 28፥1 , ሮሜ. 8፥15 , ዮሐ. 4፥18 ፡፡" +
			"ጌታችን ወደዚኸች ምድር ወርዶ ለኣዳም የገባለትን ቃል ኪዳን ከመፈጸሙ በፊትና ከፈጸመ በኋላ በብሉይ ኪዳንም ኾነ በሐዲስ ኪዳን የሰዉን /የኣዳምን/ ልጆች ወደ ራሱ ሲጠራ እንዴት ነበር ? ያልን እደኾነ እግዚአብሔርን የሚወዱት ፥ የሚያከብሩትና የሚፈሩት ቅዱሳን ኣባቶች እንደርሱ ቅዱስ ኣሳብ ተጠርተዋል ፡፡ እነርሱም ፦ ኣብርሃም ፥ ሙሴ ፥ ኤልሳዕ ፥ ሠለስቱ ደቂቅ ፥ ዳንኤል ፥ ዮናስ ፥ ዳዊት ፥ ሰለሞን ፥ ኖኅ ፥ ዮሴፍ ፥ ያዕቆብ . . . . . ሲኾኑ በሐዲስ ኪዳንም ሐዋርያት ፥ መጥምቁ ዮሐንስ ፥ ቅዱስ ጳዉሎስ ፥ ጴጥሮስና እንድርያስ ፥ ያዕቆብና ዮሐንስ ፥ ናትናኤል . . . . . ናቸዉ፡፡ ኣጠራራቸዉም";


@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.monday);
			initalizer();
		
	}

	private void initalizer() 
	{
		mondayPrayer = (TextView) findViewById(R.id.tvMondayPrayer);
		
		Typeface face = Typeface.createFromAsset(getAssets(), "fonts/nyala.ttf");
		
		mondayPrayer.setTypeface(face);
		
		mondayPrayer.setText(prayer);
	}

}

/*
 * This is how you can set a font from a file
 *	File font=new File(Environment.getExternalStorageDirectory(), "MgOpenCosmeticaBold.ttf"); 
 *	if (font.exists()) 
 *	{ 
 *		tv=(TextView)findViewById(R.id.file); 
 *		face=Typeface.createFromFile(font); 
 *		tv.setTypeface(face); 
 *	} 
 *	else 
 *	{ 
 *		findViewById(R.id.filerow).setVisibility(View.GONE); 
 *	} 
*/	 