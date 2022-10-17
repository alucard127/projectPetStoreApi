import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project-store';

  items = ['nicolas', 'juan', 'marco'];

  addItem(){
    this.items.push ('nuevo item');
  }
  deleteItem(index: number) {
    this.items.splice(index, 1);
  }
}






<input type="text" [(ngModel)]="title">
{{title}}

<div *ngIf="title === 'nicolas'">
    Este es un div
</div>

<button (click)="addItem()">AddItem</button>

<ul>
    <li *ngIf="items.length === 0">la lista esta vacia</li>
    <li *ngFor="let name of items; index as i">
        {{ name }} {{ i }}
        <button (click)="deleteItem(i)")>delete</button>
    </li>
</ul>

https://www.pcprogramasymas.net/aprender-php-mysql-y-javascript-con-jquery-css-y-html5-5a-edi-pdf/
https://www.youtube.com/watch?v=QmFpyys4W4w
https://itoo.dev/p/curso-php-mysql-gratis
https://www.tecnoriales.com/2018/01/users-php-mysql-desde-cero-pdf.html
https://issuu.com/redusers/docs/php___mysql_desde_cero_issuu









NUSKIN1666034491802-Certificate_Nu Skin Lumispa iO_LS2MCR_ENACOM_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1666034491802-Certificate_Nu%20Skin%20Lumispa%20iO_LS2MCR_ENACOM_Chile_2022.pdf

ROKU1666018022336-Certificate_ROKU_3820X2_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1666018022336-Certificate_ROKU_3820X2_SIGET_El%20Salvador_2022.PDF

ROKU1666018010180-Certificate_ROKU_3820X2_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1666018010180-Certificate_ROKU_3820X2_SIGET_El%20Salvador_2022.PDF

Tech4Home1666013229121-Certificate_Tech4home_T4HiU220837kA_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1666013229121-Certificate_Tech4home_T4HiU220837kA_INDOTEL_Dominican%20Republic_2022.pdf

DURACELL1666012984610-Acknowledgment_1209_Duracell_To_import_Portfolio_Outer_Commerce_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1666012984610-Acknowledgment_1209_Duracell_To_import_Portfolio_Outer_Commerce_Mexico_2022.pdf

DURACELL1666012721822-OF_DGN1910220221936_Permit_Letter_Duracell_Current_Stock_Portfolio_DGN_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1666012721822-OF_DGN1910220221936_Permit_Letter_Duracell_Current_Stock_Portfolio_DGN_Mexico_2022.pdf

PANDUIT1666011534115-CERTIFICATE_PANDUIT_LPCA02X,LPCA08X_NOM-063_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1666011534115-CERTIFICATE_PANDUIT_LPCA02X%2CLPCA08X_NOM-063_ANCE_MEXICO_2022.pdf

HP1665769516140-DICTUM_HyperX_CR001A HXS-HSDG1_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665769516140-DICTUM_HyperX_CR001A%20HXS-HSDG1_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

HP1665769306856-DICTUM_HyperX_CA002WA CF001WA CF002WA CL002WA CL004WA CS002-WA HXS-HSCFX-WA1_NOM-019-SCFI-1998 NOM-016-SCFI-1993_NYCE_MEXICO.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665769306856-DICTUM_HyperX_CA002WA%20CF001WA%20CF002WA%20CL002WA%20CL004WA%20CS002-WA%20HXS-HSCFX-WA1_NOM-019-SCFI-1998%20NOM-016-SCFI-1993_NYCE_MEXICO.pdf

PANDUIT1665763177436-CERTIFICATE_PANDUIT_EF001_DICTUM TELECOM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665763177436-CERTIFICATE_PANDUIT_EF001_DICTUM%20TELECOM_NYCE_MEXICO_2022.pdf

CRICUT1665761963305-Certificate_Cricut_JCTR101_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665761963305-Certificate_Cricut_JCTR101_MTC_Peru_2022.pdf

CRADLEPOINT1665759139962-CERTIFICATE_cradlepoint_S5A052A S0A052A S0A052B_NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665759139962-CERTIFICATE_cradlepoint_S5A052A%20S0A052A%20S0A052B_NOM-019_NYCE_MEXICO_2022.pdf

EBOX1665756656837-Extension_Certificate -TP 10740-3-10_EBOX_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665756656837-Extension_Certificate%20-TP%2010740-3-10_EBOX_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

dbuzolin1665686885690-ANATEL_SMART7RENEWAL_BRAZIL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665686885690-ANATEL_SMART7RENEWAL_BRAZIL_2022.pdf

dbuzolin1665686610316-ANATEL_NOVATE_SMART7 RENEWAL_BRAZIL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665686610316-ANATEL_NOVATE_SMART7%20RENEWAL_BRAZIL_2022.pdf

HP1665686326171-CERTIFICATE_HyperX_PF002WA_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665686326171-CERTIFICATE_HyperX_PF002WA_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

HP1665686305142-CERTIFICATE_HyperX_PF002_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665686305142-CERTIFICATE_HyperX_PF002_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

Trimble1665673270787-NOM-208 Certificate_Trimble_SNR models_NYCE_México_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665673270787-NOM-208%20Certificate_Trimble_SNR%20models_NYCE_Me%CC%81xico_2022.pdf

CRICUT1665669481486-CERTIFICATE_LIDEART_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665669481486-CERTIFICATE_LIDEART_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

HP1665668794317-DICTUM_HyperX_PF002WA_NOM-001-SCFI-2018 NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665668794317-DICTUM_HyperX_PF002WA_NOM-001-SCFI-2018%20NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf

SONY1665607323125-Certificate NYC-2202CT2599_NOM-208_SONY_CFI-ZCP1 (DUALSENSE EDGE)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665607323125-Certificate%20NYC-2202CT2599_NOM-208_SONY_CFI-ZCP1%20%28DUALSENSE%20EDGE%29_NYCE_Mexico_2022.pdf

iRobot1665606487196-CERTIFICATE_iRobot_RCA-Y1_PE No 1-01_INTERTEK_CHILE_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665606487196-CERTIFICATE_iRobot_RCA-Y1_PE%20No%201-01_INTERTEK_CHILE_2022.pdf

HP1665605822299-DICTUM_HyperX_PF002_NOM-032-ENER-2013_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665605822299-DICTUM_HyperX_PF002_NOM-032-ENER-2013_NYCE_MEXICO_2022.pdf

PANDUIT1665602952328-CERTIFICATE_PANDUIT_EF001_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665602952328-CERTIFICATE_PANDUIT_EF001_NOM-019_ANCE_MEXICO_2022.pdf

PANDUIT1665602814911-CERTIFICATE_PANDUIT_EF001_DICTUM SAFETY NOM-001, NOM-016 _ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665602814911-CERTIFICATE_PANDUIT_EF001_DICTUM%20SAFETY%20NOM-001%2C%20NOM-016%20_ANCE_MEXICO_2022.pdf

CRICUT1665577784006-Certificate_Cricut_JCTR101C_MTC_Peru_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665577784006-Certificate_Cricut_JCTR101C_MTC_Peru_2022.pdf

ROKU1665519119799-Certificate_ROKU_RC-GZ1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665519119799-Certificate_ROKU_RC-GZ1_IFT_Mexico_2022.pdf

PANDUIT1665513437771-CERTIFICATE_PANDUIT_ACD01_NOM-001_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665513437771-CERTIFICATE_PANDUIT_ACD01_NOM-001_ANCE_MEXICO_2022.pdf

PANDUIT1665443381855-CERTIFICATE_PANDUIT_ACD01_NOM-064_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665443381855-CERTIFICATE_PANDUIT_ACD01_NOM-064_ANCE_MEXICO_2022.pdf

PANDUIT1665439087450-CERTIFICATE_PANDUIT_MULTIPLE MODELS_NOM-063_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665439087450-CERTIFICATE_PANDUIT_MULTIPLE%20MODELS_NOM-063_ANCE_MEXICO_2022.pdf

ROKU1665429555130-Certificate_ROKU_RC-GZ1_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665429555130-Certificate_ROKU_RC-GZ1_MTC_Peru_2022.pdf

HP1665427303924-NOM-208 Certificate_HyperX_PF009_NYCE_México_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665427303924-NOM-208%20Certificate_HyperX_PF009_NYCE_Me%CC%81xico_2022.pdf

BOSCH1665423030492-Certificate_BOSCH_GSH 14 C_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665423030492-Certificate_BOSCH_GSH%2014%20C_SUTEL_Costa%20Rica_2022.pdf

PANDUIT1665408048436-22147CC000710_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC372_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665408048436-22147CC000710_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC372_China_UVA_Mexico_2022.pdf

PANDUIT1665408026095-22147CC000709_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC272_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665408026095-22147CC000709_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC272_China_UVA_Mexico_2022.pdf

PANDUIT1665408007898-22147CC000708_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC024_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665408007898-22147CC000708_NOM-024-SCFI-2013_Certificate_PANDUIT_ULC024_China_UVA_Mexico_2022.pdf

CRADLEPOINT1665169420517-Certificate_cradlepoint_S5A950A_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665169420517-Certificate_cradlepoint_S5A950A_IFT_Mexico_2022.pdf

PANDUIT1665157681381-CERTIFICATE_PANDUIT_PZAEFAN,PZCFK,PZICFK-E_NOM-003_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665157681381-CERTIFICATE_PANDUIT_PZAEFAN%2CPZCFK%2CPZICFK-E_NOM-003_ANCE_MEXICO_2022.pdf

MICROSFOT1665148301738-Certificate_Microsoft_1925_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665148301738-Certificate_Microsoft_1925_CRC_Colombia_2022.pdf

MICROSFOT1665147909075-Certificate_Microsoft_1855_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665147909075-Certificate_Microsoft_1855_CRC_Colombia_2022.pdf

ORACLE1665079905436-FORM C_ORACLE_EPSON_M159E_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1665079905436-FORM%20C_ORACLE_EPSON_M159E_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1665079876827-CERTIFICATE_ORACLE_EPSON_M159E_RES 169_TUV_ARGENTINA_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1665079876827-CERTIFICATE_ORACLE_EPSON_M159E_RES%20169_TUV_ARGENTINA_2022.pdf

CRICUT1664983556989-CERTIFICATE_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664983556989-CERTIFICATE_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

PANDUIT1664979527389-CERTIFICATE_PANDUIT_PZAEFAN,PZCFK,PZICFK-E_NOM-001_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664979527389-CERTIFICATE_PANDUIT_PZAEFAN%2CPZCFK%2CPZICFK-E_NOM-001_ANCE_MEXICO_2022.pdf

PANDUIT1664978761709-CERTIFICATE_PANDUIT_ACD01_NOM-031_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664978761709-CERTIFICATE_PANDUIT_ACD01_NOM-031_ANCE_MEXICO_2022.pdf

ROKU1664894009101-Certificate_ROKU_3960X_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.amazonaws.com/1664894009101-Certificate_ROKU_3960X_SIGET_El%20Salvador_2022.PDF

iRobot1664803668813-CERTIFICATE_iRobot_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664803668813-CERTIFICATE_iRobot_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

ORACLE1664802405992-Certificate Technical Resolution Letter ANC2201J00002871_NOM-019_FUJITSU_541-0481-05_ANCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664802405992-Certificate%20Technical%20Resolution%20Letter%20ANC2201J00002871_NOM-019_FUJITSU_541-0481-05_ANCE_Mexico_2022.pdf

HP1664547849983-Certificate_HyperX_PF009_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664547849983-Certificate_HyperX_PF009_CRC_Colombia_2022.pdf

ROKU1664545322647-Certificate_ROKU_3820X2_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664545322647-Certificate_ROKU_3820X2_CRC_Colombia_2022.pdf

ROKU1664544759249-Certificate_ROKU_3960X_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664544759249-Certificate_ROKU_3960X_CRC_Colombia_2022.pdf

MICROSOFT1664456418471-Certificate_Microsoft_1797_TATT_Trinidad & Tobago_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664456418471-Certificate_Microsoft_1797_TATT_Trinidad%20%26%20Tobago_2022.pdf

HP1664373872068-CERTIFICATE_HyperX_CP008_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664373872068-CERTIFICATE_HyperX_CP008_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

ORACLE1664371334117-FORM C_ORACLE_EPSON_M235B_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664371334117-FORM%20C_ORACLE_EPSON_M235B_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

CRADLEPOINT1664222571383-Certificado_Cradlepoint_S5A111A S5A118A S5135A_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664222571383-Certificado_Cradlepoint_S5A111A%20S5A118A%20S5135A_NYCE%20%28Dictum%29_Mexico_2022.pdf

CRADLEPOINT1664222441861-Certificado_Cradlepoint_S3A904A,S5A032A_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664222441861-Certificado_Cradlepoint_S3A904A%2CS5A032A_NYCE%20%28Dictum%29_Mexico_2022.pdf

CRADLEPOINT1664222204089-Certificado_Cradlepoint_S0A052A S0A052B_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664222204089-Certificado_Cradlepoint_S0A052A%20S0A052B_NYCE%20%28Dictum%29_Mexico_2022.pdf

CRADLEPOINT1664222095289-Certificado_Cradlepoint_S0A214A_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664222095289-Certificado_Cradlepoint_S0A214A_NYCE%20%28Dictum%29_Mexico_2022.pdf

CRADLEPOINT1664221749217-Certificado_Cradlepoint_S0A214A_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1664221749217-Certificado_Cradlepoint_S0A214A_NYCE%20%28Dictum%29_Mexico_2022.pdf

CRADLEPOINT1664220779855-Certificate_Cradlepoint_S5A950A,S5A033A,S3A749A_Telecom Dictum_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1664220779855-Certificate_Cradlepoint_S5A950A%2CS5A033A%2CS3A749A_Telecom%20Dictum_NYCE_Mexico_2022.pdf

BOSCH1663940895300-Certificate_BOSCH_GLM 150-27 C_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663940895300-Certificate_BOSCH_GLM%20150-27%20C_INDOTEL_Dominican%20Republic_2022.pdf

BOSCH1663940813734-Certificate_BOSCH_GLM 100-25 C_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663940813734-Certificate_BOSCH_GLM%20100-25%20C_INDOTEL_Dominican%20Republic_2022.pdf

SONY1663940059733-Certificate_BOSCH_GLM 100-25 C_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663940059733-Certificate_BOSCH_GLM%20100-25%20C_INDOTEL_Dominican%20Republic_2022.pdf

ORACLE1663938302092-CERTIFICATE_ORACLE_EPSON_M235B_RES 169_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663938302092-CERTIFICATE_ORACLE_EPSON_M235B_RES%20169_IRAM_ARGENTINA_2022.pdf

ORACLE1663938292736-CERTIFICATE_ORACLE_EPSON_M235B_RES 169_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663938292736-CERTIFICATE_ORACLE_EPSON_M235B_RES%20169_IRAM_ARGENTINA_2022.pdf

ROKU1663877927124-Certificate_ROKU_RC-FA1_IFT (Vigencia Indefinida)_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663877927124-Certificate_ROKU_RC-FA1_IFT%20%28Vigencia%20Indefinida%29_Mexico_2022.pdf

CATERPILLAR1663772288015-Certificate_Caterpillar_499-6727_DICTUM NOM-001_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663772288015-Certificate_Caterpillar_499-6727_DICTUM%20NOM-001_NYCE_Mexico_2022.pdf

HP1663768786258-Telecom Dictum_HyperX_PF010_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663768786258-Telecom%20Dictum_HyperX_PF010_NYCE_Mexico_2022.pdf

Casa Systems1663701938541-CERTIFICATE_COMERCIALIZADORA TANGO_CASA SYSTEMS_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663701938541-CERTIFICATE_COMERCIALIZADORA%20TANGO_CASA%20SYSTEMS_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

Casa Systems1663701858301-CERTIFICATE_COMERCIALIZADORA TANGO_CASA SYSTEMS_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663701858301-CERTIFICATE_COMERCIALIZADORA%20TANGO_CASA%20SYSTEMS_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

HP1663679966412-CERTIFICATE_HyperX_PF010_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663679966412-CERTIFICATE_HyperX_PF010_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

BOSCH1663616510315-Certificate_BOSCH_GLM 150-27 C_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663616510315-Certificate_BOSCH_GLM%20150-27%20C_ASEP_Panama_2022.pdf

CRADLEPOINT1663597750960-Certificate_Cradlepoint_S5A139A_NOM-024_INSPEC_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663597750960-Certificate_Cradlepoint_S5A139A_NOM-024_INSPEC_Mexico_2022.pdf

PANDUIT1663592856536-22147CC000670_NOM-004-SCFI-2006_Certificate_PANDUIT_TEXTILE_Label_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663592856536-22147CC000670_NOM-004-SCFI-2006_Certificate_PANDUIT_TEXTILE_Label_Costa_Rica_UVA_Mexico_2022.pdf

MICROSOFT1663592742880-Certificate_Microsoft_1797_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663592742880-Certificate_Microsoft_1797_ASEP_Panama_2022.pdf

PANDUIT1663592725386-22147CC000669_NOM-004-SCFI-2006_Certificate_PANDUIT_TECHINAL_USE_TEXTILE_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663592725386-22147CC000669_NOM-004-SCFI-2006_Certificate_PANDUIT_TECHINAL_USE_TEXTILE_Costa_Rica_UVA_Mexico_2022.pdf

MICROSOFT1663592482093-Certificate_Microsoft_1797_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663592482093-Certificate_Microsoft_1797_CONATEL_Paraguay_2022.pdf

CRICUT1663592364304-CERTIFICATE_LIDEART_CRICUT_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663592364304-CERTIFICATE_LIDEART_CRICUT_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

DURACELL1663362167440-Certificate-DURACELL-OptimumAAA-Belgium-Intertek-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663362167440-Certificate-DURACELL-OptimumAAA-Belgium-Intertek-Colombia-2022.pdf

DURACELL1663361882385-Certificate-DURACELL-OptimumAA-China-Intertek-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663361882385-Certificate-DURACELL-OptimumAA-China-Intertek-Colombia-2022.pdf

DURACELL1663361877582-Certificate-DURACELL-OptimumAA-China-Intertek-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663361877582-Certificate-DURACELL-OptimumAA-China-Intertek-Colombia-2022.pdf

DURACELL1663351867760-Certificate-DURACELL-OptimumAA&AAA&CoppertopAA&AAA-China-INTERTEK-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663351867760-Certificate-DURACELL-OptimumAA%26AAA%26CoppertopAA%26AAA-China-INTERTEK-Colombia-2022.pdf

SONY1663270136939-Certificate_SONY_CFI-1215A_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663270136939-Certificate_SONY_CFI-1215A_SUBTEL_Chile_2022.pdf

SONY1663269975342-Certificate_SONY_CFI-1215B_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663269975342-Certificate_SONY_CFI-1215B_SUBTEL_Chile_2022.pdf

HP1663251688986-DICTUM_HyperX_PF010_NOM-032-ENER-2013_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663251688986-DICTUM_HyperX_PF010_NOM-032-ENER-2013_NYCE_MEXICO_2022.pdf

Cradlepoint1663185442900-CERTIFICATE_Cradlepoint_S5A139A_Telecom Dictum_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663185442900-CERTIFICATE_Cradlepoint_S5A139A_Telecom%20Dictum_NYCE_MEXICO_2022.pdf

Casa Systems1663091854279-CERTIFICATE_CASA SYSTEMS_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663091854279-CERTIFICATE_CASA%20SYSTEMS_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

Casa Systems1663091293301-CERTIFICATE_CASA SYSTEMS_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663091293301-CERTIFICATE_CASA%20SYSTEMS_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

Cradlepoint1663081917368-Certificate_Cradlepoint_170700-00_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663081917368-Certificate_Cradlepoint_170700-00_NYCE%20%28Dictum%29_Mexico_2022.pdf

Cradlepoint1663081890001-Certificado_Cradlepoint_MC400-5GB_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1663081890001-Certificado_Cradlepoint_MC400-5GB_NYCE%20%28Dictum%29_Mexico_2022.pdf

PANDUIT1663013484241-22147CC000656_NOM-050-SCFI-2004_Certificate_PANDUIT_ROLL_LABEL_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013484241-22147CC000656_NOM-050-SCFI-2004_Certificate_PANDUIT_ROLL_LABEL_USA_UVA_Mexico_2022.pdf

PANDUIT1663013469311-22147CC000658_NOM-050-SCFI-2004_Certificate_PANDUIT_TERMINAL_PLASTIC_COVER_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013469311-22147CC000658_NOM-050-SCFI-2004_Certificate_PANDUIT_TERMINAL_PLASTIC_COVER_USA_UVA_Mexico_2022.pdf

PANDUIT1663013450169-22147CC000655_NOM-050-SCFI-2004_Certificate_PANDUIT_PLASTIC_COVER_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013450169-22147CC000655_NOM-050-SCFI-2004_Certificate_PANDUIT_PLASTIC_COVER_USA_UVA_Mexico_2022.pdf

PANDUIT1663013428029-22147CC000654_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013428029-22147CC000654_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_USA_UVA_Mexico_2022.pdf

PANDUIT1663013400593-22147CC000653_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_RUMANIA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013400593-22147CC000653_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_RUMANIA_UVA_Mexico_2022.pdf

PANDUIT1663013385694-22147CC000652_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_COSTA_RICA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013385694-22147CC000652_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_COSTA_RICA_UVA_Mexico_2022.pdf

PANDUIT1663013365444-22147CC000651_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_CHINA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663013365444-22147CC000651_NOM-050-SCFI-2004_Certificate_PANDUIT_OPTIC_FIBER_CONNECTION_CHINA_UVA_Mexico_2022.pdf

SATO1663009019637-CERTIFICATE_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663009019637-CERTIFICATE_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

ROKU1663000586320-Certificate_ROKU_RC-GZ1_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1663000586320-Certificate_ROKU_RC-GZ1_CONATEL_Honduras_2022.pdf

DURACELL1662997663482-22049UCC_NOM-024-SCFI-2013000498_Certificate_CEF14_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662997663482-22049UCC_NOM-024-SCFI-2013000498_Certificate_CEF14_China_UVA_Mexico_2022.pdf

SATO1662993382189-Certificate RCPSACL22-4086-A1_SATO_CL6NX Plus_IFT_Mexico_202.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662993382189-Certificate%20RCPSACL22-4086-A1_SATO_CL6NX%20Plus_IFT_Mexico_202.pdf

SATO1662993249939-Certificate RCPSACL22-4086_SATO_CL4NX Plus_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662993249939-Certificate%20RCPSACL22-4086_SATO_CL4NX%20Plus_IFT_Mexico_2022.pdf

PANDUIT1662988234610-CERTIFICATE_PANDUIT_JBC311U93_TELECOM DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662988234610-CERTIFICATE_PANDUIT_JBC311U93_TELECOM%20DICTUM_NYCE_MEXICO_2022.pdf

BOSCH1662733771174-Certificate_BOSCH_ GLM 100-25 C_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662733771174-Certificate_BOSCH_%20GLM%20100-25%20C_ASEP_Panama_2022.pdf

MICROSOFT1662664660486-Certificate_Microsoft_1797_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662664660486-Certificate_Microsoft_1797_INDOTEL_Dominican%20Republic_2022.pdf

SION S.A.1662648903564-FORM C_SION_APD_WA-30P12R WA-30P12FA_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662648903564-FORM%20C_SION_APD_WA-30P12R%20WA-30P12FA_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

SION S.A.1662579648939-CERTIFICATE_SION_APD_WA-30P12R WA30P12FA_RES 169_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662579648939-CERTIFICATE_SION_APD_WA-30P12R%20WA30P12FA_RES%20169_IRAM_ARGENTINA_2022.pdf

PANDUIT1662578803319-Certificate_PANDUIT_1F1V1A (U05N11V)_1F1V1A (U05S11V)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662578803319-Certificate_PANDUIT_1F1V1A%20%28U05N11V%29_1F1V1A%20%28U05S11V%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662578662840-Certificate_PANDUIT_1E1L2A (U03N11L)_1E1L2A (U03S11L)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662578662840-Certificate_PANDUIT_1E1L2A%20%28U03N11L%29_1E1L2A%20%28U03S11L%29_INSPEC-UVA_Mexico_2022.pdf

NEDAP1662556491141-Certificate_NEDAP_ASSY AD46 RF+RFID_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662556491141-Certificate_NEDAP_ASSY%20AD46%20RF%2BRFID_SIT_Guatemala_2022.pdf

NEDAP1662556329566-Certificate_NEDAP_SMART DEACT_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662556329566-Certificate_NEDAP_SMART%20DEACT_SIT_Guatemala_2022.pdf

Nedap1662556040080-Certificate_Nedap_SMART DEACT_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662556040080-Certificate_Nedap_SMART%20DEACT_URSEC_Uruguay_2022.pdf

NEDAP1662555883503-Certificate_NEDAP_ASSY AD46 RF_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662555883503-Certificate_NEDAP_ASSY%20AD46%20RF_SIT_Guatemala_2022.pdf

CEI1662494216574-Certificate_Sensoteq_WMVM_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662494216574-Certificate_Sensoteq_WMVM_SUBTEL_Chile_2022.pdf

CEI1662494025099-Certificate_Sensoteq_KPXS VE01-XXX_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662494025099-Certificate_Sensoteq_KPXS%20VE01-XXX_SUBTEL_Chile_2022.pdf

VISUAR SA.1662472640148-Extension_Certificate -TP 10740-3-20_VISUAR_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662472640148-Extension_Certificate%20-TP%2010740-3-20_VISUAR_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

ROKU1662406012375-Certificate_Roku_3930X_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662406012375-Certificate_Roku_3930X_ENACOM_Argentina_2022.pdf

SONY1662405411764-Certificate_RCPSOCF22-3020_SONY_CFI-1215B_FOXCONN_J20H104_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662405411764-Certificate_RCPSOCF22-3020_SONY_CFI-1215B_FOXCONN_J20H104_IFT_Mexico_2022.pdf

SONY1662405313806-Certificate_RCPSOCF22-3019_SONY_CFI-1215A_FOXCONN_J20H104_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662405313806-Certificate_RCPSOCF22-3019_SONY_CFI-1215A_FOXCONN_J20H104_IFT_Mexico_2022.pdf

SONY1662405200512-Certificate_RCPSOCF22-3018_SONY_CFI-1215B_FOXCONN_J20H100_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662405200512-Certificate_RCPSOCF22-3018_SONY_CFI-1215B_FOXCONN_J20H100_IFT_Mexico_2022.pdf

SONY1662405088054-Certificate_RCPSOCF22-3017_SONY_CFI-1215A_FOXCONN_J20H100_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662405088054-Certificate_RCPSOCF22-3017_SONY_CFI-1215A_FOXCONN_J20H100_IFT_Mexico_2022.pdf

SONY1662404971799-Certificate_RCPSOCF22-3016_SONY_CFI-1215B_AZUREWAVE_AW-XM546_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662404971799-Certificate_RCPSOCF22-3016_SONY_CFI-1215B_AZUREWAVE_AW-XM546_IFT_Mexico_2022.pdf

SONY1662404833942-Certificate_RCOSOCF22-3015_SONY_CFI-1215A_AZUREWAVE_AW-XM546_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662404833942-Certificate_RCOSOCF22-3015_SONY_CFI-1215A_AZUREWAVE_AW-XM546_IFT_Mexico_2022.pdf

SONY1662404664221-Certificate_RCPSOCF22-3014_SONY_CFI-1215B_AZUREWAVE_AW-XM501_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662404664221-Certificate_RCPSOCF22-3014_SONY_CFI-1215B_AZUREWAVE_AW-XM501_IFT_Mexico_2022.pdf

SONY1662404522426-Certificate_RCPSOCF22-3013_SONY_CFI-1215A_AZUREWAVE_AW-XM501_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662404522426-Certificate_RCPSOCF22-3013_SONY_CFI-1215A_AZUREWAVE_AW-XM501_IFT_Mexico_2022.pdf

CRICUT1662393782737-CERTIFICATE_CRICUT_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662393782737-CERTIFICATE_CRICUT_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRADLEPOINT1662388419063-CERTIFICATE_Cradlepoint_S5A139A_Safety Dictum_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662388419063-CERTIFICATE_Cradlepoint_S5A139A_Safety%20Dictum_NYCE_MEXICO_2022.pdf

ROKU1662384291197-CERTIFICATE_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662384291197-CERTIFICATE_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

NUSKIN1662149400847-Certificate_Nu Skin Lumispa iO_LS2F_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662149400847-Certificate_Nu%20Skin%20Lumispa%20iO_LS2F_ENACOM_Argentina_2022.pdf

SATO1662063114450-CERTIFICATE_SATO-BLUESTAR_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662063114450-CERTIFICATE_SATO-BLUESTAR_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

SATO1662062708041-CERTIFICATE_SATO-BLUESTAR_1BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662062708041-CERTIFICATE_SATO-BLUESTAR_1BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

SATO1662048241890-CERTIFICATE_SATO-BLUESTAR_4BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662048241890-CERTIFICATE_SATO-BLUESTAR_4BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

LENOVO1662043042996-Certificate Update_Lenovo_IdeaPad 1 15IJL7_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662043042996-Certificate%20Update_Lenovo_IdeaPad%201%2015IJL7_SUBTEL_Chile_2021.pdf

PANDUIT1662039137592-Certificate_PANDUIT_1C1L2A (U02N11L)_1C1L2A (U02S11L)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662039137592-Certificate_PANDUIT_1C1L2A%20%28U02N11L%29_1C1L2A%20%28U02S11L%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662038786974-Certificate_PANDUIT_1A1L2A (U01N11L)_1A1L2A (U01S11L)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662038786974-Certificate_PANDUIT_1A1L2A%20%28U01N11L%29_1A1L2A%20%28U01S11L%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662038528926-Certificate_PANDUIT_1H1V1A (U10N11V)_1HV1A (U10S11V)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662038528926-Certificate_PANDUIT_1H1V1A%20%28U10N11V%29_1HV1A%20%28U10S11V%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662038323963-Certificate_PANDUIT_1G1V1A (U06N11V)_1G1V1A (U06S11V)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662038323963-Certificate_PANDUIT_1G1V1A%20%28U06N11V%29_1G1V1A%20%28U06S11V%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662037409688-Certificate_PANDUIT_1E1V1A (U03N11V)_1E1V1A (U03S11V)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662037409688-Certificate_PANDUIT_1E1V1A%20%28U03N11V%29_1E1V1A%20%28U03S11V%29_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662037179340-Certificate_PANDUIT_1D1V1A (U02N11V)_1D1V1A (U02S11V)__INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662037179340-Certificate_PANDUIT_1D1V1A%20%28U02N11V%29_1D1V1A%20%28U02S11V%29__INSPEC-UVA_Mexico_2022.pdf

PANDUIT1662037144144-Certificate Checklist NOM-024 Family 2.pages
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662037144144-Certificate%20Checklist%20NOM-024%20Family%202.pages

PANDUIT1662036387793-Certificate_PANDUIT_1B1V1A (U01N11V)_1B1V1A (U01S11V)_1A1V1A (U01N13V)_1A1V1A (U01S13V)_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1662036387793-Certificate_PANDUIT_1B1V1A%20%28U01N11V%29_1B1V1A%20%28U01S11V%29_1A1V1A%20%28U01N13V%29_1A1V1A%20%28U01S13V%29_INSPEC-UVA_Mexico_2022.pdf

BOSCH1662034818052-Certificate_BOSCH_GLM 150-27 C_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1662034818052-Certificate_BOSCH_GLM%20150-27%20C_URSEC_Uruguay_2022.pdf

ROKU1661883971171-CERTIFICATE_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661883971171-CERTIFICATE_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

ORACLE1661880487414-NOM-208 Certificate_ORACLE_MICROS Compact Workstation 3_NYCE_México_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661880487414-NOM-208%20Certificate_ORACLE_MICROS%20Compact%20Workstation%203_NYCE_Me%CC%81xico_2022.pdf

CRICUT1661873973515-NOM-208 Certificate_Cricut models with BDE-BDM209 Module_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661873973515-NOM-208%20Certificate_Cricut%20models%20with%20BDE-BDM209%20Module_NYCE_Mexico_2022.pdf

CRICUT1661873934861-NOM-208 Certificate_Cricut models with CBM002 Module_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661873934861-NOM-208%20Certificate_Cricut%20models%20with%20CBM002%20Module_NYCE_Mexico_2022.pdf

CRICUT1661873895990-NOM-208 Certificate_Cricut models wih RN4678 module_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661873895990-NOM-208%20Certificate_Cricut%20models%20wih%20RN4678%20module_NYCE_Mexico_2022.pdf

SATO1661872958161-CERTIFICATE_SATO_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661872958161-CERTIFICATE_SATO_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

BOSCH1661798223210-Certificate_BOSCH_GLM 150-27 C_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661798223210-Certificate_BOSCH_GLM%20150-27%20C_SUTEL_Costa%20Rica_2022.pdf

BOSCH1661797300264-Certificate_BOSCH_ GLM 100-25 C_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661797300264-Certificate_BOSCH_%20GLM%20100-25%20C_SUBTEL_Chile_2022.pdf

LENOVO1661786861711-Certificate_Lenovo_IdeaPad 1 15 IGL7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661786861711-Certificate_Lenovo_IdeaPad%201%2015%20IGL7_SUBTEL_Chile_2022.pdf

LENOVO1661785553089-Certificate_Lenovo_IdeaPad 1 14 IGL7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661785553089-Certificate_Lenovo_IdeaPad%201%2014%20IGL7_SUBTEL_Chile_2022.pdf

SATO1661785439469-CERTIFICATE_SATO_4BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661785439469-CERTIFICATE_SATO_4BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

ROKU1661784616442- Certificate_ROKU_3820X (3820MX)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661784616442-%20Certificate_ROKU_3820X%20%283820MX%29_IFT_Mexico_2022.pdf

Nedap1661544444903-Certificate_Nedap_VP4102 VP8002 VP8002-VP4102_NYCE (Telecom Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661544444903-Certificate_Nedap_VP4102%20VP8002%20VP8002-VP4102_NYCE%20%28Telecom%20Dictum%29_Mexico_2022.pdf

ORACLE1661542233228-CERTIFICATE_ORACLE_7605096_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661542233228-CERTIFICATE_ORACLE_7605096_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

SATO1661533111135-CERTIFICATE_SATO_1BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661533111135-CERTIFICATE_SATO_1BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

Trimble1661456666872-NOM-208 Certificate_Trimble_EC520-W_NYCE_México_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661456666872-NOM-208%20Certificate_Trimble_EC520-W_NYCE_Me%CC%81xico_2022.pdf

PANDUIT1661452944862-Certificate_NOM-001_NYC-2202C1E14546_PANDUIT_1G1V1A (U06N11V); 1G1V1A (U06S11V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661452944862-Certificate_NOM-001_NYC-2202C1E14546_PANDUIT_1G1V1A%20%28U06N11V%29%3B%201G1V1A%20%28U06S11V%29_NYCE_Mexico_2022.pdf

PANDUIT1661446365467-Certificate_NOM-001_NYC-2202C1E14254_PANDUIT_1E1V1A (U03N11V); 1E1V1A (U03S11V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661446365467-Certificate_NOM-001_NYC-2202C1E14254_PANDUIT_1E1V1A%20%28U03N11V%29%3B%201E1V1A%20%28U03S11V%29_NYCE_Mexico_2022.pdf

PANDUIT1661437444720-Certificate_NOM-001_NYC-2202C1E14258_PANDUIT_1D1V1A (U02N11V); 1D1V1A (U02S11V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661437444720-Certificate_NOM-001_NYC-2202C1E14258_PANDUIT_1D1V1A%20%28U02N11V%29%3B%201D1V1A%20%28U02S11V%29_NYCE_Mexico_2022.pdf

PANDUIT1661432837692-Certificate_NOM-001_NYC-2202C1E14548_PANDUIT_1B1V1A (U01N11V); 1B1V1A (U01S11V); 1A1V1A (U01N13V); 1A1V1A (U01S13V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661432837692-Certificate_NOM-001_NYC-2202C1E14548_PANDUIT_1B1V1A%20%28U01N11V%29%3B%201B1V1A%20%28U01S11V%29%3B%201A1V1A%20%28U01N13V%29%3B%201A1V1A%20%28U01S13V%29_NYCE_Mexico_2022.pdf

BOSCH1661430734438-Certificate_BOSCH_GLM 150-27 C_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661430734438-Certificate_BOSCH_GLM%20150-27%20C_SUBTEL_2022.pdf

NEDAP1661367494279-Certificate_Nedap_VP8002-VP4102_NOM-024_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661367494279-Certificate_Nedap_VP8002-VP4102_NOM-024_Mexico_2022.pdf

NEDAP1661367387082-Certificate_Nedap_VP8002_NOM-024_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661367387082-Certificate_Nedap_VP8002_NOM-024_Mexico_2022.pdf

NEDAP1661367199368-Certificate_Nedap_VP4102_NOM-024_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661367199368-Certificate_Nedap_VP4102_NOM-024_Mexico_2022.pdf

HP1661366753875-Certificate_HyperX_CP008_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661366753875-Certificate_HyperX_CP008_INSPEC-UVA_Mexico_2022.pdf

HP1661353396392-Certificate_HyperX_PF010_White_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661353396392-Certificate_HyperX_PF010_White_INSPEC-UVA_Mexico_2022.pdf

HP1661353224196-Certificate_HyperX_PF010_Black_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661353224196-Certificate_HyperX_PF010_Black_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1661351162483-Certificate_NYC-2202C0E14694_PANDUIT_1F1V1A (U05N11V); 1F1V1A (U05S11V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661351162483-Certificate_NYC-2202C0E14694_PANDUIT_1F1V1A%20%28U05N11V%29%3B%201F1V1A%20%28U05S11V%29_NYCE_Mexico_2022.pdf

NANXUS1661350374261-CERTIFICATE_NETRADYNE_D-430, D-210, DCM-NA1-200_NOM-001_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661350374261-CERTIFICATE_NETRADYNE_D-430%2C%20D-210%2C%20DCM-NA1-200_NOM-001_NYCE_MEXICO_2022.pdf

BTL1661349988016-Certificate_RZ01-0440_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1661349988016-Certificate_RZ01-0440_INSPEC-UVA_Mexico_2021.pdf

DURACELL1661266747275-22147CC000583_NOM-024-SCFI-2013__Certificate_2032_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661266747275-22147CC000583_NOM-024-SCFI-2013__Certificate_2032_China_UVA_Mexico_2022.pdf

MICROSOFT1661266554070-Certificate_Microsoft_1797_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661266554070-Certificate_Microsoft_1797_SIT_Guatemala_2022.pdf

HP1661261464508-Dictum_HyperX_CL005WA_NOM-196-SCFI-2016 NOM-218-SCFI-2017 NOM-221-SCFI-2017_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661261464508-Dictum_HyperX_CL005WA_NOM-196-SCFI-2016%20NOM-218-SCFI-2017%20NOM-221-SCFI-2017_NYCE_Mexico_2022.pdf

HP1661259604338-DICTUM_HyperX_CL005WA_NOM-016-SCFI-1993 NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661259604338-DICTUM_HyperX_CL005WA_NOM-016-SCFI-1993%20NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

DEER TECHNOLOGY1661259248888-Extension_Certificate -TP 10740-3-14_DEER_TECH_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661259248888-Extension_Certificate%20-TP%2010740-3-14_DEER_TECH_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1661200128064-22049UCC_NOM-024-SCFI-2013000484_Certificate_CEF14+6AA+2AAATBCd6TRY_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661200128064-22049UCC_NOM-024-SCFI-2013000484_Certificate_CEF14%2B6AA%2B2AAATBCd6TRY_China_UVA_Mexico_2022.pdf

PANDUIT1661195956845-Certificate_NYC_CEDT1241-22_PANDUIT_1H1V1A (U10N11V-U10S11V)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661195956845-Certificate_NYC_CEDT1241-22_PANDUIT_1H1V1A%20%28U10N11V-U10S11V%29_NYCE_Mexico_2022.pdf

ORACLE1661190019994-CERTIFICATE_ORACLE_7605092_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661190019994-CERTIFICATE_ORACLE_7605092_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

BOSCH1661188278139-Certificate_BOSCH_GLM 100-25 C_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661188278139-Certificate_BOSCH_GLM%20100-25%20C_URSEC_Uruguay_2022.pdf

ROKU1661182645234-Certificate_ROKU_RC-GZ1_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1661182645234-Certificate_ROKU_RC-GZ1_NYCE_Mexico_2022.pdf

Panduit1661175857909-CERTIFICATE_PANDUIT_JBC311U93_HSE NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1661175857909-CERTIFICATE_PANDUIT_JBC311U93_HSE%20NOM-019_ANCE_MEXICO_2022.pdf

HP1660919795079-CERTIFICATE_HyperX_CL005WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660919795079-CERTIFICATE_HyperX_CL005WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1660919775118-CERTIFICATE_HyperX_CL005_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660919775118-CERTIFICATE_HyperX_CL005_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

MICROSOFT1660853941070-Certificate_Microsoft_1959_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660853941070-Certificate_Microsoft_1959_SUBTEL_Chile_2022.pdf

BOSCH1660851666984-Certificate_BOSCH_GLM 50-27 C_SUBTEL_Chile.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660851666984-Certificate_BOSCH_GLM%2050-27%20C_SUBTEL_Chile.pdf

BOSCH1660851471189-Certificate_BOSCH_GLM 50-27 C.pdf
https://orbiscompliance.s3.amazonaws.com/1660851471189-Certificate_BOSCH_GLM%2050-27%20C.pdf

BOSCH1660748291314-Certificate_BOSCH_GLM 100-25 C_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660748291314-Certificate_BOSCH_GLM%20100-25%20C_SUTEL_Costa%20Rica_2022.pdf

MICROSOFT1660743496918-Certificate_Microsoft_1797_MTC_Peru_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660743496918-Certificate_Microsoft_1797_MTC_Peru_2022.pdf

NEDAP1660675764667-Certificate_NOM-024_Nedap_SmartTag Neck_INSPEC_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660675764667-Certificate_NOM-024_Nedap_SmartTag%20Neck_INSPEC_Mexico_2022.pdf

HP1660671762806-Ceritificate_HyperX_CL005WA_CONATEL_Venezuela_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660671762806-Ceritificate_HyperX_CL005WA_CONATEL_Venezuela_2022.pdf

HP1660671590355-Ceritificate_HyperX_CL005_CONATEL_Venezuela_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660671590355-Ceritificate_HyperX_CL005_CONATEL_Venezuela_2022.pdf

ASKEY1660586287776-CoC_ASKEY_RG3110W_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660586287776-CoC_ASKEY_RG3110W_ANATEL_Brazil_2022.pdf

ROKU1660239901636-Certificate_ROKU_RC-GZ1_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660239901636-Certificate_ROKU_RC-GZ1_SUBTEL_Chile_2022.pdf

HP1660144450843-Certificate_HyperX_CL005WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660144450843-Certificate_HyperX_CL005WA_SUBTEL_Chile_2022.pdf

HP1660144323359-Certificate_HyperX_CL005_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660144323359-Certificate_HyperX_CL005_SUBTEL_Chile_2022.pdf

HP1660143354741-Certificate_Hyperx_CS009WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660143354741-Certificate_Hyperx_CS009WA_SUBTEL_Chile_2022.pdf

HP1660143244861-Certificate_Hyperx_CS009_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660143244861-Certificate_Hyperx_CS009_SUBTEL_Chile_2022.pdf

HP1660139991284-Certificate_HyperX_CL005_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660139991284-Certificate_HyperX_CL005_MTC_Peru_2022.pdf

NU SKIN1660065652293-Letter_N° 4790_NuSkin_AgeLOC_body_iO_DIGEMID_Peru_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1660065652293-Letter_N%C2%B0%204790_NuSkin_AgeLOC_body_iO_DIGEMID_Peru_2022.PDF

SONY1660059195272-Certificate_Sony_CFI-ZCVL1 CFI-ZCVR1_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1660059195272-Certificate_Sony_CFI-ZCVL1%20CFI-ZCVR1_SUBTEL_Chile_2022.pdf

HP1659969570640-Certificate_HyperX_CL005_CL005WA_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659969570640-Certificate_HyperX_CL005_CL005WA_INSPEC-UVA_Mexico_2022.pdf

SATO1659968124405-Certificate_SATO_CT4-LX_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659968124405-Certificate_SATO_CT4-LX_IFT_Mexico_2022.pdf

ROKU1659729430879-Certificate_ROKU_RC-GZ1_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659729430879-Certificate_ROKU_RC-GZ1_ASEP_Panama_2022.pdf

ROKU1659713616711-CERTIFICATE_ROKU_3820X(3820MX)_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659713616711-CERTIFICATE_ROKU_3820X%283820MX%29_ANCE_MEXICO_2022.pdf

HP1659705954154-NOM-208 Certificate_HyperX_CL005WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659705954154-NOM-208%20Certificate_HyperX_CL005WA_NYCE_Mexico_2022.pdf

HP1659705869582-NOM-208 Certificate_HyperX_CL005_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659705869582-NOM-208%20Certificate_HyperX_CL005_NYCE_Mexico_2022.pdf

BOSCH1659638587840-Certificate_BOSCH_GWS 18V-10 PSC_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659638587840-Certificate_BOSCH_GWS%2018V-10%20PSC_SUBTEL_Chile_2022.pdf

BOSCH1659637870221-Certificate_BOSCH_GKT 18V-52 GC_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659637870221-Certificate_BOSCH_GKT%2018V-52%20GC_SUBTEL_Chile_2022.pdf

CEI1659635057964-Certificate_Sensoteq_ANTR2003_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659635057964-Certificate_Sensoteq_ANTR2003_SUBTEL_Chile_2022.pdf

SONY1659616967380-Certificate_SONY_CFI-1215B_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659616967380-Certificate_SONY_CFI-1215B_CONATEL_Honduras_2022.pdf

SONY1659616632920-Certificate_SONY_CFI-1215A_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659616632920-Certificate_SONY_CFI-1215A_CONATEL_Honduras_2022.pdf

ROKU1659550178396-Importer Certificate_ROKU_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659550178396-Importer%20Certificate_ROKU_ENACOM_Argentina_2022.pdf

KINGSTON1659541964270-CERTIFICATE_KINGSTON_SXS2000 MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659541964270-CERTIFICATE_KINGSTON_SXS2000%20MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

ROKU1659541697998-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659541697998-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf

ROKU1659541595687-CERTIFICATE_ROKU_ADS-65CJ-12-2 12060E_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659541595687-CERTIFICATE_ROKU_ADS-65CJ-12-2%2012060E_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf

SONY1659465456732-Certificate_SONY_CFI-1215B_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659465456732-Certificate_SONY_CFI-1215B_CONATEL_Honduras_2022.pdf

ROKU1659462779428-Certificate_ROKU_RC-GZ1-ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659462779428-Certificate_ROKU_RC-GZ1-ENACOM_Argentina_2022.pdf

DURACELL1659447751573-Surveillance_Resolution_ Certificate_Duracell-PROCELL_NYCE6896_NYCE_6897_NYCE6898M1_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659447751573-Surveillance_Resolution_%20Certificate_Duracell-PROCELL_NYCE6896_NYCE_6897_NYCE6898M1_NYCE_Mexico_2022.pdf

ECRIN1659444999635-Extension_Certificate -TP_10740-3-13_ECRIN_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659444999635-Extension_Certificate%20-TP_10740-3-13_ECRIN_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

1659444981887-Extension_Certificate -TP_10740-3-13_ECRIN_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659444981887-Extension_Certificate%20-TP_10740-3-13_ECRIN_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

ROKU1659364401468-Certificate_ROKU_RC-GZ1_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659364401468-Certificate_ROKU_RC-GZ1_SIT_Guatemala_2022.pdf

ROKU1659364313817-Certificate_ROKU_RC-GZ1_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659364313817-Certificate_ROKU_RC-GZ1_SIT_Guatemala_2022.pdf

CRICUT1659363546052-Certificate_Cricut_JCTR101_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659363546052-Certificate_Cricut_JCTR101_SIT_Guatemala_2022.pdf

HP1659362313912-Certificate_HyperX_CL005WA_MTC_Peru_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659362313912-Certificate_HyperX_CL005WA_MTC_Peru_2022.pdf

ORACLE1659115111775-FORM C_ORACLE_VAC14S-V1625 VAC14S-V1625A_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659115111775-FORM%20C_ORACLE_VAC14S-V1625%20VAC14S-V1625A_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1659115101692-FORM C_ORACLE_VA2073-VAC5S_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659115101692-FORM%20C_ORACLE_VA2073-VAC5S_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1659115088699-FORM C_ORACLE_VA2073-VA1625 VA2073-V1625A_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659115088699-FORM%20C_ORACLE_VA2073-VA1625%20VA2073-V1625A_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ROKU1659101613584-CERTIFICATE_ROKU_9102X(9102MX)_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659101613584-CERTIFICATE_ROKU_9102X%289102MX%29_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

NEDAP1659098810818-CERTIFICATE_LA FORTALEZA ASSET_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1659098810818-CERTIFICATE_LA%20FORTALEZA%20ASSET_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

NEDAP1659098794651-CERTIFICATE_EAS SYSTEMS_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1659098794651-CERTIFICATE_EAS%20SYSTEMS_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

LENOVO1658953017391-Certificate_Lenovo_Yoga Slim 7 Pro 16IAH7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658953017391-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2016IAH7_SUBTEL_Chile_2022.pdf

ORACLE1658937742182-FORM C_ORACLE_VAC20S-VSC19_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658937742182-FORM%20C_ORACLE_VAC20S-VSC19_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1658937729274-FORM C_ORACLE_AR20S-VSC19_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658937729274-FORM%20C_ORACLE_AR20S-VSC19_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1658937715737-FORM C_ORACLE_AR10S2 and VAC7S_CORDSET_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658937715737-FORM%20C_ORACLE_AR10S2%20and%20VAC7S_CORDSET_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ROKU1658928620596-CERTIFICATE_ROKU_3920MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658928620596-CERTIFICATE_ROKU_3920MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

Casa Systems1658928274646-CERTIFICATE_casa systems_C40G_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658928274646-CERTIFICATE_casa%20systems_C40G_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

PEPPERL1658925782911-Certificate_ECOM_TAB EX 03 DZ2_Colombia_CRC_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658925782911-Certificate_ECOM_TAB%20EX%2003%20DZ2_Colombia_CRC_2022.pdf

CRICUT1658864873783-Certificate_Cricut_JCTR101C_TELCOR_Nicaragua_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658864873783-Certificate_Cricut_JCTR101C_TELCOR_Nicaragua_2022.pdf

CRICUT1658864857409-Certificate_Cricut_JCTR101_TELCOR_Nicaragua_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658864857409-Certificate_Cricut_JCTR101_TELCOR_Nicaragua_2022.pdf

DURACELL1658864843257-TP 10740-6_Certificate_Duracell_OPTIMUM_AA&AAA_USA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658864843257-TP%2010740-6_Certificate_Duracell_OPTIMUM_AA%26AAA_USA_IQC_Argentina_2022.pdf

CRICUT1658864494765-Certificate_Cricut_CHP220B3_TELCOR_Nicaragua_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658864494765-Certificate_Cricut_CHP220B3_TELCOR_Nicaragua_2022.pdf

CRICUT1658863266594-Certificate_Cricut_CHP180B3_TELCOR_Nicaragua_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658863266594-Certificate_Cricut_CHP180B3_TELCOR_Nicaragua_2022.pdf

PANDUIT1658861054122-Clearance Letter_PANDUIT_1B1V1A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658861054122-Clearance%20Letter_PANDUIT_1B1V1A_NYCE_Mexico_2022.pdf

HP1658849234166-Certificate_HyperX_CL005WA_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658849234166-Certificate_HyperX_CL005WA_URSEC_Uruguay_2022.pdf

HP1658849173335-Certificate_HyperX_CL005_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658849173335-Certificate_HyperX_CL005_URSEC_Uruguay_2022.pdf

ORACLE1658778582006-CERTIFICATE_ORACLE_VAC20S-VSC19_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778582006-CERTIFICATE_ORACLE_VAC20S-VSC19_CORDSET_IRAM_ARGENTINA_2022.pdf

ORACLE1658778552760-CERTIFICATE_ORACLE_VAC14S-V1625 VAC14S-V1625A_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778552760-CERTIFICATE_ORACLE_VAC14S-V1625%20VAC14S-V1625A_CORDSET_IRAM_ARGENTINA_2022.pdf

ORACLE1658778536365-CERTIFICATE_ORACLE_VA2073-VAC5S_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778536365-CERTIFICATE_ORACLE_VA2073-VAC5S_CORDSET_IRAM_ARGENTINA_2022.pdf

ORACLE1658778506180-CERTIFICATE_ORACLE_VA2073-VA1625 VA2073-V1625A VA2073-VAC5S_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778506180-CERTIFICATE_ORACLE_VA2073-VA1625%20VA2073-V1625A%20VA2073-VAC5S_CORDSET_IRAM_ARGENTINA_2022.pdf

ORACLE1658778491204-CERTIFICATE_ORACLE_AR20S-VSC19_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778491204-CERTIFICATE_ORACLE_AR20S-VSC19_CORDSET_IRAM_ARGENTINA_2022.pdf

ORACLE1658778475551-CERTIFICATE_ORACLE_AR10S2 and VAC7S_CORDSET_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658778475551-CERTIFICATE_ORACLE_AR10S2%20and%20VAC7S_CORDSET_IRAM_ARGENTINA_2022.pdf

Casa Systems1658774095272-CERTIFICATE_casa systems_C40G_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658774095272-CERTIFICATE_casa%20systems_C40G_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

HP1658765932319-Certificate_HyperX_CP007_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658765932319-Certificate_HyperX_CP007_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1658759318774-CERTIFICATE_PANDUIT_PVQ-PM, PVQ-PM-U_HSE CERTIFICATE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658759318774-CERTIFICATE_PANDUIT_PVQ-PM%2C%20PVQ-PM-U_HSE%20CERTIFICATE_ANCE_MEXICO_2022.pdf

GARMIN1658539520269-CoC_GARMIN_Catalyst_ANATEL_Brazil_2022_.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658539520269-CoC_GARMIN_Catalyst_ANATEL_Brazil_2022_.pdf

GARMIN1658539439116-CoH_GARMIN_Catalyst_ANATEL_Brazil_2022_.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658539439116-CoH_GARMIN_Catalyst_ANATEL_Brazil_2022_.pdf

HP1658509354815-Certificate_HyperX_CS009WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658509354815-Certificate_HyperX_CS009WA_ENACOM_Argentina_2022.pdf

HP1658509179554-Certificate_HyperX_CS009_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658509179554-Certificate_HyperX_CS009_ENACOM_Argentina_2022.pdf

BOSCH1658504251309-Certificate_BOSCH_GWS 18V-10 PSC_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658504251309-Certificate_BOSCH_GWS%2018V-10%20PSC_MTC_Peru_2022.pdf

BOSCH1658504234237-Certificate_BOSCH_GKT 18V-52 GC_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658504234237-Certificate_BOSCH_GKT%2018V-52%20GC_MTC_Peru_2022.pdf

BOSCH1658504219176-Certificate_BOSCH_GCY 42_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658504219176-Certificate_BOSCH_GCY%2042_MTC_Peru_2022.pdf

HP1658499881921-Certificate_HyperX_CL005WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658499881921-Certificate_HyperX_CL005WA_ENACOM_Argentina_2022.pdf

HP1658499858881-Certificate_HyperX_CL005_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658499858881-Certificate_HyperX_CL005_ENACOM_Argentina_2022.pdf

HP1658498080971-Dictum_HyperX_CP007_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658498080971-Dictum_HyperX_CP007_NYCE_Mexico_2022.pdf

LENOVO1658342625992-Certificate_Lenovo_IdeaPad 5 Pro 16IAH7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658342625992-Certificate_Lenovo_IdeaPad%205%20Pro%2016IAH7_SUBTEL_Chile_2022.pdf

LENOVO1658340179877-Certificate_Lenovo_Legion 7 16IAX7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658340179877-Certificate_Lenovo_Legion%207%2016IAX7_SUBTEL_Chile_2022.pdf

IROBOT1658324348121-Certificado.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658324348121-Certificado.pdf

HP1658322864777-CERTIFICATE_HyperX_CP007_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658322864777-CERTIFICATE_HyperX_CP007_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

LENOVO1658321745361-Certificate_Lenovo_Yoga Slim 7 ProX 14IAH7_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658321745361-Certificate_Lenovo_Yoga%20Slim%207%20ProX%2014IAH7_Chile_SUBTEL_2022.pdf

CEI1658259924474-Certificate_Sensoteq_ANTR2006; ANTR2002; ANTR2005_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658259924474-Certificate_Sensoteq_ANTR2006%3B%20ANTR2002%3B%20ANTR2005_SUBTEL_Chile_2022.pdf

CRADLEPOINT1658257872240-Dictum_telecom_cradlepoint_S0214A_NYCE_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658257872240-Dictum_telecom_cradlepoint_S0214A_NYCE_2022.pdf

CRICUT1658256756954-Certificate_Cricut_JCTR101C_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658256756954-Certificate_Cricut_JCTR101C_SUBTEL_Chile_2022.pdf

CRICUT1658256602840-Certificate_Cricut_JCTR101_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658256602840-Certificate_Cricut_JCTR101_SUBTEL_Chile_2022.pdf

SONY1658240833135-Certificate_SONY_CFI-1215B_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658240833135-Certificate_SONY_CFI-1215B_ATT_Bolivia_2022.pdf

SONY1658240794185-Certificate_SONY_CFI-1215A_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658240794185-Certificate_SONY_CFI-1215A_ATT_Bolivia_2022.pdf

BOSCH1658238680303-Certificate_BOSCH_GLM 150-27 C_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658238680303-Certificate_BOSCH_GLM%20150-27%20C_MTC_Peru_2022.pdf

DURACELL1658237963338-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658237963338-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1658166862448-Certificate_HyperX_CL005WA_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658166862448-Certificate_HyperX_CL005WA_CRC_Colombia_2022.pdf

HP1658166842633-Certificate_HyperX_CL005_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658166842633-Certificate_HyperX_CL005_CRC_Colombia_2022.pdf

ROKU1658149775160-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU-L_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658149775160-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU-L_NOM-029-ENER-2017_NYCE_MEXICO_2022.pdf

ORACLE1658149730417-CERTIFICATE_ORACLE_EPSON M368 M159E M159B M159A_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1658149730417-CERTIFICATE_ORACLE_EPSON%20M368%20M159E%20M159B%20M159A_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1658001990526-CoH-HPHX-CS009WA-ANATEL-BRAZIL-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658001990526-CoH-HPHX-CS009WA-ANATEL-BRAZIL-2022.pdf

HP1658001980896-CoH-HPHX-CS009-ANATEL-BRAZIL-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658001980896-CoH-HPHX-CS009-ANATEL-BRAZIL-2022.pdf

HP1658001966062-CoC-HPHX-CS009WA-ANATEL-BRAZIL-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658001966062-CoC-HPHX-CS009WA-ANATEL-BRAZIL-2022.pdf

HP1658001953707-CoC-HPHX-CS009-ANATEL-BRAZIL-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1658001953707-CoC-HPHX-CS009-ANATEL-BRAZIL-2022.pdf

ARISTA1657993875341-CoH_UBLOX_SARA-U201_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993875341-CoH_UBLOX_SARA-U201_ANATEL_Brazil_2022.pdf

ARISTA1657993591351-CoH_ARISTA_DCS-7050TX-64 - DCS-7050TX-48 _ANATEL_Brazil_2022..pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993591351-CoH_ARISTA_DCS-7050TX-64%20-%20DCS-7050TX-48%20_ANATEL_Brazil_2022..pdf

ARISTA1657993576167-CoC_ARISTA_DCS-7050TX-64 - DCS-7050TX-48 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993576167-CoC_ARISTA_DCS-7050TX-64%20-%20DCS-7050TX-48%20_ANATEL_Brazil_2022.pdf

u-blox1657993212401-CoC_UBLOX_SARA-U201_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993212401-CoC_UBLOX_SARA-U201_ANATEL_Brazil_2022.pdf

u-blox1657993186007-CoH_UBLOX_NINA-B111_NINA-B112 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993186007-CoH_UBLOX_NINA-B111_NINA-B112%20_ANATEL_Brazil_2022.pdf

u-blox1657993170538-CoH_UBLOX_ODIN-W260_ODIN-W262 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993170538-CoH_UBLOX_ODIN-W260_ODIN-W262%20_ANATEL_Brazil_2022.pdf

u-blox1657993154522-CoC_UBLOX_ODIN-W260_ODIN-W262 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993154522-CoC_UBLOX_ODIN-W260_ODIN-W262%20_ANATEL_Brazil_2022.pdf

u-blox1657993111379-CoC_UBLOX_NINA-W_NINA-B_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993111379-CoC_UBLOX_NINA-W_NINA-B_ANATEL_Brazil_2022.pdf

u-blox1657993097631-CoC_UBLOX_NINA-B111_NINA-B112 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657993097631-CoC_UBLOX_NINA-B111_NINA-B112%20_ANATEL_Brazil_2022.pdf

u-blox1657991501461-CoH_UBLOX_ANNA-B4 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657991501461-CoH_UBLOX_ANNA-B4%20_ANATEL_Brazil_2022.pdf

u-blox1657991484863-CoC_UBLOX_ANNA-B4 _ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657991484863-CoC_UBLOX_ANNA-B4%20_ANATEL_Brazil_2022.pdf

CRICUT1657821864143-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_MALAYSIA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821864143-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_MALAYSIA.pdf

CRICUT1657821857517-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_MALAYSIA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821857517-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_MALAYSIA.pdf

CRICUT1657821852108-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_MALAYSIA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821852108-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_MALAYSIA.pdf

CRICUT1657821851029-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_MALAYSIA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821851029-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_MALAYSIA.pdf

CRICUT1657821823658-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_MALAYSIA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821823658-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_MALAYSIA.pdf

CRICUT1657821542439-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V&C-UVA_Mexico_2022_CHINA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657821542439-Certificate_Cricut_CXPL202_CXPL203_CXPL203B_CXPL203C_CXPL301_CXPL303_CXPL303B_CXPL303C_JCTR101_JCTR101B_JCTR101C_V%26C-UVA_Mexico_2022_CHINA.pdf

CEI1657724019279-Certificate_Sensoteq_ANTS1002_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657724019279-Certificate_Sensoteq_ANTS1002_SUBTEL_Chile_2022.pdf

SATEL OY1657723745227-Certificate_SATEL_ SATELLINE-EASy_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657723745227-Certificate_SATEL_%20SATELLINE-EASy_ENACOM_Argentina_2022.pdf

DURACELL1657723007906-NYCE7177_Certificate_Duracell_Coppertop_9V_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657723007906-NYCE7177_Certificate_Duracell_Coppertop_9V_NYCE_Mexico_2022.pdf

DURACELL1657722701065-NYCE7176_Certificate_Duracell_Button_10_13_312_675_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657722701065-NYCE7176_Certificate_Duracell_Button_10_13_312_675_NYCE_Mexico_2022.pdf

DURACELL1657720746462-NYCE7175_Certificate_Duracell_Coppertop_AA_AAA_C_D_OPTIMUM_AA_AAA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657720746462-NYCE7175_Certificate_Duracell_Coppertop_AA_AAA_C_D_OPTIMUM_AA_AAA_NYCE_Mexico_2022.pdf

ROKU1657719785145-Certificate_ROKU_RC-GZ1_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657719785145-Certificate_ROKU_RC-GZ1_SUTEL_Costa%20Rica_2022.pdf

ROKU1657640018765-CERTIFICATE_ROKU_RC-GZ1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657640018765-CERTIFICATE_ROKU_RC-GZ1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

IROBOT1657637580830-IBAMA Autorization_iRobot_Brazil_2022.html
https://orbiscompliance.s3.amazonaws.com/1657637580830-IBAMA%20Autorization_iRobot_Brazil_2022.html

SATO1657558835005-Certificate RCPSAPW22-2717_SATO_PW4NX(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657558835005-Certificate%20RCPSAPW22-2717_SATO_PW4NX%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

CRADLEPOINT1657547044170-CERTIFICATE_CRADLEPOINT_S0A214A_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657547044170-CERTIFICATE_CRADLEPOINT_S0A214A_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

NANXUS1657543357476-Certificate_Netradyne_D-430_NOM-208_NYCE_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657543357476-Certificate_Netradyne_D-430_NOM-208_NYCE_2022.pdf

ROKU1657307614290-Certificate_ROKU_RC-GZ1_NYCE (Dictamen Técnico)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657307614290-Certificate_ROKU_RC-GZ1_NYCE%20%28Dictamen%20Te%CC%81cnico%29_Mexico_2022.pdf

NEDAP1657303671327-CERTIFICATE_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657303671327-CERTIFICATE_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

PANDUIT1657299613573-21147CC000479_NOM-050-SCFI-2004_Certificate_PANDUIT_Rod_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657299613573-21147CC000479_NOM-050-SCFI-2004_Certificate_PANDUIT_Rod_USA_Inspec_Mexico_2022.pdf

PANDUIT1657299545638-21147CC000478_NOM-050-SCFI-2004_Certificate_PANDUIT_Crimp Tool_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657299545638-21147CC000478_NOM-050-SCFI-2004_Certificate_PANDUIT_Crimp%20Tool_USA_Inspec_Mexico_2022.pdf

PANDUIT1657297974437-21147CC000477_NOM-050-SCFI-2004_Certificate_PANDUIT_Nut_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657297974437-21147CC000477_NOM-050-SCFI-2004_Certificate_PANDUIT_Nut_USA_Inspec_Mexico_2022.pdf

PANDUIT1657297535505-21147CC000476_NOM-050-SCFI-2004_Certificate_PANDUIT_Tube_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657297535505-21147CC000476_NOM-050-SCFI-2004_Certificate_PANDUIT_Tube_USA_Inspec_Mexico_2022.pdf

PANDUIT1657297371134-21147CC000475_NOM-050-SCFI-2004_Certificate_PANDUIT_Crimp Die_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657297371134-21147CC000475_NOM-050-SCFI-2004_Certificate_PANDUIT_Crimp%20Die_USA_Inspec_Mexico_2022.pdf

PANDUIT1657297304150-21147CC000473_NOM-050-SCFI-2004_Certificate_PANDUIT_Screw_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657297304150-21147CC000473_NOM-050-SCFI-2004_Certificate_PANDUIT_Screw_USA_Inspec_Mexico_2022.pdf

PANDUIT1657296609256-21147CC000474_NOM-050-SCFI-2004_Certificate_PANDUIT_Screw_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657296609256-21147CC000474_NOM-050-SCFI-2004_Certificate_PANDUIT_Screw_China_Inspec_Mexico_2022.pdf

PANDUIT1657296453776-21147CC000472_NOM-050-SCFI-2004_Certificate_PANDUIT_Strip_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657296453776-21147CC000472_NOM-050-SCFI-2004_Certificate_PANDUIT_Strip_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657296196351-21147CC000471_NOM-050-SCFI-2004_Certificate_PANDUIT_Card_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657296196351-21147CC000471_NOM-050-SCFI-2004_Certificate_PANDUIT_Card_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657296089331-21147CC000469_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657296089331-21147CC000469_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_USA_Inspec_Mexico_2022.pdf

PANDUIT1657296022697-21147CC000470_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657296022697-21147CC000470_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657295882506-21147CC000468_NOM-050-SCFI-2004_Certificate_PANDUIT_T_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295882506-21147CC000468_NOM-050-SCFI-2004_Certificate_PANDUIT_T_USA_Inspec_Mexico_2022.pdf

PANDUIT1657295616220-21147CC000467_NOM-050-SCFI-2004_Certificate_PANDUIT_Enclosure_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295616220-21147CC000467_NOM-050-SCFI-2004_Certificate_PANDUIT_Enclosure_USA_Inspec_Mexico_2022.pdf

PANDUIT1657295524216-21147CC000464_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295524216-21147CC000464_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_USA_Inspec_Mexico_2022.pdf

PANDUIT1657295382351-21147CC000466_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295382351-21147CC000466_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657295314136-21147CC000465_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295314136-21147CC000465_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657295223660-21147CC000463_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295223660-21147CC000463_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657295094447-21147CC000462_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295094447-21147CC000462_NOM-050-SCFI-2004_Certificate_PANDUIT_Support_China_Inspec_Mexico_2022.pdf

PANDUIT1657295028324-21147CC000461_NOM-050-SCFI-2004_Certificate_PANDUIT_System_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657295028324-21147CC000461_NOM-050-SCFI-2004_Certificate_PANDUIT_System_USA_Inspec_Mexico_2022.pdf

PANDUIT1657294957953-21147CC000459_NOM-050-SCFI-2004_Certificate_PANDUIT_Separator_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294957953-21147CC000459_NOM-050-SCFI-2004_Certificate_PANDUIT_Separator_USA_Inspec_Mexico_2022.pdf

PANDUIT1657294896685-21147CC000460_NOM-050-SCFI-2004_Certificate_PANDUIT_Separator_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294896685-21147CC000460_NOM-050-SCFI-2004_Certificate_PANDUIT_Separator_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657294811718-21147CC000458_NOM-050-SCFI-2004_Certificate_PANDUIT_Safe_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294811718-21147CC000458_NOM-050-SCFI-2004_Certificate_PANDUIT_Safe_USA_Inspec_Mexico_2022.pdf

PANDUIT1657294752063-21147CC000457_NOM-050-SCFI-2004_Certificate_PANDUIT_Safe_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294752063-21147CC000457_NOM-050-SCFI-2004_Certificate_PANDUIT_Safe_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657294676415-21147CC000456_NOM-050-SCFI-2004_Certificate_PANDUIT_Roll_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294676415-21147CC000456_NOM-050-SCFI-2004_Certificate_PANDUIT_Roll_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657294357486-21147CC000455_NOM-050-SCFI-2004_Certificate_PANDUIT_Catch_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657294357486-21147CC000455_NOM-050-SCFI-2004_Certificate_PANDUIT_Catch_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657293516675-21147CC000454_NOM-050-SCFI-2004_Certificate_PANDUIT_Replacement_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657293516675-21147CC000454_NOM-050-SCFI-2004_Certificate_PANDUIT_Replacement_USA_Inspec_Mexico_2022.pdf

PANDUIT1657293366014-21147CC000453_NOM-050-SCFI-2004_Certificate_PANDUIT_Reducer_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657293366014-21147CC000453_NOM-050-SCFI-2004_Certificate_PANDUIT_Reducer_USA_Inspec_Mexico_2022.pdf

PANDUIT1657293061501-21147CC000452_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657293061501-21147CC000452_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_Inspec_Mexico_2022.pdf

PANDUIT1657292520603-21147CC000451_NOM-050-SCFI-2004_Certificate_PANDUIT_Protective_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657292520603-21147CC000451_NOM-050-SCFI-2004_Certificate_PANDUIT_Protective_USA_Inspec_Mexico_2022.pdf

PANDUIT1657292398711-21147CC000450_NOM-050-SCFI-2004_Certificate_PANDUIT_Power_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657292398711-21147CC000450_NOM-050-SCFI-2004_Certificate_PANDUIT_Power_USA_Inspec_Mexico_2022.pdf

PANDUIT1657292338768-21147CC000449_NOM-050-SCFI-2004_Certificate_PANDUIT_Plaque_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657292338768-21147CC000449_NOM-050-SCFI-2004_Certificate_PANDUIT_Plaque_USA_Inspec_Mexico_2022.pdf

PANDUIT1657292279711-21147CC000448_NOM-050-SCFI-2004_Certificate_PANDUIT_Plaque_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657292279711-21147CC000448_NOM-050-SCFI-2004_Certificate_PANDUIT_Plaque_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657292094489-21147CC000447_NOM-050-SCFI-2004_Certificate_PANDUIT_Field_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657292094489-21147CC000447_NOM-050-SCFI-2004_Certificate_PANDUIT_Field_USA_Inspec_Mexico_2022.pdf

PANDUIT1657291986298-21147CC000446_NOM-050-SCFI-2004_Certificate_PANDUIT_Pins_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657291986298-21147CC000446_NOM-050-SCFI-2004_Certificate_PANDUIT_Pins_USA_Inspec_Mexico_2022.pdf

PANDUIT1657291837387-21147CC000444_NOM-050-SCFI-2004_Certificate_PANDUIT_Panel_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657291837387-21147CC000444_NOM-050-SCFI-2004_Certificate_PANDUIT_Panel_USA_Inspec_Mexico_2022.pdf

PANDUIT1657290304884-21147CC000445_NOM-050-SCFI-2004_Certificate_PANDUIT_Panel_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657290304884-21147CC000445_NOM-050-SCFI-2004_Certificate_PANDUIT_Panel_China_Inspec_Mexico_2022.pdf

PANDUIT1657290235182-21147CC000440_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657290235182-21147CC000440_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_USA_Inspec_Mexico_2022.pdf

PANDUIT1657290026437-21147CC000442_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657290026437-21147CC000442_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657289274206-21147CC000441_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657289274206-21147CC000441_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657289257597-21147CC000443_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657289257597-21147CC000443_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_China_Inspec_Mexico_2022.pdf

PANDUIT1657288754783-21147CC000443_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657288754783-21147CC000443_NOM-050-SCFI-2004_Certificate_PANDUIT_Organizer_China_Inspec_Mexico_2022.pdf

PANDUIT1657288586627-21147CC000437_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657288586627-21147CC000437_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_USA_Inspec_Mexico_2022.pdf

PANDUIT1657288565454-21147CC000439_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657288565454-21147CC000439_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657288489297-21147CC000439_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657288489297-21147CC000439_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657288455728-21147CC000438_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Japon_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657288455728-21147CC000438_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Japon_Inspec_Mexico_2022.pdf

PANDUIT1657286325361-21147CC000438_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Japon_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657286325361-21147CC000438_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Japon_Inspec_Mexico_2022.pdf

PEPPERL1657207256310-Certificate_ECOM_TAB-EX 03 DZ2_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657207256310-Certificate_ECOM_TAB-EX%2003%20DZ2_ARCOTEL_Ecuador_2022.pdf

CRADLEPOINT1657141426633-Certificate_ cradlepoint_ S0A214A_NYCE (Safety Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657141426633-Certificate_%20cradlepoint_%20S0A214A_NYCE%20%28Safety%20Dictum%29_Mexico_2022.pdf

NEDAP1657133801620-CERTIFICATE_ALTA GENETICS EXTENSION_NEDAP_SMARTTAG NECK_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657133801620-CERTIFICATE_ALTA%20GENETICS%20EXTENSION_NEDAP_SMARTTAG%20NECK_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

PANDUIT1657116898014-21147CC000437_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116898014-21147CC000437_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_USA_Inspec_Mexico_2022.pdf

PANDUIT1657116822034-21147CC000436_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116822034-21147CC000436_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657116773131-21147CC000435_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116773131-21147CC000435_NOM-050-SCFI-2004_Certificate_PANDUIT_Mounting_China_Inspec_Mexico_2022.pdf

PANDUIT1657116724030-21147CC000417_NOM-050-SCFI-2004_Certificate_PANDUIT_Module_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116724030-21147CC000417_NOM-050-SCFI-2004_Certificate_PANDUIT_Module_USA_Inspec_Mexico_2022.pdf

PANDUIT1657116670094-21147CC000418_NOM-050-SCFI-2004_Certificate_PANDUIT_Module_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116670094-21147CC000418_NOM-050-SCFI-2004_Certificate_PANDUIT_Module_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657116612027-21147CC000416_NOM-050-SCFI-2004_Certificate_PANDUIT_Array_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116612027-21147CC000416_NOM-050-SCFI-2004_Certificate_PANDUIT_Array_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657116537522-21147CC000413_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116537522-21147CC000413_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_USA_Inspec_Mexico_2022.pdf

PANDUIT1657116483886-21147CC000415_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116483886-21147CC000415_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657116431978-21147CC000414_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116431978-21147CC000414_NOM-050-SCFI-2004_Certificate_PANDUIT_Framework_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657116373891-21147CC000411_NOM-050-SCFI-2004_Certificate_PANDUIT_Marker_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116373891-21147CC000411_NOM-050-SCFI-2004_Certificate_PANDUIT_Marker_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657116306357-21147CC000412_NOM-050-SCFI-2004_Certificate_PANDUIT_Marker_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116306357-21147CC000412_NOM-050-SCFI-2004_Certificate_PANDUIT_Marker_China_Inspec_Mexico_2022.pdf

PANDUIT1657116188139-21147CC000410_NOM-050-SCFI-2004_Certificate_PANDUIT_Sleeve_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116188139-21147CC000410_NOM-050-SCFI-2004_Certificate_PANDUIT_Sleeve_USA_Inspec_Mexico_2022.pdf

PANDUIT1657116120197-21147CC000409_NOM-050-SCFI-2004_Certificate_PANDUIT_Locator_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116120197-21147CC000409_NOM-050-SCFI-2004_Certificate_PANDUIT_Locator_USA_Inspec_Mexico_2022.pdf

PANDUIT1657116022377-21147CC000408_NOM-050-SCFI-2004_Certificate_PANDUIT_Notebook_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657116022377-21147CC000408_NOM-050-SCFI-2004_Certificate_PANDUIT_Notebook_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657115964537-21147CC000407_NOM-050-SCFI-2004_Certificate_PANDUIT_Fiber Patch Cord_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115964537-21147CC000407_NOM-050-SCFI-2004_Certificate_PANDUIT_Fiber%20Patch%20Cord_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657115844550-21147CC000404_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115844550-21147CC000404_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_USA_Inspec_Mexico_2022.pdf

PANDUIT1657115799217-21147CC000404_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115799217-21147CC000404_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_USA_Inspec_Mexico_2022.pdf

PANDUIT1657115747567-21147CC000406_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Rumania_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115747567-21147CC000406_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Rumania_Inspec_Mexico_2022.pdf

PANDUIT1657115686398-21147CC000405_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Mexico_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115686398-21147CC000405_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Mexico_Inspec_Mexico_2022.pdf

PANDUIT1657115629797-21147CC000403_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115629797-21147CC000403_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657115572617-21147CC000402_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115572617-21147CC000402_NOM-050-SCFI-2004_Certificate_PANDUIT_Kit_China_Inspec_Mexico_2022.pdf

PANDUIT1657115502812-21147CC000401_NOM-050-SCFI-2004_Certificate_PANDUIT_Intersection_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115502812-21147CC000401_NOM-050-SCFI-2004_Certificate_PANDUIT_Intersection_China_Inspec_Mexico_2022.pdf

PANDUIT1657115441305-21147CC000400_NOM-050-SCFI-2004_Certificate_PANDUIT_Insert_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115441305-21147CC000400_NOM-050-SCFI-2004_Certificate_PANDUIT_Insert_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657115360971-21147CC000399_NOM-050-SCFI-2004_Certificate_PANDUIT_Insertion_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115360971-21147CC000399_NOM-050-SCFI-2004_Certificate_PANDUIT_Insertion_USA_Inspec_Mexico_2022.pdf

PANDUIT1657115288642-21147CC000398_NOM-050-SCFI-2004_Certificate_PANDUIT_Icon_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115288642-21147CC000398_NOM-050-SCFI-2004_Certificate_PANDUIT_Icon_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657115207694-21147CC000397_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115207694-21147CC000397_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_USA_Inspec_Mexico_2022.pdf

PANDUIT1657115138940-21147CC000396_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_Costa Rica_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657115138940-21147CC000396_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_Costa%20Rica_Inspec_Mexico_2022.pdf

PANDUIT1657114980637-21147CC000395_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_China_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657114980637-21147CC000395_NOM-050-SCFI-2004_Certificate_PANDUIT_Tool_China_Inspec_Mexico_2022.pdf

PANDUIT1657114922727-21147CC000394_NOM-050-SCFI-2004_Certificate_PANDUIT_Clamp_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657114922727-21147CC000394_NOM-050-SCFI-2004_Certificate_PANDUIT_Clamp_USA_Inspec_Mexico_2022.pdf

PANDUIT1657114867313-21147CC000393_NOM-050-SCFI-2004_Certificate_PANDUIT_Clamp_Holanda_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657114867313-21147CC000393_NOM-050-SCFI-2004_Certificate_PANDUIT_Clamp_Holanda_Inspec_Mexico_2022.pdf

PANDUIT1657114742064-21147CC000392_NOM-050-SCFI-2004_Certificate_PANDUIT_Hook_USA_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657114742064-21147CC000392_NOM-050-SCFI-2004_Certificate_PANDUIT_Hook_USA_Inspec_Mexico_2022.pdf

iRobot Corporation1657051913768-IBAMA Authorization -iRobot - Roomba 614-675 - Brazil - 2022.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657051913768-IBAMA%20Authorization%20-iRobot%20-%20Roomba%20614-675%20-%20Brazil%20-%202022.html

iRobot Corporation1657051850934-Cert_22956-21.10_Rev00.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1657051850934-Cert_22956-21.10_Rev00.pdf

NANXUS1657029285177-Dictum_Netradyne_D-210_D-430_NOM-221_NOM-218_NOM-196_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1657029285177-Dictum_Netradyne_D-210_D-430_NOM-221_NOM-218_NOM-196_NYCE_Mexico_2022.pdf

iRobot Corporation1656956950162-IBAMA Authorization -iRobot - Roomba 614-675 - Brazil - 2022.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656956950162-IBAMA%20Authorization%20-iRobot%20-%20Roomba%20614-675%20-%20Brazil%20-%202022.html

iRobot Corporation1656956693469-Sound Power Certificate -iRobot-614-Brazil-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656956693469-Sound%20Power%20Certificate%20-iRobot-614-Brazil-2022.pdf

BOSCH1656942544365-Certificate_BOSCH_GLM 100-25 C_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656942544365-Certificate_BOSCH_GLM%20100-25%20C_MTC_Peru_2022.pdf

SONY1656940531478-Certificate_SONY_CFI-1215A_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656940531478-Certificate_SONY_CFI-1215A_CONATEL_Honduras_2022.pdf

ROKU1656940000043-CERTIFICATE_ROKU_3930MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022___NYC-2202C0E11045.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656940000043-CERTIFICATE_ROKU_3930MX_NOM-019-SCFI-1998_NYCE_MEXICO_2022___NYC-2202C0E11045.pdf

CEI1656939021634-CERTIFICATE_CEI_Lykaner 4 R2_NPMX_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656939021634-CERTIFICATE_CEI_Lykaner%204%20R2_NPMX_MEXICO_2022.pdf

HP1656690510860-Certificate_HyperX_CS009_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656690510860-Certificate_HyperX_CS009_MTC_Peru_2022.pdf

HP1656690462926-Certificate_HyperX_CS009WA_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656690462926-Certificate_HyperX_CS009WA_MTC_Peru_2022.pdf

ROKU1656685665448-CERTIFICATE_ROKU_RC-GZ1_SAFETY DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656685665448-CERTIFICATE_ROKU_RC-GZ1_SAFETY%20DICTUM_NYCE_MEXICO_2022.pdf

PANDUIT1656612541753-21147CC000357_NOM-050-SCFI-2004_Certificate_PANDUIT_Belt_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656612541753-21147CC000357_NOM-050-SCFI-2004_Certificate_PANDUIT_Belt_Inspec_USA_2022.pdf

DURACELL1656609811439-TP_10740-5_Certificate_Duracell_9V_Malaysia_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656609811439-TP_10740-5_Certificate_Duracell_9V_Malaysia_IQC_Argentina_2022.pdf

PANDUIT1656596345093-21147CC000358_NOM-050-SCFI-2004_Certificate_PANDUIT_Cross_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656596345093-21147CC000358_NOM-050-SCFI-2004_Certificate_PANDUIT_Cross_Inspec_USA_2022.pdf

PANDUIT1656596183749-21147CC000364_NOM-050-SCFI-2004_Certificate_PANDUIT_Spillout_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656596183749-21147CC000364_NOM-050-SCFI-2004_Certificate_PANDUIT_Spillout_Inspec_USA_2022.pdf

PANDUIT1656596112909-21147CC000363_NOM-050-SCFI-2004_Certificate_PANDUIT_Dice_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656596112909-21147CC000363_NOM-050-SCFI-2004_Certificate_PANDUIT_Dice_Inspec_Mexico_2022.pdf

PANDUIT1656596028662-21147CC000362_NOM-050-SCFI-2004_Certificate_PANDUIT_Cradle_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656596028662-21147CC000362_NOM-050-SCFI-2004_Certificate_PANDUIT_Cradle_Inspec_USA_2022.pdf

PANDUIT1656595927536-21147CC000361_NOM-050-SCFI-2004_Certificate_PANDUIT_Blades_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656595927536-21147CC000361_NOM-050-SCFI-2004_Certificate_PANDUIT_Blades_Inspec_USA_2022.pdf

PANDUIT1656595814020-21147CC000360_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656595814020-21147CC000360_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Inspec_USA_2022.pdf

PANDUIT1656595678852-21147CC000359_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656595678852-21147CC000359_NOM-050-SCFI-2004_Certificate_PANDUIT_Cover_Inspec_Mexico_2022.pdf

PANDUIT1656595299365-21147CC000358_NOM-050-SCFI-2004_Certificate_PANDUIT_Cross_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656595299365-21147CC000358_NOM-050-SCFI-2004_Certificate_PANDUIT_Cross_Inspec_USA_2022.pdf

PANDUIT1656595001108-21147CC000352_NOM-050-SCFI-2004_Certificate_PANDUIT_Belt_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656595001108-21147CC000352_NOM-050-SCFI-2004_Certificate_PANDUIT_Belt_Inspec_USA_2022.pdf

PANDUIT1656594494516-21147CC000356_NOM-050-SCFI-2004_Certificate_PANDUIT_Connection_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656594494516-21147CC000356_NOM-050-SCFI-2004_Certificate_PANDUIT_Connection_Inspec_USA_2022.pdf

PANDUIT1656594298027-21147CC000355_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656594298027-21147CC000355_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_Mexico_2022.pdf

PANDUIT1656594182455-21147CC000354_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656594182455-21147CC000354_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_USA_2022.pdf

PANDUIT1656594096372-21147CC000353_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_China_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656594096372-21147CC000353_NOM-050-SCFI-2004_Certificate_PANDUIT_Connector_Inspec_China_2022.pdf

PANDUIT1656593994073-21147CC000352_NOM-050-SCFI-2004_Certificate_PANDUIT_Conduit_Inspec_China_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656593994073-21147CC000352_NOM-050-SCFI-2004_Certificate_PANDUIT_Conduit_Inspec_China_2022.pdf

PANDUIT1656593542685-21147CC000351_NOM-050-SCFI-2004_Certificate_PANDUIT_Conduit_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656593542685-21147CC000351_NOM-050-SCFI-2004_Certificate_PANDUIT_Conduit_Inspec_USA_2022.pdf

PANDUIT1656593442385-21147CC000350_NOM-050-SCFI-2004_Certificate_PANDUIT_Collar_Inspec_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656593442385-21147CC000350_NOM-050-SCFI-2004_Certificate_PANDUIT_Collar_Inspec_Costa%20Rica_2022.pdf

PANDUIT1656593380948-21147CC000349_NOM-050-SCFI-2004_Certificate_PANDUIT_Clip_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656593380948-21147CC000349_NOM-050-SCFI-2004_Certificate_PANDUIT_Clip_Inspec_USA_2022.pdf

PANDUIT1656592921576-21147CC000348_NOM-050-SCFI-2004_Certificate_PANDUIT_Tape_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656592921576-21147CC000348_NOM-050-SCFI-2004_Certificate_PANDUIT_Tape_Inspec_USA_2022.pdf

PANDUIT1656592670395-21147CC000346_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_Rumania_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656592670395-21147CC000346_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_Rumania_2022.pdf

PANDUIT1656592499781-21147CC000345_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656592499781-21147CC000345_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_USA_2022.pdf

PANDUIT1656592035548-21147CC000347_NOM-050-SCFI-2004_Certificate_PANDUIT_Tape_Inspec_Costa Rica_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656592035548-21147CC000347_NOM-050-SCFI-2004_Certificate_PANDUIT_Tape_Inspec_Costa%20Rica_2022.pdf

DURACELL1656523291852-22049UCC_NOM-024-SCFI-20130003776_Certificate_OPTIMUM_CEF14-AA4_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656523291852-22049UCC_NOM-024-SCFI-20130003776_Certificate_OPTIMUM_CEF14-AA4_China_UVA_Mexico_2022.pdf

DURACELL1656523233614-22049UCC_NOM-024-SCFI-20130003778_Certificate_OPTIMUM_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656523233614-22049UCC_NOM-024-SCFI-20130003778_Certificate_OPTIMUM_AA_China_UVA_Mexico_2022.pdf

DURACELL1656523086280-22049UCC_NOM-024-SCFI-20130003777_Certificate_OPTIMUM_AAA_Belgium_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656523086280-22049UCC_NOM-024-SCFI-20130003777_Certificate_OPTIMUM_AAA_Belgium_UVA_Mexico_2022.pdf

CRICUT1656513256645-Certificate_Cricut_CHP220B3_PUC_Belize_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656513256645-Certificate_Cricut_CHP220B3_PUC_Belize_2022.pdf

CRICUT1656513012136-Certificate_Cricut_CHP180B3_PUC_Belize_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656513012136-Certificate_Cricut_CHP180B3_PUC_Belize_2022.pdf

CRICUT1656512988269-Certificate_Cricut_CHP180B3_PUC_Belize_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512988269-Certificate_Cricut_CHP180B3_PUC_Belize_2022.pdf

PANDUIT1656512979523-21147CC000388_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512979523-21147CC000388_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_USA_UVA_Mexico_2022.pdf

PANDUIT1656512901626-21147CC000391_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_Rumania_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512901626-21147CC000391_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_Rumania_UVA_Mexico_2022.pdf

PANDUIT1656512819699-21147CC000390_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_Mexico_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512819699-21147CC000390_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_Mexico_UVA_Mexico_2022.pdf

PANDUIT1656512754392-21147CC000388_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512754392-21147CC000388_NOM-050-SCFI-2004_Certificate_PANDUIT_Cabinet_China_UVA_Mexico_2022.pdf

PANDUIT1656512687934-21147CC000387_NOM-050-SCFI-2004_Certificate_PANDUIT_Sleev_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512687934-21147CC000387_NOM-050-SCFI-2004_Certificate_PANDUIT_Sleev_USA_UVA_Mexico_2022.pdf

PANDUIT1656512644292-21147CC000345_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512644292-21147CC000345_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_USA_2022.pdf

PANDUIT1656512626788-21147CC000386_NOM-050-SCFI-2004_Certificate_PANDUIT_Flex_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512626788-21147CC000386_NOM-050-SCFI-2004_Certificate_PANDUIT_Flex_USA_UVA_Mexico_2022.pdf

PANDUIT1656512568755-21147CC000385_NOM-050-SCFI-2004_Certificate_PANDUIT_Flex_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512568755-21147CC000385_NOM-050-SCFI-2004_Certificate_PANDUIT_Flex_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656512491618-21147CC000383_NOM-050-SCFI-2004_Certificate_PANDUIT_Label_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512491618-21147CC000383_NOM-050-SCFI-2004_Certificate_PANDUIT_Label_USA_UVA_Mexico_2022.pdf

PANDUIT1656512404989-21147CC000384_NOM-050-SCFI-2004_Certificate_PANDUIT_Labels_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512404989-21147CC000384_NOM-050-SCFI-2004_Certificate_PANDUIT_Labels_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656512332943-21147CC000382_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_Rumania_UVA_Mexico_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512332943-21147CC000382_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_Rumania_UVA_Mexico_2022.pdf.pdf

PANDUIT1656512251005-21147CC000381_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_Mexico_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512251005-21147CC000381_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_Mexico_UVA_Mexico_2022.pdf

SONY1656512116254-Certificate_SONY_CFI-ZCVL1 CFI-ZCVR1_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512116254-Certificate_SONY_CFI-ZCVL1%20CFI-ZCVR1_ATT_Bolivia_2022.pdf

PANDUIT1656512108094-21147CC000380_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656512108094-21147CC000380_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_USA_UVA_Mexico_2022.pdf

PANDUIT1656511946774-21147CC000379_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511946774-21147CC000379_NOM-050-SCFI-2004_Certificate_PANDUIT_Shelf_China_UVA_Mexico_2022.pdf

PANDUIT1656511850624-21147CC000378_NOM-050-SCFI-2004_Certificate_PANDUIT_Cornerback_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511850624-21147CC000378_NOM-050-SCFI-2004_Certificate_PANDUIT_Cornerback_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656511757701-21147CC000377_NOM-050-SCFI-2004_Certificate_PANDUIT_Spire_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511757701-21147CC000377_NOM-050-SCFI-2004_Certificate_PANDUIT_Spire_USA_UVA_Mexico_2022.pdf

PANDUIT1656511651403-21147CC000376_NOM-050-SCFI-2004_Certificate_PANDUIT_Equipment_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511651403-21147CC000376_NOM-050-SCFI-2004_Certificate_PANDUIT_Equipment_USA_UVA_Mexico_2022.pdf

PANDUIT1656511549709-21147CC000375_NOM-050-SCFI-2004_Certificate_PANDUIT_Plug__Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511549709-21147CC000375_NOM-050-SCFI-2004_Certificate_PANDUIT_Plug__Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656511468247-21147CC000374_NOM-050-SCFI-2004_Certificate_PANDUIT_Joint_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511468247-21147CC000374_NOM-050-SCFI-2004_Certificate_PANDUIT_Joint_USA_UVA_Mexico_2022.pdf

PANDUIT1656511396566-21147CC000373_NOM-050-SCFI-2004_Certificate_PANDUIT_Joint_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511396566-21147CC000373_NOM-050-SCFI-2004_Certificate_PANDUIT_Joint_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656511324277-21147CC000372_NOM-050-SCFI-2004_Certificate_PANDUIT_Pipeline_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511324277-21147CC000372_NOM-050-SCFI-2004_Certificate_PANDUIT_Pipeline_USA_UVA_Mexico_2022.pdf

PANDUIT1656511323005-21147CC000344_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511323005-21147CC000344_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_Costa%20Rica_2022.pdf

PANDUIT1656511250663-21147CC000367_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656511250663-21147CC000367_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_UVA_Mexico_2022.pdf

PANDUIT1656510706391-21147CC000370_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_Singapur_Mexico_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656510706391-21147CC000370_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_Singapur_Mexico_2022.pdf.pdf

PANDUIT1656510645118-21147CC000369_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_Japan_Mexico_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656510645118-21147CC000369_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_USA_Japan_Mexico_2022.pdf.pdf

PANDUIT1656510576674-21147CC000368_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_Holland_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656510576674-21147CC000368_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_Holland_UVA_Mexico_2022.pdf

PANDUIT1656510262228-21147CC000366_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656510262228-21147CC000366_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Device_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1656510127432-21147CC000365_NOM-050-SCFI-2004_Certificate_PANDUIT_Dispenser_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656510127432-21147CC000365_NOM-050-SCFI-2004_Certificate_PANDUIT_Dispenser_Costa_Rica_UVA_Mexico_2022.pdf

Nedap1656509993061-Certificate_Nedap_SMARTATG NECK_NYCE (Dictum)_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656509993061-Certificate_Nedap_SMARTATG%20NECK_NYCE%20%28Dictum%29_Mexico_2022.pdf

PANDUIT1656509899348-21147CC000343_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_China_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656509899348-21147CC000343_NOM-050-SCFI-2004_Certificate_PANDUIT_Cassette_Inspec_China_2022.pdf

PANDUIT1656508742139-21147CC000342_NOM-050-SCFI-2004_Certificate_PANDUIT_Case_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656508742139-21147CC000342_NOM-050-SCFI-2004_Certificate_PANDUIT_Case_Inspec_USA_2022.pdf

PANDUIT1656507794596-21147CC000341_NOM-050-SCFI-2004_Certificate_PANDUIT_Lock_Inspec_USA_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656507794596-21147CC000341_NOM-050-SCFI-2004_Certificate_PANDUIT_Lock_Inspec_USA_2022.pdf

PANDUIT1656445737332-21147CC000339_NOM-050-SCFI-2004_Certificate_PANDUIT_Canal_Inspec_USA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656445737332-21147CC000339_NOM-050-SCFI-2004_Certificate_PANDUIT_Canal_Inspec_USA_2022.pdf

PANDUIT1656444794066-21147CC000339_NOM-050-SCFI-2004_Certificate_PANDUIT_Canal_Inspec_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656444794066-21147CC000339_NOM-050-SCFI-2004_Certificate_PANDUIT_Canal_Inspec_Costa%20Rica_2022.pdf

PANDUIT1656442437027-Certificate_PANDUIT_Canal_inspec_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656442437027-Certificate_PANDUIT_Canal_inspec_Costa%20Rica_2022.pdf

CRICUT1656426717315-Certificate_Cricut_JCTR101_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656426717315-Certificate_Cricut_JCTR101_ASEP_Panama_2022.pdf

BOSCH1656359192289-Certificate_BOSCH_GLM 50-27 C_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656359192289-Certificate_BOSCH_GLM%2050-27%20C_ASEP_Panama_2022.pdf

BOSCH1656359184240-Certificate_BOSCH_GLM 50-27 C_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656359184240-Certificate_BOSCH_GLM%2050-27%20C_ASEP_Panama_2022.pdf

CRADLEPOINT1656348794351-IFT_Certificate_cradlepoint_S3A904A_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656348794351-IFT_Certificate_cradlepoint_S3A904A_Mexico_2022.pdf

BTL1656338223550-Certificate_RAZER_HSD01_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656338223550-Certificate_RAZER_HSD01_IFT_Mexico_2022.pdf

BTL1656338162744-Certificate_RAZER_RC30-0448_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656338162744-Certificate_RAZER_RC30-0448_IFT_Mexico_2022.pdf

NEDAP1656337156046-DICTUM_Nedap_SMARTTAG NECK_NOM-001-SCFI-2018 NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656337156046-DICTUM_Nedap_SMARTTAG%20NECK_NOM-001-SCFI-2018%20NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf

NEDAP1656337130782-CERTIFICATE_Nedap_SMARTTAG NECK_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1656337130782-CERTIFICATE_Nedap_SMARTTAG%20NECK_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

POLY1656010259634-Certificate_Poly_P032_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656010259634-Certificate_Poly_P032_IFT_Mexico_2022.pdf

POLY1656010076076-NOM-208 Certificate_Poly_P032_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656010076076-NOM-208%20Certificate_Poly_P032_NYCE_Mexico_2022.pdf

SONY1656006106789-Certificate NYC-2202CT1514-01A_NOM-208_SONY_J20H104_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656006106789-Certificate%20NYC-2202CT1514-01A_NOM-208_SONY_J20H104_NYCE_Mexico_2022.pdf

SONY1656006017057-Certificate NYC-2202CT1509-01A_NOM-208_SONY_J20H100_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656006017057-Certificate%20NYC-2202CT1509-01A_NOM-208_SONY_J20H100_NYCE_Mexico_2022.pdf

SONY1656005824836-Certificate NYC-2202CT1502-01A_NOM-208_SONY_AW-XM546_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656005824836-Certificate%20NYC-2202CT1502-01A_NOM-208_SONY_AW-XM546_NYCE_Mexico_2022.pdf

SONY1656005755325-Certificate NYC-2202CT1501-01A_NOM-208_SONY_AW-XM501_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1656005755325-Certificate%20NYC-2202CT1501-01A_NOM-208_SONY_AW-XM501_NYCE_Mexico_2022.pdf

DURACELL1655998814148-21147CC000334_NOM-024-SCFI-2013_Certificate_Procell_9V_Malaysia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998814148-21147CC000334_NOM-024-SCFI-2013_Certificate_Procell_9V_Malaysia_UVA_Mexico_2022.pdf

DURACELL1655998656760-21147CC000333_NOM-024-SCFI-2013_Certificate_Procell_D_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998656760-21147CC000333_NOM-024-SCFI-2013_Certificate_Procell_D_China_UVA_Mexico_2022.pdf

DURACELL1655998592232-21147CC000332_NOM-024-SCFI-2013_Certificate_Procell_C_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998592232-21147CC000332_NOM-024-SCFI-2013_Certificate_Procell_C_China_UVA_Mexico_2022.pdf

DURACELL1655998533153-21147CC000331_NOM-024-SCFI-2013_Certificate_Procell_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998533153-21147CC000331_NOM-024-SCFI-2013_Certificate_Procell_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655998474568-21147CC000330_NOM-024-SCFI-2013_Certificate_Procell_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998474568-21147CC000330_NOM-024-SCFI-2013_Certificate_Procell_AA_China_UVA_Mexico_2022.pdf

DURACELL1655998419057-21147CC000329_NOM-024-SCFI-2013_Certificate_Duracell_CR2025_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998419057-21147CC000329_NOM-024-SCFI-2013_Certificate_Duracell_CR2025_China_UVA_Mexico_2022.pdf

DURACELL1655998339350-21147CC000328_NOM-024-SCFI-2013_Certificate_Duracell_CR2016_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998339350-21147CC000328_NOM-024-SCFI-2013_Certificate_Duracell_CR2016_China_UVA_Mexico_2022.pdf

DURACELL1655998278384-21147CC000327_NOM-024-SCFI-2013_Certificate_Duracell_CR2_Indonesia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998278384-21147CC000327_NOM-024-SCFI-2013_Certificate_Duracell_CR2_Indonesia_UVA_Mexico_2022.pdf

DURACELL1655998199511-21147CC000326_NOM-024-SCFI-2013_Certificate_Duracell_Lithium_123_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998199511-21147CC000326_NOM-024-SCFI-2013_Certificate_Duracell_Lithium_123_China_UVA_Mexico_2022.pdf

DURACELL1655998147699-21147CC000325_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998147699-21147CC000325_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655998089556-21147CC000324_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655998089556-21147CC000324_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AA_China_UVA_Mexico_2022.pdf

DURACELL1655997994259-21147CC000323_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_675_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997994259-21147CC000323_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_675_Germany_UVA_Mexico_2022.pdf

DURACELL1655997810382-21147CC000322_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_312_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997810382-21147CC000322_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_312_Germany_UVA_Mexico_2022.pdf

DURACELL1655997705429-21147CC000321_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_13_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997705429-21147CC000321_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_13_Germany_UVA_Mexico_2022.pdf

DURACELL1655997623608-21147CC000320_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_10_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997623608-21147CC000320_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_10_Germany_UVA_Mexico_2022.pdf

DURACELL1655997560218-21147CC000294_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_LR44-A76_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997560218-21147CC000294_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_LR44-A76_China_UVA_Mexico_2022.pdf

DURACELL1655997234569-21147CC000293_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_21-23_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997234569-21147CC000293_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_21-23_China_UVA_Mexico_2022.pdf

DURACELL1655997189345-21147CC000292_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_9V_Malaysia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997189345-21147CC000292_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_9V_Malaysia_UVA_Mexico_2022.pdf

DURACELL1655997140701-21147CC000291_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_D_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655997140701-21147CC000291_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_D_USA_UVA_Mexico_2022.pdf

DURACELL1655996797629-21147CC000290_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_C_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655996797629-21147CC000290_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_C_USA_UVA_Mexico_2022.pdf

DURACELL1655996729712-21147CC000289_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655996729712-21147CC000289_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655996661278-21147CC000288_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655996661278-21147CC000288_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AA_China_UVA_Mexico_2022.pdf

ROKU1655989353394-Certificate_ROKU_RC-GZ1_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655989353394-Certificate_ROKU_RC-GZ1_SIGET_El%20Salvador_2022.PDF

ROKU1655989274046-Certificate_ROKU_RC-GZ1_SIT_El Salvador_2022.PDF
https://orbiscompliance.s3.amazonaws.com/1655989274046-Certificate_ROKU_RC-GZ1_SIT_El%20Salvador_2022.PDF

SONY1655927306606-Certificate_SONY_CFI-1215B_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655927306606-Certificate_SONY_CFI-1215B_CONATEL_Paraguay_2022.pdf

SONY1655927165090-Certificate_SONY_CFI-1215A_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655927165090-Certificate_SONY_CFI-1215A_CONATEL_Paraguay_2022.pdf

PANDUIT1655925516445-21147CC000315_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655925516445-21147CC000315_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Singapur_UVA_Mexico_2022.pdf

PANDUIT1655924945570-21147CC000313_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924945570-21147CC000313_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_USA_UVA_Mexico_2022.pdf

PANDUIT1655924838690-21147CC000312_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924838690-21147CC000312_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655924715619-21147CC000310_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924715619-21147CC000310_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Singapur_UVA_Mexico_2022.pdf

PANDUIT1655924522092-21147CC000309_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Japan_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924522092-21147CC000309_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Japan_UVA_Mexico_2022.pdf

PANDUIT1655924445336-21147CC000308_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924445336-21147CC000308_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_UVA_Mexico_2022.pdf

PANDUIT1655924388251-21147CC000307_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924388251-21147CC000307_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655924221015-21147CC000287_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Japan_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924221015-21147CC000287_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Japan_UVA_Mexico_2022.pdf

PANDUIT1655924138445-21147CC000286_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924138445-21147CC000286_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_USA_UVA_Mexico_2022.pdf

PANDUIT1655924047610-21147CC000281_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655924047610-21147CC000281_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655923948137-21147CC000276_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Rumania_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655923948137-21147CC000276_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Rumania_UVA_Mexico_2022.pdf

PANDUIT1655923855228-21147CC000275_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Mexico_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655923855228-21147CC000275_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Mexico_UVA_Mexico_2022.pdf

PANDUIT1655923778174-21147CC000274_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655923778174-21147CC000274_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_USA_UVA_Mexico_2022.pdf

PANDUIT1655923668023-21147CC000273_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655923668023-21147CC000273_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_China_UVA_Mexico_2022.pdf

PANDUIT1655923528544-21147CC000272_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655923528544-21147CC000272_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Singapur_UVA_Mexico_2022.pdf

PANDUIT1655922552998-21147CC000270_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Holland_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655922552998-21147CC000270_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Holland_UVA_Mexico_2022.pdf

PANDUIT1655922473696-21147CC000269_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655922473696-21147CC000269_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_USA_UVA_Mexico_2022.pdf

PANDUIT1655922394470-21147CC000268_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655922394470-21147CC000268_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655922292069-21147CC000267_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655922292069-21147CC000267_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655922185946-21147CC000266_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655922185946-21147CC000266_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_USA_UVA_Mexico_2022.pdf

CRADLE1655901545127-Certificate_cradlepoint_S0A214A_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1655901545127-Certificate_cradlepoint_S0A214A_INSPEC-UVA_Mexico_2022.pdf

DURACELL1655838353365-21147CC000334_NOM-024-SCFI-2013_Certificate_Procell_9V_Malaysia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838353365-21147CC000334_NOM-024-SCFI-2013_Certificate_Procell_9V_Malaysia_UVA_Mexico_2022.pdf

DURACELL1655838297010-21147CC000333_NOM-024-SCFI-2013_Certificate_Procell_D_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838297010-21147CC000333_NOM-024-SCFI-2013_Certificate_Procell_D_China_UVA_Mexico_2022.pdf

DURACELL1655838216672-21147CC000332_NOM-024-SCFI-2013_Certificate_Procell_C_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838216672-21147CC000332_NOM-024-SCFI-2013_Certificate_Procell_C_China_UVA_Mexico_2022.pdf

DURACELL1655838162072-21147CC000331_NOM-024-SCFI-2013_Certificate_Procell_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838162072-21147CC000331_NOM-024-SCFI-2013_Certificate_Procell_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655838120027-21147CC000330_NOM-024-SCFI-2013_Certificate_Procell_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838120027-21147CC000330_NOM-024-SCFI-2013_Certificate_Procell_AA_China_UVA_Mexico_2022.pdf

DURACELL1655838055493-21147CC000329_NOM-024-SCFI-2013_Certificate_Duracell_CR2025_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655838055493-21147CC000329_NOM-024-SCFI-2013_Certificate_Duracell_CR2025_China_UVA_Mexico_2022.pdf

DURACELL1655837998129-21147CC000328_NOM-024-SCFI-2013_Certificate_Duracell_CR2016_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837998129-21147CC000328_NOM-024-SCFI-2013_Certificate_Duracell_CR2016_China_UVA_Mexico_2022.pdf

DURACELL1655837889762-21147CC000327_NOM-024-SCFI-2013_Certificate_Duracell_CR2_Indonesia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837889762-21147CC000327_NOM-024-SCFI-2013_Certificate_Duracell_CR2_Indonesia_UVA_Mexico_2022.pdf

DURACELL1655837840790-21147CC000326_NOM-024-SCFI-2013_Certificate_Duracell_Lithium_123_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837840790-21147CC000326_NOM-024-SCFI-2013_Certificate_Duracell_Lithium_123_China_UVA_Mexico_2022.pdf

DURACELL1655837798833-21147CC000325_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837798833-21147CC000325_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655837754123-21147CC000324_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837754123-21147CC000324_NOM-024-SCFI-2013_Certificate_Duracell_Secundary_AA_China_UVA_Mexico_2022.pdf

DURACELL1655837709589-21147CC000323_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_675_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837709589-21147CC000323_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_675_Germany_UVA_Mexico_2022.pdf

DURACELL1655837654071-21147CC000322_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_312_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837654071-21147CC000322_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_312_Germany_UVA_Mexico_2022.pdf

DURACELL1655837598795-21147CC000321_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_13_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837598795-21147CC000321_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_13_Germany_UVA_Mexico_2022.pdf

DURACELL1655837537071-21147CC000320_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_10_Germany_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837537071-21147CC000320_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_10_Germany_UVA_Mexico_2022.pdf

DURACELL1655837493591-21147CC000294_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_LR44-A76_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837493591-21147CC000294_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_LR44-A76_China_UVA_Mexico_2022.pdf

DURACELL1655837427480-21147CC000293_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_21-23_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837427480-21147CC000293_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_21-23_China_UVA_Mexico_2022.pdf

DURACELL1655837018784-21147CC000292_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_9V_Malaysia_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655837018784-21147CC000292_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_9V_Malaysia_UVA_Mexico_2022.pdf

DURACELL1655836971530-21147CC000291_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_D_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655836971530-21147CC000291_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_D_USA_UVA_Mexico_2022.pdf

DURACELL1655836916587-21147CC000290_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_C_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655836916587-21147CC000290_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_C_USA_UVA_Mexico_2022.pdf

DURACELL1655836857005-21147CC000289_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AAA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655836857005-21147CC000289_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AAA_China_UVA_Mexico_2022.pdf

DURACELL1655836769971-21147CC000288_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AA_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655836769971-21147CC000288_NOM-024-SCFI-2013_Certificate_Duracell_Coppertop_AA_China_UVA_Mexico_2022.pdf

CRICUT1655821970600-Certificate_Cricut_JCTR101C_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1655821970600-Certificate_Cricut_JCTR101C_ASEP_Panama_2022.pdf

CRICUT1655755204060-Certificate_Cricut_JCTR101C_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655755204060-Certificate_Cricut_JCTR101C_CONATEL_Honduras_2022.pdf

PANDUIT1655751797556-21147CC000315_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655751797556-21147CC000315_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Singapur_UVA_Mexico_2022.pdf

PANDUIT1655734339837-21147CC000314_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Rumania_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655734339837-21147CC000314_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Rumania_UVA_Mexico_2022.pdf

PANDUIT1655734259344-21147CC000313_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655734259344-21147CC000313_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_USA_UVA_Mexico_2022.pdf

PANDUIT1655734166788-21147CC000312_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655734166788-21147CC000312_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655734042244-21147CC000311_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655734042244-21147CC000311_NOM-050-SCFI-2004_Certificate_PANDUIT_Box_China_UVA_Mexico_2022.pdf

PANDUIT1655733957709-21147CC000310_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655733957709-21147CC000310_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Singapur_UVA_Mexico_2022.pdf

PANDUIT1655733835098-21147CC000309_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Japan_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655733835098-21147CC000309_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Japan_UVA_Mexico_2022.pdf

PANDUIT1655733782137-21147CC000308_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655733782137-21147CC000308_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_USA_UVA_Mexico_2022.pdf

PANDUIT1655733707343-21147CC000307_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655733707343-21147CC000307_NOM-050-SCFI-2004_Certificate_PANDUIT_Flange_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1655733309631-21147CC000306_NOM-050-SCFI-2004_Certificate_PANDUIT_Coil_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655733309631-21147CC000306_NOM-050-SCFI-2004_Certificate_PANDUIT_Coil_USA_UVA_Mexico_2022.pdf

SONY1655729196848-Certificate_SONY_CFI-ZCVR1_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1655729196848-Certificate_SONY_CFI-ZCVR1_CONATEL_Honduras_2022.pdf

Casa Systems1655410624178-CERTIFICATE_COMERCIALIZADORA TANGO_casa systems_LTE-2007-04_NOM-019-SCFI-1998_NYCE_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655410624178-CERTIFICATE_COMERCIALIZADORA%20TANGO_casa%20systems_LTE-2007-04_NOM-019-SCFI-1998_NYCE_2022.pdf

HP1655391836971-Label Update_HyperX_CL004WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655391836971-Label%20Update_HyperX_CL004WA_ENACOM_Argentina_2022.pdf

LENOVO1655387365776-Certificate_Lenovo_IdeaPad 5 Pro 16ARH7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1655387365776-Certificate_Lenovo_IdeaPad%205%20Pro%2016ARH7_SUBTEL_Chile_2022.pdf

CRICUT1655236449965-Certificate_Cricut_CHP080B1_V&C-UVA_Mexico_2022_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655236449965-Certificate_Cricut_CHP080B1_V%26C-UVA_Mexico_2022_Malaysia.pdf

CRICUT1655236443690-Certificate_Cricut_CHP080B1_V&C-UVA_Mexico_2022_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655236443690-Certificate_Cricut_CHP080B1_V%26C-UVA_Mexico_2022_Malaysia.pdf

CRICUT1655236354011-Certificate_Cricut_CHP080B1_V&C-UVA_Mexico_2022_China.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655236354011-Certificate_Cricut_CHP080B1_V%26C-UVA_Mexico_2022_China.pdf

CRICUT1655236345451-Certificate_Cricut_CHP080B1_V&C-UVA_Mexico_2022_China.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655236345451-Certificate_Cricut_CHP080B1_V%26C-UVA_Mexico_2022_China.pdf

Cricut1655233967734-Certificate_Cricut_JCTR101C_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655233967734-Certificate_Cricut_JCTR101C_ATT_Bolivia_2022.pdf

Cricut1655233932696-Certificate_Cricut_JCTR101_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655233932696-Certificate_Cricut_JCTR101_ATT_Bolivia_2022.pdf

NEDAP1655226224225-Certificate_Nedap_ASSY AD46R RF+RFID_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655226224225-Certificate_Nedap_ASSY%20AD46R%20RF%2BRFID_ARCOTEL_Ecuador_2022.pdf

NEDAP1655226160557-Certificate_Nedap_ASSY AD46R RF_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655226160557-Certificate_Nedap_ASSY%20AD46R%20RF_ARCOTEL_Ecuador_2022.pdf

Casa Systems1655210670799-CERTIFICATE_casa systems_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1655210670799-CERTIFICATE_casa%20systems_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

SATO1655153069778-Certificate RCPSAS822-0426_SATO_S84-ex (Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655153069778-Certificate%20RCPSAS822-0426_SATO_S84-ex%20%28Bluestarlam%29_IFT_Mexico_2022.pdf

CRICUT1655148809848-Certificate_Cricut_CHP180B3_CHP220B3_V&C-UVA_Mexico_2022_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655148809848-Certificate_Cricut_CHP180B3_CHP220B3_V%26C-UVA_Mexico_2022_Malaysia.pdf

CRICUT1655148734732-Certificate_Cricut_CHP180B3_CHP220B3_V&C-UVA_Mexico_2022_China.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655148734732-Certificate_Cricut_CHP180B3_CHP220B3_V%26C-UVA_Mexico_2022_China.pdf

Cricut1655128030967-Certificate_Cricut_CHP080B1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655128030967-Certificate_Cricut_CHP080B1_IFT_Mexico_2022.pdf

CRICUT1655126981672-CERTIFICATE_Cricut_LIDEART_JCTR101 JCTR101X_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655126981672-CERTIFICATE_Cricut_LIDEART_JCTR101%20JCTR101X_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRICUT1655126939548-CERTIFICATE_Cricut_LIDEART_CHP080B1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655126939548-CERTIFICATE_Cricut_LIDEART_CHP080B1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

CRICUT1655126879573-CERTIFICATE_Cricut_LIDEART_CHP220B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655126879573-CERTIFICATE_Cricut_LIDEART_CHP220B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

CRICUT1655126837242-CERTIFICATE_Cricut_LIDEART_CHP180B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655126837242-CERTIFICATE_Cricut_LIDEART_CHP180B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

SONY1655126813306-Certificate_SONY_CFI-ZCVL1_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1655126813306-Certificate_SONY_CFI-ZCVL1_CONATEL_Honduras_2022.pdf

CRICUT1655122174346-Certificate_Cricut_JCTR101_CONATEL_Paraguay_2022.PDF
https://orbiscompliance.s3.amazonaws.com/1655122174346-Certificate_Cricut_JCTR101_CONATEL_Paraguay_2022.PDF

SION S.A.1654891288987-FORM C_SION_APD_WB-24J12R; WB-24J12FA_Lealtad Comercial_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891288987-FORM%20C_SION_APD_WB-24J12R%3B%20WB-24J12FA_Lealtad%20Comercial_Argentina_2022.pdf

PANDUIT1654891244453-21147CC000287_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Japan_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891244453-21147CC000287_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Japan_UVA_Mexico_2022.pdf

SION S.A.1654891217829-Certificate_SION_APD_WB-24J12R; WB-24J12FA_IRAM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891217829-Certificate_SION_APD_WB-24J12R%3B%20WB-24J12FA_IRAM_Argentina_2022.pdf

PANDUIT1654891199722-21147CC000286_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891199722-21147CC000286_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_USA_UVA_Mexico_2022.pdf

PANDUIT1654891154182-21147CC000285_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891154182-21147CC000285_NOM-050-SCFI-2004_Certificate_PANDUIT_Blocking_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1654891106188-21147CC000284_NOM-050-SCFI-2004_Certificate_PANDUIT_Base_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891106188-21147CC000284_NOM-050-SCFI-2004_Certificate_PANDUIT_Base_USA_UVA_Mexico_2022.pdf

PANDUIT1654891042707-21147CC000282_NOM-050-SCFI-2004_Certificate_PANDUIT_Strain_relief_bar_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654891042707-21147CC000282_NOM-050-SCFI-2004_Certificate_PANDUIT_Strain_relief_bar_USA_UVA_Mexico_2022.pdf

PANDUIT1654890987133-21147CC000283_NOM-050-SCFI-2004_Certificate_PANDUIT_Strain_relief_bar_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890987133-21147CC000283_NOM-050-SCFI-2004_Certificate_PANDUIT_Strain_relief_bar_China_UVA_Mexico_2022.pdf

PANDUIT1654890891665-21147CC000280_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890891665-21147CC000280_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_USA_UVA_Mexico_2022.pdf

PANDUIT1654890846196-21147CC000281_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890846196-21147CC000281_NOM-050-SCFI-2004_Certificate_PANDUIT_Packing_Ring_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1654890787859-21147CC000279_NOM-050-SCFI-2004_Certificate_PANDUIT_Wire_Support_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890787859-21147CC000279_NOM-050-SCFI-2004_Certificate_PANDUIT_Wire_Support_USA_UVA_Mexico_2022.pdf

PANDUIT1654890745627-21147CC000278_NOM-050-SCFI-2004_Certificate_PANDUIT_Retainer_Ring_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890745627-21147CC000278_NOM-050-SCFI-2004_Certificate_PANDUIT_Retainer_Ring_USA_UVA_Mexico_2022.pdf

PANDUIT1654890691536-21147CC000277_NOM-050-SCFI-2004_Certificate_PANDUIT_Plastic_angle_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890691536-21147CC000277_NOM-050-SCFI-2004_Certificate_PANDUIT_Plastic_angle_USA_UVA_Mexico_2022.pdf

PANDUIT1654890627792-21147CC000276_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Rumania_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890627792-21147CC000276_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Rumania_UVA_Mexico_2022.pdf

PANDUIT1654890467214-21147CC000275_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Mexico_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890467214-21147CC000275_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_Mexico_UVA_Mexico_2022.pdf

PANDUIT1654890417726-21147CC000274_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890417726-21147CC000274_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_USA_UVA_Mexico_2022.pdf

PANDUIT1654890340576-21147CC000273_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_China_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890340576-21147CC000273_NOM-050-SCFI-2004_Certificate_PANDUIT_Vertical_Administrator_China_UVA_Mexico_2022.pdf

PANDUIT1654890252967-21147CC000271_NOM-050-SCFI-2004_Certificate_PANDUIT_Adhesive_Grommet_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890252967-21147CC000271_NOM-050-SCFI-2004_Certificate_PANDUIT_Adhesive_Grommet_USA_UVA_Mexico_2022.pdf

PANDUIT1654890186727-21147CC000272_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890186727-21147CC000272_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Singapur_UVA_Mexico_2022.pdf

PANDUIT1654890031905-21147CC000270_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Holland_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654890031905-21147CC000270_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Holland_UVA_Mexico_2022.pdf

PANDUIT1654889943633-21147CC000269_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889943633-21147CC000269_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_USA_UVA_Mexico_2022.pdf

PANDUIT1654889886845-21147CC000268_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889886845-21147CC000268_NOM-050-SCFI-2004_Certificate_PANDUIT_Adapters_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1654889829700-21147CC000266_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889829700-21147CC000266_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_USA_UVA_Mexico_2022.pdf

PANDUIT1654889766072-21147CC000267_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889766072-21147CC000267_NOM-050-SCFI-2004_Certificate_PANDUIT_Couplers_Costa_Rica_UVA_Mexico_2022.pdf

PANDUIT1654889702166-21147CC000265_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Singapur_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889702166-21147CC000265_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Singapur_UVA_Mexico_2022.pdf

PANDUIT1654889578398-21147CC000264_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Netherland_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889578398-21147CC000264_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Netherland_UVA_Mexico_2022.pdf

PANDUIT1654889527925-21147CC000263_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889527925-21147CC000263_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_USA_UVA_Mexico_2022.pdf

PANDUIT1654889431691-21147CC000262_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Costa_Rica_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654889431691-21147CC000262_NOM-050-SCFI-2004_Certificate_PANDUIT_Accesories_Costa_Rica_UVA_Mexico_2022.pdf

CRICUT1654865167202-Certificate_Cricut_JCTR101_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654865167202-Certificate_Cricut_JCTR101_CONATEL_Honduras_2022.pdf

CETECOM1654701558796-Certificate_TARAMA_G1BN5ASI002_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654701558796-Certificate_TARAMA_G1BN5ASI002_CRC_Colombia_2022.pdf

CETECOM1654701470122-Certificate_TARANA_G1RN5ASI012_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654701470122-Certificate_TARANA_G1RN5ASI012_CRC_Colombia_2022.pdf

CRICUT1654692233780-Certificate_Cricut_JCTR101C_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654692233780-Certificate_Cricut_JCTR101C_SIT_Guatemala_2022.pdf

CRICUT1654629292444-CERTIFICATE_Cricut_CHP180B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654629292444-CERTIFICATE_Cricut_CHP180B3_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

TRIMBLE1654624106199-Certificate_Trimble_134000-99_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654624106199-Certificate_Trimble_134000-99_ATT_Bolivia_2022.pdf

TRIMBLE1654624095477-Certificate_Trimble_134000-99_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654624095477-Certificate_Trimble_134000-99_ATT_Bolivia_2022.pdf

TRIMBLE1654622966894-Certificate_Trimble_134000-99_ASEP_Panama_2022 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654622966894-Certificate_Trimble_134000-99_ASEP_Panama_2022%20.pdf

CRICUT1654615456644-Certificate_Cricut_JCTR101C_CONATEL_Paraguay_2022.PDF
https://orbiscompliance.s3.amazonaws.com/1654615456644-Certificate_Cricut_JCTR101C_CONATEL_Paraguay_2022.PDF

CRICUT1654526044194-CERTIFICATE_CRICUT_CHP220B3_NOM-003-SCFI-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654526044194-CERTIFICATE_CRICUT_CHP220B3_NOM-003-SCFI-SCFI-2014_NYCE_MEXICO_2022.pdf

BTL1654521921380-Certificate_Poly_CCX 505_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654521921380-Certificate_Poly_CCX%20505_IFT_Mexico_2022.pdf

BTL1654521913237-Certificate_Poly_CCX 505_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654521913237-Certificate_Poly_CCX%20505_IFT_Mexico_2022.pdf

SATO1654521642892-Certificate RCPSAWS22-1675-A3_Ampliacion de Definitivo Bluetooth_SATO_WS412TT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654521642892-Certificate%20RCPSAWS22-1675-A3_Ampliacion%20de%20Definitivo%20Bluetooth_SATO_WS412TT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1654521542623-Certificate RCPSAWS22-1675-A2_Ampliacion de Definitivo Bluetooth_SATO_WS412DT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654521542623-Certificate%20RCPSAWS22-1675-A2_Ampliacion%20de%20Definitivo%20Bluetooth_SATO_WS412DT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1654521457764-Certificate RCPSAWS22-1675-A1_Ampliacion de Definitivo Bluetooth_SATO_WS408TT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654521457764-Certificate%20RCPSAWS22-1675-A1_Ampliacion%20de%20Definitivo%20Bluetooth_SATO_WS408TT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1654521068711-Certificate RCPSAWS22-1675_Definitivo Bluetooth_ SATO_WS408DT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654521068711-Certificate%20RCPSAWS22-1675_Definitivo%20Bluetooth_%20SATO_WS408DT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

BTL1654286123188-NOM-208 Certificate_RAZER_HSD01_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654286123188-NOM-208%20Certificate_RAZER_HSD01_NYCE_Mexico_2022.pdf

LENOVO1654282157022-Certificate_Lenovo_Yoga Slim 9 14IAP7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654282157022-Certificate_Lenovo_Yoga%20Slim%209%2014IAP7_SUBTEL_Chile_2022.pdf

LENOVO1654282029777-Certificate_Lenovo_ThinkBook 16 G4+ ARA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654282029777-Certificate_Lenovo_ThinkBook%2016%20G4%2B%20ARA_SUBTEL_Chile_2022.pdf

LENOVO1654281761042-Certificate_Lenovo_ThinkBook 14 G4+ ARA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654281761042-Certificate_Lenovo_ThinkBook%2014%20G4%2B%20ARA_SUBTEL_Chile_2022.pdf

LENOVO1654281528726-Certificate_Lenovo_IdeaPad 3 15IAU7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654281528726-Certificate_Lenovo_IdeaPad%203%2015IAU7_SUBTEL_Chile_2022.pdf

LENOVO1654281294593-Certificate_Lenovo_IdeaPad 3 14IAU7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654281294593-Certificate_Lenovo_IdeaPad%203%2014IAU7_SUBTEL_Chile_2022.pdf

BRONI1654278097686-Extension_Certificate -TP 10740-3-15_BRONI_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654278097686-Extension_Certificate%20-TP%2010740-3-15_BRONI_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

INTERMACO1654260757561-Extension_Certificate -TP 10740-3-17_OMNICHANNEL_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654260757561-Extension_Certificate%20-TP%2010740-3-17_OMNICHANNEL_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

INTERMACO1654260720919-Extension_Certificate -TP 10740-3-16_INTERMACO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654260720919-Extension_Certificate%20-TP%2010740-3-16_INTERMACO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

CRICUT1654198828448-CERTIFICATE_Cricut_CHP080B1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654198828448-CERTIFICATE_Cricut_CHP080B1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

CRICUT1654198779929-CERTIFICATE_Cricut_JCTR101 MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654198779929-CERTIFICATE_Cricut_JCTR101%20MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

HP1654198748358-CERTIFICATE_HyperX_CS009_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654198748358-CERTIFICATE_HyperX_CS009_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

BTL1654190915832-NOM-208 Certificate_RAZER_RC30-0448_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654190915832-NOM-208%20Certificate_RAZER_RC30-0448_NYCE_Mexico_2022.pdf

INTERMACO1654177238201-Extension_Certificate -TP 10740-3-2_INTERMACO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654177238201-Extension_Certificate%20-TP%2010740-3-2_INTERMACO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

OMNICHANNEL1654176237656-Extension_Certificate -TP 10740-3-1_OMNICHANNEL_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654176237656-Extension_Certificate%20-TP%2010740-3-1_OMNICHANNEL_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

CRICUT1654173125531-Certificate_Cricut_CHP220B3_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654173125531-Certificate_Cricut_CHP220B3_ASEP_Panama_2022.pdf

DURACELL1654113690944-CERTIFICATE_DURACELL_CEF14LA4_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654113690944-CERTIFICATE_DURACELL_CEF14LA4_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

iRobot1654090117011-CERTIFICATE_iRobot_ADD-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654090117011-CERTIFICATE_iRobot_ADD-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1654024932953-DICTUM_HyperX_CS009WA_NOM-016-SCFI-1993 NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654024932953-DICTUM_HyperX_CS009WA_NOM-016-SCFI-1993%20NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRADLEPOINT1654024856165-DICTUM_cradlepoint_S5A749A S5A950 S5A033A S3A749A_NOM-001-SCFI-2018 NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1654024856165-DICTUM_cradlepoint_S5A749A%20S5A950%20S5A033A%20S3A749A_NOM-001-SCFI-2018%20NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf

VIDITEC1654009677760-Extension_Certificate -TP 10740-3-18_VIDITEC_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1654009677760-Extension_Certificate%20-TP%2010740-3-18_VIDITEC_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

ORACLE1653926147185-CERTIFICATE_ORACLE_7604281_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653926147185-CERTIFICATE_ORACLE_7604281_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653926147212-CERTIFICATE_ORACLE_7604523_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653926147212-CERTIFICATE_ORACLE_7604523_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653926147206-CERTIFICATE_ORACLE_7604685_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653926147206-CERTIFICATE_ORACLE_7604685_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

Cricut1653924557938-Certificate_Cricut_CHP220B3_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653924557938-Certificate_Cricut_CHP220B3_IFT_Mexico_2022.pdf

Cricut1653924520919-Certificate_Cricut_CHP180B3_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653924520919-Certificate_Cricut_CHP180B3_IFT_Mexico_2022.pdf

Stoneridge1653924251884-Certificate_Stoneridge_SM100_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653924251884-Certificate_Stoneridge_SM100_ATT_Bolivia_2022.pdf

SATO1653917479951-Certificate RCPSAPW22-1822_SATO_PW4NX(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653917479951-Certificate%20RCPSAPW22-1822_SATO_PW4NX%28Azerty%29_IFT_Mexico_2022.pdf

TRIMBLE1653915729673-Certificate_Trimble_134000-99_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653915729673-Certificate_Trimble_134000-99_CONATEL_Honduras_2022.pdf

ORACLE1653683395998-FORM C_ORACLE_XP ALM85US15_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683395998-FORM%20C_ORACLE_XP%20ALM85US15_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1653683381086-CERTIFICATE_ORACLE_XP ALM85US15_RES 169_UL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683381086-CERTIFICATE_ORACLE_XP%20ALM85US15_RES%20169_UL_ARGENTINA_2022.pdf

ORACLE1653683358293-FORM C_ORACLE_FSP060-DHAN3_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683358293-FORM%20C_ORACLE_FSP060-DHAN3_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1653683344745-CERTIFICATE_ORACLE_FSP060-DHAN3_RES 169_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683344745-CERTIFICATE_ORACLE_FSP060-DHAN3_RES%20169_IRAM_ARGENTINA_2022.pdf

ORACLE1653683295941-FORM C_ORACLE_FSP120-AHAN3_RES 169_LEALTAD COMERCIAL_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683295941-FORM%20C_ORACLE_FSP120-AHAN3_RES%20169_LEALTAD%20COMERCIAL_ARGENTINA_2022.pdf

ORACLE1653683275726-CERTIFICATE_ORACLE_FSP120-AHAN3_RES 169_IRAM_ARGENTINA_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653683275726-CERTIFICATE_ORACLE_FSP120-AHAN3_RES%20169_IRAM_ARGENTINA_2022.pdf

CRADLEPOINT1653671373633-Dictum_NOM-218_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653671373633-Dictum_NOM-218_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf

CRADLEPOINT1653667823650-Dictum_NOM-196_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653667823650-Dictum_NOM-196_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf

BTL1653663563039-CERTIFICATE_RAZER_RZ01-0440_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653663563039-CERTIFICATE_RAZER_RZ01-0440_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

ORACLE1653660090244-CERTIFICATE_ORACLE_7604511_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653660090244-CERTIFICATE_ORACLE_7604511_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ARISTA1653600925490-CoC_ARISTA_C-2xx_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653600925490-CoC_ARISTA_C-2xx_ANATEL_Brazil_2022.pdf

ARISTA1653598676609-CoH_ARISTA_AN1749_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653598676609-CoH_ARISTA_AN1749_ANATEL_Brazil_2022.pdf

ARISTA1653598662659-CoC_ARISTA_AN1749_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653598662659-CoC_ARISTA_AN1749_ANATEL_Brazil_2022.pdf

ORACLE1653588825392-CERTIFICATE_ORACLE_7604164_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653588825392-CERTIFICATE_ORACLE_7604164_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653588825370-CERTIFICATE_ORACLE_7604250_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653588825370-CERTIFICATE_ORACLE_7604250_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

DURACELL1653580962680-Certificate-DURACELL-CoppertopAA&AAA:USA-Intertek-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653580962680-Certificate-DURACELL-CoppertopAA%26AAA%3AUSA-Intertek-Colombia-2022.pdf

HP1653579278214-Certificate_HyperX_CS009WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653579278214-Certificate_HyperX_CS009WA_NYCE_Mexico_2022.pdf

SONY1653578239588-Certificate_SONY_CFI-ZCVL1_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653578239588-Certificate_SONY_CFI-ZCVL1_CONATEL_Paraguay_2022.pdf

SONY1653578133556-Certificate_SONY_CFI-ZCVR1_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653578133556-Certificate_SONY_CFI-ZCVR1_CONATEL_Paraguay_2022.pdf

GYP NEWTREE1653576771446-Extension_Certificate -TP 10740-2-2_GYP_NewTree_Duracell_C&D_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653576771446-Extension_Certificate%20-TP%2010740-2-2_GYP_NewTree_Duracell_C%26D_IQC_Argentina_2022.pdf

KIERO1653576075544-Extension_Certificate -TP 10740-2-1_KIERO_Duracell_C&D_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653576075544-Extension_Certificate%20-TP%2010740-2-1_KIERO_Duracell_C%26D_IQC_Argentina_2022.pdf

KIERO1653575176437-Extension_Certificate -TP-10740-3-12_KIERO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653575176437-Extension_Certificate%20-TP-10740-3-12_KIERO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

HP1653573116205-Certificate_HyperX_CEB003L, CEB003R, CEB003WA, CEB003C1_INSPEC-UVA_Mexico_2022-VIETNAM.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653573116205-Certificate_HyperX_CEB003L%2C%20CEB003R%2C%20CEB003WA%2C%20CEB003C1_INSPEC-UVA_Mexico_2022-VIETNAM.pdf

NEDAP1653569086456-Certificate_Nedap_ ASSY OVR RFID_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653569086456-Certificate_Nedap_%20ASSY%20OVR%20RFID_CRC_Colombia_2022.pdf

HP1653407769305-Dictum_HyperX_CS009WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653407769305-Dictum_HyperX_CS009WA_NYCE_Mexico_2022.pdf

iRobot1653402483738-CERTIFICATE_iRobot_RVA-Y1 RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653402483738-CERTIFICATE_iRobot_RVA-Y1%20RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

SATO1653402193312-Certificate RCPSAWS22-1674-A3_Ampliacion de Definitivo_SATO_WS412TT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653402193312-Certificate%20RCPSAWS22-1674-A3_Ampliacion%20de%20Definitivo_SATO_WS412TT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1653402125370-Certificate RCPSAWS22-1674-A2_Ampliacion de Definitivo_SATO_WS412DT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653402125370-Certificate%20RCPSAWS22-1674-A2_Ampliacion%20de%20Definitivo_SATO_WS412DT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1653402044774-Certificate RCPSAWS22-1674-A1_Ampliacion de Definitivo_SATO_WS408TT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653402044774-Certificate%20RCPSAWS22-1674-A1_Ampliacion%20de%20Definitivo_SATO_WS408TT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1653401956910-Certificate RCPSAWS22-1674_Definitivo_ SATO_WS408DT-STD(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653401956910-Certificate%20RCPSAWS22-1674_Definitivo_%20SATO_WS408DT-STD%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

TRIMBLE1653400725854-Certificate_Trimble_134000-99_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653400725854-Certificate_Trimble_134000-99_INDOTEL_Dominican%20Republic_2022.pdf

SATO1653399753929-Certificate RCPSAPW22-1684_SATO_PW4NX(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653399753929-Certificate%20RCPSAPW22-1684_SATO_PW4NX%28Bluestarlam%29_IFT_Mexico_2022.pdf

DURACELL1653398849195-NYCE6785M2_Certificate_Duracell_Coppertop_AA_AAA_C_D_OPTIMUM_AA_AAA_QUANTUM_AA_AAA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653398849195-NYCE6785M2_Certificate_Duracell_Coppertop_AA_AAA_C_D_OPTIMUM_AA_AAA_QUANTUM_AA_AAA_NYCE_Mexico_2022.pdf

SATO1653398797398-Certificate RCPSACT22-1888_SATO_CT4-LX(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653398797398-Certificate%20RCPSACT22-1888_SATO_CT4-LX%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

CRADLEPOINT1653395834510-Dictum_NOM-221_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653395834510-Dictum_NOM-221_cradlepoint_S5A749A-S5A950A-S5A033A-S3A749A_NYCE_Mexico_2022.pdf

SATO1653339784808-Certificate RCPSACL22-1889-A1_SATO_CL6NX Plus(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653339784808-Certificate%20RCPSACL22-1889-A1_SATO_CL6NX%20Plus%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1653339692576-Certificate RCPSACL22-1889_SATO_CL4NX Plus(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653339692576-Certificate%20RCPSACL22-1889_SATO_CL4NX%20Plus%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SONY1653337892906-Certificate RCPSOCF22-1570-A1_SONY_CFI-ZCVR1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653337892906-Certificate%20RCPSOCF22-1570-A1_SONY_CFI-ZCVR1_IFT_Mexico_2022.pdf

SONY1653337715034-Certificate RCPSOCF22-1570_SONY_CFI-ZCVL1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653337715034-Certificate%20RCPSOCF22-1570_SONY_CFI-ZCVL1_IFT_Mexico_2022.pdf

ROKU1653330627615-Extension_Certificate -TP 10740-3-11_S2GO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653330627615-Extension_Certificate%20-TP%2010740-3-11_S2GO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

HP1653322733362-Certificate_HyperX_CS009WA_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653322733362-Certificate_HyperX_CS009WA_ASEP_Panama_2022.pdf

HP1653322603080-Certificate_HyperX_CS009_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653322603080-Certificate_HyperX_CS009_ASEP_Panama_2022.pdf

CRICUT1653314483484-Certificate_Cricut_CHP220B3_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653314483484-Certificate_Cricut_CHP220B3_CONATEL_Honduras_2022.pdf

CRICUT1653314096042-Certificate_Cricut_CHP180B3_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653314096042-Certificate_Cricut_CHP180B3_CONATEL_Honduras_2022.pdf

CRICUT1653312857548-Certificate_Cricut_CHP180B3_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653312857548-Certificate_Cricut_CHP180B3_CONATEL_Honduras_2022.pdf

SONY1653077794797-Certificate_SONY_CUH-ZCT2U_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653077794797-Certificate_SONY_CUH-ZCT2U_CONATEL_Paraguay_2022.pdf

HP1653074798962-Certificate_HyperX_CS009WA_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653074798962-Certificate_HyperX_CS009WA_IFT_Mexico_2022.pdf

HP1653074752242-Certificate_HyperX_CS009_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653074752242-Certificate_HyperX_CS009_IFT_Mexico_2022.pdf

HP1653074173529-Certificate_HyperX_CEB003WA_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653074173529-Certificate_HyperX_CEB003WA_IFT_Mexico_2022.pdf

HP1653073967751-Certificate_HyperX_CEB003(CEB003R, CEB003L)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653073967751-Certificate_HyperX_CEB003%28CEB003R%2C%20CEB003L%29_IFT_Mexico_2022.pdf

ORACLE1653059054716-CERTIFICATE_ORACLE_7604617_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054716-CERTIFICATE_ORACLE_7604617_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653059054681-CERTIFICATE_ORACLE_7601976_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054681-CERTIFICATE_ORACLE_7601976_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653059054700-CERTIFICATE_ORACLE_7603799_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054700-CERTIFICATE_ORACLE_7603799_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653059054704-CERTIFICATE_ORACLE_7603486_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054704-CERTIFICATE_ORACLE_7603486_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653059054712-CERTIFICATE_ORACLE_7604388_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054712-CERTIFICATE_ORACLE_7604388_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653059054708-CERTIFICATE_ORACLE_7603849_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653059054708-CERTIFICATE_ORACLE_7603849_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534137-CERTIFICATE_ORACLE_7604617_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534137-CERTIFICATE_ORACLE_7604617_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534130-CERTIFICATE_ORACLE_7603849_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534130-CERTIFICATE_ORACLE_7603849_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534123-CERTIFICATE_ORACLE_7603799_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534123-CERTIFICATE_ORACLE_7603799_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534134-CERTIFICATE_ORACLE_7604388_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534134-CERTIFICATE_ORACLE_7604388_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534112-CERTIFICATE_ORACLE_7601976_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534112-CERTIFICATE_ORACLE_7601976_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1653058534127-CERTIFICATE_ORACLE_7603486_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653058534127-CERTIFICATE_ORACLE_7603486_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

LENOVO1653054246842-Certificate_Lenovo_ThinkBoook Plus G3 IAP_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1653054246842-Certificate_Lenovo_ThinkBoook%20Plus%20G3%20IAP_SUBTEL_Chile_2022.pdf

ARISTA1653003154320-CoH_ARISTA_DCS-7388_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653003154320-CoH_ARISTA_DCS-7388_ANATEL_Brazil_2022.pdf

ARISTA1653003134667-CoC_ARISTA_DCS-7388_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653003134667-CoC_ARISTA_DCS-7388_ANATEL_Brazil_2022.pdf

ARISTA1653001454935-CoH_ARISTA_AN1778_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653001454935-CoH_ARISTA_AN1778_ANATEL_Brazil_2022.pdf

ARISTA1653001310854-CoC_ARISTA_AN1778_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1653001310854-CoC_ARISTA_AN1778_ANATEL_Brazil_2022.pdf

LENOVO1652966937933-Certificate_Lenovo_Yoga Slim 7 Pro 16ARH7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652966937933-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2016ARH7_SUBTEL_Chile_2022.pdf

ARISTA1652820084123-CoC_ARISTA_AN1739_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652820084123-CoC_ARISTA_AN1739_ANATEL_Brazil_2022.pdf

ARISTA1652820057561-CoH_ARISTA_AN1739_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652820057561-CoH_ARISTA_AN1739_ANATEL_Brazil_2022.pdf

Kingston1652814337101-CERTIFICATE_KINGSTON_IKVP80ES MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652814337101-CERTIFICATE_KINGSTON_IKVP80ES%20MODELS_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

GP1652810564285-2022 Compliance Notification GS-CS-210013-GP-15A&24A:China-Intertek-Colombia-2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652810564285-2022%20Compliance%20Notification%20GS-CS-210013-GP-15A%2624A%3AChina-Intertek-Colombia-2022.pdf

LOGITECH1652797872241-Extension_Certificate -TP 10740-3-5_SZEMET_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797872241-Extension_Certificate%20-TP%2010740-3-5_SZEMET_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797743887-Extension_Certificate -TP 10740-3-3_STYLUS_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797743887-Extension_Certificate%20-TP%2010740-3-3_STYLUS_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797693570-Extension_Certificate -TP 10740-3-8_JUKEBOX_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797693570-Extension_Certificate%20-TP%2010740-3-8_JUKEBOX_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797648372-Extension_Certificate -TP 10740-3-1_GYP_NEW_TREE_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797648372-Extension_Certificate%20-TP%2010740-3-1_GYP_NEW_TREE_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797609605-Extension_Certificate -TP 10740-3-4_GRUPO_NUCLEO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797609605-Extension_Certificate%20-TP%2010740-3-4_GRUPO_NUCLEO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797573055-Extension_Certificate -TP 10740-3-6_ELIT_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797573055-Extension_Certificate%20-TP%2010740-3-6_ELIT_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797538768-Extension_Certificate -TP 10740-3-9_DISTECNA_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797538768-Extension_Certificate%20-TP%2010740-3-9_DISTECNA_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797505498-Extension_Certificate -TP 10740-3-7_CORCISA_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797505498-Extension_Certificate%20-TP%2010740-3-7_CORCISA_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

LOGITECH1652797466077-Extension_Certificate -TP 10740-3-2_CEVEN_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797466077-Extension_Certificate%20-TP%2010740-3-2_CEVEN_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652797237216-Extension_Certificate -TP 10740-3-1_GYP_NEW_TREE_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797237216-Extension_Certificate%20-TP%2010740-3-1_GYP_NEW_TREE_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652797166032-Extension_Certificate -TP 10740-3-4_GRUPO_NUCLEO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797166032-Extension_Certificate%20-TP%2010740-3-4_GRUPO_NUCLEO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652797100274-Extension_Certificate -TP 10740-3-6_ELIT_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652797100274-Extension_Certificate%20-TP%2010740-3-6_ELIT_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652796976868-Extension_Certificate -TP 10740-3-9_DISTECNA_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652796976868-Extension_Certificate%20-TP%2010740-3-9_DISTECNA_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652796901328-Extension_Certificate -TP 10740-3-7_CORCISA_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652796901328-Extension_Certificate%20-TP%2010740-3-7_CORCISA_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

DURACELL1652795917964-Extension_Certificate -TP 10740-3-2_CEVEN_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652795917964-Extension_Certificate%20-TP%2010740-3-2_CEVEN_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

Nedap1652792798184-Certificate_Nedap_Samrttag Neck_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652792798184-Certificate_Nedap_Samrttag%20Neck_IFT_Mexico_2022.pdf

ORACLE1652734286622-Certificate RCPQUQC22-1752_Qualcomm Atheros_QCNFA364A(ORACLE_MICROS Compact Workstation 3)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652734286622-Certificate%20RCPQUQC22-1752_Qualcomm%20Atheros_QCNFA364A%28ORACLE_MICROS%20Compact%20Workstation%203%29_IFT_Mexico_2022.pdf

Roku1652478324655-Certificate_Roku_3940X(3940MX)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652478324655-Certificate_Roku_3940X%283940MX%29_IFT_Mexico_2021.pdf

iRobot1652465031244-Safety Certificate_iRobot_Braava 240_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652465031244-Safety%20Certificate_iRobot_Braava%20240_Brazil_2022.pdf

LENOVO1652451715530-Certificate Update_Lenovo_Lenovo 10w_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652451715530-Certificate%20Update_Lenovo_Lenovo%2010w_SUBTEL_Chile_2022.pdf

ORACLE1652383241254-CERTIFICATE_ORACLE_7603401_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652383241254-CERTIFICATE_ORACLE_7603401_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1652382979875-CERTIFICATE_ORACLE_7600634_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652382979875-CERTIFICATE_ORACLE_7600634_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

TRIMBLE1652375405553-Certificate_TRIMBLE_134000-99_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652375405553-Certificate_TRIMBLE_134000-99_ARCOTEL_Ecuador_2022.pdf

PANDUIT1652299743835-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652299743835-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2022.pdf

CRICUT1652208795417-CERTIFICATE_Cricut_CXPL303 CXPL303B CXPL303C_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652208795417-CERTIFICATE_Cricut_CXPL303%20CXPL303B%20CXPL303C_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

HP1652207952252-CERTIFICATE_HyperX_CS001-A_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652207952252-CERTIFICATE_HyperX_CS001-A_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRICUT1652193162382-Certificate_Cricut_JCTR101_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652193162382-Certificate_Cricut_JCTR101_SIGET_El%20Salvador_2022.PDF

CRICUT1652192999280-Certificate_Cricut_JCTRC101C_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192999280-Certificate_Cricut_JCTRC101C_SIGET_El%20Salvador_2022.PDF

PANDUIT1652192930990-21147CC000194_NOM-050-SCFI-2004_Certificate_PANDUIT_MTPSRBCL-C_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192930990-21147CC000194_NOM-050-SCFI-2004_Certificate_PANDUIT_MTPSRBCL-C_UVA_Mexico_2022.pdf

PANDUIT1652192826047-21147CC000195_NOM-050-SCFI-2004_Certificate_PANDUIT_PE2VD06_PR2VSD08_USA_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192826047-21147CC000195_NOM-050-SCFI-2004_Certificate_PANDUIT_PE2VD06_PR2VSD08_USA_UVA_Mexico_2022.pdf

CRICUT1652192748158-Certificate_Cricut_JCTR101_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192748158-Certificate_Cricut_JCTR101_SIGET_El%20Salvador_2022.PDF

PANDUIT1652192574406-21147CC000196_NOM-050-SCFI-2004_Certificate_PANDUIT_PE2VD06_PR2VSD08_CH_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192574406-21147CC000196_NOM-050-SCFI-2004_Certificate_PANDUIT_PE2VD06_PR2VSD08_CH_UVA_Mexico_2022.pdf

PANDUIT1652192490816-21147CC000193_NOM-050-SCFI-2004_Certificate_PANDUIT_FWRKMAT_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192490816-21147CC000193_NOM-050-SCFI-2004_Certificate_PANDUIT_FWRKMAT_UVA_Mexico_2022.pdf

PANDUIT1652192412019-21147CC000191_NOM-050-SCFI-2004_Certificate_PANDUIT_AFR4ECBL_CF3IW-E_CFPE2IWY_CFPE4IGY_CFPL6EIY_ECF5IW-E_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652192412019-21147CC000191_NOM-050-SCFI-2004_Certificate_PANDUIT_AFR4ECBL_CF3IW-E_CFPE2IWY_CFPE4IGY_CFPL6EIY_ECF5IW-E_UVA_Mexico_2022.pdf

PANDUIT1652192321873-21147CC000192_NOM-050-SCFI-2004_Certificate_PANDUIT_CIPIW-C_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652192321873-21147CC000192_NOM-050-SCFI-2004_Certificate_PANDUIT_CIPIW-C_UVA_Mexico_2022.pdf

HPHX1652131981316-CoH_HPHX_CEB003WA_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652131981316-CoH_HPHX_CEB003WA_ANATEL_Brazil_2022.pdf

HPHX1652131964356-CoH_HPHX_CEB003R_CEB003L_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652131964356-CoH_HPHX_CEB003R_CEB003L_ANATEL_Brazil_2022.pdf

HPHX1652131955504-CoC_HPHX_CEB003WA_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652131955504-CoC_HPHX_CEB003WA_ANATEL_Brazil_2022.pdf

HPHX1652131943963-CoC_HPHX_CEB003R_CEB003L_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652131943963-CoC_HPHX_CEB003R_CEB003L_ANATEL_Brazil_2022.pdf

oracle1652110360970-Certificate RCPORMI22-1703-A1_ORACLE_MICROS Workstation 6 Series 2_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652110360970-Certificate%20RCPORMI22-1703-A1_ORACLE_MICROS%20Workstation%206%20Series%202_IFT_Mexico_2022.pdf

oracle1652110321747-Certificate RCPORMI22-1703_ORACLE_MICROS Express Station 4_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652110321747-Certificate%20RCPORMI22-1703_ORACLE_MICROS%20Express%20Station%204_IFT_Mexico_2022.pdf

IROBOT1652109692728-Certificate_iRobot_RVB-Y2_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652109692728-Certificate_iRobot_RVB-Y2_IFT_Mexico_2022.pdf

IROBOT1652109683205-Certificate_iRobot_RVB-Y2_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652109683205-Certificate_iRobot_RVB-Y2_IFT_Mexico_2022.pdf

IROBOT1652109044247-Certificate_iRobot_RVA-Y2_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652109044247-Certificate_iRobot_RVA-Y2_IFT_Mexico_2022.pdf

IROBOT1652108704744-Certificate_iRobot_RMA-Y1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652108704744-Certificate_iRobot_RMA-Y1_IFT_Mexico_2022.pdf

MICROSOFT1652100437118-Certificate_Microsoft_1959_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652100437118-Certificate_Microsoft_1959_CONATEL_Honduras_2022.pdf

MICROSOFT1652100386750-Certificate_Microsoft_1959_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1652100386750-Certificate_Microsoft_1959_CONATEL_Honduras_2022.pdf

KCTL1652099243548-Certificate_SAMSUNG_CCAR210R_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1652099243548-Certificate_SAMSUNG_CCAR210R_ARCOTEL_Ecuador_2022.pdf

cradlepoint1651866939724-CERTIFICATE_cradlepoint_S5A033A_NOM-019-SCFI-1998_NYCE_MEXICO.pdf
https://orbiscompliance.s3.amazonaws.com/1651866939724-CERTIFICATE_cradlepoint_S5A033A_NOM-019-SCFI-1998_NYCE_MEXICO.pdf

BTL1651782180644-CERTIFICATE_POLY_CCX 400_NOM-019-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651782180644-CERTIFICATE_POLY_CCX%20400_NOM-019-1998_NYCE_MEXICO_2022.pdf

LENOVO1651772249265-Certificate_Lenovo_Lenovo 10w_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651772249265-Certificate_Lenovo_Lenovo%2010w_SUBTEL_Chile_2022.pdf

IROBOT1651762087729-Electrical Safety Certificate_iRobot_Roomba 614-675-694_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651762087729-Electrical%20Safety%20Certificate_iRobot_Roomba%20614-675-694_Brazil_2022.pdf

CEI1651690095107-CoC_CEI_LYKANER5_ANATEL_Korea.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651690095107-CoC_CEI_LYKANER5_ANATEL_Korea.pdf

CRICUT1651689873508-NCC 22.09207_Rev0.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651689873508-NCC%2022.09207_Rev0.pdf

CRICUT1651675294293-Updated Certificate _Cricut_CHP220B3_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651675294293-Updated%20Certificate%20_Cricut_CHP220B3_SUTEL_Costa%20Rica_2022.pdf

CRICUT1651675187819-Updated Certificate_Cricut_CHP180B3_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651675187819-Updated%20Certificate_Cricut_CHP180B3_SUTEL_Costa%20Rica_2022.pdf

SONY1651670296035-Certificate NYC-2202CT1192_NOM-208_SONY_CFI-ZCVL1_CFI-ZCVR1_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651670296035-Certificate%20NYC-2202CT1192_NOM-208_SONY_CFI-ZCVL1_CFI-ZCVR1_NYCE_Mexico_2022.pdf

Nedap1651603813569-Certificate_Nedap_Convexs MD80C_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651603813569-Certificate_Nedap_Convexs%20MD80C_IFT_Mexico_2021.pdf

IROBOT1651596794188-Sound Power Certificate_Irobot_Roomba e5_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651596794188-Sound%20Power%20Certificate_Irobot_Roomba%20e5_Brazil_2022.pdf

SATO1651591955727-Certificate RCPSAWS22-1451-A1_SATO_WS408TT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651591955727-Certificate%20RCPSAWS22-1451-A1_SATO_WS408TT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

SATO1651591860852-Certificate RCPSAWS22-1452_SATO_WS408DT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651591860852-Certificate%20RCPSAWS22-1452_SATO_WS408DT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

SATO1651590354385-Certificate RCPSACL22-1394-A1_SATO_CL6NX Plus(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651590354385-Certificate%20RCPSACL22-1394-A1_SATO_CL6NX%20Plus%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1651590175948-Certificate RCPSACL22-1394_SATO_CL4NX Plus(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651590175948-Certificate%20RCPSACL22-1394_SATO_CL4NX%20Plus%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

IROBOT1651589207061-Sound Power Certificate_iRobot_Roomba i7+_ICbr_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651589207061-Sound%20Power%20Certificate_iRobot_Roomba%20i7%2B_ICbr_Brazil_2022.pdf

DURACELL1651589205323-TP 10740-4-_Certificate_Duracell_OPTIMUM_AA&AAA_CH_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651589205323-TP%2010740-4-_Certificate_Duracell_OPTIMUM_AA%26AAA_CH_IQC_Argentina_2022.pdf

IROBOT1651588931115-Sound Power Certificate_iRobot_Roomba i7+_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651588931115-Sound%20Power%20Certificate_iRobot_Roomba%20i7%2B_Brazil_2022.pdf

IROBOT1651588572191-Sound Power Certificate_iRobot_Roomba i7+_ICbr_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651588572191-Sound%20Power%20Certificate_iRobot_Roomba%20i7%2B_ICbr_Brazil_2022.pdf

IROBOT1651588546752-Safety Certificate_iRobot_Roombai7+_ICbr_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651588546752-Safety%20Certificate_iRobot_Roombai7%2B_ICbr_Brazil_2022.pdf

CRICUT1651582347686-Certificate_Cricut_CHP180B3_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651582347686-Certificate_Cricut_CHP180B3_ASEP_Panama_2022.pdf

HP1651246130479-Certificate_HyperX_CEB003WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651246130479-Certificate_HyperX_CEB003WA_ENACOM_Argentina_2022.pdf

HP1651246083906-Certificate_HyperX_CEB003R_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651246083906-Certificate_HyperX_CEB003R_ENACOM_Argentina_2022.pdf

HP1651246030506-Certificate_HyperX_CEB003L_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651246030506-Certificate_HyperX_CEB003L_ENACOM_Argentina_2022.pdf

HP1651245672252-Certificate_HyperX_PF002WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651245672252-Certificate_HyperX_PF002WA_ENACOM_Argentina_2022.pdf

HP1651245551420-Certificate_HyperX_PF002_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651245551420-Certificate_HyperX_PF002_ENACOM_Argentina_2022.pdf

HP1651245441144-Certificate_HyperX_CP001WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651245441144-Certificate_HyperX_CP001WA_ENACOM_Argentina_2022.pdf

HP1651245403760-Certificate_HyperX_CP001_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651245403760-Certificate_HyperX_CP001_ENACOM_Argentina_2022.pdf

DURACELL1651240028222-14722D1604-Dictamen_Certificate_Duracell_March_Coppertop_AA_6Pz_1054930605_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651240028222-14722D1604-Dictamen_Certificate_Duracell_March_Coppertop_AA_6Pz_1054930605_INSPEC-UVA_Mexico_2022.pdf

RAZER1651238586332-Certificate_RAZER_RZ01-0440_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651238586332-Certificate_RAZER_RZ01-0440_NYCE_Mexico_2022.pdf

HP1651179943747-CoH_HPHX_CP001WA_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651179943747-CoH_HPHX_CP001WA_ANATEL_Brazil_2022.pdf

HP1651179934692-CoH_HPHX_CP001_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651179934692-CoH_HPHX_CP001_ANATEL_Brazil_2022.pdf

HP1651179924318-CoC_HPHX_CP001WA_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651179924318-CoC_HPHX_CP001WA_ANATEL_Brazil_2022.pdf

HP1651179912831-CoC_HPHX_CP001_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651179912831-CoC_HPHX_CP001_ANATEL_Brazil_2022.pdf

DURACELL1651170848555-L1184001_ORBISBR_pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651170848555-L1184001_ORBISBR_pdf.pdf

TRIMBLE1651161834149-Certificate_Trimble_134000-99_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651161834149-Certificate_Trimble_134000-99_SIGET_El%20Salvador_2022.PDF

HP1651151315506-Cetificate_HyperX_CS009_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651151315506-Cetificate_HyperX_CS009_URSEC_Uruguay_2022.pdf

SATO1651074497212-DICTUM_SATO_M6E-NANO_NOM-001 NOM-016 NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651074497212-DICTUM_SATO_M6E-NANO_NOM-001%20NOM-016%20NOM-019_NYCE_MEXICO_2022.pdf

HP1651066270651-NOM-208 Certificate_HyperX_CS009WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651066270651-NOM-208%20Certificate_HyperX_CS009WA_NYCE_Mexico_2022.pdf

HP1651066231250-NOM-208 Certificate_HyperX_CS009_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1651066231250-NOM-208%20Certificate_HyperX_CS009_NYCE_Mexico_2022.pdf

CRICUT1651062684891-Certificate_Cricut_CHP220B3_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1651062684891-Certificate_Cricut_CHP220B3_SUTEL_Costa%20Rica_2022.pdf

TRIMBLE1650994585720-CERTIFICATE_TRIMBLE_VDM912_NOM-001 DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650994585720-CERTIFICATE_TRIMBLE_VDM912_NOM-001%20DICTUM_NYCE_MEXICO_2022.pdf

SATO1650986297634-DICTUM_SATO_SX-SDMAC_NOM-001 NOM-016 NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650986297634-DICTUM_SATO_SX-SDMAC_NOM-001%20NOM-016%20NOM-019_NYCE_MEXICO_2022.pdf

SATO1650900541986-DICTUM_SATO_M6E-MICRO_NOM-001 NOM-016 NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650900541986-DICTUM_SATO_M6E-MICRO_NOM-001%20NOM-016%20NOM-019_NYCE_MEXICO_2022.pdf

HP1650896893914-Cetificate_HyperX_CS009WA_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650896893914-Cetificate_HyperX_CS009WA_URSEC_Uruguay_2022.pdf

SATO1650894528023-Certificate Dictum NYC TLDT0485-22_Novanta_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650894528023-Certificate%20Dictum%20NYC%20TLDT0485-22_Novanta_NYCE_Mexico_2022.pdf

HP1650893849117-Certificate_HyperX_CS009_CS009WA_INSPEC-UVA_Mexico_2022_VIETNAM.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650893849117-Certificate_HyperX_CS009_CS009WA_INSPEC-UVA_Mexico_2022_VIETNAM.pdf

BTL1650893515021-IFT Certificate_RAZER_RZ04-0398_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650893515021-IFT%20Certificate_RAZER_RZ04-0398_IFT_Mexico_2022.pdf

BTL1650643786363-CERTIFICATE_RAZER_RZ01-0439_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650643786363-CERTIFICATE_RAZER_RZ01-0439_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

SATO1650640099594-Certficate NYC-2202CT1069_NOM-208_SATO_WS4 Series(SATO Mexico)_NYCE_Mexico_2022- Bluetooth.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650640099594-Certficate%20NYC-2202CT1069_NOM-208_SATO_WS4%20Series%28SATO%20Mexico%29_NYCE_Mexico_2022-%20Bluetooth.pdf

IROBOT1650639611316-Final report - Shenzhen Kin Yat Power Electronic Company Limited.- 14-04-2022 - Xiang Lai.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650639611316-Final%20report%20-%20Shenzhen%20Kin%20Yat%20Power%20Electronic%20Company%20Limited.-%2014-04-2022%20-%20Xiang%20Lai.pdf

TRIMBLE1650632909061-22049UCCNOM-024-SCFI-2013_Certificate_TRIMBLE_VDM912_V&C-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650632909061-22049UCCNOM-024-SCFI-2013_Certificate_TRIMBLE_VDM912_V%26C-UVA_Mexico_2022.pdf

ARISTA1650564157412-CoH_ARISTA_DCS-7812_DCS-7816_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650564157412-CoH_ARISTA_DCS-7812_DCS-7816_ANATEL_Brazil_2022.pdf

ARISTA1650564147126-CoC_ARISTA_DCS-7812_DCS-7816_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650564147126-CoC_ARISTA_DCS-7812_DCS-7816_ANATEL_Brazil_2022.pdf

Arista1650556781072-CoH_ARISTA_AN1722_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650556781072-CoH_ARISTA_AN1722_ANATEL_Brazil_2022.pdf

Arista1650556755525-CoC_ARISTA_AN1722_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650556755525-CoC_ARISTA_AN1722_ANATEL_Brazil_2022.pdf

LENOVO1650555540755-Certificate_Lenovo_Lenovo V15 G3 IAP_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650555540755-Certificate_Lenovo_Lenovo%20V15%20G3%20IAP_Chile_SUBTEL_2022.pdf

LENOVO1650555400541-Certificate_Lenovo_Lenovo V14 G3 IAP_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650555400541-Certificate_Lenovo_Lenovo%20V14%20G3%20IAP_Chile_SUBTEL_2022.pdf

LENOVO1650555291035-Certificate_Lenovo_IdeaPad 3 17IAU7_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650555291035-Certificate_Lenovo_IdeaPad%203%2017IAU7_Chile_SUBTEL_2022.pdf

MICROSOFT1650555121440-Certificate_Microsoft_1951_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650555121440-Certificate_Microsoft_1951_Chile_SUBTEL_2022.pdf

MICROSOFT1650554801122-Certificate_Microsoft_1951_CONATEL_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650554801122-Certificate_Microsoft_1951_CONATEL_Honduras_2022.pdf

Cricut1650550345981-CERTIFICATE_Cricut_LIDEART_VLC27301_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650550345981-CERTIFICATE_Cricut_LIDEART_VLC27301_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

BTL1650544836969-CERTIFICATE_RAZER_RZ04-0398_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650544836969-CERTIFICATE_RAZER_RZ04-0398_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

SATO1650482540183-Certificate NYC-2202CT1073_NOM-208_SATO_WS4 Series(SATO Mexico)_NYCE_Mexico_2022- WLAN.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650482540183-Certificate%20NYC-2202CT1073_NOM-208_SATO_WS4%20Series%28SATO%20Mexico%29_NYCE_Mexico_2022-%20WLAN.pdf

SATO1650479838116-Certificate NYC TLDT0454-22_silex_SX-SDMAC_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650479838116-Certificate%20NYC%20TLDT0454-22_silex_SX-SDMAC_NYCE_Mexico_2022.pdf

SATO1650466971282-Certificate NYC TLDT0452-22_NOVANTA_M6E-MICRO_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650466971282-Certificate%20NYC%20TLDT0452-22_NOVANTA_M6E-MICRO_NYCE_Mexico_2022.pdf

DURACELL1650463264714-OF_1248_Permit_Letter_Duracell_Current_Stock_Portfolio_DGN_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650463264714-OF_1248_Permit_Letter_Duracell_Current_Stock_Portfolio_DGN_Mexico_2022.pdf

DURACELL1650462592939-Acknowledgment_1100_Duracell_To_import_Portfolio_Outer_Commerce_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650462592939-Acknowledgment_1100_Duracell_To_import_Portfolio_Outer_Commerce_Mexico_2022.pdf

IROBOT1650460403395-Safety Certificate_380_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650460403395-Safety%20Certificate_380_iRobot_Brazil_2022.pdf

IROBOT1650460403401-Safety Certificate_Roomba s9+_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650460403401-Safety%20Certificate_Roomba%20s9%2B_iRobot_Brazil_2022.pdf

IROBOT1650460403386-Safety Certificate_Roomba i7+_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650460403386-Safety%20Certificate_Roomba%20i7%2B_iRobot_Brazil_2022.pdf

IROBOT1650460344476-Safety Certificate_Roomba s9+_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650460344476-Safety%20Certificate_Roomba%20s9%2B_iRobot_Brazil_2022.pdf

IROBOT1650460344470-Safety Certificate_380_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650460344470-Safety%20Certificate_380_iRobot_Brazil_2022.pdf

IROBOT1650460344427-Safety Certificate_Roomba i7+_iRobot_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650460344427-Safety%20Certificate_Roomba%20i7%2B_iRobot_Brazil_2022.pdf

Cricut1650395888458-NOM-208 Certificate_Cricut_CHP180B3&CHP220B3&CHP080B1_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650395888458-NOM-208%20Certificate_Cricut_CHP180B3%26CHP220B3%26CHP080B1_NYCE_Mexico_2022.pdf

DURACELL1650382661173-TP_10740-1_Certificate_Duracell_675_Germany_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650382661173-TP_10740-1_Certificate_Duracell_675_Germany_IQC_Argentina_2022.pdf

DURACELL1650381934941-TP_10740-2_Certificate_Duracell_C&D_USA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1650381934941-TP_10740-2_Certificate_Duracell_C%26D_USA_IQC_Argentina_2022.pdf

DURACELL1650372408946-TP_10740-3_Certificate_Duracell_AA&AAA_CH_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650372408946-TP_10740-3_Certificate_Duracell_AA%26AAA_CH_IQC_Argentina_2022.pdf

PANDUIT1650297458801-Certificate_PANDUIT_EF001_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1650297458801-Certificate_PANDUIT_EF001_INSPEC-UVA_Mexico_2022.pdf

BOSCH1649966715001-Certificaet_BOSCH_GLM 50-27 C_ATT_Bolivia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649966715001-Certificaet_BOSCH_GLM%2050-27%20C_ATT_Bolivia_2022.pdf

ORACLE1649964360364-CERTIFICATE_ORACLE_7603877_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649964360364-CERTIFICATE_ORACLE_7603877_NOM-019_ANCE_MEXICO_2022.pdf

CRICUT1649960673799-CERTIFICATE_Cricut_VLC27301_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649960673799-CERTIFICATE_Cricut_VLC27301_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

BOSCH1649948367573-Certificate_BOSCH_GLM 50-27 C_MTC_Peru_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649948367573-Certificate_BOSCH_GLM%2050-27%20C_MTC_Peru_2022.pdf

CRICUT1649787000009-Certificate_Cricut_CHP180B3_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649787000009-Certificate_Cricut_CHP180B3_ARCOTEL_Ecuador_2022.pdf

ORACLE1649779264908-CERTIFICATE_ORACLE_7115948_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649779264908-CERTIFICATE_ORACLE_7115948_NOM-019_ANCE_MEXICO_2022.pdf

HP1649704160931-DICTUM NOM-196_HyperX_CS001-A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649704160931-DICTUM%20NOM-196_HyperX_CS001-A_NYCE_Mexico_2022.pdf

Lenovo1649690971768-Certificate_Lenovo_ThinkStation P360 Tower_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649690971768-Certificate_Lenovo_ThinkStation%20P360%20Tower_SUBTEL_Chile_2022.pdf

HyperX1649688507055-Certificate_HyperX_CEB003WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649688507055-Certificate_HyperX_CEB003WA_SUBTEL_Chile_2022.pdf

HyperX1649688467150-Certificate_HyperX_CEBOO03WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649688467150-Certificate_HyperX_CEBOO03WA_SUBTEL_Chile_2022.pdf

HyperX1649688436499-Certificate_HyperX_CEBOO03WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649688436499-Certificate_HyperX_CEBOO03WA_SUBTEL_Chile_2022.pdf

HyperX1649688411504-Certificate_HyperX_CEB003 y CEB003R_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649688411504-Certificate_HyperX_CEB003%20y%20CEB003R_SUBTEL_Chile_2022.pdf

ORACLE1649684813500-CERTIFICATE_ORACLE_PU1SLT_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649684813500-CERTIFICATE_ORACLE_PU1SLT_NOM-019_ANCE_MEXICO_2022.pdf

ORACLE1649684359279-CERTIFICATE_ORACLE_ HSTNS-2141_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649684359279-CERTIFICATE_ORACLE_%20HSTNS-2141_NOM-019_ANCE_MEXICO_2022.pdf

BOSCH1649683785204-Certificate_BOSCH_GLM 50-27 C_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649683785204-Certificate_BOSCH_GLM%2050-27%20C_INDOTEL_Dominican%20Republic_2022.pdf

u-blox1649455388313-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2022 .pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455388313-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2022%20.pdf.pdf

u-blox1649455380625-CoH_UBLOX_SARA-R412M_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455380625-CoH_UBLOX_SARA-R412M_ANATEL_Brazil_2022.pdf

u-blox1649455372596-CoH_UBLOX_SARA-R410M_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455372596-CoH_UBLOX_SARA-R410M_ANATEL_Brazil_2022.pdf

u-blox1649455360699-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2022 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455360699-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2022%20.pdf

u-blox1649455353066-CoC_UBLOX_TOBY-L200_MPCI_L200_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455353066-CoC_UBLOX_TOBY-L200_MPCI_L200_ANATEL_Brazil_2022.pdf

u-blox1649455346153-CoC_UBLOX_SARA-R412M_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455346153-CoC_UBLOX_SARA-R412M_ANATEL_Brazil_2022.pdf

u-blox1649455203812-CoC_UBLOX_SARA-R410M_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649455203812-CoC_UBLOX_SARA-R410M_ANATEL_Brazil_2022.pdf

u-blox1649450864122-CoC_UBLOX_SARA-R222x_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649450864122-CoC_UBLOX_SARA-R222x_ANATEL_Brazil_2022.pdf

u-blox1649450847176-CoH_UBLOX_SARA-R222x_ANATEL_Brazil_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649450847176-CoH_UBLOX_SARA-R222x_ANATEL_Brazil_2022.pdf.pdf

Novatel1649448782572-CoC_Pwrpak7_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649448782572-CoC_Pwrpak7_ANATEL_Brazil_2022.pdf

BOSCH1649437204208-Certificate_BOSCH_ GLM 50-27 C_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649437204208-Certificate_BOSCH_%20GLM%2050-27%20C_SUTEL_Costa%20Rica_2022.pdf

Roku1649433220802-CoH_Roku_3930x_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649433220802-CoH_Roku_3930x_ANATEL_Brazil_2022.pdf

Roku1649433208760-CoC_Roku_3930x_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649433208760-CoC_Roku_3930x_ANATEL_Brazil_2022.pdf

RAZER1649429458968-Certificate_RAZER_RZ04-398 ; RC30-0448_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649429458968-Certificate_RAZER_RZ04-398%20%3B%20RC30-0448_INSPEC-UVA_Mexico_2022.pdf

LENOVO1649356116089-Certificate_Lenovo_ThinkBook 16 G4+ IAP_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649356116089-Certificate_Lenovo_ThinkBook%2016%20G4%2B%20IAP_SUBTEL_Chile_2022.pdf

LENOVO1649355401933-Certifica_Lenovo_ThinkBook 14 G4+ IAP._SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649355401933-Certifica_Lenovo_ThinkBook%2014%20G4%2B%20IAP._SUBTEL_Chile_2022.pdf

LENOVO1649355012739-Certifica_Lenovo_Lenovo V15 G3 ABA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649355012739-Certifica_Lenovo_Lenovo%20V15%20G3%20ABA_SUBTEL_Chile_2022.pdf

LENOVO1649354350409-Certifica_Lenovo_Lenovo V14 G3 ABA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649354350409-Certifica_Lenovo_Lenovo%20V14%20G3%20ABA_SUBTEL_Chile_2022.pdf

LENOVO1649352112700-Certifica_Lenovo_IdeaPad 3 17ABA7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649352112700-Certifica_Lenovo_IdeaPad%203%2017ABA7_SUBTEL_Chile_2022.pdf

LENOVO1649351226402-Certificate_Lenovo_IdeaPad 3 14ABA7_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649351226402-Certificate_Lenovo_IdeaPad%203%2014ABA7_SUBTEL_Chile_2022.pdf

DURACELL1649340552015-14722D1253-Dictamen_Certificate_Duracell_March_Coppertop_D_2Pz_1101564846_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649340552015-14722D1253-Dictamen_Certificate_Duracell_March_Coppertop_D_2Pz_1101564846_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649340270061-14722D1251-Dictamen_Certificate_Duracell_March_Coppertop_C_D_2Pz_1101564847_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649340270061-14722D1251-Dictamen_Certificate_Duracell_March_Coppertop_C_D_2Pz_1101564847_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649340145292-14722D1236-Dictamen_Certificate_Duracell_March_Coppertop_AAA_4Pz_6Pz_1054930480_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649340145292-14722D1236-Dictamen_Certificate_Duracell_March_Coppertop_AAA_4Pz_6Pz_1054930480_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649338545215-14722D1235-Dictamen_Certificate_Duracell_March_Coppertop_AAA_1Pz_4Pz_1054930481_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649338545215-14722D1235-Dictamen_Certificate_Duracell_March_Coppertop_AAA_1Pz_4Pz_1054930481_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649338389923-14722D1234-Dictamen_Certificate_Duracell_March_Coppertop_AA_4Pz_6Pz_1054930476_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649338389923-14722D1234-Dictamen_Certificate_Duracell_March_Coppertop_AA_4Pz_6Pz_1054930476_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649338331083-14722D1233-Dictamen_Certificate_Duracell_March_Coppertop_AA_1Pz_4Pz_1054930479_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649338331083-14722D1233-Dictamen_Certificate_Duracell_March_Coppertop_AA_1Pz_4Pz_1054930479_INSPEC-UVA_Mexico_2022.pdf

DURACELL1649338224266-14722D1232-Dictamen_Certificate_Duracell_March_Coppertop_AA_1Pz_1054930481_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649338224266-14722D1232-Dictamen_Certificate_Duracell_March_Coppertop_AA_1Pz_1054930481_INSPEC-UVA_Mexico_2022.pdf

HP1649337591245-NOM-208 Certificate_HyperX_CEB003WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649337591245-NOM-208%20Certificate_HyperX_CEB003WA_NYCE_Mexico_2022.pdf

HP1649336694357-NOM-208 Certificate_HyperX_CEB003 (CEB003R, CEB003L)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649336694357-NOM-208%20Certificate_HyperX_CEB003%20%28CEB003R%2C%20CEB003L%29_NYCE_Mexico_2022.pdf

HP1649251658275-Certificate_HyperX_CS009, CS009WA_INSPEC-UVA_Mexico_2022_(CHINA).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649251658275-Certificate_HyperX_CS009%2C%20CS009WA_INSPEC-UVA_Mexico_2022_%28CHINA%29.pdf

ROKU1649189160250-CERTIFICATE_ROKU_3940X(3940MX)_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649189160250-CERTIFICATE_ROKU_3940X%283940MX%29_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRICUT1649166235584-CERTIFICATE_LIDEART_Cricut_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649166235584-CERTIFICATE_LIDEART_Cricut_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRICUT1649166215253-CERTIFICATE_ORBIS_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649166215253-CERTIFICATE_ORBIS_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

CRICUT1649165579003-Certificate_Cricut_CHP220B3_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649165579003-Certificate_Cricut_CHP220B3_SIT_Guatemala_2022.pdf

HP1649165478396-CERTIFICATE_HyperX_CEB003C1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649165478396-CERTIFICATE_HyperX_CEB003C1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1649165368318-CERTIFICATE_HyperX_CEB003WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649165368318-CERTIFICATE_HyperX_CEB003WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

HP1649165347936-CERTIFICATE_HyperX_CEB003L CEB003R_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649165347936-CERTIFICATE_HyperX_CEB003L%20CEB003R_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

CRICUT1649164030499-Certificate_Cricut_CHP180B3_SIT_Guatemala_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1649164030499-Certificate_Cricut_CHP180B3_SIT_Guatemala_2022.pdf

NEDAP1649079370676-Cetificate_Nedap_LACTIVATOR REALTIME_IFT_MEXICO_2021_(Corrected).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649079370676-Cetificate_Nedap_LACTIVATOR%20REALTIME_IFT_MEXICO_2021_%28Corrected%29.pdf

HP1649077377695-Certificate_HyperX_CS007, CS008_INSPEC-UVA_Mexico_2022_(VIETNAM).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1649077377695-Certificate_HyperX_CS007%2C%20CS008_INSPEC-UVA_Mexico_2022_%28VIETNAM%29.pdf

HP1649077360681-Certificate_HyperX_CS007, CS008_INSPEC-UVA_Mexico_2022_(CHINA).pdf
https://orbiscompliance.s3.amazonaws.com/1649077360681-Certificate_HyperX_CS007%2C%20CS008_INSPEC-UVA_Mexico_2022_%28CHINA%29.pdf

SATO1648839757664-Certificate RCPSAA822-0745_SATO_S84-ex (SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648839757664-Certificate%20RCPSAA822-0745_SATO_S84-ex%20%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

CRICUT1648824594902-Certificate_Cricut_CHP220B3_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648824594902-Certificate_Cricut_CHP220B3_SIGET_El%20Salvador_2022.PDF

CRICUT1648824261024-Certificate_Cricut_CHP080B1_V&C UVA_Mexico_2022 (China).pdf
https://orbiscompliance.s3.amazonaws.com/1648824261024-Certificate_Cricut_CHP080B1_V%26C%20UVA_Mexico_2022%20%28China%29.pdf

CASA SYSTEM1648821078924-IFT Certificate_casa systems_LTE-1006-07_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648821078924-IFT%20Certificate_casa%20systems_LTE-1006-07_IFT_Mexico_2022.pdf

LENOVO1648818972666-Certificate_Lenovo_IdeaPad 3 15ABA7_Chile_SUBTEL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648818972666-Certificate_Lenovo_IdeaPad%203%2015ABA7_Chile_SUBTEL_2022.pdf

BTL1648759619773-CERTIFICATE_Poly_P032_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648759619773-CERTIFICATE_Poly_P032_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

IROBOT1648743798336-CERTIFICATE_iRobot_ADH-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648743798336-CERTIFICATE_iRobot_ADH-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

CRICUT1648731408016-Certificate_Cricut_CHP180B3_SIGET_El Salvador _2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648731408016-Certificate_Cricut_CHP180B3_SIGET_El%20Salvador%20_2022.PDF

PANDUIT1648671653065-Certificate_NOM-050-SCFI-2004-21147CC000131_PANDUIT_NKSPB_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648671653065-Certificate_NOM-050-SCFI-2004-21147CC000131_PANDUIT_NKSPB_UVA_Mexico_2022.pdf

PANDUIT1648670121725-Certificate_NOM-050-SCFI-2004-21147CC000130_PANDUIT_NK1FBL_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648670121725-Certificate_NOM-050-SCFI-2004-21147CC000130_PANDUIT_NK1FBL_UVA_Mexico_2022.pdf

BTL1648566327640-IFT Certificate_RAZER_RZ01-0439_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648566327640-IFT%20Certificate_RAZER_RZ01-0439_IFT_Mexico_2022.pdf

HP1648565615401-IFT Certificate_HyperX_CP001WA_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648565615401-IFT%20Certificate_HyperX_CP001WA_IFT_Mexico_2022.pdf

HP1648565592294-IFT Certificate_HyperX_CP001_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648565592294-IFT%20Certificate_HyperX_CP001_IFT_Mexico_2022.pdf

HP1648561973202-NOM-208 DICTUM_HyperX_CS007 & CS008_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648561973202-NOM-208%20DICTUM_HyperX_CS007%20%26%20CS008_NYCE_Mexico_2022.pdf

SATO1648561256686-Certificate RCPSAS822-0765_SATO_S84-ex (Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648561256686-Certificate%20RCPSAS822-0765_SATO_S84-ex%20%28Azerty%29_IFT_Mexico_2022.pdf

IROBOT1648560764088-IFT Certificate_iRobot_RVF-Y1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648560764088-IFT%20Certificate_iRobot_RVF-Y1_IFT_Mexico_2022.pdf

SATO1648559155336-Certificate RCPSACT22-0922_SATO_CT4-LX(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648559155336-Certificate%20RCPSACT22-0922_SATO_CT4-LX%28Azerty%29_IFT_Mexico_2022.pdf

HP1648496805448-IFT Certificate_HyperX_CL002WA1_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648496805448-IFT%20Certificate_HyperX_CL002WA1_IFT_Mexico_2022.pdf

HP1648495979258-IFT Certificate_HyperX_CL004_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648495979258-IFT%20Certificate_HyperX_CL004_IFT_Mexico_2022.pdf

HP1648495544331-IFT Certificate_HyperX_HXS-HSCFX-WA1_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648495544331-IFT%20Certificate_HyperX_HXS-HSCFX-WA1_IFT_Mexico_2021.pdf

HP1648495530884-IFT Certificate_HyperX_CF002WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648495530884-IFT%20Certificate_HyperX_CF002WA_IFT_Mexico_2021.pdf

HP1648494346823-IFT Certificate_HyperX_ CF001WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648494346823-IFT%20Certificate_HyperX_%20CF001WA_IFT_Mexico_2021.pdf

BOSCH1648478094613-Certificate_ BOSCH - GLM 50-27 C_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648478094613-Certificate_%20BOSCH%20-%20GLM%2050-27%20C_URSEC_Uruguay_2022.pdf

HP1648475915731-CERTIFICATE_HyperX_CP002_NOM-001-SCFI-2018_MEXICO__________NYC-2202C0E04527.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648475915731-CERTIFICATE_HyperX_CP002_NOM-001-SCFI-2018_MEXICO__________NYC-2202C0E04527.pdf

IROBOT1648475809262-Certificate_iRobot_RVF-Y1 and ADH-N1_V&C UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648475809262-Certificate_iRobot_RVF-Y1%20and%20ADH-N1_V%26C%20UVA_Mexico_2022.pdf

CRICUT1648474510077-Certificate_cricut_CHP220B3_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648474510077-Certificate_cricut_CHP220B3_CRC_Colombia_2022.pdf

BOSCH1648474439488-Certificate_BOSCH_D-tect 200 C_IFT_Mexico_2021 (Corrected).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648474439488-Certificate_BOSCH_D-tect%20200%20C_IFT_Mexico_2021%20%28Corrected%29.pdf

CRICUT1648473763589-Certificate_cricut_CHP180B3_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648473763589-Certificate_cricut_CHP180B3_CRC_Colombia_2022.pdf

PANDUIT1648216579836-CERTIFICATE_PANDUIT_POEXRX1 ((POEXKIT1-NP)(POEXKIT1)) POEXTX1 _NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648216579836-CERTIFICATE_PANDUIT_POEXRX1%20%28%28POEXKIT1-NP%29%28POEXKIT1%29%29%20POEXTX1%20_NOM-019_NYCE_MEXICO_2022.pdf

PANDUIT1648216523540-CERTIFICATE_PANDUIT_POEXRX4 (POEXKIT4-NP)(POEXKIT4)_NOM-019_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648216523540-CERTIFICATE_PANDUIT_POEXRX4%20%28POEXKIT4-NP%29%28POEXKIT4%29_NOM-019_NYCE_MEXICO_2022.pdf

PANDUIT1648216126930-CERTIFICATE_PANDUIT_POEXRX4 (POEXKIT4-NP)(POEXKIT4)_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648216126930-CERTIFICATE_PANDUIT_POEXRX4%20%28POEXKIT4-NP%29%28POEXKIT4%29_NOM-019_ANCE_MEXICO_2022.pdf

HP1648148470052-Certificate_HyperX_CP001_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1648148470052-Certificate_HyperX_CP001_SUBTEL_Chile_2022.pdf

ORACLE1648047353814-CERTIFICATE_ORACLE_MICROS Express Express Station 4_NOM-019-SCFI-1998_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1648047353814-CERTIFICATE_ORACLE_MICROS%20Express%20Express%20Station%204_NOM-019-SCFI-1998_ANCE_MEXICO_2022.pdf

iROBOT1648042037009-CERTIFICATE_iRobot_RVF-Y1_NOM-003-SCFI-2014_NYCE_MEXICO________NYC-2202C0E04351.pdf
https://orbiscompliance.s3.amazonaws.com/1648042037009-CERTIFICATE_iRobot_RVF-Y1_NOM-003-SCFI-2014_NYCE_MEXICO________NYC-2202C0E04351.pdf

SONY1647631104747-CERTIFICATE_SONY DE MÉXICO_CXD90064_IFT_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647631104747-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_CXD90064_IFT_2022.pdf

MICROSOFT1647627133900-Certificate_Microsoft_1951_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647627133900-Certificate_Microsoft_1951_ASEP_Panama_2022.pdf

HP1647627082150-Certificate_HyperX_CP001_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647627082150-Certificate_HyperX_CP001_SUBTEL_Chile_2022.pdf

CRADLEPOINT1647622366378-Certificate_cradlepoint_170700-000_nNYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647622366378-Certificate_cradlepoint_170700-000_nNYCE_Mexico_2022.pdf

MICROSOFT1647613865416-Certificate_Microsoft_1959_URCA_Bahamas_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647613865416-Certificate_Microsoft_1959_URCA_Bahamas_2022.pdf

MICROSOFT1647610443718-Certificate_Microsoft_1951_URCA_Bahamas_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1647610443718-Certificate_Microsoft_1951_URCA_Bahamas_2022.pdf

PANDUIT1647548413824-CERTIFICATE_PANDUIT_1156_NOM-208_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647548413824-CERTIFICATE_PANDUIT_1156_NOM-208_ANCE_MEXICO_2022.pdf

LAIRD1647547770898-CoC_LAIRD_SCC-1_OFTA_HONGKONG_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647547770898-CoC_LAIRD_SCC-1_OFTA_HONGKONG_2022.pdf

iRobot Corporation1647539335644-Electrical Safeti Certificate_iRobot_RMA-Y1_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647539335644-Electrical%20Safeti%20Certificate_iRobot_RMA-Y1_Brazil_2022.pdf

MICROSOFT1647531249133-Certificate_Microsoft_1951_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647531249133-Certificate_Microsoft_1951_ARCOTEL_Ecuador_2022.pdf

MICROSOFT1647451652746-Certificate_Microsoft_1959_SMA_Jamaica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647451652746-Certificate_Microsoft_1959_SMA_Jamaica_2022.pdf

MICROSOFT1647451602626-Certificate_Microsoft_1959_INDOTEL_Dominican Republic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647451602626-Certificate_Microsoft_1959_INDOTEL_Dominican%20Republic_2022.pdf

MICROSOFT1647445900313-Certificate_Microsoft_1951_SMA_Jamaica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647445900313-Certificate_Microsoft_1951_SMA_Jamaica_2022.pdf

MICROSOFT1647439385768-Certificate_Microsoft_1951_INDOTEL_DominicanRepublic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647439385768-Certificate_Microsoft_1951_INDOTEL_DominicanRepublic_2022.pdf

MICROSOFT1647435914215-Certificate_Microsoft_1959_ASEP_Panama_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1647435914215-Certificate_Microsoft_1959_ASEP_Panama_2022.pdf

ROKU1647370104409-Certificate_Roku_3820X_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647370104409-Certificate_Roku_3820X_ENACOM_Argentina_2022.pdf

CRADLEPOINT1647351814629-Certificate_cradlepoint_170700-000_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647351814629-Certificate_cradlepoint_170700-000_NYCE_Mexico_2022.pdf

CRADLE1647350237396-Certificate_Cradlepoint_170700-000_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1647350237396-Certificate_Cradlepoint_170700-000_INSPEC-UVA_Mexico_2022.pdf

RAZER1647287886098-IFT Certificate_RAZER_RC30-0346_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647287886098-IFT%20Certificate_RAZER_RC30-0346_IFT_Mexico_2022.pdf

RAZER1647287797139-IFT Certificate_RAZER_RZ04-0346_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647287797139-IFT%20Certificate_RAZER_RZ04-0346_IFT_Mexico_2022.pdf

ORACLE1647282235555-CERTIFICATE_ORACLE_ 7600634_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647282235555-CERTIFICATE_ORACLE_%207600634_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1647282026196-CERTIFICATE_ORACLE_ 7601087_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647282026196-CERTIFICATE_ORACLE_%207601087_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

INDUSTRIAL SCIENTIFIC1647281024877-Certificate_Industrial Scientific_iAssign Beacon_Argentina_ENACOM_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647281024877-Certificate_Industrial%20Scientific_iAssign%20Beacon_Argentina_ENACOM_2022.pdf

HP1647271437966-Certificate_HyperX_PF002WA_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647271437966-Certificate_HyperX_PF002WA_IFT_Mexico_2022.pdf

NOVATEL1647271363659-Certificate_NOVATEL_RS9113-N00-S0C_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647271363659-Certificate_NOVATEL_RS9113-N00-S0C_ENACOM_Argentina_2022.pdf

BTL1647270304256-Certificate_RAZER_RC30-0378_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647270304256-Certificate_RAZER_RC30-0378_IFT_Mexico_2022.pdf

BTL1647270283336-Certificate_RAZER_RZ04-0443_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647270283336-Certificate_RAZER_RZ04-0443_IFT_Mexico_2022.pdf

MICROSOFT1647261112156-Certificate_Microsoft_1959_ARCOTEL_Ecuador_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1647261112156-Certificate_Microsoft_1959_ARCOTEL_Ecuador_2022.pdf

ROKU1647028647599-Certificate -TP 10738-4-5_S2GO_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647028647599-Certificate%20-TP%2010738-4-5_S2GO_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

HP1647025273035-Certificate_HyperX_CA002WA_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1647025273035-Certificate_HyperX_CA002WA_ENACOM_Argentina_2022.pdf

cradlepoint1647001128232-DICTAMEN_cradlepoint_170700-000_NOM-001-SCFI-2018&NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1647001128232-DICTAMEN_cradlepoint_170700-000_NOM-001-SCFI-2018%26NOM-016-SCFI-1993_NYCE_MEXICO_2022.pdf

ADVANCETECH1646920657225-Certificate_Advancetech_UNO-2271G_NOM-208_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646920657225-Certificate_Advancetech_UNO-2271G_NOM-208_NYCE_Mexico_2022.pdf

PANDUIT1646831243709-CERTIFICATE_PANDUIT_ICAM12DRJS_TELECOM DICTUM_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646831243709-CERTIFICATE_PANDUIT_ICAM12DRJS_TELECOM%20DICTUM_ANCE_MEXICO_2022.pdf

cradlepoint1646769332503-Certificate_cradlepoint_S5A749A_NOM-019_NYCE_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646769332503-Certificate_cradlepoint_S5A749A_NOM-019_NYCE_Mexico.pdf

ORACLE1646761621225-FORM C_ORACLE_MICROS Express Station 4_ Electrical Safety_LEALTAD COMERCIAL_ARGENTINA_2022____CE-2022-21682754-APN-DNRT.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646761621225-FORM%20C_ORACLE_MICROS%20Express%20Station%204_%20Electrical%20Safety_LEALTAD%20COMERCIAL_ARGENTINA_2022____CE-2022-21682754-APN-DNRT.pdf

DURACELL1646759633856-22049UCCNOM-024-SCFI-2013000166 _Certificate_Duracell_OPTIMUM_AAA_Belgium_V&C_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646759633856-22049UCCNOM-024-SCFI-2013000166%20_Certificate_Duracell_OPTIMUM_AAA_Belgium_V%26C_Mexico_2022.pdf

SATO1646752324966-Certificate RCPSAWS22-0435-A3_Ampliacion de Definitivo_SATO_WS412TT-STD(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646752324966-Certificate%20RCPSAWS22-0435-A3_Ampliacion%20de%20Definitivo_SATO_WS412TT-STD%28Azerty%29_IFT_Mexico_2022.pdf

SATO1646752185025-Certificate RCPSAWS22-0435-A2_Ampliacion de Definitivo_SATO_WS412DT-STD(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646752185025-Certificate%20RCPSAWS22-0435-A2_Ampliacion%20de%20Definitivo_SATO_WS412DT-STD%28Azerty%29_IFT_Mexico_2022.pdf

SATO1646752077890-Certificate RCPSAWS22-0435-A1_Ampliacion de Definitivo_SATO_WS408TT-STD(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646752077890-Certificate%20RCPSAWS22-0435-A1_Ampliacion%20de%20Definitivo_SATO_WS408TT-STD%28Azerty%29_IFT_Mexico_2022.pdf

SATO1646751865859-Certificate RCPSAWS22-0435_Definitivo_ SATO_WS408DT-STD(Azerty)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646751865859-Certificate%20RCPSAWS22-0435_Definitivo_%20SATO_WS408DT-STD%28Azerty%29_IFT_Mexico_2022.pdf

SATO1646749082116-Certificate RCPSAWS22-0573-A3_Ampliacion de Definitivo_SATO_WS412TT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646749082116-Certificate%20RCPSAWS22-0573-A3_Ampliacion%20de%20Definitivo_SATO_WS412TT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

SATO1646748990312-Certificate RCPSAWS22-0573-A2_Ampliacion de Definitivo_SATO_WS408TT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646748990312-Certificate%20RCPSAWS22-0573-A2_Ampliacion%20de%20Definitivo_SATO_WS408TT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

SATO1646748871370-Certificate RCPSAWS22-0573-A1_Ampliacion de Definitivo_SATO_WS408DT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646748871370-Certificate%20RCPSAWS22-0573-A1_Ampliacion%20de%20Definitivo_SATO_WS408DT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

SATO1646748569595-Certificate RCPSAWS22-0573_Definitivo_SATO_WS412DT-STD(Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646748569595-Certificate%20RCPSAWS22-0573_Definitivo_SATO_WS412DT-STD%28Bluestarlam%29_IFT_Mexico_2022.pdf

DURACELL1646745664802-22049UCCNOM-024-SCFI-2013000166 _Certificate_Duracell_OPTIMUM_AAA_Belgium_V&C_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646745664802-22049UCCNOM-024-SCFI-2013000166%20_Certificate_Duracell_OPTIMUM_AAA_Belgium_V%26C_Mexico_2022.pdf

HP1646744195709-Dictum_HyperX_CP001WA&CEB003WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646744195709-Dictum_HyperX_CP001WA%26CEB003WA_NYCE_Mexico_2022.pdf

DURACELL1646686261986-Surveillance_Resolution_ Certificate_Duracell_NYCE6785_NYCE_6786_NYCE6787_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646686261986-Surveillance_Resolution_%20Certificate_Duracell_NYCE6785_NYCE_6786_NYCE6787_NYCE_Mexico_2022.pdf

HP1646683497828-CERTIFICATE_HyperX_CP001WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022____NYC-2202C0E03572.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646683497828-CERTIFICATE_HyperX_CP001WA_NOM-001-SCFI-2018_NYCE_MEXICO_2022____NYC-2202C0E03572.pdf

HP1646683485020-CERTIFICATE_HyperX_CP001_NOM-001-SCFI-2018_NYCE_MEXICO_2022____NYC-2202C0E03568.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646683485020-CERTIFICATE_HyperX_CP001_NOM-001-SCFI-2018_NYCE_MEXICO_2022____NYC-2202C0E03568.pdf

ORACLE1646674359723-CERTIFICATE_ORACLE_MICROS Express Station 4_ Electrical Safety_INTERTEK_ARGENTINA_2022____C-CSE-IACSA-O6-001.2.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646674359723-CERTIFICATE_ORACLE_MICROS%20Express%20Station%204_%20Electrical%20Safety_INTERTEK_ARGENTINA_2022____C-CSE-IACSA-O6-001.2.pdf

SATO1646671135554-Certificate RCPSAS821-4059_SATO_S86-ex (SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646671135554-Certificate%20RCPSAS821-4059_SATO_S86-ex%20%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

SATO1646671020291-Certificate RCPSAS821-4059_SATO_S86-ex (Bluestarlam)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646671020291-Certificate%20RCPSAS821-4059_SATO_S86-ex%20%28Bluestarlam%29_IFT_Mexico_2022.pdf

NEDAP1646668781842-CERTIFICATE_ORBIS_ALTA GENETICS EXTENSION_VP8002-4102;VP8002;VP4102_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2202C0E03051.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646668781842-CERTIFICATE_ORBIS_ALTA%20GENETICS%20EXTENSION_VP8002-4102%3BVP8002%3BVP4102_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2202C0E03051.pdf

PANDUIT1646656843429-CERTIFICATE_PANDUIT_PVQ-PM PVQ-PM-U_SAFETY DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646656843429-CERTIFICATE_PANDUIT_PVQ-PM%20PVQ-PM-U_SAFETY%20DICTUM_NYCE_MEXICO_2022.pdf

PANDUIT1646656839217-CERTIFICATE_PANDUIT_PVQ-PM PVQ-PM-U_SAFETY DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646656839217-CERTIFICATE_PANDUIT_PVQ-PM%20PVQ-PM-U_SAFETY%20DICTUM_NYCE_MEXICO_2022.pdf

MICROSOFT1646421121365-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646421121365-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf

MICROSOFT1646420991875-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646420991875-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf

MICROSOFT1646420672518-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646420672518-Certificate_Microsoft_1959_URSEC_Uruguay_2022.pdf

MICROSOFT1646420650974-Certificate_Microsoft_1951_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646420650974-Certificate_Microsoft_1951_URSEC_Uruguay_2022.pdf

PANDUIT1646409765550-CERTIFICATE_PANDUIT_ICAM12DRJS_SAFETY DICTUM_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646409765550-CERTIFICATE_PANDUIT_ICAM12DRJS_SAFETY%20DICTUM_ANCE_MEXICO_2022.pdf

ORACLE1646405093376-CERTIFICATE_ORACLE_SNMA-1_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646405093376-CERTIFICATE_ORACLE_SNMA-1_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

MICROSOFT1646404483243-Certificate_Microsoft_1959_TATT_Trinidad&Tobago_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646404483243-Certificate_Microsoft_1959_TATT_Trinidad%26Tobago_2022.pdf

MICROSOF1646404451373-Certificate_Microsoft_1959_TATT_Trinidad&Tobago_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646404451373-Certificate_Microsoft_1959_TATT_Trinidad%26Tobago_2022.pdf

MICROSOFT1646404112648-Certificate_Microsoft_1951_TATT_Trinidad&Tobago_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646404112648-Certificate_Microsoft_1951_TATT_Trinidad%26Tobago_2022.pdf

ORACLE1646403908202-CERTIFICATE_ORACLE_T82_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646403908202-CERTIFICATE_ORACLE_T82_ANCE_MEXICO_2022.pdf

ORACLE1646403841931-CERTIFICATE_ORACLE_PU1SL_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646403841931-CERTIFICATE_ORACLE_PU1SL_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1646403833925-CERTIFICATE_ORACLE_PU1SL_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646403833925-CERTIFICATE_ORACLE_PU1SL_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1646403580819-CERTIFICATE_ORACLE_PU2SL_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646403580819-CERTIFICATE_ORACLE_PU2SL_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

MICROSOFT1646338378173-Certificate_Microsoft_1959_INDOTEL_DominicanRepublic_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646338378173-Certificate_Microsoft_1959_INDOTEL_DominicanRepublic_2022.pdf

HP1646335934950-CoH_HP_CL002WA1_ANATEL_Brazil_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646335934950-CoH_HP_CL002WA1_ANATEL_Brazil_2022.pdf.pdf

HP1646335919229-CoC_HP_CL002WA1_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646335919229-CoC_HP_CL002WA1_ANATEL_Brazil_2022.pdf

HP1646334826140-CoH_HP_CA002WA_ANATEL_Brazil_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646334826140-CoH_HP_CA002WA_ANATEL_Brazil_2022.pdf.pdf

HP1646334815971-CoH_HP_CA002_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646334815971-CoH_HP_CA002_ANATEL_Brazil_2022.pdf

HP1646334801809-CoC_HP_CA002WA_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646334801809-CoC_HP_CA002WA_ANATEL_Brazil_2022.pdf

HP1646334788715-CoC_HP_CA002_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646334788715-CoC_HP_CA002_ANATEL_Brazil_2022.pdf

KCTL1646334281965-CoH_KCTL_CWAP210M_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646334281965-CoH_KCTL_CWAP210M_ANATEL_Brazil_2021.pdf

PANDUIT1646333844499-CERTIFICATE_PANDUIT_POEXTX1 POEXRX1 (POEXKIT1-NP POEXKIT1)_TELECOM DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646333844499-CERTIFICATE_PANDUIT_POEXTX1%20POEXRX1%20%28POEXKIT1-NP%20POEXKIT1%29_TELECOM%20DICTUM_NYCE_MEXICO_2022.pdf

PANDUIT1646333736553-CERTIFICATE_PANDUIT_POEXTX1 POEXRX1 (POEXKIT1-NP POEXKIT1)_SAFETY DICTUM_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646333736553-CERTIFICATE_PANDUIT_POEXTX1%20POEXRX1%20%28POEXKIT1-NP%20POEXKIT1%29_SAFETY%20DICTUM_ANCE_MEXICO_2022.pdf

PANDUIT1646333588433-CERTIFICATE_PANDUIT_POEXRX4 (POEXKIT4-NP POEXKIT4)_SAFETY DICTUM_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646333588433-CERTIFICATE_PANDUIT_POEXRX4%20%28POEXKIT4-NP%20POEXKIT4%29_SAFETY%20DICTUM_ANCE_MEXICO_2022.pdf

PANDUIT1646332918190-CERTIFICATE_PANDUIT_PVQ-PM PVQ-PM-U_TELECOM DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646332918190-CERTIFICATE_PANDUIT_PVQ-PM%20PVQ-PM-U_TELECOM%20DICTUM_NYCE_MEXICO_2022.pdf

ARISTA1646327865802-CoH_ARISTA_AN1713_ANATEL_Brazil_2021_1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327865802-CoH_ARISTA_AN1713_ANATEL_Brazil_2021_1.pdf

ARISTA1646327848989-CoC_ARISTA_AN1713_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327848989-CoC_ARISTA_AN1713_ANATEL_Brazil_2021.pdf

ARISTA1646327623977-CoH_ARISTA_AN1762_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327623977-CoH_ARISTA_AN1762_ANATEL_Brazil_2022.pdf

ARISTA1646327606269-CoC_ARISTA_AN1762_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327606269-CoC_ARISTA_AN1762_ANATEL_Brazil_2022.pdf

ARISTA1646327404760-CoH_ARISTA_AN1714_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327404760-CoH_ARISTA_AN1714_ANATEL_Brazil_2021.pdf

ARISTA1646327388888-CoC_ARISTA_AN1714_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646327388888-CoC_ARISTA_AN1714_ANATEL_Brazil_2021.pdf

ARISTA1646326786508-CoH_ARISTA_AN1712_ANATEL_Brazil_2021_1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646326786508-CoH_ARISTA_AN1712_ANATEL_Brazil_2021_1.pdf

ARISTA1646326773060-CoC_ARISTA_AN1712_ANATEL_Brazil_2021_1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646326773060-CoC_ARISTA_AN1712_ANATEL_Brazil_2021_1.pdf

ARISTA1646324353637-CoH_ARISTA_AN1730_ANATEL_Brazil_2021.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646324353637-CoH_ARISTA_AN1730_ANATEL_Brazil_2021.pdf.pdf

ARISTA1646324246923-CoC_ARISTA_AN1730_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646324246923-CoC_ARISTA_AN1730_ANATEL_Brazil_2021.pdf

MICROSOFT1646320112909-Certificate_Microsoft-1959_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646320112909-Certificate_Microsoft-1959_MTC_Peru_2022.pdf

MICROSOFT1646320096614-Certificate_Microsoft-1951_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646320096614-Certificate_Microsoft-1951_MTC_Peru_2022.pdf

BTL1646312984638-NOM-208 Certificate_RAZER_RZ04-0398_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646312984638-NOM-208%20Certificate_RAZER_RZ04-0398_NYCE_Mexico_2022.pdf

HP1646311300863-DICTAMEN_HyperX_AE002 HX-KB5ME2 AG001 AG002 AG003 AG004 MK001_NOM-032-ENER-2013_NYCE_MEXICO_2022_____NYC EEDT0032-22.pdf
https://orbiscompliance.s3.amazonaws.com/1646311300863-DICTAMEN_HyperX_AE002%20HX-KB5ME2%20AG001%20AG002%20AG003%20AG004%20MK001_NOM-032-ENER-2013_NYCE_MEXICO_2022_____NYC%20EEDT0032-22.pdf

HP1646249040356-Certificate_HyperX_CEB003L, CEB003R, CEB003WA, CEB003C1_INSPEC-UVA_Mexico_2022-CHINA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646249040356-Certificate_HyperX_CEB003L%2C%20CEB003R%2C%20CEB003WA%2C%20CEB003C1_INSPEC-UVA_Mexico_2022-CHINA.pdf

HP1646243849639-DICTAMEN_HyperX_CEB003WA_NOM-016-SCFI-1993&NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC CEDT0317-22.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646243849639-DICTAMEN_HyperX_CEB003WA_NOM-016-SCFI-1993%26NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC%20CEDT0317-22.pdf

HP1646243792505-DICTAMEN_HyperX_CEB003WA_NOM-016-SCFI-1993&NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC CEDT0247-22.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646243792505-DICTAMEN_HyperX_CEB003WA_NOM-016-SCFI-1993%26NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC%20CEDT0247-22.pdf

IROBOT1646242020215-Certificate_iRobot_RVF-Y1_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646242020215-Certificate_iRobot_RVF-Y1_NYCE_Mexico_2022.pdf

SATO1646240773833-Certificate NYC-2202CT0420_SATO_PW4NX(SATO Mexico)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646240773833-Certificate%20NYC-2202CT0420_SATO_PW4NX%28SATO%20Mexico%29_NYCE_Mexico_2022.pdf

SATO1646239481225-Certificate NYC-2202CT0421_SATO_PW4NX(Azerty)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646239481225-Certificate%20NYC-2202CT0421_SATO_PW4NX%28Azerty%29_NYCE_Mexico_2022.pdf

ORACLE1646233295847-Certificate_DT Research_DT317CR_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1646233295847-Certificate_DT%20Research_DT317CR_IFT_Mexico_2022.pdf

TRIMBLE1646227123034-CERTIFICATE_TRIMBLE_TD-510_IFT_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1646227123034-CERTIFICATE_TRIMBLE_TD-510_IFT_MEXICO_2022.pdf

SATO1645815072142-Certificate NYC-2202CT0510_NOM-208_SATO_S84-ex(Azerty)__NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645815072142-Certificate%20NYC-2202CT0510_NOM-208_SATO_S84-ex%28Azerty%29__NYCE_Mexico_2022.pdf

IROBOT1645809922681-Certificate_iRobot_RMA-Y1_V&C-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645809922681-Certificate_iRobot_RMA-Y1_V%26C-UVA_Mexico_2022.pdf

BTL1645802805233-NOM-208 Certificate_Poly_CCX 505_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645802805233-NOM-208%20Certificate_Poly_CCX%20505_NYCE_Mexico_2022.pdf

HP1645802249631-DICTAMEN_HyperX_CP001WA_NOM-016-SCFI-1993&NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC CEDT0247-22.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645802249631-DICTAMEN_HyperX_CP001WA_NOM-016-SCFI-1993%26NOM-019-SCFI-1998_NYCE_MEXICO_2022_____NYC%20CEDT0247-22.pdf

HP1645800721433-Certificate_HyperX_CEB003WA_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645800721433-Certificate_HyperX_CEB003WA_MTC_Peru_2022.pdf

HP1645800566845-Certificate_HyperX_CEB003R_MTC_Peru_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645800566845-Certificate_HyperX_CEB003R_MTC_Peru_2022.pdf

HP1645800504514-Certificate_HyperX_CEB003L_MTC_Peru_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645800504514-Certificate_HyperX_CEB003L_MTC_Peru_2022.pdf

NEDAP1645644743737-CoC_NEDAP_VP4011_ANATEL_BRAZIL_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645644743737-CoC_NEDAP_VP4011_ANATEL_BRAZIL_2022.pdf

LAIRD1645632359418-Certificate_Mercury Marine_SCC-1_NTRC_Saint Lucia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645632359418-Certificate_Mercury%20Marine_SCC-1_NTRC_Saint%20Lucia_2022.pdf

CRICUT1645626976577-Certificate_Cricut_VLC27301_V&C UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645626976577-Certificate_Cricut_VLC27301_V%26C%20UVA_Mexico_2022.pdf

HP1645625238498-DICTAMEN_HyperX_PF001 HX-MC002B HX-MC004B HX-MC005B_NOM-032-ENER-2013_NYCE_MEXICO_2022_____NYC EEDT0030-22.pdf
https://orbiscompliance.s3.amazonaws.com/1645625238498-DICTAMEN_HyperX_PF001%20HX-MC002B%20HX-MC004B%20HX-MC005B_NOM-032-ENER-2013_NYCE_MEXICO_2022_____NYC%20EEDT0030-22.pdf

iRobot Corporation1645561046895-Safety Certificate_iRobot_Roomba 614:675:694_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645561046895-Safety%20Certificate_iRobot_Roomba%20614%3A675%3A694_Brazil_2021.pdf

HP1645544694144-NOM-208_Dictum_HyperX_Wired Headset_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645544694144-NOM-208_Dictum_HyperX_Wired%20Headset_NYCE_Mexico_2022.pdf

ORACLE1645533989366-CERTIFICATE_ORACLE_T84_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645533989366-CERTIFICATE_ORACLE_T84_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

ORACLE1645533939152-CERTIFICATE_ORACLE_SNMA-2_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645533939152-CERTIFICATE_ORACLE_SNMA-2_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

PANDUIT1645533750776-CERTIFICATE_ORACLE_SNMA-2_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645533750776-CERTIFICATE_ORACLE_SNMA-2_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

iRobot1645476320865-CERTIFICATE_iRobot_RVE-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645476320865-CERTIFICATE_iRobot_RVE-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

PANDUIT1645474145445-CERTIFICATE_PANDUIT_POEXRX4 (POEXKIT4-NP POEXKIT4)_TELECOM DICTUM_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645474145445-CERTIFICATE_PANDUIT_POEXRX4%20%28POEXKIT4-NP%20POEXKIT4%29_TELECOM%20DICTUM_NYCE_MEXICO_2022.pdf

SATO1645463121062-Certificate RCPSAPW22-0219_SATO_PW208NX(SATO Mexico)_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645463121062-Certificate%20RCPSAPW22-0219_SATO_PW208NX%28SATO%20Mexico%29_IFT_Mexico_2022.pdf

HP1645448340374-NOM-208 Certificate_HyperX_CP001WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645448340374-NOM-208%20Certificate_HyperX_CP001WA_NYCE_Mexico_2022.pdf

HP1645448313087-NOM-208 Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645448313087-NOM-208%20Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf

HP1645448309147-NOM-208 Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645448309147-NOM-208%20Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf

HP1645213932080-NOM-208 Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645213932080-NOM-208%20Certificate_HyperX_CP001_NYCE_Mexico_2022.pdf

HP1645213914448-NOM-208 Certificate_HyperX_CP001WA_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645213914448-NOM-208%20Certificate_HyperX_CP001WA_NYCE_Mexico_2022.pdf

OMNICHANNEL1645207214682-Certificate - TP 10738-4_OMNICHANNEL_Duracell_AA&AAA_IQC_Argentina_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645207214682-Certificate%20-%20TP%2010738-4_OMNICHANNEL_Duracell_AA%26AAA_IQC_Argentina_2022.pdf

MICROSOFT1645197464914-Certificate_Microsoft_1959_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645197464914-Certificate_Microsoft_1959_SUTEL_Costa%20Rica_2022.pdf

HP1645197341237-Certificate_HyperX_CP001WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645197341237-Certificate_HyperX_CP001WA_SUBTEL_Chile_2022.pdf

BTL1645195660494-Certificate_Razer_RZ01-0439 y DGRG7_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645195660494-Certificate_Razer_RZ01-0439%20y%20DGRG7_INSPEC-UVA_Mexico_2022.pdf

BTL1645194338440-Certificate_Razer_RZ04-0443 and RC30-0378_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645194338440-Certificate_Razer_RZ04-0443%20and%20RC30-0378_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1645129825739-CERTIFICATE_PANDUIT_PVQ-EM_SAFETY DICTUM_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645129825739-CERTIFICATE_PANDUIT_PVQ-EM_SAFETY%20DICTUM_ANCE_MEXICO_2022.pdf

BTL1645118373006-NOM-208 Certificate_RAZER_RZ04-0443_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645118373006-NOM-208%20Certificate_RAZER_RZ04-0443_NYCE_Mexico_2022.pdf

ORACLE1645115102710-CERTIFICATE_ORACLE_7601651_NOM-019 HSE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645115102710-CERTIFICATE_ORACLE_7601651_NOM-019%20HSE_ANCE_MEXICO_2022.pdf

PANDUIT1645112508794-Certificate_PANDUIT_PQ-PM; PVQ-PM_U_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645112508794-Certificate_PANDUIT_PQ-PM%3B%20PVQ-PM_U_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1645112413585-Certificate_PANDUIT_PVQ-EM_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645112413585-Certificate_PANDUIT_PVQ-EM_INSPEC-UVA_Mexico_2022.pdf

Kingston1645107800067-CERTIFICATE_KINGSTON_SXS2000:2000G,SXS2000:1000G,SXS2000:500G,SXS2000:4000G(UPDATE)_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12931.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645107800067-CERTIFICATE_KINGSTON_SXS2000%3A2000G%2CSXS2000%3A1000G%2CSXS2000%3A500G%2CSXS2000%3A4000G%28UPDATE%29_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12931.pdf

PANDUIT1645106690193-Certificate_PANDUIT_POEXKIT1; POEXTX; POEXRX1_INSPEC_UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645106690193-Certificate_PANDUIT_POEXKIT1%3B%20POEXTX%3B%20POEXRX1_INSPEC_UVA_Mexico_2022.pdf

PANDUIT1645106502735-Certificate_PANDUIT_POEXKIT1-NP; POEXTX1 ; POEXRX1_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645106502735-Certificate_PANDUIT_POEXKIT1-NP%3B%20POEXTX1%20%3B%20POEXRX1_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1645106412603-Certificate_PANDUIT_POEXKIT4-NP ; POEXTX1 ; POEXRX4_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645106412603-Certificate_PANDUIT_POEXKIT4-NP%20%3B%20POEXTX1%20%3B%20POEXRX4_INSPEC-UVA_Mexico_2022.pdf

PANDUIT1645106342271-Certificate_PANDUIT_POEXKIT4 ; POEXTX1 ; POEXRX4_INSPEC-VA_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645106342271-Certificate_PANDUIT_POEXKIT4%20%3B%20POEXTX1%20%3B%20POEXRX4_INSPEC-VA_Mexico_2022.pdf

HP1645106309403-NOM-196, NOM-208 Dictum_HyperX_Ratón(Mouse Alámbrico)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645106309403-NOM-196%2C%20NOM-208%20Dictum_HyperX_Rato%CC%81n%28Mouse%20Ala%CC%81mbrico%29_NYCE_Mexico_2022.pdf

BTL1645104467482-NOM-208 Certificate_RAZER_RC30-0378_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645104467482-NOM-208%20Certificate_RAZER_RC30-0378_NYCE_Mexico_2022.pdf

SATO1645103764107-Certificate_NYC-2202CT0404_NOM-208_SATO_S84-ex(SATO Mexico)__NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645103764107-Certificate_NYC-2202CT0404_NOM-208_SATO_S84-ex%28SATO%20Mexico%29__NYCE_Mexico_2022.pdf

DURACELL1645103073415-Certificate_22049UCCNOM024-SCFI_2013000123_Duracell_OPTIMUM_CHINA_AA_V&C_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645103073415-Certificate_22049UCCNOM024-SCFI_2013000123_Duracell_OPTIMUM_CHINA_AA_V%26C_Mexico_2022.pdf

MICROSOFT1645040924254-Certificate_Microsoft_1951_SUTEL_Costa Rica_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645040924254-Certificate_Microsoft_1951_SUTEL_Costa%20Rica_2022.pdf

HP1645035891938-Certificate_HyperX_HXS-MCWA1_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645035891938-Certificate_HyperX_HXS-MCWA1_URSEC_Uruguay_2022.pdf

HP1645035814832-Certificate_HyperX_HX-MC006B_URSEC_Uruguay_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645035814832-Certificate_HyperX_HX-MC006B_URSEC_Uruguay_2022.pdf

dflausino1645029948423-NCC_22969_22.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645029948423-NCC_22969_22.pdf

dflausino1645029645170-CoH_UBLOX_LISA-U201_ANATEL_Brazil_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645029645170-CoH_UBLOX_LISA-U201_ANATEL_Brazil_2022.pdf

MICROSOFT1645022993386-Certificate_Microsoft_1959_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645022993386-Certificate_Microsoft_1959_SIGET_El%20Salvador_2022.PDF

PANDUIT1645022247168-CERTIFICATE_PANDUIT_PVQ-EM_TELECOM DICTUM_ANCE_MEXICO_2022.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1645022247168-CERTIFICATE_PANDUIT_PVQ-EM_TELECOM%20DICTUM_ANCE_MEXICO_2022.pdf.pdf

PANDUIT1645022119019-CERTIFICATE_PANDUIT_PVQ-PM, PVQ-PM-U_HSE CERTIFICATE_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1645022119019-CERTIFICATE_PANDUIT_PVQ-PM%2C%20PVQ-PM-U_HSE%20CERTIFICATE_ANCE_MEXICO_2022.pdf

HP1644948506405-NOM-196 and NOM-208_Dictum_HyperX_Keyboard_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644948506405-NOM-196%20and%20NOM-208_Dictum_HyperX_Keyboard_NYCE_Mexico_2022.pdf

CRADLEPOINT1644948173436-Dictum_Cradlepoint_S5A033A_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1644948173436-Dictum_Cradlepoint_S5A033A_NYCE_Mexico_2022.pdf

ROKU1644937006434-Certificate_Roku_WR002_TELCOR_Nicaragua_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644937006434-Certificate_Roku_WR002_TELCOR_Nicaragua_2022.pdf

TRIMBLE1644936041807-CERTIFICATE_TRIMBLE_SNR2434_IFT_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644936041807-CERTIFICATE_TRIMBLE_SNR2434_IFT_MEXICO_2022.pdf

BTL1644933121221-NOM-208 Certificate_RAZER_RZ01-0439_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644933121221-NOM-208%20Certificate_RAZER_RZ01-0439_NYCE_Mexico_2022.pdf

HP1644928458769-CERTIFICATE_HyperX_CL002WA1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644928458769-CERTIFICATE_HyperX_CL002WA1_NOM-001-SCFI-2018_NYCE_MEXICO_2022.pdf

iRobot Corporation1644858760245-Final report - Huizhou BYD - 07-01-2022 Wantty Huang.pdf
https://orbiscompliance.s3.amazonaws.com/1644858760245-Final%20report%20-%20Huizhou%20BYD%20-%2007-01-2022%20Wantty%20Huang.pdf

MICROSOFT1644843305460-Certificate_Microsoft_1951_SIGET_El Salvador_2022.PDF
https://orbiscompliance.s3.amazonaws.com/1644843305460-Certificate_Microsoft_1951_SIGET_El%20Salvador_2022.PDF

iRobot Corporation1644600231090-IBAMA Autorization_iRobot_Roomba 694_Brazil_2022.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644600231090-IBAMA%20Autorization_iRobot_Roomba%20694_Brazil_2022.html

iRobot Corporation1644600202009-IBAMA Autorization_iRobot_RVE-Y1_Brazil_2022.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644600202009-IBAMA%20Autorization_iRobot_RVE-Y1_Brazil_2022.html

NEDAP1644586572904-Certificate_Nedap_VP4011_CONATEL_Paraguay_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1644586572904-Certificate_Nedap_VP4011_CONATEL_Paraguay_2022.pdf

SATO1644409804484-CERTIFICATE_BLUESTARLAM_1BAY CHARGING CRADLE (HS CODE UPDATE)_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644409804484-CERTIFICATE_BLUESTARLAM_1BAY%20CHARGING%20CRADLE%20%28HS%20CODE%20UPDATE%29_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

SATO1644409770816-CERTIFICATE_AZERTY_1BAY CHARGING CRADLE (HS CODE UPDATE)_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644409770816-CERTIFICATE_AZERTY_1BAY%20CHARGING%20CRADLE%20%28HS%20CODE%20UPDATE%29_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

SATO1644409754992-CERTIFICATE_SATO_1BAY CHARGING CRADLE (HS CODE UPDATE)_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1644409754992-CERTIFICATE_SATO_1BAY%20CHARGING%20CRADLE%20%28HS%20CODE%20UPDATE%29_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

HP1644244615668-Certificate_HyperX_CP002_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1644244615668-Certificate_HyperX_CP002_INSPEC-UVA_Mexico_2022.pdf

ARISTA1644003539223-CoH_ARISTA_AN1768_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644003539223-CoH_ARISTA_AN1768_ANATEL_Brazil_2021.pdf

ARISTA1644003515531-CoH_ARISTA_AN1763_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644003515531-CoH_ARISTA_AN1763_ANATEL_Brazil_2021.pdf

ARISTA1644003490278-CoC_ARISTA_AN1768_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644003490278-CoC_ARISTA_AN1768_ANATEL_Brazil_2021.pdf

ARISTA1644003461183-CoC_ARISTA_AN1763_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644003461183-CoC_ARISTA_AN1763_ANATEL_Brazil_2021.pdf

ARISTA1644001013599-CoH_ARISTA_AN1708_ANATEL_Brazil_2021.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1644001013599-CoH_ARISTA_AN1708_ANATEL_Brazil_2021.pdf.pdf

ARISTA1644000994454-CoC_ARISTA_AN1708_ANATEL_Brazil_2021.pdf.pdf
https://orbiscompliance.s3.amazonaws.com/1644000994454-CoC_ARISTA_AN1708_ANATEL_Brazil_2021.pdf.pdf

BTL1643918050740-NOM-208 Certificate_RAZER_RC30-0346_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643918050740-NOM-208%20Certificate_RAZER_RC30-0346_NYCE_Mexico_2021.pdf

BTL1643917746648-NOM-208 Certificate_RAZER_RZ04-0346_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643917746648-NOM-208%20Certificate_RAZER_RZ04-0346_NYCE_Mexico_2021.pdf

BTL1643917733835-NOM-208 Certificate_RAZER_RZ04-0346_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643917733835-NOM-208%20Certificate_RAZER_RZ04-0346_NYCE_Mexico_2021.pdf

SATO1643914760682-Certificate NYC-2102CT3647-01A_NOM-208_SATO_WS412DT-STD WS412TT-STD(Bluestarlam)_NYCE_Mexico_2022- WLAN.pdf
https://orbiscompliance.s3.amazonaws.com/1643914760682-Certificate%20NYC-2102CT3647-01A_NOM-208_SATO_WS412DT-STD%20WS412TT-STD%28Bluestarlam%29_NYCE_Mexico_2022-%20WLAN.pdf

iRobot Corporation1643829161683-Safety Certificate_iRobot_Roomba s9+_ICbr_Brazil_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643829161683-Safety%20Certificate_iRobot_Roomba%20s9%2B_ICbr_Brazil_2022.pdf

iRobot Corporation1643737626638-Final report - Jabil Circuite - 28-12-2021 Wantty Huang.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643737626638-Final%20report%20-%20Jabil%20Circuite%20-%2028-12-2021%20Wantty%20Huang.pdf

PANDUIT1643727118480-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022- 10PZ.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643727118480-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022-%2010PZ.pdf.pdf

PANDUIT1643727032017-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022- 1PZ.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643727032017-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022-%201PZ.pdf

PANDUIT1643727011956-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022- 1PZ.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643727011956-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022-%201PZ.pdf

PANDUIT1643727011941-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022- 1PZ.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643727011941-Certificate_PANDUIT_ICAM12DRJS_INSPEC-UVA_Mexico_2022-%201PZ.pdf

HP1643719902889-Certificate_HyperX_CP001; CP001WA_INSPEC-UVA_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643719902889-Certificate_HyperX_CP001%3B%20CP001WA_INSPEC-UVA_Mexico_2022.pdf

NEDAP1643664575170-Certificate_Nedap_LACTIVATOR REALTIME_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643664575170-Certificate_Nedap_LACTIVATOR%20REALTIME_IFT_Mexico_2021.pdf

NEDAP1643664468384-Certificate_Nedap_NECK TAG ACT RT_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643664468384-Certificate_Nedap_NECK%20TAG%20ACT%20RT_IFT_Mexico_2021.pdf

ORACLE1643662657592-CERTIFICATE_ORACLE_AHP-1123HTT-C2-1010_NOM-019_ANCE_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643662657592-CERTIFICATE_ORACLE_AHP-1123HTT-C2-1010_NOM-019_ANCE_MEXICO_2022.pdf

SATO1643406672752-Certificate NYC-2102CT3648-01A_NOM-208_SATO_WS412DT-STD WS412TT-STD(Bluestarlam)_NYCE_Mexico_2022- BLUETOOTH.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643406672752-Certificate%20NYC-2102CT3648-01A_NOM-208_SATO_WS412DT-STD%20WS412TT-STD%28Bluestarlam%29_NYCE_Mexico_2022-%20BLUETOOTH.pdf

SATO1643406605530-Certificate NYC-2102CT3648-01A_NOM-208_SATO_WS412DT-STD WS412TT-STD(Bluestarlam)_NYCE_Mexico_2021- BLUETOOTH.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643406605530-Certificate%20NYC-2102CT3648-01A_NOM-208_SATO_WS412DT-STD%20WS412TT-STD%28Bluestarlam%29_NYCE_Mexico_2021-%20BLUETOOTH.pdf

SONY1643403214720-Certificate_SONY_CFI-1115A_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643403214720-Certificate_SONY_CFI-1115A_ATT_Bolivia_2021.pdf

SONY1643403185838-Certificate_SONY_CFI-1115B_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643403185838-Certificate_SONY_CFI-1115B_ATT_Bolivia_2021.pdf

INDSCI1643389297815-CoC-INDSCI-Ventis Pro-ANATEL-BRAZIL-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643389297815-CoC-INDSCI-Ventis%20Pro-ANATEL-BRAZIL-2021.pdf

INDSCI1643389282307-CoC-INDSCI-RADIUS_BZ1-ANATEL-BRAZIL-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643389282307-CoC-INDSCI-RADIUS_BZ1-ANATEL-BRAZIL-2021.pdf

Arista1643382224390-CoH_ARISTA_AN1746_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643382224390-CoH_ARISTA_AN1746_ANATEL_Brazil_2021.pdf

Arista1643382205637-CoC_ARISTA_AN1746_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643382205637-CoC_ARISTA_AN1746_ANATEL_Brazil_2021.pdf

KCTL1643381567084-CoC_KCTL_CWAP210M_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1643381567084-CoC_KCTL_CWAP210M_ANATEL_Brazil_2021.pdf

HP1643315951789-Certificate_HyperX_CL002WA1_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643315951789-Certificate_HyperX_CL002WA1_SUBTEL_Chile_2022.pdf

PANDUIT1643302293198-CERTIFICATE_PANDUIT_PVQ-EM_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643302293198-CERTIFICATE_PANDUIT_PVQ-EM_NOM-019_ANCE_MEXICO_2021.pdf

LAIRD1643296173559-Type Approval - Brunswick Corporation SCC-1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643296173559-Type%20Approval%20-%20Brunswick%20Corporation%20SCC-1.pdf

HP1643286082991-Certificate_HyperX_CP001WA_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643286082991-Certificate_HyperX_CP001WA_CRC_Colombia_2022.pdf

HP1643286046834-Certificate_HyperX_CP001_CRC_Colombia_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643286046834-Certificate_HyperX_CP001_CRC_Colombia_2022.pdf

HP1643207301224-Certificate_HyperX_CA002WA_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643207301224-Certificate_HyperX_CA002WA_SUBTEL_Chile_2022.pdf

HP1643207256186-Certificate_HyperX_CA002_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643207256186-Certificate_HyperX_CA002_SUBTEL_Chile_2022.pdf

iRobot1643127619030-CERTIFICATE_iRobot_RVD-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643127619030-CERTIFICATE_iRobot_RVD-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2022.pdf

BTL1643116441883-CERTIFICATE_Poly_CCX 505_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643116441883-CERTIFICATE_Poly_CCX%20505_NOM-019-SCFI-1998_NYCE_MEXICO_2022.pdf

BTL1643115275593-CERTIFICATE_RAZER_RZ04-03801&RZ-0443_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1643115275593-CERTIFICATE_RAZER_RZ04-03801%26RZ-0443_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

SATO1643051569270-Certificate NYC-2202CT0180_NOM-208_SATO_WS4 Series(Azerty)_NYCE_Mexico_2022- WLAN.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643051569270-Certificate%20NYC-2202CT0180_NOM-208_SATO_WS4%20Series%28Azerty%29_NYCE_Mexico_2022-%20WLAN.pdf

SATO1643051443151-Certificate NYC-2202CT0179_NOM-208_SATO_WS4 Series(Azerty)_NYCE_Mexico_2022- Bluetooth.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643051443151-Certificate%20NYC-2202CT0179_NOM-208_SATO_WS4%20Series%28Azerty%29_NYCE_Mexico_2022-%20Bluetooth.pdf

SATO1643051430651-Certificate NYC-2202CT0179_NOM-208_SATO_WS4 Series(Azerty)_NYCE_Mexico_2022- Bluetooth.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643051430651-Certificate%20NYC-2202CT0179_NOM-208_SATO_WS4%20Series%28Azerty%29_NYCE_Mexico_2022-%20Bluetooth.pdf

BOSH1643049946521-CERTIFICATE_BOSH_D-TECT200C_PERU_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1643049946521-CERTIFICATE_BOSH_D-TECT200C_PERU_2021.pdf

TRIMBLE1643045518055-CERTIFICATE_TRIMBLE_EC520_NOM-208_MEXICO_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1643045518055-CERTIFICATE_TRIMBLE_EC520_NOM-208_MEXICO_2022.pdf

CRADLEPOINT1642699277277-Dictum_cradlepoint_MC400-5GB_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642699277277-Dictum_cradlepoint_MC400-5GB_NYCE_Mexico_2021.pdf

CRADLEPOINT1642699186159-Dictum_cradlepoint_S5A111A_S5A052A_S5A118A_S5A135A_S5A844A_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642699186159-Dictum_cradlepoint_S5A111A_S5A052A_S5A118A_S5A135A_S5A844A_NYCE_Mexico_2021.pdf

CRADLEPOINT1642699109899-Dictum_cradlepoint_S3A904A_S5A032A_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642699109899-Dictum_cradlepoint_S3A904A_S5A032A_NYCE_Mexico_2021.pdf

CRADLEPOINT1642699027538-Dictum_cradlepoint_S0A052A_S0A052B_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642699027538-Dictum_cradlepoint_S0A052A_S0A052B_NYCE_Mexico_2021.pdf

iRobot Corporation1642691391132-Safety Certificate_iRobot_Roomba 621:677_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642691391132-Safety%20Certificate_iRobot_Roomba%20621%3A677_Brazil_2021.pdf

SATO1642683661390-Certificate RCPSAPW21-4008_SATO_PW208NX(Azerty)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1642683661390-Certificate%20RCPSAPW21-4008_SATO_PW208NX%28Azerty%29_IFT_Mexico_2021.pdf

HP1642623954061-IFT Certificate_HyperX_PF002_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642623954061-IFT%20Certificate_HyperX_PF002_IFT_Mexico_2021.pdf

HP1642622437607-IFT Certificate_HyperX_CL004WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642622437607-IFT%20Certificate_HyperX_CL004WA_IFT_Mexico_2021.pdf

HP1642621908637-IFT Certificate_HyperX_ CA002WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642621908637-IFT%20Certificate_HyperX_%20CA002WA_IFT_Mexico_2021.pdf

HP1642621882523-IFT Certificate_HyperX_CA002_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642621882523-IFT%20Certificate_HyperX_CA002_IFT_Mexico_2021.pdf

HP1642615120326-IFT Certificate_HyperX_HX-HSCFX-BK:WW_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642615120326-IFT%20Certificate_HyperX_HX-HSCFX-BK%3AWW_IFT_Mexico_2021.pdf

HP1642615070271-IFT Certificate_HyperX_CF002_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642615070271-IFT%20Certificate_HyperX_CF002_IFT_Mexico_2021.pdf

HP1642614054403-IFT Certificate_HyperX_CS002-WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642614054403-IFT%20Certificate_HyperX_CS002-WA_IFT_Mexico_2021.pdf

HP1642613973753-IFT Certificate_HyperX_CS002_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642613973753-IFT%20Certificate_HyperX_CS002_IFT_Mexico_2021.pdf

HP1642612638838-IFT Certificate_HyperX_CL002WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642612638838-IFT%20Certificate_HyperX_CL002WA_IFT_Mexico_2021.pdf

HP1642612616701-IFT Certificate_HyperX_CL002_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642612616701-IFT%20Certificate_HyperX_CL002_IFT_Mexico_2021.pdf

HP1642604630998-IFT Certificate_HyperX_ CF001_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642604630998-IFT%20Certificate_HyperX_%20CF001_IFT_Mexico_2021.pdf

HP1642602997464-IFT Certificate_HyperX_CEB002_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1642602997464-IFT%20Certificate_HyperX_CEB002_IFT_Mexico_2022.pdf

BTL1642532653090-IFT Certificate_RAZER_RC30-03801_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642532653090-IFT%20Certificate_RAZER_RC30-03801_IFT_Mexico_2022.pdf

BTL1642532621833-IFT Certificate_RAZER_RZ04-03801_IFT_Mexico_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1642532621833-IFT%20Certificate_RAZER_RZ04-03801_IFT_Mexico_2022.pdf

BOSCH1642447608169-Certificate_BOSCH_GLM 120 C_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642447608169-Certificate_BOSCH_GLM%20120%20C_SUBTEL_Chile_2022.pdf

BOSCH1642447579722-Certificate_BOSCH_GIS 1000 C_SUBTEL_Chile_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642447579722-Certificate_BOSCH_GIS%201000%20C_SUBTEL_Chile_2022.pdf

BOSCH1642432930434-Certificate_Bosch_GLM 50 C_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642432930434-Certificate_Bosch_GLM%2050%20C_SUBTEL_Chile_2021.pdf

BOSCH1642432908202-Certificate_BOSCH_GLM 50-27 CG_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642432908202-Certificate_BOSCH_GLM%2050-27%20CG_SUBTEL_Chile_2021.pdf

HP1642431208257-Certificate_HyperX_ HXS-MCWA1_ENACOM_Argentina_2022.pdf
https://orbiscompliance.s3.amazonaws.com/1642431208257-Certificate_HyperX_%20HXS-MCWA1_ENACOM_Argentina_2022.pdf

BTL1642184140823-CERTIFICATE_RAZER_RZ04-0346_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1642184140823-CERTIFICATE_RAZER_RZ04-0346_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

TOPCON1642091999548-CERTIFICATE_TOPCON_PPL65M-120_SAFETY_UL_ARGENTINA_2021_21AR00608.1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642091999548-CERTIFICATE_TOPCON_PPL65M-120_SAFETY_UL_ARGENTINA_2021_21AR00608.1.pdf

TOPCON1642091537695-CE-2021-43744451-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642091537695-CE-2021-43744451-APN-DNRT%23MDP.pdf

ORACLE1642090860003-NOR21130AE0020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090860003-NOR21130AE0020.pdf

ORACLE1642090730047-NOR21130AE0019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090730047-NOR21130AE0019.pdf

ORACLE1642090595979-NOR21130AE0018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090595979-NOR21130AE0018.pdf

ORACLE1642090477846-NOR21130AE0017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090477846-NOR21130AE0017.pdf

ORACLE1642090295797-NOR21130AE0016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090295797-NOR21130AE0016.pdf

ORACLE1642090141577-NOR21130AE0015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642090141577-NOR21130AE0015.pdf

ORACLE1642089956305-NOR21130AE0014.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642089956305-NOR21130AE0014.pdf

ORACLE1642089354888-NOR21130AE0013.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642089354888-NOR21130AE0013.pdf

ORACLE1642086194713-RA 3785646 E - Firma Electronica-Signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642086194713-RA%203785646%20E%20-%20Firma%20Electronica-Signed.pdf

ORACLE1642085415635-CE-2020-66793888-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642085415635-CE-2020-66793888-APN-DNRT%23MDP.pdf

iRobot1642084500650-CERTIFICATE_NESTEK_IROBOT_RVA-Y1 RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO_2021___NYC-2102C0E08719 (1).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642084500650-CERTIFICATE_NESTEK_IROBOT_RVA-Y1%20RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO_2021___NYC-2102C0E08719%20%281%29.pdf

iRobot1642083877544-iRobot ADD-N1-ExtensionNestek,Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642083877544-iRobot%20ADD-N1-ExtensionNestek%2CMexico%202020.pdf

CRADLEPOINT1642083115342-CERTIFICATE_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021_NOR21130C0068.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1642083115342-CERTIFICATE_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021_NOR21130C0068.pdf

CASA SYSTEM1642080969230-CERTIFICATE_HS CODE ADDITION_CASA SYSTEMS_AS5916-54XKS_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1642080969230-CERTIFICATE_HS%20CODE%20ADDITION_CASA%20SYSTEMS_AS5916-54XKS_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf

iRobot1641926491204-CERTIFICATE_iRobot_ADG-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641926491204-CERTIFICATE_iRobot_ADG-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

iRobot1641926287325-CERTIFICATE_iRobot_ADI-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1641926287325-CERTIFICATE_iRobot_ADI-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021.pdf

ORACLE1641917612458-CERTIFICATE_Form C_Oracle_M159E_Lealtad Comercial_ARGENTINA_2021_____CE-2021-123217743-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641917612458-CERTIFICATE_Form%20C_Oracle_M159E_Lealtad%20Comercial_ARGENTINA_2021_____CE-2021-123217743-APN-DNRT%23MDP.pdf

ORACLE1641917592011-CERTIFICATE_Oracle_M159E_Electrical safety_TUV_ARGENTINA_2021_____EXT-2021-7272 RA 3785646 E.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641917592011-CERTIFICATE_Oracle_M159E_Electrical%20safety_TUV_ARGENTINA_2021_____EXT-2021-7272%20RA%203785646%20E.pdf

SONY1641916867531-CERTIFICATE_Sony_CFI-ZCT1W_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641916867531-CERTIFICATE_Sony_CFI-ZCT1W_IFT_Mexico_2021.pdf

iRobot1641846135749-CERTIFICATE_iRobot_RVE-Y1 WITH ADI-N1 or ADG-N2_Electrical safety_Intertek_CHILE_2021_____E-022-24-0549.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641846135749-CERTIFICATE_iRobot_RVE-Y1%20WITH%20ADI-N1%20or%20ADG-N2_Electrical%20safety_Intertek_CHILE_2021_____E-022-24-0549.pdf

iRobot1641846067021-CERTIFICADO DE APROBACIÓN E-022-24-0549.pdf
https://orbiscompliance.s3.amazonaws.com/1641846067021-CERTIFICADO%20DE%20APROBACIO%CC%81N%20E-022-24-0549.pdf

Nedap1641835884342-Certificate_Nedap_SmartTag NECK_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641835884342-Certificate_Nedap_SmartTag%20NECK_IFT_Mexico_2021.pdf

SATO1641834534895-Certificate NYC-2202CT0042_SATO_PW4NX(Bluestarlam)_NYCE_Mexico_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641834534895-Certificate%20NYC-2202CT0042_SATO_PW4NX%28Bluestarlam%29_NYCE_Mexico_2022.pdf

ROKU1641832290647-Certificate_ROKU_3820X_CONATEl_Honduras_2022.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641832290647-Certificate_ROKU_3820X_CONATEl_Honduras_2022.pdf

TRIMBLE1641832184658-CERTIFICATE_TRIMBLE_SNR2434, SNR430, SNR434, SNR930, SNR934_NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1641832184658-CERTIFICATE_TRIMBLE_SNR2434%2C%20SNR430%2C%20SNR434%2C%20SNR930%2C%20SNR934_NOM-208_MEXICO_2021.pdf

iRobot1641303873307-IBAMA Autorization_iRobot_RVD-Y1_Brazil_2021.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1641303873307-IBAMA%20Autorization_iRobot_RVD-Y1_Brazil_2021.html

iRobot1641303317718-Sound Power Certificate_iRobot_Roomba 694_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1641303317718-Sound%20Power%20Certificate_iRobot_Roomba%20694_Brazil_2021.pdf

iRobot1641303317724-Sound Power Certificate_iRobot_RVE-Y1_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1641303317724-Sound%20Power%20Certificate_iRobot_RVE-Y1_Brazil_2021.pdf

iRobot1641303317689-Safety Certificate_iRobot_RVE-Y1_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1641303317689-Safety%20Certificate_iRobot_RVE-Y1_Brazil_2021.pdf

DURACELL1639748483986-Certificate_NYCE6785M1_NOM-212-SCFI-2017_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639748483986-Certificate_NYCE6785M1_NOM-212-SCFI-2017_NYCE_Mexico_2021.pdf

SATO1639748168667-Certificate NYC-2102CT4475_SATO_PW208NX(SATO Mexico)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639748168667-Certificate%20NYC-2102CT4475_SATO_PW208NX%28SATO%20Mexico%29_NYCE_Mexico_2021.pdf

Kingston1639747509787-Certificate_Kingston_CL004_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639747509787-Certificate_Kingston_CL004_IFT_Mexico_2021.pdf

INDSCI1639741503687-CoC-INDSCI-iAssign Beacon-ANATEL-BRAZIL-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639741503687-CoC-INDSCI-iAssign%20Beacon-ANATEL-BRAZIL-2021.pdf

INDSCI1639741482536-CoH-INDSCI-iAssign Beacon-ANATEL-BRAZIL-2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639741482536-CoH-INDSCI-iAssign%20Beacon-ANATEL-BRAZIL-2021.pdf

HP1639680767993-Dictum_HyperX_CL002WA1_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639680767993-Dictum_HyperX_CL002WA1_NYCE_Mexico_2021.pdf

DURACELL1639675694904-Certificate_NYCE6898M1_Procell_9V_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639675694904-Certificate_NYCE6898M1_Procell_9V_NYCE_Mexico_2021.pdf

TRIMBLE1639672449122-CERTIFICATE_TRIMBLE_TD510-LW, TD520-W_NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639672449122-CERTIFICATE_TRIMBLE_TD510-LW%2C%20TD520-W_NOM-208_MEXICO_2021.pdf

CASA1639663386267-Certificate_casa systems_LTE-2007-04_IFT(PROVISIONAL)_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639663386267-Certificate_casa%20systems_LTE-2007-04_IFT%28PROVISIONAL%29_Mexico_2021.pdf

IROBOT1639661322773-Certificate_21147CC000813_iRobot_RVE-Y1_ADG-N1_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639661322773-Certificate_21147CC000813_iRobot_RVE-Y1_ADG-N1_INSPEC-UVA_Mexico_2021.pdf

IROBOT1639661214786-Certificate_21147CC000814_iRobot_RVE-Y1_ADI-N1_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639661214786-Certificate_21147CC000814_iRobot_RVE-Y1_ADI-N1_INSPEC-UVA_Mexico_2021.pdf

CRADLEPOINT1639598872655-Certificate_21147CC00793_(MC400-5GB)_INSPEC_UVA_Mexico_2021(MC400-5GB).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639598872655-Certificate_21147CC00793_%28MC400-5GB%29_INSPEC_UVA_Mexico_2021%28MC400-5GB%29.pdf

BTL1639592885852-Certificate_RAZER_382_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639592885852-Certificate_RAZER_382_IFT_Mexico_2021.pdf

BTL1639588758922-Certificate_RAZER_383_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639588758922-Certificate_RAZER_383_IFT_Mexico_2021.pdf

PANDUIT1639488570141-CERTIFICATE_PANDUIT_ACD01_NOM-003_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639488570141-CERTIFICATE_PANDUIT_ACD01_NOM-003_ANCE_MEXICO_2021.pdf

DURACELL1639422420557-14721D6976-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544024_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639422420557-14721D6976-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544024_INSPEC-UVA_Mexico_2021.pdf

DURACELL1639422375527-14721D6975-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544023_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639422375527-14721D6975-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544023_INSPEC-UVA_Mexico_2021.pdf

DURACELL1639422306261-14721D6974-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544022_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639422306261-14721D6974-Dictamen_Certificate_Duracell_November_Coppertop_D_2Pz_1101544022_INSPEC-UVA_Mexico_2021.pdf

Cradlepoint1639404944033-Certificate_Cradlepoint_S5A749A_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639404944033-Certificate_Cradlepoint_S5A749A_IFT_Mexico_2021.pdf

iRobot1639161091590-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021_NYC-2102C0E09712.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639161091590-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-2018_NYCE_MEXICO_2021_NYC-2102C0E09712.pdf

SATO1639159240140-Certificate_SATO_FX3-LX_NOM-19 (Sato Productivity)_NYCE_MExico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639159240140-Certificate_SATO_FX3-LX_NOM-19%20%28Sato%20Productivity%29_NYCE_MExico_2021.pdf

SATO1639158497818-Certificate_SATO_FX3-LX_NOM-19_NYCE_MExico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639158497818-Certificate_SATO_FX3-LX_NOM-19_NYCE_MExico_2021.pdf

SATO1639157752814-Certificate_SATO_FX3-L-X_NOM-19_NYCE_MExico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639157752814-Certificate_SATO_FX3-L-X_NOM-19_NYCE_MExico_2021.pdf

SATO1639157701227-Pre - Factura1125-20.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639157701227-Pre%20-%20Factura1125-20.pdf

CRADLEPOINT1639154033161-DICTAMEN_cradlepoint_S5A052A;S5A111A;S5A118A;S5A135A;S5A844A;S3A904A;S5A032A_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC CEDT1680-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639154033161-DICTAMEN_cradlepoint_S5A052A%3BS5A111A%3BS5A118A%3BS5A135A%3BS5A844A%3BS3A904A%3BS5A032A_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC%20CEDT1680-21.pdf

CRADLEPOINT1639154001034-DICTAMEN_cradlepoint_S0A052A;S0A052B_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC CEDT1681-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639154001034-DICTAMEN_cradlepoint_S0A052A%3BS0A052B_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC%20CEDT1681-21.pdf

CRADLEPOINT1639153965823-DICTAMEN_cradlepoint_MC400-5GB_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC CEDT1651-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639153965823-DICTAMEN_cradlepoint_MC400-5GB_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC%20CEDT1651-21.pdf

SATO1639142644605-Certificate NYC-2102CT4379_CT4-LX (SATO Mexico)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639142644605-Certificate%20NYC-2102CT4379_CT4-LX%20%28SATO%20Mexico%29_NYCE_Mexico_2021.pdf

HP1639074284069-Certificate_HyperX_CL002 , CL002WA1_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639074284069-Certificate_HyperX_CL002%20%2C%20CL002WA1_INSPEC-UVA_Mexico_2021.pdf

CRADLEPOINT1639072728409-Certificate_Cradlepoint_S3A904A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1639072728409-Certificate_Cradlepoint_S3A904A_INSPEC-UVA_Mexico_2021.pdf

CRADLEPOINT1639072492844-Certificate_21147CC00786_(S5A111A)-E3000-5GB_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1639072492844-Certificate_21147CC00786_%28S5A111A%29-E3000-5GB_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638996333546-Certificate_21147CC00794_(S5A032A) W1850-5GB_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638996333546-Certificate_21147CC00794_%28S5A032A%29%20W1850-5GB_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638996117048-Certificate_21147CC00793_(MC400-5GB)_INSPEC_UVA_Mexico_2021(MC400-5GB).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638996117048-Certificate_21147CC00793_%28MC400-5GB%29_INSPEC_UVA_Mexico_2021%28MC400-5GB%29.pdf

CRADLEPOINT1638995875880-Certificate_21147CC00792_(S5A844A) IBR1700-1200M-B_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638995875880-Certificate_21147CC00792_%28S5A844A%29%20IBR1700-1200M-B_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638995630674-Certificate_21147CC00791_(S5A135A)_E102-C7C_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638995630674-Certificate_21147CC00791_%28S5A135A%29_E102-C7C_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638995230883-Certificate_21147CC00790_(S5A118A)_E300-C7C_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638995230883-Certificate_21147CC00790_%28S5A118A%29_E300-C7C_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638994723560-Certificate_21147CC00789_(S0A052A)_RX30-PoE_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638994723560-Certificate_21147CC00789_%28S0A052A%29_RX30-PoE_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638994368560-Certificate_21147CC00788_(S0A052B)_RX30-MC_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638994368560-Certificate_21147CC00788_%28S0A052B%29_RX30-MC_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638994041793-Certificate_21147CC00787_(S5A052A)-R1900-5GB_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638994041793-Certificate_21147CC00787_%28S5A052A%29-R1900-5GB_INSPEC_UVA_Mexico_2021.pdf

CRADLEPOINT1638993784129-Certificate_21147CC00786_(S5A111A)-E3000-5GB_INSPEC_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638993784129-Certificate_21147CC00786_%28S5A111A%29-E3000-5GB_INSPEC_UVA_Mexico_2021.pdf

HP1638972649679-NOM-208 Certificate_HyperX_CL002WA1_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638972649679-NOM-208%20Certificate_HyperX_CL002WA1_NYCE_Mexico_2021.pdf

Cricut1638900366325-CERTIFICATE_LIDEART_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E21198.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638900366325-CERTIFICATE_LIDEART_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E21198.pdf

Cricut1638900353715-CERTIFICATE_CONPRO_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E19259.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638900353715-CERTIFICATE_CONPRO_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E19259.pdf

iRobot1638900329344-CERTIFICATE_CONPRO_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E19259.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638900329344-CERTIFICATE_CONPRO_Cricut_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E19259.pdf

Kingston1638900228044-Certificate-(Notificación-Vigencia)_Kingston_CL002WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638900228044-Certificate-%28Notificacio%CC%81n-Vigencia%29_Kingston_CL002WA_NYCE_Mexico_2021.pdf

ORACLE1638893338773-Certificate NYC-2102CT4341_ORACLE_MICROS Compact Workstation 3_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638893338773-Certificate%20NYC-2102CT4341_ORACLE_MICROS%20Compact%20Workstation%203_NYCE_Mexico_2021.pdf

DURACELL1638814632017-Certificate_NYCE6898_Procell_9V_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638814632017-Certificate_NYCE6898_Procell_9V_NYCE_Mexico_2021.pdf

DURACELL1638814576826-Certificate_NYCE6897_Procell_C&D_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638814576826-Certificate_NYCE6897_Procell_C%26D_NYCE_Mexico_2021.pdf

DURACELL1638813213475-Certificate_NYCE6896_Procell_AA&AAA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638813213475-Certificate_NYCE6896_Procell_AA%26AAA_NYCE_Mexico_2021.pdf

Roku1638812231165-Certificate_Roku_9102X (9102MX)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638812231165-Certificate_Roku_9102X%20%289102MX%29_IFT_Mexico_2021.pdf

HP1638796842324-Certificate_HyperX_CL002WA1_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638796842324-Certificate_HyperX_CL002WA1_MTC_Peru_2021.pdf

HP1638552623631-Certificate_HyperX_CL002WA1_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638552623631-Certificate_HyperX_CL002WA1_ENACOM_Argentina_2021.pdf

HP1638552465458-Certificate_HyperX_CA002_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638552465458-Certificate_HyperX_CA002_ENACOM_Argentina_2021.pdf

SONY1638536299932-Certificate_SONY_CFI-1115A_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638536299932-Certificate_SONY_CFI-1115A_TELCOR_Nicaragua_2021.pdf

u-blox1638452291525-CoH_Ublox_Sara-G350_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638452291525-CoH_Ublox_Sara-G350_Anatel_Brazil_2021.pdf

u-blox1638452234950-CoH_Ublox_Toby-L280 _MPCH280_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638452234950-CoH_Ublox_Toby-L280%20_MPCH280_Anatel_Brazil_2021.pdf

u-blox1638452188057-CoH_Ublox_LISA-U2000_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638452188057-CoH_Ublox_LISA-U2000_Anatel_Brazil_2021.pdf

SATO1638451140641-Certificate NYC-2102CT4293_SATO_CL4NX Plus & CL6NX Plus(SATO Mexico)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638451140641-Certificate%20NYC-2102CT4293_SATO_CL4NX%20Plus%20%26%20CL6NX%20Plus%28SATO%20Mexico%29_NYCE_Mexico_2021.pdf

DURACELL1638389323962-14721D6641-Dictamen_Certificate_Duracell_October_Coppertop_C_2Pz_1101539850_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638389323962-14721D6641-Dictamen_Certificate_Duracell_October_Coppertop_C_2Pz_1101539850_INSPEC-UVA_Mexico_2021.pdf

DURACELL1638389191695-14721D5900-Dictamen_Certificate_Duracell_September_Coppertop_AAA_1Pz_1054929669_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638389191695-14721D5900-Dictamen_Certificate_Duracell_September_Coppertop_AAA_1Pz_1054929669_INSPEC-UVA_Mexico_2021.pdf

DURACELL1638387867885-14721D5899-Dictamen_Certificate_Duracell_September_Coppertop_AA_1Pz_1054929669_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638387867885-14721D5899-Dictamen_Certificate_Duracell_September_Coppertop_AA_1Pz_1054929669_INSPEC-UVA_Mexico_2021.pdf

DURACELL1638387736328-14721D5836-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525150_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638387736328-14721D5836-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525150_INSPEC-UVA_Mexico_2021.pdf

iRobot1638386948838-CERTIFICATE_Form C_iRobot_ADG-N2_Lealtad Comercial_ARGENTINA_2021_____CE-2021-116752255-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638386948838-CERTIFICATE_Form%20C_iRobot_ADG-N2_Lealtad%20Comercial_ARGENTINA_2021_____CE-2021-116752255-APN-DNRT%23MDP.pdf

iRobot1638386936910-CERTIFICATE_Form C_iRobot_ADI-N1_Lealtad Comercial_ARGENTINA_2021_____CE-2021-116756132-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638386936910-CERTIFICATE_Form%20C_iRobot_ADI-N1_Lealtad%20Comercial_ARGENTINA_2021_____CE-2021-116756132-APN-DNRT%23MDP.pdf

iRobot1638386917099-CERTIFICATE_iRobot_ADG-N2_Electrical safety_TUV_ARGENTINA_2021_____RA 4183464 E.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638386917099-CERTIFICATE_iRobot_ADG-N2_Electrical%20safety_TUV_ARGENTINA_2021_____RA%204183464%20E.pdf

iRobot1638386887595-CERTIFICATE_iRobot_ADI-N1_Electrical safety_TUV_ARGENTINA_2021_____RA 4183465 E.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638386887595-CERTIFICATE_iRobot_ADI-N1_Electrical%20safety_TUV_ARGENTINA_2021_____RA%204183465%20E.pdf

DURACELL1638375377436-14721D5835-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101524805_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638375377436-14721D5835-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101524805_INSPEC-UVA_Mexico_2021.pdf

HP1638369549713-MTC-Oficio_HyperX_HX-MC006B_HSX-MCWA1_PF007 & PF007WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638369549713-MTC-Oficio_HyperX_HX-MC006B_HSX-MCWA1_PF007%20%26%20PF007WA_MTC_Peru_2021.pdf

Cricut1638364878423-CERTIFICATE_Cricut_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20988.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638364878423-CERTIFICATE_Cricut_CXPL303_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20988.pdf

Cradlepoint1638364812367-CERTIFICATE_cradlepoint_S5A950A_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20986.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638364812367-CERTIFICATE_cradlepoint_S5A950A_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20986.pdf

Cradlepoint1638364794122-CERTIFICATE_cradlepoint_S3A904A_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20987.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638364794122-CERTIFICATE_cradlepoint_S3A904A_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20987.pdf

IROBOT1638361922631-Certificate_iRobot_RVF-Y1_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638361922631-Certificate_iRobot_RVF-Y1_SUBTEL_Chile_2021.pdf

SATO1638304337770-CERTIFICATE_BLUESTARLAM_SATO_1BAY CHARGING CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20973.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638304337770-CERTIFICATE_BLUESTARLAM_SATO_1BAY%20CHARGING%20CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20973.pdf

SATO1638304013109-CERTIFICATE_AZERTY_SATO_1BAY CHARGING CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20971.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638304013109-CERTIFICATE_AZERTY_SATO_1BAY%20CHARGING%20CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20971.pdf

NEDAP1638291645446-Certificate_Nedap_SMART DEACT_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638291645446-Certificate_Nedap_SMART%20DEACT_Chile_SUBTEL_2021.pdf

DURACELL1638290293952-CERTIFICATE_DURACELL_CEF14LA4_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20947.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638290293952-CERTIFICATE_DURACELL_CEF14LA4_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20947.pdf

Kingston1638284858731-Certificate-(Notificación-Vigencia)_Kingston_CEB002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638284858731-Certificate-%28Notificacio%CC%81n-Vigencia%29_Kingston_CEB002_NYCE_Mexico_2021.pdf

DURACELL1638276293092-Certificate_Ext_301-03828_Duracell_9V_INTI_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638276293092-Certificate_Ext_301-03828_Duracell_9V_INTI_Argentina_2021.pdf

iRobot1638213427839-CERTIFICATE_iRobot_RVF-Y1 WITH ADH-N1_Electrical safety_Intertek_CHILE_2021_____E-022-24-0496.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638213427839-CERTIFICATE_iRobot_RVF-Y1%20WITH%20ADH-N1_Electrical%20safety_Intertek_CHILE_2021_____E-022-24-0496.pdf

KCTL1638207328498-CERTIFICATE_skyHD_MH01-500_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20571.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638207328498-CERTIFICATE_skyHD_MH01-500_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20571.pdf

HP1638199562053-CERTIFICATE_DICTAMEN_HYPERX_CL002WA1_NOM-019-SCFI-1998_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC CEDT1599-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638199562053-CERTIFICATE_DICTAMEN_HYPERX_CL002WA1_NOM-019-SCFI-1998_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC%20CEDT1599-21.pdf

HP1638195194257-Certificate_HyperX_PF007WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638195194257-Certificate_HyperX_PF007WA_ENACOM_Argentina_2021.pdf

HP1638195139206-Certificate_HyperX_PF007_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638195139206-Certificate_HyperX_PF007_ENACOM_Argentina_2021.pdf

HP1638195080480-Certificate_HyperX_HX-MC006B_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638195080480-Certificate_HyperX_HX-MC006B_ENACOM_Argentina_2021.pdf

HP1638195012359-Certificate_HyperX_CS002-WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638195012359-Certificate_HyperX_CS002-WA_ENACOM_Argentina_2021.pdf

HP1638194947291-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194947291-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf

HP1638194877705-Certificate_HyperX_CL004WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194877705-Certificate_HyperX_CL004WA_ENACOM_Argentina_2021.pdf

HP1638194825336-Certificate_HyperX_CL004_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194825336-Certificate_HyperX_CL004_ENACOM_Argentina_2021.pdf

HP1638194794735-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194794735-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf

HP1638194762822-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194762822-Certificate_HyperX_CS002_ENACOM_Argentina_2021.pdf

HP1638194706052-Certificate_HyperX_CL002WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194706052-Certificate_HyperX_CL002WA_ENACOM_Argentina_2021.pdf

HP1638194646699-Certificate_HyperX_CL002_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194646699-Certificate_HyperX_CL002_ENACOM_Argentina_2021.pdf

HP1638194585366-Certificate_HyperX_CF001WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194585366-Certificate_HyperX_CF001WA_ENACOM_Argentina_2021.pdf

HP1638194493832-Certificate_HyperX_CF001_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1638194493832-Certificate_HyperX_CF001_ENACOM_Argentina_2021.pdf

iRobot Corporation1638193146045-Safety Certificate_iRobot_Roomba 614:675:694_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1638193146045-Safety%20Certificate_iRobot_Roomba%20614%3A675%3A694_Brazil_2021.pdf

ORACLE1637958757842-Certificate_DT Research_DT317CR_ANCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637958757842-Certificate_DT%20Research_DT317CR_ANCE_Mexico_2021.pdf

BTL1637956235970-Certificate_RAZER_RZ04-0346; RC30-0346_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637956235970-Certificate_RAZER_RZ04-0346%3B%20RC30-0346_INSPEC-UVA_Mexico_2021.pdf

sato1637953145400-Certificate NYC-2102CT4230_NOM-208_SATO_S84-ex(Bluestarlam)__NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637953145400-Certificate%20NYC-2102CT4230_NOM-208_SATO_S84-ex%28Bluestarlam%29__NYCE_Mexico_2021.pdf

HP1637855963038-NOM-208 Certificate_HyperX_CA002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637855963038-NOM-208%20Certificate_HyperX_CA002_NYCE_Mexico_2021.pdf

HP1637787990290-Certificate_HyperX_CA002WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637787990290-Certificate_HyperX_CA002WA_MTC_Peru_2021.pdf

HP1637787878800-Certificate_HyperX_CA002_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637787878800-Certificate_HyperX_CA002_MTC_Peru_2021.pdf

HP1637699033825-NOM-208 Certificate_HyperX_CA002WA_NYCE_ Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637699033825-NOM-208%20Certificate_HyperX_CA002WA_NYCE_%20Mexico_2021.pdf

lutron1637691667463-Certificate Lutron RMJ-,LMJ-,RMJS-,PP; Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691667463-Certificate%20Lutron%20RMJ-%2CLMJ-%2CRMJS-%2CPP%3B%20Factual%20Mexico.pdf

lutron1637691662086-Certificate Lutron RMJ-,LMJ-,RMJS-,PP; Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691662086-Certificate%20Lutron%20RMJ-%2CLMJ-%2CRMJS-%2CPP%3B%20Factual%20Mexico.pdf

lutron1637691655812-Certificate Lutron QSN-2ECO-S, QSN-1ECO-S, QSN-2DAL-S, QSN-1DAL-S, QSN-TW, QSN2-2ECO-S Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691655812-Certificate%20Lutron%20QSN-2ECO-S%2C%20QSN-1ECO-S%2C%20QSN-2DAL-S%2C%20QSN-1DAL-S%2C%20QSN-TW%2C%20QSN2-2ECO-S%20Factual%20Mexico.pdf

lutron1637691649766-Certificate Lutron QP3-1PL-100-240 Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691649766-Certificate%20Lutron%20QP3-1PL-100-240%20Factual%20Mexico.pdf

lutron1637691640329-Certificate Lutron PHPM-PA-120, PHPM-3F-120, PHPM-WBX-12 Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691640329-Certificate%20Lutron%20PHPM-PA-120%2C%20PHPM-3F-120%2C%20PHPM-WBX-12%20Factual%20Mexico.pdf

lutron1637691631455-Certificate Lutron MQSE-4A1-D, MQSE-3A1-D, MQSE-2A1-D, LQSE-4A1-D, LQSE-4A-120-D; LQSE-4A5-120-D, QSN-4A5-D, QSN-4A5-S Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691631455-Certificate%20Lutron%20MQSE-4A1-D%2C%20MQSE-3A1-D%2C%20MQSE-2A1-D%2C%20LQSE-4A1-D%2C%20LQSE-4A-120-D%3B%20LQSE-4A5-120-D%2C%20QSN-4A5-D%2C%20QSN-4A5-S%20Factual%20Mexico.pdf

lutron1637691623980-Certificate Lutron LQSE-2DAL-D, LQSE-2ECO-D; QSN-2DALUNV-D, QSN-2DALUNV-S, LQSE-2DALUNV-D, MQSE-1DALUNV-D; QSN-2ECO-120-D; Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691623980-Certificate%20Lutron%20LQSE-2DAL-D%2C%20LQSE-2ECO-D%3B%20QSN-2DALUNV-D%2C%20QSN-2DALUNV-S%2C%20LQSE-2DALUNV-D%2C%20MQSE-1DALUNV-D%3B%20QSN-2ECO-120-D%3B%20Factual%20Mexico.pdf

lutron1637691616690-Certificate Lutron HW-RPM-4U-120, LP-RPM-4U-120 Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691616690-Certificate%20Lutron%20HW-RPM-4U-120%2C%20LP-RPM-4U-120%20Factual%20Mexico.pdf

lutron1637691607311-Certificate Lutron HQ, HWI, PD4, PD2, PD5, PD6, PD8, PD9, PD10; Factual Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637691607311-Certificate%20Lutron%20HQ%2C%20HWI%2C%20PD4%2C%20PD2%2C%20PD5%2C%20PD6%2C%20PD8%2C%20PD9%2C%20PD10%3B%20Factual%20Mexico.pdf

lutron1637691597023-Certificate Lutron GRX-TVI Factual Mexico.pdf
https://orbiscompliance.s3.amazonaws.com/1637691597023-Certificate%20Lutron%20GRX-TVI%20Factual%20Mexico.pdf

SATO1637613125329-CERTIFICATE_SATO_1BAY CHARGING CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E20308.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637613125329-CERTIFICATE_SATO_1BAY%20CHARGING%20CRADLE_FSP_FSP045-RBCN3_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E20308.pdf

BTL1637612964920-CERTIFICATE_RAZER_RZ04-03801_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20474.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637612964920-CERTIFICATE_RAZER_RZ04-03801_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E20474.pdf

HP1637589412845-Certificate_HyperX_CF001WA_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637589412845-Certificate_HyperX_CF001WA_SUBTEL_Chile_2021.pdf

HP1637589165271-Certificate_HyperX_CF001_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637589165271-Certificate_HyperX_CF001_SUBTEL_Chile_2021.pdf

ROKU1637588635058-Certificate_Roku_3820X_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637588635058-Certificate_Roku_3820X_SUBTEL_Chile_2021.pdf

BTL1637588037829-IFT Certificate_RAZER_RZ01-0413_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637588037829-IFT%20Certificate_RAZER_RZ01-0413_IFT_Mexico_2021.pdf

NEDAP1637583115746-CERTIFICATE_Nedap_VP8002-4102;VP8002;VP4102_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E20173.pdf
https://orbiscompliance.s3.amazonaws.com/1637583115746-CERTIFICATE_Nedap_VP8002-4102%3BVP8002%3BVP4102_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E20173.pdf

HP1637337683843-Certificate_HyperX_CL002WA1_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637337683843-Certificate_HyperX_CL002WA1_CRC_Colombia_2021.pdf

BTL1637327426406-NOM-208 Certificate_RAZER_RC30-03801_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637327426406-NOM-208%20Certificate_RAZER_RC30-03801_NYCE_Mexico_2021.pdf

HP1637265428135-Certificate_HyperX_PF002WA_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637265428135-Certificate_HyperX_PF002WA_SUBTEL_Chile_2021.pdf

HP1637265319423-Certificate_HyperX_PF002_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637265319423-Certificate_HyperX_PF002_SUBTEL_Chile_2021.pdf

ORACLE1637252063558-Certificate NYC-2102CT4134_NOM-208_ORACLE_MICROS Express Station 4 and MICROS Workstation 6 Series 2_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637252063558-Certificate%20NYC-2102CT4134_NOM-208_ORACLE_MICROS%20Express%20Station%204%20and%20MICROS%20Workstation%206%20Series%202_NYCE_Mexico_2021.pdf

ROKU1637244961304-Certificate_ROKU_3820X_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637244961304-Certificate_ROKU_3820X_ASEP_Panama_2021.pdf

DURACELL1637243863038-Certificate_Extension-2021-6820 BT-ARG 4082271(R1)_Duracell_675_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637243863038-Certificate_Extension-2021-6820%20BT-ARG%204082271%28R1%29_Duracell_675_TUV_Argentina_2021.pdf

Kingston1637243543592-Certificate-(Notificación-Vigencia)_Kingston_HXS-HSCFX-WA1_NYCE_MEXIC_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637243543592-Certificate-%28Notificacio%CC%81n-Vigencia%29_Kingston_HXS-HSCFX-WA1_NYCE_MEXIC_2021.pdf

DURACELL1637243532182-Certificate_Extension-2021-6822 BT-ARG 4084262_Duracell_10_13_312&675_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637243532182-Certificate_Extension-2021-6822%20BT-ARG%204084262_Duracell_10_13_312%26675_TUV_Argentina_2021.pdf

DURACELL1637243449433-Certificate_Extension-2021-6818 BT-ARG 4082268 (R1)_Duracell_C&D_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637243449433-Certificate_Extension-2021-6818%20BT-ARG%204082268%20%28R1%29_Duracell_C%26D_TUV_Argentina_2021.pdf

DURACELL1637243290660-Certificate_Extension-2021-6757-BT-ARG 4082272 (R1)_Duracell_AA&AAA_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637243290660-Certificate_Extension-2021-6757-BT-ARG%204082272%20%28R1%29_Duracell_AA%26AAA_TUV_Argentina_2021.pdf

IROBOT1637242135047-Certificate_iRobot_RVF-Y1_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637242135047-Certificate_iRobot_RVF-Y1_ASEP_Panama_2021.pdf

Casa Systems1637240471280-CERTIFICATE_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20214.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637240471280-CERTIFICATE_Edge-corE_AS5916-54XKS_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20214.pdf

Casa Systems1637240456681-CERTIFICATE_casa systems_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20181.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637240456681-CERTIFICATE_casa%20systems_LTE-1006-07_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E20181.pdf

HP1637239427968-Certificate_HyperX_PF007WA-HXS-MCWA1_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637239427968-Certificate_HyperX_PF007WA-HXS-MCWA1_SUBTEL_Chile_2021.pdf

HP1637239191981-Certificate_HyperX_PF007-HX-MC006B_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637239191981-Certificate_HyperX_PF007-HX-MC006B_SUBTEL_Chile_2021.pdf

HP1637239006425-Certificate_HyperX_CM001-HX-HSCAM-GM_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637239006425-Certificate_HyperX_CM001-HX-HSCAM-GM_SUBTEL_Chile_2021.pdf

SONY1637238991244-Certificate_SONY_CFI-1115B_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637238991244-Certificate_SONY_CFI-1115B_TELCOR_Nicaragua_2021.pdf

BTL1637181527342-Certificate_RAZER_RZ04-0346; RC30-0346_INSPECT-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637181527342-Certificate_RAZER_RZ04-0346%3B%20RC30-0346_INSPECT-UVA_Mexico_2021.pdf

BTL1637158564021-NOM-208 Certificate_RAZER_RZ04-03801_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637158564021-NOM-208%20Certificate_RAZER_RZ04-03801_NYCE_Mexico_2021.pdf

ROKU1637150731490-Certificate_Roku_3820X_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637150731490-Certificate_Roku_3820X_SUTEL_Costa%20Rica_2021.pdf

LENOVO1637088161195-Certificate_Lenovo_IdeaPad 1 14IJL7_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637088161195-Certificate_Lenovo_IdeaPad%201%2014IJL7_SUBTEL_Chile_2021.pdf

LAIRD1637065208136-CoC_LAIRD_SmartCraft Connect Gateway_RCM_Australia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1637065208136-CoC_LAIRD_SmartCraft%20Connect%20Gateway_RCM_Australia_2021.pdf

LAIRD1637065104484-sDoC_LAIRD_SmartCraft Connect Gateway_NBTC_Thailand_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1637065104484-sDoC_LAIRD_SmartCraft%20Connect%20Gateway_NBTC_Thailand_2021.pdf

PANDUIT1636995565484-CERTIFICATE_PANDUIT_JBC311U93_NOM-221_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995565484-CERTIFICATE_PANDUIT_JBC311U93_NOM-221_ANCE_MEXICO_2021.pdf

PANDUIT1636995429703-CERTIFICATE_PANDUIT_EF001_NOM-218_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995429703-CERTIFICATE_PANDUIT_EF001_NOM-218_ANCE_MEXICO_2021.pdf

PANDUIT1636995340738-CERTIFICATE_PANDUIT_JBC311U93_NOM-208_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995340738-CERTIFICATE_PANDUIT_JBC311U93_NOM-208_ANCE_MEXICO_2021.pdf

PANDUIT1636995256047-CERTIFICATE_PANDUIT_JBC311U93_NOM-196_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995256047-CERTIFICATE_PANDUIT_JBC311U93_NOM-196_ANCE_MEXICO_2021.pdf

PANDUIT1636995180203-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995180203-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf

PANDUIT1636995153824-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995153824-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf

PANDUIT1636995075803-CERTIFICATE_PANDUIT_JBC311U93_NOM-001_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636995075803-CERTIFICATE_PANDUIT_JBC311U93_NOM-001_ANCE_MEXICO_2021.pdf

PANDUIT1636990070092-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636990070092-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2021.pdf

PANDUIT1636985911642-CERTIFICATE_PANDUIT_ACA01_NOM-003_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636985911642-CERTIFICATE_PANDUIT_ACA01_NOM-003_ANCE_MEXICO_2021.pdf

TELEFONICA DE ARGENTINA S.A.1636985591065-Certificate_APD_WB-24J12R & WB-24J12FA_Lealtad Comercial_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636985591065-Certificate_APD_WB-24J12R%20%26%20WB-24J12FA_Lealtad%20Comercial_Argentina_2021.pdf

TELEFONICA DE ARGENTINA S.A.1636985591061-Certificate_APD_WB-12G12FA_Lealtad Comercial_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636985591061-Certificate_APD_WB-12G12FA_Lealtad%20Comercial_Argentina_2021.pdf

TELEFONICA DE ARGENTINA S.A.1636983468784-Certificate_APD_WB-12G12FA; WB-24J12R & WB-24J12FA_IRAM_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1636983468784-Certificate_APD_WB-12G12FA%3B%20WB-24J12R%20%26%20WB-24J12FA_IRAM_Argentina_2021.pdf

TRIMBLE1636746823774-CERTIFICATE_TRIMBLE_SNR2434,SNR430,SNR434,SNR930,SNR934_SAFETY DICTUM_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636746823774-CERTIFICATE_TRIMBLE_SNR2434%2CSNR430%2CSNR434%2CSNR930%2CSNR934_SAFETY%20DICTUM_MEXICO_2021.pdf

TRIMBLE1636746733094-CERTIFICATE_TRIMBLE_SNR2434, SNR430, SNR434, SNR930, SNR934_NOM-019-SCFI-1998_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636746733094-CERTIFICATE_TRIMBLE_SNR2434%2C%20SNR430%2C%20SNR434%2C%20SNR930%2C%20SNR934_NOM-019-SCFI-1998_MEXICO_2021.pdf

TRIMBLE1636746674953-CERTIFICATE_TRIMBLE_TD510-LW, TD520-W_NOM-019-SCFI-1998_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636746674953-CERTIFICATE_TRIMBLE_TD510-LW%2C%20TD520-W_NOM-019-SCFI-1998_MEXICO_2021.pdf

HP1636741795002-NOM-208 Certificate_HyperX_CF002WA & HXS-HSCFX-WA1_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636741795002-NOM-208%20Certificate_HyperX_CF002WA%20%26%20HXS-HSCFX-WA1_NYCE_Mexico_2021.pdf

LENOVO1636737195384-Certificate_Lenovo_IdeaPad 1 15IJL7_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1636737195384-Certificate_Lenovo_IdeaPad%201%2015IJL7_SUBTEL_Chile_2021.pdf

TRIMBLE1636725216501-CERTIFICATE_TRIMBLE_TD510-LW_NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636725216501-CERTIFICATE_TRIMBLE_TD510-LW_NOM-208_MEXICO_2021.pdf

TRIMBLE1636723250308-CERTIFICATE_TRIMBLE_EC520_NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636723250308-CERTIFICATE_TRIMBLE_EC520_NOM-208_MEXICO_2021.pdf

TRIMBLE1636723224923-CERTIFICATE_TRIMBLE_EC520_NOM-001 DICTUM_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636723224923-CERTIFICATE_TRIMBLE_EC520_NOM-001%20DICTUM_MEXICO_2021.pdf

HP1636720838417-NOM-208 Certificate_HyperX_CL004WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636720838417-NOM-208%20Certificate_HyperX_CL004WA_NYCE_Mexico_2021.pdf

HP1636663579663-NOM-208 Certificate_HyperX_CS002-WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636663579663-NOM-208%20Certificate_HyperX_CS002-WA_NYCE_Mexico_2021.pdf

HP1636663511534-NOM-208 Certificate Checklist HyperX CS002-WA.pdf
https://orbiscompliance.s3.amazonaws.com/1636663511534-NOM-208%20Certificate%20Checklist%20HyperX%20CS002-WA.pdf

HP1636638916921-NOM-208 Certificate_HyperX_CF001_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636638916921-NOM-208%20Certificate_HyperX_CF001_NYCE_Mexico_2021.pdf

HP1636638871017-NOM-208 Certificate_HyperX_CF001WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636638871017-NOM-208%20Certificate_HyperX_CF001WA_NYCE_Mexico_2021.pdf

HP1636637383620-NOM-208 Certificate_HyperX_CL004_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636637383620-NOM-208%20Certificate_HyperX_CL004_NYCE_Mexico_2021.pdf

iRobot Corporation1636581565434-Sound Power Certificate_iRobot_RVD-Y1_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636581565434-Sound%20Power%20Certificate_iRobot_RVD-Y1_Brazil_2021.pdf

iRobot Corporation1636581479213-Certificate Safety_iRobot_RVD-Y1_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636581479213-Certificate%20Safety_iRobot_RVD-Y1_Brazil_2021.pdf

PANDUIT1636567554641-CERTIFICATE_PANDUIT_UPS00100DC_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636567554641-CERTIFICATE_PANDUIT_UPS00100DC_ANCE_MEXICO_2021.pdf

Kingston1636564901051-CoH_HP_CL004_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636564901051-CoH_HP_CL004_ANATEL_Brazil_2021.pdf

Kingston1636564901074-CoH_HP_CL004WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636564901074-CoH_HP_CL004WA_ANATEL_Brazil_2021.pdf

TRIMBLE1636564651325-CERTIFICATE_TRIMBLE_SNR2434,SNR430,SNR434,SNR930,SNR934_TELECOM DICTUM_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636564651325-CERTIFICATE_TRIMBLE_SNR2434%2CSNR430%2CSNR434%2CSNR930%2CSNR934_TELECOM%20DICTUM_MEXICO_2021.pdf

TRIMBLE1636563481915-CERTIFICATE_TRIMBLE_TD510-LW,TD520-W_TELECOM DICTUM_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1636563481915-CERTIFICATE_TRIMBLE_TD510-LW%2CTD520-W_TELECOM%20DICTUM_MEXICO_2021.pdf

DURACELL1636485681862-Surveillance_Certificate_PROCELL_AA_AAA_C_D_9V_NYCE_NOM-212-SCFI-2017_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636485681862-Surveillance_Certificate_PROCELL_AA_AAA_C_D_9V_NYCE_NOM-212-SCFI-2017_Mexico_2021.pdf

Ublox1636474438244-SARA-G350_CoH_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1636474438244-SARA-G350_CoH_Anatel_Brazil_2021.pdf

Ublox1636468961019-CoC_Ublox_Sara-G350_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636468961019-CoC_Ublox_Sara-G350_Anatel_Brazil_2021.pdf

Ublox1636468961038-CoC_Ublox_Toby-L280 _MPCH280_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636468961038-CoC_Ublox_Toby-L280%20_MPCH280_Anatel_Brazil_2021.pdf

Ublox1636468960889-CoC_Ublox_LISA-U2000_Anatel_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636468960889-CoC_Ublox_LISA-U2000_Anatel_Brazil_2021.pdf

HP1636466518584-NOM-208 Certificate_HyperX_CS002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636466518584-NOM-208%20Certificate_HyperX_CS002_NYCE_Mexico_2021.pdf

HP1636464789217-NOM-208 Certificate_HyperX_PF002WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636464789217-NOM-208%20Certificate_HyperX_PF002WA_NYCE_Mexico_2021.pdf

HP1636464723188-NOM-208 Certificate_HyperX_PF002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636464723188-NOM-208%20Certificate_HyperX_PF002_NYCE_Mexico_2021.pdf

Ublox1636463287772-CoH_ublox-NINA-Bx_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636463287772-CoH_ublox-NINA-Bx_ANATEL_Brazil_2021.pdf

Ublox1636463272746-CoC_UBLOX_.NINA-B4_ANATEL_BRAZIL_2021pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636463272746-CoC_UBLOX_.NINA-B4_ANATEL_BRAZIL_2021pdf.pdf

Cobham1636406150879-CoH_WULFSBERG_R T -7000PMR_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636406150879-CoH_WULFSBERG_R%20T%20-7000PMR_ANATEL_Brazil_2021.pdf

Cradlepoint1636396780531-CERTIFICATE EXTENSION TO INGRAM_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021NOR21130C0119.pdf
https://orbiscompliance.s3.amazonaws.com/1636396780531-CERTIFICATE%20EXTENSION%20TO%20INGRAM_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021NOR21130C0119.pdf

NDS1636142414070-Safety Certificate_NDS_Radiance Ultra_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636142414070-Safety%20Certificate_NDS_Radiance%20Ultra_Brazil_2021.pdf

NDS1636142399609-Safety Certificate_NDS_Endo Vue_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636142399609-Safety%20Certificate_NDS_Endo%20Vue_Brazil_2021.pdf

BTL1636140311057-Certificate_RAZER_RZ04-0346; RC30-0346_INSPECT-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636140311057-Certificate_RAZER_RZ04-0346%3B%20RC30-0346_INSPECT-UVA_Mexico_2021.pdf

IROBOT1636132408133-Certificate_iRobot_RVF-Y1_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636132408133-Certificate_iRobot_RVF-Y1_CRC_Colombia_2021.pdf

LENOVO1636126425509-Certificate_Lenovo_TP00116E_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1636126425509-Certificate_Lenovo_TP00116E_SUBTEL_Chile_2021.pdf

HP1636115474504-CERTIFICATE_HYPERX_CP005,HX-CPDUX-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E19635.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636115474504-CERTIFICATE_HYPERX_CP005%2CHX-CPDUX-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E19635.pdf

HP1636060924457-CERTIFICATE_DICTAMEN_HYPERX_CR001A,HXS-HSDG1_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____4294DTCE-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1636060924457-CERTIFICATE_DICTAMEN_HYPERX_CR001A%2CHXS-HSDG1_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____4294DTCE-21.pdf

IROBOT1635961126570-Certificate_iRobot_RVF-Y1_SIT_Guatemala_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635961126570-Certificate_iRobot_RVF-Y1_SIT_Guatemala_2021.pdf

ROKU1635957454237-Certificate_Roku_3820X_SIT_Guatemala_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635957454237-Certificate_Roku_3820X_SIT_Guatemala_2021.pdf

KCTL1635950890740-CoH_KCTL_CWBR720M_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635950890740-CoH_KCTL_CWBR720M_ANATEL_Brazil_2021.pdf

KCTL1635950869012-CoC_KCTL_CWBR720M_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635950869012-CoC_KCTL_CWBR720M_ANATEL_Brazil_2021.pdf

KCTL1635950840453-CoH_KCTL_CCA210R_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635950840453-CoH_KCTL_CCA210R_ANATEL_Brazil_2021.pdf

KCTL1635950816931-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635950816931-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf

KCTL1635950801835-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635950801835-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf

HP1635945750125-CERTIFICATE_HYPERX_9 HEADSETS_7 ADAPTERS_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E19206.pdf
https://orbiscompliance.s3.amazonaws.com/1635945750125-CERTIFICATE_HYPERX_9%20HEADSETS_7%20ADAPTERS_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E19206.pdf

HP1635942577410-CERTIFICATE_DICTAMEN_HYPERX_9 HEADSETS_7 ADAPTERS_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E19206.pdf
https://orbiscompliance.s3.amazonaws.com/1635942577410-CERTIFICATE_DICTAMEN_HYPERX_9%20HEADSETS_7%20ADAPTERS_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C1E19206.pdf

HP1635887724729-CERTIFICATE_HYPERX_CP003,HX-CPBS-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E19388.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635887724729-CERTIFICATE_HYPERX_CP003%2CHX-CPBS-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E19388.pdf

HP1635886980789-CERTIFICATE_DICTAMEN_HYPERX_PF002_NOM-032-ENER-2013_NYCE_MEXICO_2021_____0208DTEE-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635886980789-CERTIFICATE_DICTAMEN_HYPERX_PF002_NOM-032-ENER-2013_NYCE_MEXICO_2021_____0208DTEE-21.pdf

DURACELL1635879463171-14721D5839-Dictamen_Certificate_Duracell_September_Coppertop_C&D_2Pz_1101525157_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879463171-14721D5839-Dictamen_Certificate_Duracell_September_Coppertop_C%26D_2Pz_1101525157_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635879405950-14721D5838-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525157_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879405950-14721D5838-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525157_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635879338942-14721D5837-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525156_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879338942-14721D5837-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525156_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635879279528-14721D5834-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525156_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879279528-14721D5834-Dictamen_Certificate_Duracell_September_Coppertop_D_2Pz_1101525156_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635879226643-14721D5833-Dictamen_Certificate_Duracell_September_Coppertop_C_2Pz_1101524078_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879226643-14721D5833-Dictamen_Certificate_Duracell_September_Coppertop_C_2Pz_1101524078_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635879138276-14721D5560-Dictamen_Certificate_Duracell_September_Coppertop_AA_1Pz_1054929525_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635879138276-14721D5560-Dictamen_Certificate_Duracell_September_Coppertop_AA_1Pz_1054929525_INSPEC-UVA_Mexico_2021.pdf

HP1635869269821-NOM-208 Certificate_HyperX_CF002;HX-HSCFX-BK:WW_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635869269821-NOM-208%20Certificate_HyperX_CF002%3BHX-HSCFX-BK%3AWW_NYCE_Mexico_2021.pdf

SATO1635863814827-Certificate NYC-2102CT4019_SATO_CL4NX Plus & CL6NX Plus(Bluestarlam)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635863814827-Certificate%20NYC-2102CT4019_SATO_CL4NX%20Plus%20%26%20CL6NX%20Plus%28Bluestarlam%29_NYCE_Mexico_2021.pdf

Nedap1635861650661-Certificate_Nedap_VP4011_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635861650661-Certificate_Nedap_VP4011_IFT_Mexico_2021.pdf

HP1635797226915-CoH_HP_HX-MC006B_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635797226915-CoH_HP_HX-MC006B_ANATEL_Brazil_2021.pdf

HP1635796512108-NOM-196, 218, 221_Dictum_HyperX_Wireless Adapters_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635796512108-NOM-196%2C%20218%2C%20221_Dictum_HyperX_Wireless%20Adapters_NYCE_MEXICO_2021.pdf

HP1635795696262-CoH_HP_HXS-MCWA1_ANATEL_Brazil_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795696262-CoH_HP_HXS-MCWA1_ANATEL_Brazil_2021%20.pdf

HP1635795678566-CoH_HP_HX-MC006B_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795678566-CoH_HP_HX-MC006B_ANATEL_Brazil_2021.pdf

HP1635795661761-CoH_HP_HX-CPBS-A_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795661761-CoH_HP_HX-CPBS-A_ANATEL_Brazil_2021.pdf

HP1635795642069-CoH_HP_CS002-WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795642069-CoH_HP_CS002-WA_ANATEL_Brazil_2021.pdf

HP1635795615248-CoH_HP_CS002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795615248-CoH_HP_CS002_ANATEL_Brazil_2021.pdf

HP1635795601533-CoH_HP_CL002WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795601533-CoH_HP_CL002WA_ANATEL_Brazil_2021.pdf

HP1635795589242-CoH_HP_CL002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795589242-CoH_HP_CL002_ANATEL_Brazil_2021.pdf

HP1635795568114-CoH_HP_CF001WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795568114-CoH_HP_CF001WA_ANATEL_Brazil_2021.pdf

HP1635795556479-CoH_HP_CF001_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795556479-CoH_HP_CF001_ANATEL_Brazil_2021.pdf

HP1635795547516-CoH_HP_CEB002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795547516-CoH_HP_CEB002_ANATEL_Brazil_2021.pdf

HP1635795534452-CoH_HP_HX-HSCAM-GM_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795534452-CoH_HP_HX-HSCAM-GM_ANATEL_Brazil_2021.pdf

HP1635795523798-CoH_HP_CS005-WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795523798-CoH_HP_CS005-WA_ANATEL_Brazil_2021.pdf

HP1635795499287-CoC_HP_HXS-MCWA1_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795499287-CoC_HP_HXS-MCWA1_ANATEL_Brazil_2021.pdf

HP1635795488026-CoC_HP_HX-MC006B_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795488026-CoC_HP_HX-MC006B_ANATEL_Brazil_2021.pdf

HP1635795478152-CoC_HP_HX-HSCAM-GM_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795478152-CoC_HP_HX-HSCAM-GM_ANATEL_Brazil_2021.pdf

HP1635795467234-CoC_HP_HX-CPBS-A_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795467234-CoC_HP_HX-CPBS-A_ANATEL_Brazil_2021.pdf

HP1635795454636-CoC_HP_CS005_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795454636-CoC_HP_CS005_ANATEL_Brazil_2021.pdf

HP1635795440025-CoC_HP_CS002-WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795440025-CoC_HP_CS002-WA_ANATEL_Brazil_2021.pdf

HP1635795425470-CoC_HP_CS002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795425470-CoC_HP_CS002_ANATEL_Brazil_2021.pdf

HP1635795413768-CoC_HP_CL002WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795413768-CoC_HP_CL002WA_ANATEL_Brazil_2021.pdf

HP1635795401268-CoC_HP_CL002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795401268-CoC_HP_CL002_ANATEL_Brazil_2021.pdf

HP1635795380258-CoC_HP_CF001WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795380258-CoC_HP_CF001WA_ANATEL_Brazil_2021.pdf

HP1635795366766-CoC_HP_CF001_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795366766-CoC_HP_CF001_ANATEL_Brazil_2021.pdf

HP1635795354615-CoC_HP_CEB002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635795354615-CoC_HP_CEB002_ANATEL_Brazil_2021.pdf

IROBOT1635791744985-Certificate_iRobot_RVF-Y1_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635791744985-Certificate_iRobot_RVF-Y1_SUTEL_Costa%20Rica_2021.pdf

PANDUIT1635786825424-CERTIFICATE_PANDUIT_JBC311U93_NOM-001_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635786825424-CERTIFICATE_PANDUIT_JBC311U93_NOM-001_ANCE_MEXICO_2021.pdf

HP1635776743131-Certificate_HyperX_PF002WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635776743131-Certificate_HyperX_PF002WA_MTC_Peru_2021.pdf

HP1635776231431-Certificate_HyperX_CL004_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635776231431-Certificate_HyperX_CL004_MTC_Peru_2021.pdf

PANDUIT1635776188666-CERTIFICATE_PANDUIT_EF001_NOM-221_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635776188666-CERTIFICATE_PANDUIT_EF001_NOM-221_ANCE_MEXICO_2021.pdf

PANDUIT1635776069962-CERTIFICATE_PANDUIT_EF001_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635776069962-CERTIFICATE_PANDUIT_EF001_NOM-019_ANCE_MEXICO_2021.pdf

HP1635775619755-Certificate_HyperX_CL002_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635775619755-Certificate_HyperX_CL002_MTC_Peru_2021.pdf

PANDUIT1635774551615-CERTIFICATE_PANDUIT_JBC311U93_NOM-221_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774551615-CERTIFICATE_PANDUIT_JBC311U93_NOM-221_ANCE_MEXICO_2021.pdf

PANDUIT1635774541926-CERTIFICATE_PANDUIT_JBC311U93_NOM-218_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774541926-CERTIFICATE_PANDUIT_JBC311U93_NOM-218_ANCE_MEXICO_2021.pdf

PANDUIT1635774525914-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774525914-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf

PANDUIT1635774517758-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774517758-CERTIFICATE_PANDUIT_JBC311U93_NOM-019_ANCE_MEXICO_2021.pdf

PANDUIT1635774500532-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774500532-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf

PANDUIT1635774481067-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635774481067-CERTIFICATE_PANDUIT_JBC311U93_NOM-016_ANCE_MEXICO_2021.pdf

Roku1635772868142-Certificate_Roku_3820X (3820MX)_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635772868142-Certificate_Roku_3820X%20%283820MX%29_MTC_Peru_2021.pdf

HP1635535631991-NOM-208 Certificate_HyperX_CF001WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635535631991-NOM-208%20Certificate_HyperX_CF001WA_NYCE_Mexico_2021.pdf

HP1635534346537-NOM-208 Certificate_HyperX_CS005_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635534346537-NOM-208%20Certificate_HyperX_CS005_NYCE_Mexico_2021.pdf

HP1635520119026-NOM-196 Dictum_HyperX_PF002_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635520119026-NOM-196%20Dictum_HyperX_PF002_MEXICO_2021.pdf

HP1635519429274-NOM-196 Dictum_HyperX_CR001A; HXS-HSDG1_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635519429274-NOM-196%20Dictum_HyperX_CR001A%3B%20HXS-HSDG1_NYCE_MEXICO_2021.pdf

HP1635518399741-NOM-208 Dictum_HyperX_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635518399741-NOM-208%20Dictum_HyperX_NYCE_MEXICO_2021.pdf

HP1635453152948-CERTIFICATE_HYPERX_PF002WA_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E18893.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635453152948-CERTIFICATE_HYPERX_PF002WA_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E18893.pdf

HP1635453152946-CERTIFICATE_HYPERX_PF002_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E18947.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635453152946-CERTIFICATE_HYPERX_PF002_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E18947.pdf

HP1635453152939-CERTIFICATE_DICTAMEN_HYPERX_CA002WA;CF001WA;CF002WA;CL002WA;CL004WA;CS002-WA;HXS-HSCFX-WA1_NOM-019-SCFI-1998_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4295DTCE-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635453152939-CERTIFICATE_DICTAMEN_HYPERX_CA002WA%3BCF001WA%3BCF002WA%3BCL002WA%3BCL004WA%3BCS002-WA%3BHXS-HSCFX-WA1_NOM-019-SCFI-1998_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4295DTCE-21.pdf

HP1635453152944-CERTIFICATE_DICTAMEN_HYPERX_PF002WA_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4281DTCE-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635453152944-CERTIFICATE_DICTAMEN_HYPERX_PF002WA_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4281DTCE-21.pdf

NEDAP1635443150613-CERTIFICATE_DICTAMEN_NEDAP_VP8002-4102;VP8002;VP4102_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4298DTCE-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635443150613-CERTIFICATE_DICTAMEN_NEDAP_VP8002-4102%3BVP8002%3BVP4102_NOM-001-SCFI-2018_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____4298DTCE-21.pdf

Roku1635442995185-Certificate_Roku_RC-EL1_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635442995185-Certificate_Roku_RC-EL1_IFT_Mexico_2021.pdf

HP1635438132243-Certificate_1733-2021 T-306811_HyperX_CL004WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635438132243-Certificate_1733-2021%20T-306811_HyperX_CL004WA_MTC_Peru_2021.pdf

HP1635438027851-Certificate_1731-2021 T-307900_HyperX_CL002WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635438027851-Certificate_1731-2021%20T-307900_HyperX_CL002WA_MTC_Peru_2021.pdf

HP1635437932320-Certificate_1728-2021 T-306812_HyperX_PF002_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635437932320-Certificate_1728-2021%20T-306812_HyperX_PF002_MTC_Peru_2021.pdf

HP1635437679692-Certificate_1732-2021 T-307266_HyperX_CS002_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635437679692-Certificate_1732-2021%20T-307266_HyperX_CS002_MTC_Peru_2021.pdf

HP1635437594066-Certificate_1727-2021 T-307304_HyperX_CS002-WA_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635437594066-Certificate_1727-2021%20T-307304_HyperX_CS002-WA_MTC_Peru_2021.pdf

HP1635437217006-Certificate_1727-2021 T-307304_HyperX_CS002-WA_EXECUTIVE TRANSPORT E.I.R.L_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635437217006-Certificate_1727-2021%20T-307304_HyperX_CS002-WA_EXECUTIVE%20TRANSPORT%20E.I.R.L_Peru_2021.pdf

HP1635435069009-Certificate_HyperX_CL002WA_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635435069009-Certificate_HyperX_CL002WA_Chile_SUBTEL_2021.pdf

HP1635435001155-Certificate_HyperX_CL002_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635435001155-Certificate_HyperX_CL002_Chile_SUBTEL_2021.pdf

HP1635432786694-Certificate_HyperX_CS002-WA_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635432786694-Certificate_HyperX_CS002-WA_Chile_SUBTEL_2021.pdf

HP1635432687958-Certificate_HyperX_CS002_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635432687958-Certificate_HyperX_CS002_Chile_SUBTEL_2021.pdf

HP1635428250250-Certificate_HyperX_CEB002_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635428250250-Certificate_HyperX_CEB002_Chile_SUBTEL_2021.pdf

HP1635426476361-Certificate_HyperX_CL004WA_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635426476361-Certificate_HyperX_CL004WA_Chile_SUBTEL_2021.pdf

HP1635426438265-Certificate_HyperX_CL004_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635426438265-Certificate_HyperX_CL004_Chile_SUBTEL_2021.pdf

PANDUIT1635359437806-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635359437806-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021%20.pdf

KINGSTON1635343981018-Certificate_HyperX_PF002_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635343981018-Certificate_HyperX_PF002_CRC_Colombia_2021.pdf

KINGSTON1635343783095-Certificate_HyperX_PF002WA_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635343783095-Certificate_HyperX_PF002WA_CRC_Colombia_2021.pdf

SATO1635279893357-Certificate NYC-2102CT3940_NOM-208_SATO_S86-ex(SATO Mexico)__NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635279893357-Certificate%20NYC-2102CT3940_NOM-208_SATO_S86-ex%28SATO%20Mexico%29__NYCE_Mexico_2021.pdf

SATO1635279889289-Certificate NYC-2102CT3940_NOM-208_SATO_S86-ex(SATO Mexico)__NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635279889289-Certificate%20NYC-2102CT3940_NOM-208_SATO_S86-ex%28SATO%20Mexico%29__NYCE_Mexico_2021.pdf

HP1635275366997-Certificate_HyperX_CS003_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635275366997-Certificate_HyperX_CS003_INSPEC-UVA_Mexico_2021.pdf

DURACELL1635253405970-21147CC000741-Certificate_PROCELL_9V_12Pz_Malaysia_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635253405970-21147CC000741-Certificate_PROCELL_9V_12Pz_Malaysia_INSPEC-UVA_Mexico_2021.pdf

BTL1635251115920-Certificate_RAZER_RZ04-03801 & RC30-03801_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635251115920-Certificate_RAZER_RZ04-03801%20%26%20RC30-03801_INSPEC-UVA_Mexico_2021.pdf

HP1635190170293-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021 (Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635190170293-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021%20%28Taiwan%29.pdf

HP1635189760605-Certificate_HyperX_CF002;CF002WA_INSPEC-UVA_Mexico_2021 (Vietnam) .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635189760605-Certificate_HyperX_CF002%3BCF002WA_INSPEC-UVA_Mexico_2021%20%28Vietnam%29%20.pdf

HP1635189334861-Certificate_HyperX_CS005_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635189334861-Certificate_HyperX_CS005_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

iRobot1635189236859-Certificate_iRobot_AXF-Y1 & RVD-Y1_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635189236859-Certificate_iRobot_AXF-Y1%20%26%20RVD-Y1_IFT_Mexico_2021.pdf

ROKU1635188770859-Certificate_Roku_3820X_SIGET_El Salvador_2021.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635188770859-Certificate_Roku_3820X_SIGET_El%20Salvador_2021.PDF

HP1635188310457-Certificate_HyperX_CS002;CS002-WA_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635188310457-Certificate_HyperX_CS002%3BCS002-WA_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

HP1635187885254-Certificate_HyperX_CL002;CL002WA_INSPECT-UVA_Mexico_2021(Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635187885254-Certificate_HyperX_CL002%3BCL002WA_INSPECT-UVA_Mexico_2021%28Vietnam%29.pdf

Roku1635187857600-IFT Certificate_Roku_3820X (3820MX)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635187857600-IFT%20Certificate_Roku_3820X%20%283820MX%29_IFT_Mexico_2021.pdf

HP1635187374429-Certificate_HyperX_CF001;CF001WA_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635187374429-Certificate_HyperX_CF001%3BCF001WA_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

HP1635186856839-Certificate_HyperX_CS006_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635186856839-Certificate_HyperX_CS006_INSPEC-UVA_Mexico_2021.pdf

HP1635186498761-Certificate_HyperX_HX-HSCSC2-BK_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635186498761-Certificate_HyperX_HX-HSCSC2-BK_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

HP1635186050388-Certificate_HyperX_HX-HSCOS-GM:WW_INSPEC-UVA_Mexico_2021 (Vietnam)..pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635186050388-Certificate_HyperX_HX-HSCOS-GM%3AWW_INSPEC-UVA_Mexico_2021%20%28Vietnam%29..pdf

HP1635185596605-Certificate_HyperX_HX-CPDUX-A_INSPEC-UVA_Mexico_2021 (Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635185596605-Certificate_HyperX_HX-CPDUX-A_INSPEC-UVA_Mexico_2021%20%28Taiwan%29.pdf

PANDUIT1635185455851-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635185455851-CERTIFICATE_PANDUIT_1156_NOM-019_ANCE_MEXICO_2021.pdf

HP1635176054307-NOM-208 Certificate_HyperX_CL002WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635176054307-NOM-208%20Certificate_HyperX_CL002WA_NYCE_Mexico_2021.pdf

HP1635175713880-NOM-208 Certificate_HyperX_CL002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635175713880-NOM-208%20Certificate_HyperX_CL002_NYCE_Mexico_2021.pdf

HP1635175191432-Certificate_HyperX_HX-CPBS-A_INSPEC-UVA_Mexico_2021(Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635175191432-Certificate_HyperX_HX-CPBS-A_INSPEC-UVA_Mexico_2021%28Taiwan%29.pdf

HP1635172664728-Certificate_HyperX_CS006_INSPEC-UVA_Mexico_2021(Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635172664728-Certificate_HyperX_CS006_INSPEC-UVA_Mexico_2021%28Vietnam%29.pdf

HP1635170104974-Certificate_HyperX_CS004_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635170104974-Certificate_HyperX_CS004_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

HP1635167663893-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021 (Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635167663893-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021%20%28Taiwan%29.pdf

HP1635167649079-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021 (Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635167649079-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021%20%28Taiwan%29.pdf

HP1635167638344-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021 (Taiwan).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1635167638344-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021%20%28Taiwan%29.pdf

HP1635167291957-Certificate_HyperX_HX-HSCSC2-BK_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1635167291957-Certificate_HyperX_HX-HSCSC2-BK_INSPEC-UVA_Mexico_2021.pdf

HP1634932691216-Certificate_HyperX_CEB002_NYCE NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634932691216-Certificate_HyperX_CEB002_NYCE%20NOM-208_MEXICO_2021.pdf

HP1634932678911-Certificate_HyperX_CEB002_NYCE NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634932678911-Certificate_HyperX_CEB002_NYCE%20NOM-208_MEXICO_2021.pdf

HP1634932668847-Certificate_HyperX_CEB002_NYCE NOM-208_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634932668847-Certificate_HyperX_CEB002_NYCE%20NOM-208_MEXICO_2021.pdf

HP1634930688006-Certificate_HyperX_HX-HSCFX-BK:WW ; HXS-HSCFX-WA1_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634930688006-Certificate_HyperX_HX-HSCFX-BK%3AWW%20%3B%20HXS-HSCFX-WA1_INSPEC-UVA_Mexico_2021.pdf

HP1634930250132-Certificate_HyperX_HX-HSCOS-GM:WW_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634930250132-Certificate_HyperX_HX-HSCOS-GM%3AWW_INSPEC-UVA_Mexico_2021.pdf

HP1634929911154-Certificate_HyperX_HX-CPDUX-A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634929911154-Certificate_HyperX_HX-CPDUX-A_INSPEC-UVA_Mexico_2021.pdf

HP1634929608572-Certificate_HyperX_HX-CPDUX_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634929608572-Certificate_HyperX_HX-CPDUX_INSPEC-UVA_Mexico_2021.pdf

HP1634929236966-Certificate_HyperX_HX-CPBS-A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634929236966-Certificate_HyperX_HX-CPBS-A_INSPEC-UVA_Mexico_2021.pdf

HP1634927753628-Certificate_HyperX_CS004_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634927753628-Certificate_HyperX_CS004_INSPEC-UVA_Mexico_2021.pdf

HP1634927059108-Certificate_HyperX_CR001 ; CR001A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634927059108-Certificate_HyperX_CR001%20%3B%20CR001A_INSPEC-UVA_Mexico_2021.pdf

HP1634926536180-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634926536180-Certificate_HyperX_CP005_INSPEC-UVA_Mexico_2021.pdf

HP1634925859227-Certificate_HyperX_CO001_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634925859227-Certificate_HyperX_CO001_INSPEC-UVA_Mexico_2021.pdf

HP1634925373543-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634925373543-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021.pdf

HP1634925367914-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634925367914-Certificate_HyperX_CP003_INSPEC-UVA_Mexico_2021.pdf

HP1634924805308-Certificate_HyperX_CF002; CF002WA_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634924805308-Certificate_HyperX_CF002%3B%20CF002WA_INSPEC-UVA_Mexico_2021.pdf

DURACELL1634839919270-14721D5286-Dictamen_Certificate_Duracell_August_Coppertop_9V_1Pz_28123783_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634839919270-14721D5286-Dictamen_Certificate_Duracell_August_Coppertop_9V_1Pz_28123783_INSPEC-UVA_Mexico_2021.pdf

DURACELL1634839847804-14721D5261-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_2Pz_14Pz_1054929451_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634839847804-14721D5261-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_2Pz_14Pz_1054929451_INSPEC-UVA_Mexico_2021.pdf

DURACELL1634839783279-14721D5260-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_1054929451_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634839783279-14721D5260-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_1054929451_INSPEC-UVA_Mexico_2021.pdf

DURACELL1634839721712-14721D5259-Dictamen_Certificate_Duracell_August_Coppertop_AAA_4Pz_6Pz_1054929449_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634839721712-14721D5259-Dictamen_Certificate_Duracell_August_Coppertop_AAA_4Pz_6Pz_1054929449_INSPEC-UVA_Mexico_2021.pdf

DURACELL1634839530109-14721D5258-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_1054929449_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634839530109-14721D5258-Dictamen_Certificate_Duracell_August_Coppertop_AA_1Pz_1054929449_INSPEC-UVA_Mexico_2021.pdf

LENOVO1634835808108-Certificate Update_Lenovo_TP00116D_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634835808108-Certificate%20Update_Lenovo_TP00116D_SUBTEL_Chile_2021.pdf

LENOVO1634824243250-Certificate Update_Lenovo_TP00117D_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1634824243250-Certificate%20Update_Lenovo_TP00117D_SUBTEL_Chile_2020.pdf

LENOVO1634647722940-Certifications_Lenovo_Yoga Slim 7 Carbon 14ACN6_SUBTE_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634647722940-Certifications_Lenovo_Yoga%20Slim%207%20Carbon%2014ACN6_SUBTE_Chile_2021.pdf

ROKU1634571504100-DICTAMEN_CERTIFICATE_ROKU_3820X (3820MX)_NOM-001-SCFI-2018_NPMX_MEXICO_2021_____NOR21130EDT0053.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634571504100-DICTAMEN_CERTIFICATE_ROKU_3820X%20%283820MX%29_NOM-001-SCFI-2018_NPMX_MEXICO_2021_____NOR21130EDT0053.pdf

KINGSTON1634569398118-Certificate_Kingston_CL004_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634569398118-Certificate_Kingston_CL004_ENACOM_Argentina_2021.pdf

KINGSTON1634569386087-Certificate_Kingston_CL004WA_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634569386087-Certificate_Kingston_CL004WA_ENACOM_Argentina_2021.pdf

Kingston1634316313080-CoC_Kingston_PF002WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634316313080-CoC_Kingston_PF002WA_ANATEL_Brazil_2021.pdf

Kingston1634316302418-CoC_Kingston_PF002_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634316302418-CoC_Kingston_PF002_ANATEL_Brazil_2021.pdf

Arista Networks Inc.1634236151044-CoH_ARISTA_AN1741_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634236151044-CoH_ARISTA_AN1741_ANATEL_Brazil_2021.pdf

Arista Networks Inc.1634236136021-CoH_ARISTA_AN1718_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634236136021-CoH_ARISTA_AN1718_ANATEL_Brazil_2021.pdf

Arista Networks Inc.1634236124276-CoC_Arista_AN1741_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634236124276-CoC_Arista_AN1741_Brazil_2021.pdf

Arista Networks Inc.1634235286467-CoC_Arista_AN1741_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634235286467-CoC_Arista_AN1741_Brazil_2021.pdf

Arista Networks Inc.1634235273291-CoC_Arista_AN1718_ Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634235273291-CoC_Arista_AN1718_%20Brazil_2021.pdf

Arista Networks Inc.1634234924325-CoH_ARISTA_AN1769_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634234924325-CoH_ARISTA_AN1769_ANATEL_Brazil_2021.pdf

Arista Networks Inc.1634234787374-CoC_Arista _AN1769_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634234787374-CoC_Arista%20_AN1769_Brazil_2021.pdf

Arista Networks Inc.1634234343327-CoH_ARISTA_AN1737_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634234343327-CoH_ARISTA_AN1737_ANATEL_Brazil_2021.pdf

Arista Networks Inc.1634233334079-Arista CoC-DCS-7130-96S, DCS-7130-96LS, DCS-7130-96LAS, DCS-7130-96LBS-Brazil 2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634233334079-Arista%20CoC-DCS-7130-96S%2C%20DCS-7130-96LS%2C%20DCS-7130-96LAS%2C%20DCS-7130-96LBS-Brazil%202021%20.pdf

SONY1634216911779-Certificate_SONY_CFI-1115A_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634216911779-Certificate_SONY_CFI-1115A_CONATEL_Honduras_2021.pdf

DURACELL1634143693598-2021 Compliance Notification GS-CS-200012-Duracell-9C:Malaysia-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634143693598-2021%20Compliance%20Notification%20GS-CS-200012-Duracell-9C%3AMalaysia-Intertek-Colombia-2021.pdf

DURACELL1634143559339-2021 Compliance Notification GS-CS-200011-Duracell-C&D:USA-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634143559339-2021%20Compliance%20Notification%20GS-CS-200011-Duracell-C%26D%3AUSA-Intertek-Colombia-2021.pdf

DURACELL1634143387792-2021 Compliance Notification GS-CS-200010-Duracell-AA&AAA:USA-Intertek-Colombia -2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1634143387792-2021%20Compliance%20Notification%20GS-CS-200010-Duracell-AA%26AAA%3AUSA-Intertek-Colombia%20-2021.pdf

DURACELL1634142954442-2021 Compliance Notification GS-CS-200009-Duracell-AA&AAA:China-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.amazonaws.com/1634142954442-2021%20Compliance%20Notification%20GS-CS-200009-Duracell-AA%26AAA%3AChina-Intertek-Colombia-2021.pdf

ORACLE1633957205856-CERTIFICATE_ORACLE MEXICO_EPSON_M159E,M159B,M159A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E18282.pdf
https://orbiscompliance.s3.amazonaws.com/1633957205856-CERTIFICATE_ORACLE%20MEXICO_EPSON_M159E%2CM159B%2CM159A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E18282.pdf

ORACLE1633719240197-Folio de Importacion STOC4251-CT-3444_ORACLE_MICROS Express Station 4 and MICROS Workstation 6 Series 2_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633719240197-Folio%20de%20Importacion%20STOC4251-CT-3444_ORACLE_MICROS%20Express%20Station%204%20and%20MICROS%20Workstation%206%20Series%202_NYCE_Mexico_2021.pdf

ORACLE1633717985004-Folio de Importacion STOC4233-CT-3342_ORACLE_MICROS Compact Workstation 3_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633717985004-Folio%20de%20Importacion%20STOC4233-CT-3342_ORACLE_MICROS%20Compact%20Workstation%203_NYCE_Mexico_2021.pdf

ORACLE1633717798452-Certificate_DT Research_DT317CR_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633717798452-Certificate_DT%20Research_DT317CR_NYCE_Mexico_2021.pdf

SATO1633710365808-Certificate NYC-2102CT3767_SATO_PW208NX(Azerty)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633710365808-Certificate%20NYC-2102CT3767_SATO_PW208NX%28Azerty%29_NYCE_Mexico_2021.pdf

HP1633702089672-Certificate_HyperX_PF002_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633702089672-Certificate_HyperX_PF002_URSEC_Uruguay_2021.pdf

HP1633702071550-Certificate_HyperX_PF002WA_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633702071550-Certificate_HyperX_PF002WA_URSEC_Uruguay_2021.pdf

HP1633700873377-Certificate_HP_PF002_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633700873377-Certificate_HP_PF002_URSEC_Uruguay_2021.pdf

HP1633700649810-Certificate_HP_PF002WA_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633700649810-Certificate_HP_PF002WA_URSEC_Uruguay_2021.pdf

ROKU1633698263601-CERTIFICATE_ROKU_3820X(3820MX)_NOM-019-SCFI-1998_NPMX_MEXICO_2021_____NOR21130C0237.pdf
https://orbiscompliance.s3.amazonaws.com/1633698263601-CERTIFICATE_ROKU_3820X%283820MX%29_NOM-019-SCFI-1998_NPMX_MEXICO_2021_____NOR21130C0237.pdf

ORACLE1633629797646-CERTIFICATE FORM C_ORACLE_M159E_CE-2020-66793888-APN-DNRT#MDP_ARGENTINA_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633629797646-CERTIFICATE%20FORM%20C_ORACLE_M159E_CE-2020-66793888-APN-DNRT%23MDP_ARGENTINA_2020.pdf

iRobot1633622222902-Constancia - 2021-0986 Firmada.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633622222902-Constancia%20-%202021-0986%20Firmada.pdf

iROBOT1633619273514-CERTIFICATE_IROBOT_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E18098.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633619273514-CERTIFICATE_IROBOT_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2021_____NYC-2102C0E18098.pdf

BTL1633617968442-CERTIFICATE_POLY_POLY EDGE B30_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17992.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633617968442-CERTIFICATE_POLY_POLY%20EDGE%20B30_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17992.pdf

BTL1633611047416-Certificate_RAZER_RC30-0380_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633611047416-Certificate_RAZER_RC30-0380_IFT_Mexico_2021.pdf

BTL1633610993308-Certificate_RAZER_RZ04-0380_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633610993308-Certificate_RAZER_RZ04-0380_IFT_Mexico_2021.pdf

BTL1633610812896-Certificate_RAZER_RC30-0380_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633610812896-Certificate_RAZER_RC30-0380_NYCE_Mexico_2021.pdf

BTL1633610575229-Certificate_RAZER_RZ04-0380_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1633610575229-Certificate_RAZER_RZ04-0380_NYCE_Mexico_2021.pdf

DURACELL1633096731202-14721D5101-Dictamen_Certificate_Duracell_July_Coppertop_AA_4;1Pz_1054929370_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633096731202-14721D5101-Dictamen_Certificate_Duracell_July_Coppertop_AA_4%3B1Pz_1054929370_INSPEC-UVA_Mexico_2021.pdf

HP1633093135301-Certificate_HyperX_CS002 ; CS002-WA_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633093135301-Certificate_HyperX_CS002%20%3B%20CS002-WA_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032838645-14721D5105-Dictamen_Certificate_Duracell_July_Coppertop_AA_4;30Pz_1054929372_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032838645-14721D5105-Dictamen_Certificate_Duracell_July_Coppertop_AA_4%3B30Pz_1054929372_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032823062-14721D5100-Dictamen_Certificate_Duracell_July_Coppertop_AA_18Pz_1054929370_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032823062-14721D5100-Dictamen_Certificate_Duracell_July_Coppertop_AA_18Pz_1054929370_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032804144-14721D5099-Dictamen_Certificate_Duracell_July_Coppertop_AA_4;18;6Pz_1054929387_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032804144-14721D5099-Dictamen_Certificate_Duracell_July_Coppertop_AA_4%3B18%3B6Pz_1054929387_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032727863-14721D5099-Dictamen_Certificate_Duracell_July_Coppertop_AA_4;18;6Pz_1054929387_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032727863-14721D5099-Dictamen_Certificate_Duracell_July_Coppertop_AA_4%3B18%3B6Pz_1054929387_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032686788-14721D5098-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929386_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032686788-14721D5098-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929386_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032621162-14721D5097-Dictamen_Certificate_Duracell_July_Coppertop_AAA_1Pz_1054929386_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032621162-14721D5097-Dictamen_Certificate_Duracell_July_Coppertop_AAA_1Pz_1054929386_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032609876-14721D5096-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929373_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1633032609876-14721D5096-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929373_INSPEC-UVA_Mexico_2021.pdf

DURACELL1633032604641-14721D5096-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929373_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1633032604641-14721D5096-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929373_INSPEC-UVA_Mexico_2021.pdf

HP1633006996235-Certificate_HyperX_CF001 ; CF001WA_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1633006996235-Certificate_HyperX_CF001%20%3B%20CF001WA_INSPEC-UVA_Mexico_2021.pdf

Kingston1632927737657-Certificate_Kingston_CL004WA_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632927737657-Certificate_Kingston_CL004WA_IFT_Mexico_2021.pdf

CEI1632923635259-Certificate_ALPS ALPINE EUROPE GmbH_Lykaner 4 R2_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632923635259-Certificate_ALPS%20ALPINE%20EUROPE%20GmbH_Lykaner%204%20R2_IFT_Mexico_2021.pdf

HP1632922539291-Certificate_HyperX_CS005_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632922539291-Certificate_HyperX_CS005_INSPEC-UVA_Mexico_2021.pdf

HP1632922003246-Certificate_HyperX_CL002 ; CL002WA_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632922003246-Certificate_HyperX_CL002%20%3B%20CL002WA_INSPEC-UVA_Mexico_2021.pdf

HP1632921041678-Certificate_HyperX_CEB002_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632921041678-Certificate_HyperX_CEB002_INSPEC-UVA_Mexico_2021.pdf

HP1632920272599-Certificate_HyperX_PF002 (PF002WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632920272599-Certificate_HyperX_PF002%20%28PF002WA%29_INSPEC-UVA_Mexico_2021.pdf

HP1632920236880-Certificate_HyperX_CL004 (CL004WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1632920236880-Certificate_HyperX_CL004%20%28CL004WA%29_INSPEC-UVA_Mexico_2021.pdf

Casa Systems1632850087300-CERTIFICATE_CASA SYSTEMS_C40G_NOM-019-SCFI-1998_HIGHLY SPECIALIZED_NPMX_MEXICO_2021_____NOR21130AE0069.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632850087300-CERTIFICATE_CASA%20SYSTEMS_C40G_NOM-019-SCFI-1998_HIGHLY%20SPECIALIZED_NPMX_MEXICO_2021_____NOR21130AE0069.pdf

BTL1632849759088-CERTIFICATE_RAZER_RZ01-0413_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17655.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632849759088-CERTIFICATE_RAZER_RZ01-0413_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17655.pdf

SATO1632421733220-CERTIFICATE_BLUESTARLAM_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17475.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632421733220-CERTIFICATE_BLUESTARLAM_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17475.pdf

SATO1632421607703-CERTIFICATE_AZERTY_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17476.pdf
https://orbiscompliance.s3.amazonaws.com/1632421607703-CERTIFICATE_AZERTY_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17476.pdf

ORACLE1632410393178-CERTIFICATE_ORACLE_MICROS EXPRESS STATION 4_NOM-019-SCFI-1998_NPMX_MEXICO_2021_NOR21130C0075.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632410393178-CERTIFICATE_ORACLE_MICROS%20EXPRESS%20STATION%204_NOM-019-SCFI-1998_NPMX_MEXICO_2021_NOR21130C0075.pdf

Casa Systems1632409129652-CERTIFICATE_CASA SYSTEMS_C100G_NOM-019-SCFI-1998_HIGHLY SPECIALIZED_NPMX_MEXICO_2021_____NOR21130AE0068.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632409129652-CERTIFICATE_CASA%20SYSTEMS_C100G_NOM-019-SCFI-1998_HIGHLY%20SPECIALIZED_NPMX_MEXICO_2021_____NOR21130AE0068.pdf

BTL1632403802403-Certificate_RAZER_RZ01-0413_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632403802403-Certificate_RAZER_RZ01-0413_NYCE_Mexico_2021.pdf

STONERIDGE1632331927697-Certificate_Stoneridge_SM100_MTC_PERU_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632331927697-Certificate_Stoneridge_SM100_MTC_PERU_2021.pdf

INDUSTRIAL SCIENTIFIC1632326807119-Certificate_Industrial Scientific_RGX Gateway_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632326807119-Certificate_Industrial%20Scientific_RGX%20Gateway_CRC_Colombia_2021.pdf

STONERIDGE1632323880532-Certificate_Stoneridge_SM100_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1632323880532-Certificate_Stoneridge_SM100_SUBTEL_Chile_2021.pdf

PANDUIT1632243697590-Certificate_CC S0259-1.21 NOM-050_PANDUIT_ACF05_ACF06_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632243697590-Certificate_CC%20S0259-1.21%20NOM-050_PANDUIT_ACF05_ACF06_UVA_Mexico_2021.pdf

SATO1632241901503-CERTIFICATE_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17175.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632241901503-CERTIFICATE_SATO_PW4NX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E17175.pdf

SATO1632234978115-Certificate NYC-2102CT3647_NOM-208_ WLAN_SATO_WS408DT-STD WS408TT-STD(Bluestarlam)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632234978115-Certificate%20NYC-2102CT3647_NOM-208_%20WLAN_SATO_WS408DT-STD%20WS408TT-STD%28Bluestarlam%29_NYCE_Mexico_2021.pdf

SATO1632234973113-Certificate NYC-2102CT3647_NOM-208_ WLAN_SATO_WS408DT-STD WS408TT-STD(Bluestarlam)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632234973113-Certificate%20NYC-2102CT3647_NOM-208_%20WLAN_SATO_WS408DT-STD%20WS408TT-STD%28Bluestarlam%29_NYCE_Mexico_2021.pdf

SATO1632233531363-Certificate NYC-2102CT3648_NOM-208_SATO_WS408DT-STD WS408TT-STD(Bluestarlam)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1632233531363-Certificate%20NYC-2102CT3648_NOM-208_SATO_WS408DT-STD%20WS408TT-STD%28Bluestarlam%29_NYCE_Mexico_2021.pdf

Roku1632149660974-Commercial Model Recognition_Roku_3940X_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632149660974-Commercial%20Model%20Recognition_Roku_3940X_ENACOM_Argentina_2021.pdf

KIERO1632149613527-Certificate_EXT-2021-5010 BT-ARG 4082272 (R1)_KIERO_AA&AAA_TÜV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1632149613527-Certificate_EXT-2021-5010%20BT-ARG%204082272%20%28R1%29_KIERO_AA%26AAA_TU%CC%88V_Argentina_2021.pdf

LAIRD1632143683274-Certificate_LAIRD_SCC-1_INDOTEL_Dominican Republic_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1632143683274-Certificate_LAIRD_SCC-1_INDOTEL_Dominican%20Republic_2021.pdf

KINGSTON1631819377034-CERTIFICATE_KINGSTON_CL004_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E17047.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631819377034-CERTIFICATE_KINGSTON_CL004_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E17047.pdf

ROKU1631808066405-CERTIFICATE_ROKU_3930MX (3930X)_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E07975.pdf
https://orbiscompliance.s3.amazonaws.com/1631808066405-CERTIFICATE_ROKU_3930MX%20%283930X%29_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E07975.pdf

SONY1631730020284-CERTIFICATE_SONY DE MÉXICO_CXD90064_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631730020284-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_CXD90064_NPMX_2021.pdf

SONY1631730009966-CERTIFICATE_S2G_CFI-ZCT1W_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631730009966-CERTIFICATE_S2G_CFI-ZCT1W_NPMX_2021.pdf

SONY1631728624995-CERTIFICATE_SONY DE MÉXICO_J20H100(CFI-1115A)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728624995-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_J20H100%28CFI-1115A%29_NPMX_2021.pdf

SONY1631728609749-CERTIFICATE_SONY DE MÉXICO_J20H100(CFI-1115A, CFI-1115B)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728609749-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_J20H100%28CFI-1115A%2C%20CFI-1115B%29_NPMX_2021.pdf

SONY1631728584617-CERTIFICATE_SONY DE MÉXICO_AW-XM501(CFI-1115A)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728584617-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_AW-XM501%28CFI-1115A%29_NPMX_2021.pdf

SONY1631728573838-CERTIFICATE_SONY DE MÉXICO_AW-XM501(CFI-1115A, CFI-1115B)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728573838-CERTIFICATE_SONY%20DE%20ME%CC%81XICO_AW-XM501%28CFI-1115A%2C%20CFI-1115B%29_NPMX_2021.pdf

SONY1631728512325-CERTIFICATE_S2G_J20H100 (CFI-1115A) _NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728512325-CERTIFICATE_S2G_J20H100%20%28CFI-1115A%29%20_NPMX_2021.pdf

SONY1631728503804-CERTIFICATE_S2G_J20H100 (CFI-1115A, CFI-1115B)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728503804-CERTIFICATE_S2G_J20H100%20%28CFI-1115A%2C%20CFI-1115B%29_NPMX_2021.pdf

SONY1631728493990-CERTIFICATE_S2G_AW-XM501(CFI-1115A)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728493990-CERTIFICATE_S2G_AW-XM501%28CFI-1115A%29_NPMX_2021.pdf

SONY1631728484520-CERTIFICATE_S2G_AW-XM501(CFI-1115A, CFI-1115B)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728484520-CERTIFICATE_S2G_AW-XM501%28CFI-1115A%2C%20CFI-1115B%29_NPMX_2021.pdf

SONY1631728397475-CERTIFICATE_S2G_AW-XM501(CFI-1115A)_NPMX_2021 NOR21130T0128.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728397475-CERTIFICATE_S2G_AW-XM501%28CFI-1115A%29_NPMX_2021%20NOR21130T0128.pdf

SONY1631728385463-CERTIFICATE_S2G_AW-XM501(CFI-1115A, CFI-1115B)_NPMX_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631728385463-CERTIFICATE_S2G_AW-XM501%28CFI-1115A%2C%20CFI-1115B%29_NPMX_2021.pdf

SONY1631726590687-CERTIFICATE_S2G_AW-XM501_NPMX_2021 NOR21130T0128-A1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631726590687-CERTIFICATE_S2G_AW-XM501_NPMX_2021%20NOR21130T0128-A1.pdf

KINGSTON1631714237549-CERTIFICATE_KINGSTON_KUANTEN_KT12W050200US_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E17080.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631714237549-CERTIFICATE_KINGSTON_KUANTEN_KT12W050200US_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E17080.pdf

KINGSTON1631713918465-CERTIFICATE_KINGSTON_HX-CPDUX-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E17033.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631713918465-CERTIFICATE_KINGSTON_HX-CPDUX-A_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E17033.pdf

PANDUIT1631708977391-CERTIFICATE_PANDUIT_EF001_NOM-001_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631708977391-CERTIFICATE_PANDUIT_EF001_NOM-001_ANCE_MEXICO_2021.pdf

PANDUIT1631651278573-CERTIFICATE_PANDUIT_EF001_NOM-218_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631651278573-CERTIFICATE_PANDUIT_EF001_NOM-218_ANCE_MEXICO_2021.pdf

PANDUIT1631651126956-CERTIFICATE_PANDUIT_EF001_NOM-208_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631651126956-CERTIFICATE_PANDUIT_EF001_NOM-208_ANCE_MEXICO_2021.pdf

PANDUIT1631651103498-CERTIFICATE_PANDUIT_EF001_NOM-196_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631651103498-CERTIFICATE_PANDUIT_EF001_NOM-196_ANCE_MEXICO_2021.pdf

PANDUIT1631650004735-CERTIFICATE_PANDUIT_JBC311U93_NOM-208_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631650004735-CERTIFICATE_PANDUIT_JBC311U93_NOM-208_ANCE_MEXICO_2021.pdf

PANDUIT1631649705962-CERTIFICATE_PANDUIT_1156_NOM-221_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631649705962-CERTIFICATE_PANDUIT_1156_NOM-221_ANCE_MEXICO_2021.pdf

SATO1631646903522-CERTIFICATE_BLUESTARLAM_4BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14926.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631646903522-CERTIFICATE_BLUESTARLAM_4BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14926.pdf

SATO1631646903520-CERTIFICATE_BLUESTARLAM_1BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14930.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631646903520-CERTIFICATE_BLUESTARLAM_1BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14930.pdf

SATO1631646903506-CERTIFICATE_BLUESTARLAM_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14927.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631646903506-CERTIFICATE_BLUESTARLAM_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14927.pdf

SATO1631646903525-CERTIFICATE_BLUESTARLAM_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14928.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631646903525-CERTIFICATE_BLUESTARLAM_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14928.pdf

SATO1631645497431-CERTIFICATE_AZERTY_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14818.pdf
https://orbiscompliance.s3.amazonaws.com/1631645497431-CERTIFICATE_AZERTY_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14818.pdf

SATO1631645497425-CERTIFICATE_AZERTY_4BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14820.pdf
https://orbiscompliance.s3.amazonaws.com/1631645497425-CERTIFICATE_AZERTY_4BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14820.pdf

SATO1631645497428-CERTIFICATE_AZERTY_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14819.pdf
https://orbiscompliance.s3.amazonaws.com/1631645497428-CERTIFICATE_AZERTY_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14819.pdf

SATO1631645497406-CERTIFICATE_AZERTY_1BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14871.pdf
https://orbiscompliance.s3.amazonaws.com/1631645497406-CERTIFICATE_AZERTY_1BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14871.pdf

iRobot Corporation1631564550819-Certificate Safety_IROBOT_Roomba e5_KinYat_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1631564550819-Certificate%20Safety_IROBOT_Roomba%20e5_KinYat_Brazil_2021.pdf

DURACELL1631546063874-14721D4820-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929155_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631546063874-14721D4820-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929155_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631545978828-14721D4819-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6_14Pz_1054929155_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631545978828-14721D4819-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6_14Pz_1054929155_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631545879866-14721D4818-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929174_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631545879866-14721D4818-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929174_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631545787636-14721D4817-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6Pz_1054929156_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631545787636-14721D4817-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6Pz_1054929156_INSPEC-UVA_Mexico_2021.pdf

Kingston1631542119243-Dictamen Técnico_KINGSTON_Headsets_NOM-218-SCFI-2017_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631542119243-Dictamen%20Te%CC%81cnico_KINGSTON_Headsets_NOM-218-SCFI-2017_NYCE_Mexico_2021.pdf

Kingston1631542092750-Dictamen Técnico_KINGSTON_Adapters_NOM-218-SCFI-2017_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631542092750-Dictamen%20Te%CC%81cnico_KINGSTON_Adapters_NOM-218-SCFI-2017_NYCE_Mexico_2021.pdf

KINGSTON1631538336727-CERTIFICATE_DICTAMEN_KINGSTON_ADAPTERS_CF001WA,HXS-HSCFX-WA1,CS002-WA,HXS-HSCFS-WA1,CL002WA,HXS-HSDG2_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC CEDT1314-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631538336727-CERTIFICATE_DICTAMEN_KINGSTON_ADAPTERS_CF001WA%2CHXS-HSCFX-WA1%2CCS002-WA%2CHXS-HSCFS-WA1%2CCL002WA%2CHXS-HSDG2_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC%20CEDT1314-21.pdf

KINGSTON1631538304404-CERTIFICATE_DICTAMEN_KINGSTON_HEADSETS_CEB002,CF001,HX-HSCFX-BK:WW,CS002,CLOUD FLIGHT S,CL002,HX-HSCF-BK_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC CEDT1313-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631538304404-CERTIFICATE_DICTAMEN_KINGSTON_HEADSETS_CEB002%2CCF001%2CHX-HSCFX-BK%3AWW%2CCS002%2CCLOUD%20FLIGHT%20S%2CCL002%2CHX-HSCF-BK_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC%20CEDT1313-21.pdf

Roku1631538208090-Certificate_ROKU_3940X_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631538208090-Certificate_ROKU_3940X_TELCOR_Nicaragua_2021.pdf

KINGSTON1631538173129-CERTIFICATE_DICTAMEN_KINGSTON_ADAPTERS_CF001WA,HXS-HSCFX-WA1,CS002-WA,HXS-HSCFS-WA1,CL002WA,HXS-HSDG2_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC CEDT1314-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631538173129-CERTIFICATE_DICTAMEN_KINGSTON_ADAPTERS_CF001WA%2CHXS-HSCFX-WA1%2CCS002-WA%2CHXS-HSCFS-WA1%2CCL002WA%2CHXS-HSDG2_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC%20CEDT1314-21.pdf

SONY1631537841136-Certificate_SONY_CFI-ZCT1W A_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1631537841136-Certificate_SONY_CFI-ZCT1W%20A_TELCOR_Nicaragua_2021.pdf

DURACELL1631211706303-14721D5110-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6Pz_1054929176_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631211706303-14721D5110-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6Pz_1054929176_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631203470447-14721D5104-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6_14_30Pz_1054929375_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631203470447-14721D5104-Dictamen_Certificate_Duracell_July_Coppertop_AAA_6_14_30Pz_1054929375_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631202906797-14721D5103-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929269_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631202906797-14721D5103-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929269_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631202655142-14721D5102-Dictamen_Certificate_Duracell_July_Coppertop_AA_1&6Pz_1054929267_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1631202655142-14721D5102-Dictamen_Certificate_Duracell_July_Coppertop_AA_1%266Pz_1054929267_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631201824247-14721D4858-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929218_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631201824247-14721D4858-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929218_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631200699738-14721D4857-Dictamen_Certificate_Duracell_July_Coppertop_AAA_1Pz_1054929220_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631200699738-14721D4857-Dictamen_Certificate_Duracell_July_Coppertop_AAA_1Pz_1054929220_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631200509281-14721D4856-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929220_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631200509281-14721D4856-Dictamen_Certificate_Duracell_July_Coppertop_AA_6Pz_1054929220_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631200276618-14721D4855-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929219_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631200276618-14721D4855-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929219_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631199509001-14721D4854-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929214_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631199509001-14721D4854-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929214_INSPEC-UVA_Mexico_2021.pdf

DURACELL1631199284664-14721D4853-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929215_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631199284664-14721D4853-Dictamen_Certificate_Duracell_July_Coppertop_AA_1Pz_1054929215_INSPEC-UVA_Mexico_2021.pdf

ORACLE1631192491790-CERTIFICATE_ORACLE_7603401_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631192491790-CERTIFICATE_ORACLE_7603401_NPMX_MEXICO_2021.pdf

Roku1631192115979-CERTIFICATE_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E16142.pdf
https://orbiscompliance.s3.amazonaws.com/1631192115979-CERTIFICATE_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E16142.pdf

SATO1631108001857-Certificate NYC-2102CT3531_SATO_CT4-LX(Azerty)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631108001857-Certificate%20NYC-2102CT3531_SATO_CT4-LX%28Azerty%29_NYCE_Mexico_2021.pdf

HP1631104810355-Certificate_HyperX_CS002-WA_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631104810355-Certificate_HyperX_CS002-WA_CRC_Colombia_2021.pdf

HP1631104787613-Certificate_HyperX_CS002_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631104787613-Certificate_HyperX_CS002_CRC_Colombia_2021.pdf

HP1631104285450-Certificate_HyperX_CL002_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631104285450-Certificate_HyperX_CL002_CRC_Colombia_2021.pdf

HP1631104268556-Certificate_HyperX_CL002WA_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631104268556-Certificate_HyperX_CL002WA_CRC_Colombia_2021.pdf

Roku1631046994261-CERTIFICATE_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E16113.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631046994261-CERTIFICATE_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E16113.pdf

PORSCHE DESIGN1631042489090-Certificate_PORSCHE DESIGN_PDT60_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1631042489090-Certificate_PORSCHE%20DESIGN_PDT60_SUBTEL_Chile_2021.pdf

Lenovo1631026440404-Certificate_Lenovo_IdeaPad 3 Chrome 15IJL6_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631026440404-Certificate_Lenovo_IdeaPad%203%20Chrome%2015IJL6_Chile_SUBTEL_2021.pdf

Roku1631020523781-DICTAMEN NOM-221-SCFI-2017_Roku_3820X(3820MX)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1631020523781-DICTAMEN%20NOM-221-SCFI-2017_Roku_3820X%283820MX%29_NYCE_Mexico_2021.pdf

Roku1631020501715-DICTAMEN NOM-221-SCFI-2017_Roku_3820X(3820MX)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1631020501715-DICTAMEN%20NOM-221-SCFI-2017_Roku_3820X%283820MX%29_NYCE_Mexico_2021.pdf

Roku1630955986276-DICTAMEN NOM-218-SCFI-2017_Roku_3820X(3820MX)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630955986276-DICTAMEN%20NOM-218-SCFI-2017_Roku_3820X%283820MX%29_NYCE_Mexico_2021.pdf

Roku1630955504370-DICTAMEN NOM-196-SCFI-2016_Roku_3820X(3820MX)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1630955504370-DICTAMEN%20NOM-196-SCFI-2016_Roku_3820X%283820MX%29_NYCE_Mexico_2021.pdf

PANDUIT1630606950483-CERTIFICATE_PANDUIT_PZAEFAN,PZCFK,PZICFK-E_NOM-003_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630606950483-CERTIFICATE_PANDUIT_PZAEFAN%2CPZCFK%2CPZICFK-E_NOM-003_ANCE_MEXICO_2021.pdf

PANDUIT1630606933306-CERTIFICATE_PANDUIT_PZAEFAN,PZCFK,PZICFK-E_NOM-001_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630606933306-CERTIFICATE_PANDUIT_PZAEFAN%2CPZCFK%2CPZICFK-E_NOM-001_ANCE_MEXICO_2021.pdf

PANDUIT1630606762291-CERTIFICATE_PANDUIT_JBC311U93_NOM-196_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630606762291-CERTIFICATE_PANDUIT_JBC311U93_NOM-196_ANCE_MEXICO_2021.pdf

PANDUIT1630604267527-CERTIFICATE_PANDUIT_MULTIPLE MODELS_NOM-063_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630604267527-CERTIFICATE_PANDUIT_MULTIPLE%20MODELS_NOM-063_ANCE_MEXICO_2021.pdf

PANDUIT1630604256116-CERTIFICATE_PANDUIT_LPCA02X,LPCA08X_NOM-063_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630604256116-CERTIFICATE_PANDUIT_LPCA02X%2CLPCA08X_NOM-063_ANCE_MEXICO_2021.pdf

PANDUIT1630604209417-CERTIFICATE_PANDUIT_FOTNX06_NOM-063_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630604209417-CERTIFICATE_PANDUIT_FOTNX06_NOM-063_ANCE_MEXICO_2021.pdf

PANDUIT1630604008021-CERTIFICATE_PANDUIT_EF001_NOM-016_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630604008021-CERTIFICATE_PANDUIT_EF001_NOM-016_ANCE_MEXICO_2021.pdf

PANDUIT1630603889633-CERTIFICATE_PANDUIT_ACD01_NOM-064_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630603889633-CERTIFICATE_PANDUIT_ACD01_NOM-064_ANCE_MEXICO_2021.pdf

PANDUIT1630603850046-CERTIFICATE_PANDUIT_ACD01_NOM-031_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630603850046-CERTIFICATE_PANDUIT_ACD01_NOM-031_ANCE_MEXICO_2021.pdf

PANDUIT1630603092211-CERTIFICATE_PANDUIT_1156_NOM-218_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630603092211-CERTIFICATE_PANDUIT_1156_NOM-218_ANCE_MEXICO_2021.pdf

PANDUIT1630603060680-CERTIFICATE_PANDUIT_1156_NOM-016_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630603060680-CERTIFICATE_PANDUIT_1156_NOM-016_ANCE_MEXICO_2021.pdf

PANDUIT1630603020123-CERTIFICATE_PANDUIT_1156_NOM-196_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630603020123-CERTIFICATE_PANDUIT_1156_NOM-196_ANCE_MEXICO_2021.pdf

PANDUIT1630602996371-CERTIFICATE_PANDUIT_1156_NOM-001_ANCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630602996371-CERTIFICATE_PANDUIT_1156_NOM-001_ANCE_MEXICO_2021.pdf

ORACLE1630599361998-CERTIFICATE_ORACLE_7603877_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630599361998-CERTIFICATE_ORACLE_7603877_NPMX_MEXICO_2021.pdf

ORACLE1630599350363-CERTIFICATE_ORACLE_7600559_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630599350363-CERTIFICATE_ORACLE_7600559_NPMX_MEXICO_2021.pdf

ORACLE1630599344811-CERTIFICATE_ORACLE_7115948_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630599344811-CERTIFICATE_ORACLE_7115948_NPMX_MEXICO_2021.pdf

ORACLE1630594856319-CERTIFICATE_ORACLE_7603728_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594856319-CERTIFICATE_ORACLE_7603728_NPMX_MEXICO_2021.pdf

ORACLE1630594849362-CERTIFICATE_ORACLE_7601652_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594849362-CERTIFICATE_ORACLE_7601652_NPMX_MEXICO_2021.pdf

ORACLE1630594841461-CERTIFICATE_ORACLE_7601087_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594841461-CERTIFICATE_ORACLE_7601087_NPMX_MEXICO_2021.pdf

ORACLE1630594828856-CERTIFICATE_ORACLE_7600799_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594828856-CERTIFICATE_ORACLE_7600799_NPMX_MEXICO_2021.pdf

ORACLE1630594818508-CERTIFICATE_ORACLE_7600634_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594818508-CERTIFICATE_ORACLE_7600634_NPMX_MEXICO_2021.pdf

ORACLE1630594808740-CERTIFICATE_ORACLE_7120709_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594808740-CERTIFICATE_ORACLE_7120709_NPMX_MEXICO_2021.pdf

ORACLE1630594796367-CERTIFICATE_ORACLE_7120708_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594796367-CERTIFICATE_ORACLE_7120708_NPMX_MEXICO_2021.pdf

ORACLE1630594780807-CERTIFICATE_ORACLE_7120707_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594780807-CERTIFICATE_ORACLE_7120707_NPMX_MEXICO_2021.pdf

ORACLE1630594765505-CERTIFICATE_ORACLE_7120706_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594765505-CERTIFICATE_ORACLE_7120706_NPMX_MEXICO_2021.pdf

ORACLE1630594739860-CERTIFICATE_ORACLE_7120703_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594739860-CERTIFICATE_ORACLE_7120703_NPMX_MEXICO_2021.pdf

ORACLE1630594726661-CERTIFICATE_ORACLE_7120703_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594726661-CERTIFICATE_ORACLE_7120703_NPMX_MEXICO_2021.pdf

ORACLE1630594712681-CERTIFICATE_ORACLE_7120702_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594712681-CERTIFICATE_ORACLE_7120702_NPMX_MEXICO_2021.pdf

ORACLE1630594687874-CERTIFICATE_ORACLE_7119635_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594687874-CERTIFICATE_ORACLE_7119635_NPMX_MEXICO_2021.pdf

ORACLE1630594667958-CERTIFICATE_ORACLE_7119634_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594667958-CERTIFICATE_ORACLE_7119634_NPMX_MEXICO_2021.pdf

ORACLE1630594649688-CERTIFICATE_ORACLE_7119631_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594649688-CERTIFICATE_ORACLE_7119631_NPMX_MEXICO_2021.pdf

ORACLE1630594628804-CERTIFICATE_ORACLE_7119628_NPMX_MEXICO_2021..pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594628804-CERTIFICATE_ORACLE_7119628_NPMX_MEXICO_2021..pdf

ORACLE1630594134420-CERTIFICATE_ORACLE_7119320_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630594134420-CERTIFICATE_ORACLE_7119320_NPMX_MEXICO_2021.pdf

ORACLE1630593525008-CERTIFICATE_ORACLE_7115948_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630593525008-CERTIFICATE_ORACLE_7115948_NPMX_MEXICO_2021.pdf

ORACLE1630593427655-NOR21130AE0036 MODELO 760634.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630593427655-NOR21130AE0036%20MODELO%20760634.pdf

iRobot Corporation1630591164354-AUDIT REPORT_AMAZING_POT_BRAZIL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630591164354-AUDIT%20REPORT_AMAZING_POT_BRAZIL_2021.pdf

iRobot Corporation1630591146059-AUDIT REPORT_AMAZING_ED_BRAZIL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630591146059-AUDIT%20REPORT_AMAZING_ED_BRAZIL_2021.pdf

SATO1630585683829-CERTIFICATE_SATO_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14287.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630585683829-CERTIFICATE_SATO_ML-CHG6-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14287.pdf

SATO1630585674793-CERTIFICATE_SATO_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14275.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630585674793-CERTIFICATE_SATO_ML-CHG1-01_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14275.pdf

SATO1630585666020-CERTIFICATE_SATO_4BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14277.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630585666020-CERTIFICATE_SATO_4BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14277.pdf

SATO1630585651249-CERTIFICATE_SATO_1BAY CHARGING CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14270.pdf
https://orbiscompliance.s3.amazonaws.com/1630585651249-CERTIFICATE_SATO_1BAY%20CHARGING%20CRADLE_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E14270.pdf

iRobot Corporation1630508936672-IBAMA Autorizacation_iRobot_Roomba S9+_Brazil_2021.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630508936672-IBAMA%20Autorizacation_iRobot_Roomba%20S9%2B_Brazil_2021.html

BTL1630503048524-Certificate_RAZER_RZ01-0413_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1630503048524-Certificate_RAZER_RZ01-0413_INSPEC-UVA_Mexico_2021.pdf

DURACELL1630353231394-Cert. 301-03271_Duracell_9V_Malaysia_INTI_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630353231394-Cert.%20301-03271_Duracell_9V_Malaysia_INTI_Argentina_2021.pdf

SONY1630328304639-Certificate_SONY_CFI-1115A_CONATEL_Honduras_2021.PDF
https://orbiscompliance.s3.amazonaws.com/1630328304639-Certificate_SONY_CFI-1115A_CONATEL_Honduras_2021.PDF

Roku1630100868371-DICTAMEN_CERTIFICATE_ROKU_3820X (3820MX)_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC CEDT1233-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630100868371-DICTAMEN_CERTIFICATE_ROKU_3820X%20%283820MX%29_NOM-016-SCFI-1993_NYCE_MEXICO_2021_____NYC%20CEDT1233-21.pdf

Roku1630100859781-DICTAMEN_CERTIFICATE_ROKU_3820X (3820MX)_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC CEDT1235-21.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630100859781-DICTAMEN_CERTIFICATE_ROKU_3820X%20%283820MX%29_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC%20CEDT1235-21.pdf

STONERIDGE1630089133913-Certificate_Stoneridge_SM100_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630089133913-Certificate_Stoneridge_SM100_URSEC_Uruguay_2021.pdf

Roku1630071274070-NOM-208 Certificate_Roku_3820X(3820MX)_NPMX_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630071274070-NOM-208%20Certificate_Roku_3820X%283820MX%29_NPMX_Mexico_2021.pdf

PANDUIT1630071269006-Certificate_PANDUIT_EF001_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1630071269006-Certificate_PANDUIT_EF001_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1630071251595-Certificate_PANDUIT_ACA01_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1630071251595-Certificate_PANDUIT_ACA01_INSPEC-UVA_Mexico_2021.pdf

CASA1629922704871-Certificate_CASA SYSTEMS_LTE-1006-07_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629922704871-Certificate_CASA%20SYSTEMS_LTE-1006-07_INSPEC-UVA_Mexico_2021.pdf

NEDAP1629917691922-Certificate_Nedap_VP8002-VP4102_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629917691922-Certificate_Nedap_VP8002-VP4102_NYCE_Mexico_2021.pdf

iRobot Corporation1629916659009-Certificate_iRobot_AXE-Y1; RMA-Y1; RVA-Y2; RVB-Y2_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629916659009-Certificate_iRobot_AXE-Y1%3B%20RMA-Y1%3B%20RVA-Y2%3B%20RVB-Y2_NYCE_Mexico_2021.pdf

DURACELL1629838499881-Cert. 301-03271_Duracell_9V_Malaysia_INTI_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629838499881-Cert.%20301-03271_Duracell_9V_Malaysia_INTI_Argentina_2021.pdf

DURACELL1629838425301-Cert. 301-03271_Duracell_9V_Malaysia_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629838425301-Cert.%20301-03271_Duracell_9V_Malaysia_Argentina_2021.pdf

NEDAP1629815813494-Certificate_Nedap_VP8002_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629815813494-Certificate_Nedap_VP8002_NYCE_Mexico_2021.pdf

NEDAP1629815743679-Certificate_Nedap_VP4102_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629815743679-Certificate_Nedap_VP4102_NYCE_Mexico_2021.pdf

NEDAP1629739190483-CERTIFICATE_EXTENSION_LA FORTALEZA_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E13791.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629739190483-CERTIFICATE_EXTENSION_LA%20FORTALEZA_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E13791.pdf

NEDAP1629739181610-CERTIFICATE_EXTENSION_EAS SYSTEMS_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E13790.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629739181610-CERTIFICATE_EXTENSION_EAS%20SYSTEMS_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E13790.pdf

HP1629727040330-Certificate_HP_CL004 (CL004WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629727040330-Certificate_HP_CL004%20%28CL004WA%29_INSPEC-UVA_Mexico_2021.pdf

BOSCH1629722382314-Certificate_BOSCH_D-tect 200 C_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629722382314-Certificate_BOSCH_D-tect%20200%20C_ASEP_Panama_2021.pdf

HP1629488277915-Certificate_HP_PF002 (PF002WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629488277915-Certificate_HP_PF002%20%28PF002WA%29_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1629472013786-Certificate_KINGSTON_PF002 (PF002WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629472013786-Certificate_KINGSTON_PF002%20%28PF002WA%29_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402712549-Certificate_SYNAPSENSE_1156_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402712549-Certificate_SYNAPSENSE_1156_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402571988-Certificate_PANDUIT_PZICFK-E_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402571988-Certificate_PANDUIT_PZICFK-E_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402375886-Certificate_PANDUIT_PZCFK_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402375886-Certificate_PANDUIT_PZCFK_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402310989-Certificate_PANDUIT_PZAEFAN_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402310989-Certificate_PANDUIT_PZAEFAN_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402284215-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402284215-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402230714-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402230714-Certificate_PANDUIT_JBC311U93_INSPEC-UVA_Mexico_2021.pdf

PANDUIT1629402118523-Certificate_PANDUIT_UPS00100DC_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629402118523-Certificate_PANDUIT_UPS00100DC_INSPEC-UVA_Mexico_2021.pdf

DURACELL1629382108792-21147CC000631_Duracell_OPTIMUM_AA_USA_2_4_6_12_Pz_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629382108792-21147CC000631_Duracell_OPTIMUM_AA_USA_2_4_6_12_Pz_UVA_Mexico_2021.pdf

DURACELL1629382034301-21147CC000633_Duracell_OPTIMUM_AAA_Belgium_2_4_6_12_Pz_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629382034301-21147CC000633_Duracell_OPTIMUM_AAA_Belgium_2_4_6_12_Pz_UVA_Mexico_2021.pdf

DURACELL1629381805462-21147CC000632_Duracell_OPTIMUM_AA_Belgium_2_4_6_12_Pz_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629381805462-21147CC000632_Duracell_OPTIMUM_AA_Belgium_2_4_6_12_Pz_UVA_Mexico_2021.pdf

ROKU1629313115971-Certificate_Roku_3940X_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629313115971-Certificate_Roku_3940X_ENACOM_Argentina_2021.pdf

SATO1629301769693-Certificate_SATO_CT4-LX(Bluestarlam)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629301769693-Certificate_SATO_CT4-LX%28Bluestarlam%29_IFT_Mexico_2021.pdf

SATO1629301764133-Certificate_SATO_CT4-LX(Bluestarlam)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629301764133-Certificate_SATO_CT4-LX%28Bluestarlam%29_IFT_Mexico_2021.pdf

INDUSTRIAL SCIENTIFIC1629300692114-Certificate_Industrial Scientific_RGX Gateway_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629300692114-Certificate_Industrial%20Scientific_RGX%20Gateway_ENACOM_Argentina_2021.pdf

BOSCH1629209201072-Certificate_BOSCH_GLM 50-27 CG_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629209201072-Certificate_BOSCH_GLM%2050-27%20CG_ATT_Bolivia_2021.pdf

BOSCH1629136030996-Certificate_BOSCH_GLM 50-27 CG_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629136030996-Certificate_BOSCH_GLM%2050-27%20CG_ASEP_Panama_2021.pdf

INDUSTRIAL SCIENTIFIC1629122466962-Certificate_Industrial Scientific_Ventis Pro 5_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1629122466962-Certificate_Industrial%20Scientific_Ventis%20Pro%205_ENACOM_Argentina_2021.pdf

STONERIDGE1629116600279-Certificate_Stoneridge_SM100_ARCOTEL_Ecuador_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1629116600279-Certificate_Stoneridge_SM100_ARCOTEL_Ecuador_2021.pdf

GOLD PEAK1628889083064-Digital Certificate-GPI-15A&24A-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628889083064-Digital%20Certificate-GPI-15A%2624A-Intertek-Colombia-2021.pdf

DURACELL1628881303241-Digital Certificate-DURACELL-OptimumAA&AAA-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628881303241-Digital%20Certificate-DURACELL-OptimumAA%26AAA-Intertek-Colombia-2021.pdf

Cradlepoint1628864274437-NOM-208 Certificate_Cradlepoint_S5A749A_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1628864274437-NOM-208%20Certificate_Cradlepoint_S5A749A_NYCE_Mexico_2021.pdf

ROKU1628774425983-Certificate_Roku_3820X (3820MX)_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628774425983-Certificate_Roku_3820X%20%283820MX%29_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

ROKU1628774370236-Certificate_Roku_3820X (3820MX)_INSPEC-UVA_Mexico_2021 (China).pdf
https://orbiscompliance.s3.amazonaws.com/1628774370236-Certificate_Roku_3820X%20%283820MX%29_INSPEC-UVA_Mexico_2021%20%28China%29.pdf

Stoneridge1628695652325-Certificate_Stoneridge_SM100_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1628695652325-Certificate_Stoneridge_SM100_ENACOM_Argentina_2021.pdf

TELEFONICA DE ARGENTINA S.A.1628611285783-CONSTANCIA DE PRESENTACION PERMISO COMERC_TELEFONICA_WB24M12FA_R_WB18U12FA_R_LEALTAD COMERCIAL_ARGENTINA 2021_____CE-2021-72606217-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628611285783-CONSTANCIA%20DE%20PRESENTACION%20PERMISO%20COMERC_TELEFONICA_WB24M12FA_R_WB18U12FA_R_LEALTAD%20COMERCIAL_ARGENTINA%202021_____CE-2021-72606217-APN-DNRT%23MDP.pdf

SONY1628600350576-Certificate_SONY_CFI-1115B_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628600350576-Certificate_SONY_CFI-1115B_CONATEL_Honduras_2021.pdf

Lenovo1628598909887-Second Certificate Update_Lenovo_Yoga Slim 7 Pro 14ACH5_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628598909887-Second%20Certificate%20Update_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5_SUBTEL_Chile_2021.pdf

Lenovo1628597627972-Third Certificate Update_Lenovo_Yoga Slim 7 Pro 14ACH5 O_SUBTEL_Chile_2021.pdf.pdf
https://orbiscompliance.s3.amazonaws.com/1628597627972-Third%20Certificate%20Update_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5%20O_SUBTEL_Chile_2021.pdf.pdf

ORACLE1628539910924-CONSTANCIA DE PRESENTACION PERMISO COMERC._ORACLE ARGENTINA_MICROS WORKSTATION 6 ADJ STAND_LEALTAD COMERCIAL_ARGENTINA 2021_____CE-2021-72174543-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628539910924-CONSTANCIA%20DE%20PRESENTACION%20PERMISO%20COMERC._ORACLE%20ARGENTINA_MICROS%20WORKSTATION%206%20ADJ%20STAND_LEALTAD%20COMERCIAL_ARGENTINA%202021_____CE-2021-72174543-APN-DNRT%23MDP.pdf

DURACELL1628539179217-14721D4651-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494971_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628539179217-14721D4651-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494971_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628539105479-14721D4650-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494973_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628539105479-14721D4650-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494973_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628539051624-14721D4649-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494972_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628539051624-14721D4649-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494972_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538979061-14721D4648-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494970_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538979061-14721D4648-Dictamen_Certificate_Duracell_June_Coppertop_D_2Pz_1101494970_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538904576-14721D4413-Dictamen_Certificate_Duracell_June_Coppertop_AAA_1Pz_1054929119_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538904576-14721D4413-Dictamen_Certificate_Duracell_June_Coppertop_AAA_1Pz_1054929119_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538844178-14721D4412-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929116_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538844178-14721D4412-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929116_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538783927-14721D4411-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929117_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538783927-14721D4411-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929117_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538667899-14721D4299-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929079_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538667899-14721D4299-Dictamen_Certificate_Duracell_June_Coppertop_AA_1Pz_1054929079_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538601139-14721D4298-Dictamen_Certificate_Duracell_June_Coppertop_AA_6Pz_18Pz_1054929084_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538601139-14721D4298-Dictamen_Certificate_Duracell_June_Coppertop_AA_6Pz_18Pz_1054929084_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538539315-14721D4297-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_1054929084_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538539315-14721D4297-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_1054929084_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538478871-14721D4296-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_1054929077_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538478871-14721D4296-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_1054929077_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538415949-14721D4295-Dictamen_Certificate_Duracell_June_Coppertop_AA_6Pz_1054929077_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538415949-14721D4295-Dictamen_Certificate_Duracell_June_Coppertop_AA_6Pz_1054929077_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538353761-14721D4294-Dictamen_Certificate_Duracell_June_Coppertop_AAA_1Pz_6Pz_14Pz_1054929078_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538353761-14721D4294-Dictamen_Certificate_Duracell_June_Coppertop_AAA_1Pz_6Pz_14Pz_1054929078_INSPEC-UVA_Mexico_2021.pdf

DURACELL1628538281745-14721D4293-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_30Pz_1054929092_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628538281745-14721D4293-Dictamen_Certificate_Duracell_June_Coppertop_AAA_6Pz_30Pz_1054929092_INSPEC-UVA_Mexico_2021.pdf

ORACLE1628536936511-CERTIFICATE_ORACLE_MICROS WORKSTATION 6 ADJ. STAND_IEC 62368-1,2014(Ed.2.0)_ARGENTINA_2021_____CSE-IACSA-O6-002.1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628536936511-CERTIFICATE_ORACLE_MICROS%20WORKSTATION%206%20ADJ.%20STAND_IEC%2062368-1%2C2014%28Ed.2.0%29_ARGENTINA_2021_____CSE-IACSA-O6-002.1.pdf

Lenovo1628530630252-Certificate_Lenovo_ ThinkBook 15P G2 ITH_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628530630252-Certificate_Lenovo_%20ThinkBook%2015P%20G2%20ITH_SUBTEL_Chile_2021.pdf

BTL1628523151663-CERTIFICATE_RAZER_382_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12972.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628523151663-CERTIFICATE_RAZER_382_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12972.pdf

BTL1628523131304-CERTIFICATE_RAZER_383_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12946.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628523131304-CERTIFICATE_RAZER_383_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12946.pdf

KINGSTON1628509225062-CERTIFICATE_KINGSTON_SXS2000:2000G,SXS2000:1000G,SXS2000:500G_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12931.pdf
https://orbiscompliance.s3.amazonaws.com/1628509225062-CERTIFICATE_KINGSTON_SXS2000%3A2000G%2CSXS2000%3A1000G%2CSXS2000%3A500G_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12931.pdf

CASA SYSTEMS1628161671840-CERTIFICATE_CASA SYSTEMS_COMERCIALIZADORA TANGO_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12430.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628161671840-CERTIFICATE_CASA%20SYSTEMS_COMERCIALIZADORA%20TANGO_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12430.pdf

CASA SYSTEMS1628161657492-CERTIFICATE_CASA SYSTEMS_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12119.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628161657492-CERTIFICATE_CASA%20SYSTEMS_LTE-2007-04_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12119.pdf

BTL1628160489412-CERTIFICATE_OJD_OJD-53_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12158.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628160489412-CERTIFICATE_OJD_OJD-53_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12158.pdf

ROKU1628158291546-CERTIFICATE_ROKU_ADS-65CJ-12-2 12060E_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E12910.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628158291546-CERTIFICATE_ROKU_ADS-65CJ-12-2%2012060E_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E12910.pdf

ROKU1628158274416-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E12904.pdf
https://orbiscompliance.s3.amazonaws.com/1628158274416-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E12904.pdf

Industrial Scientific1628109328362-Certificate_Industrial Scientific_Radius BZ1_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628109328362-Certificate_Industrial%20Scientific_Radius%20BZ1_ENACOM_Argentina_2021.pdf

SATO1628085644296-Certificate_SATO_CLN4NX Plus & CL6NX Plus_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628085644296-Certificate_SATO_CLN4NX%20Plus%20%26%20CL6NX%20Plus_NYCE_Mexico_2021.pdf

STONERIDGE1628084594948-CertificateN21147CC000607_NOM-024-SCFI-2013-Stoneridge_SM100_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628084594948-CertificateN21147CC000607_NOM-024-SCFI-2013-Stoneridge_SM100_UVA_Mexico_2021.pdf

STONERIDGE1628084467790-CertificateN2117000607_NOM-024-SCFI-2013-Stoneridge_SM100_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1628084467790-CertificateN2117000607_NOM-024-SCFI-2013-Stoneridge_SM100_UVA_Mexico_2021.pdf

ORACLE1628023232279-CONSTANCIA DE PRESENTACION PERMISO COMERC._ORACLE ARGENTINA S.R.L_WORKSTATION_LEALTAD COMERCIAL_ARGENTINA 2021_____CE-2021-69918914-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628023232279-CONSTANCIA%20DE%20PRESENTACION%20PERMISO%20COMERC._ORACLE%20ARGENTINA%20S.R.L_WORKSTATION_LEALTAD%20COMERCIAL_ARGENTINA%202021_____CE-2021-69918914-APN-DNRT%23MDP.pdf

ORACLE1628023208064-CONSTANCIA DE VIGILANCIA_ORACLE ARGENTINA S.R.L_WORKSTATION_TUV_ARGENTINA 2021_____RA 3782353 E (R1).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628023208064-CONSTANCIA%20DE%20VIGILANCIA_ORACLE%20ARGENTINA%20S.R.L_WORKSTATION_TUV_ARGENTINA%202021_____RA%203782353%20E%20%28R1%29.pdf

SONY1628013181034-Certificate_SONY_CFI-1115B_CONATEL_Paraguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628013181034-Certificate_SONY_CFI-1115B_CONATEL_Paraguay_2021.pdf

SONY1628012302082-Certificate_SONY_CFI-1115A_CONATEL_Paraguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628012302082-Certificate_SONY_CFI-1115A_CONATEL_Paraguay_2021.pdf

BOSCH1628011721532-Certificate_BOSCH_GLM 50-27 CG_CONATEL_Paraguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628011721532-Certificate_BOSCH_GLM%2050-27%20CG_CONATEL_Paraguay_2021.pdf

Kingston1628002555072-Certificate_Kingston_CL004_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1628002555072-Certificate_Kingston_CL004_NYCE_Mexico_2021.pdf

CoC_KCTL_CCA210R_ANATEL_Brazil_20211627947749991-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1627947749991-CoC_KCTL_CCA210R_ANATEL_Brazil_2021.pdf

HP1627944931845-CoC_HP_CL004WA_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627944931845-CoC_HP_CL004WA_ANATEL_Brazil_2021.pdf

HP1627944907829-CoC_HP_CL004_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627944907829-CoC_HP_CL004_ANATEL_Brazil_2021.pdf

iRobot Corporation1627932744038-Certificate_iRobot_AXF-Y1 & RVD-Y1_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1627932744038-Certificate_iRobot_AXF-Y1%20%26%20RVD-Y1_NYCE_Mexico_2021.pdf

ROKU1627679128738-CERTIFICATE_ROKU_9102X_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E15419.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627679128738-CERTIFICATE_ROKU_9102X_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E15419.pdf

ROKU1627679112778-CERTIFICATE_ROKU_3920MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E15422.pdf
https://orbiscompliance.s3.amazonaws.com/1627679112778-CERTIFICATE_ROKU_3920MX_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E15422.pdf

Duracell1627666034137-Duracell_Test Report_OPTIMUM_AA_AAA_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627666034137-Duracell_Test%20Report_OPTIMUM_AA_AAA_Brazil_2021.pdf

Roku1627660491539-Certificate_Roku_3820X (3820MX)_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1627660491539-Certificate_Roku_3820X%20%283820MX%29_CRC_Colombia_2021.pdf

ROKU1627509744287-Validity_Notification_Roku_9102X (9102MX)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1627509744287-Validity_Notification_Roku_9102X%20%289102MX%29_NYCE_Mexico_2021.pdf

BTL1627402813054-Certificate_RAZER_382_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627402813054-Certificate_RAZER_382_NYCE_Mexico_2021.pdf

TELEFONICA DE ARGENTINA S.A.1627401875307-CERTIFICATE_TELEFONICA DE ARGENTINA S.A._WB-24M12FA, WB-24M12R, WB-18U12FA, WB-18U12R_IEC 62368-1_IRAM_Argentina_2021____DC-E-T165-012.1.pdf
https://orbiscompliance.s3.amazonaws.com/1627401875307-CERTIFICATE_TELEFONICA%20DE%20ARGENTINA%20S.A._WB-24M12FA%2C%20WB-24M12R%2C%20WB-18U12FA%2C%20WB-18U12R_IEC%2062368-1_IRAM_Argentina_2021____DC-E-T165-012.1.pdf

NEDAP1627301052731-CERTIFICATE_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12349.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627301052731-CERTIFICATE_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NYCE_MEXICO_2021_____NYC-2102C0E12349.pdf

DURACELL1627301012578-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12227.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627301012578-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-2018_NYCE_MEXICO_2021_____NYC-2102C0E12227.pdf

ROKU1627299898190-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU-L_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E15250.pdf
https://orbiscompliance.s3.amazonaws.com/1627299898190-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU-L_NOM-029-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E15250.pdf

BOSCH1627067094557-Certificate_BOSCH_GLM 50-27 CG_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627067094557-Certificate_BOSCH_GLM%2050-27%20CG_MTC_Peru_2021.pdf

Bosch1627061493081-Certificate_BOSCH_GLM 50-27 CG_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627061493081-Certificate_BOSCH_GLM%2050-27%20CG_SUTEL_Costa%20Rica_2021.pdf

BTL1627053770608-Certificate_RAZER_383_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627053770608-Certificate_RAZER_383_NYCE_Mexico_2021.pdf

Bosch1627043201969-Certificate_Bosch_D-Tect 200 C_ARCOTEL_Ecuador_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1627043201969-Certificate_Bosch_D-Tect%20200%20C_ARCOTEL_Ecuador_2021.pdf

ROKU1627042574016-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU-L_NOM-012-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E15250.pdf
https://orbiscompliance.s3.amazonaws.com/1627042574016-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU-L_NOM-012-ENER-2017_NYCE_MEXICO_2021_____NYC-2102C0E15250.pdf

U-blox Inc.1626983288377-CoH_UBLOX_SARA-R422x_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626983288377-CoH_UBLOX_SARA-R422x_ANATEL_Brazil_2021_rev1.pdf

U-blox Inc.1626982011131-NCC_19444_21_Rev1_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626982011131-NCC_19444_21_Rev1_Orbis.pdf

Kingston1626967318494-Certificate_Kingston_CL004WA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626967318494-Certificate_Kingston_CL004WA_NYCE_Mexico_2021.pdf

DURACELL1626891504986-14721D4082-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626891504986-14721D4082-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626891430584-14721D4081-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626891430584-14721D4081-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626890620670-14721D4080-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626890620670-14721D4080-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626817823634-14721D4079-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626817823634-14721D4079-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626817732551-14721D4078-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626817732551-14721D4078-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626817316632-14721D3778-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626817316632-14721D3778-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626817145159-14721D3777-Dictamen_Certificate_Duracell_May_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626817145159-14721D3777-Dictamen_Certificate_Duracell_May_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626812631847-14721D3379-Dictamen_Certificate_Duracell_April_Quantum_AAA_4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626812631847-14721D3379-Dictamen_Certificate_Duracell_April_Quantum_AAA_4Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626812465837-14721D3378-Dictamen_Certificate_Duracell_April_Lithium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626812465837-14721D3378-Dictamen_Certificate_Duracell_April_Lithium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1626812263678-14721D3377-Dictamen_Certificate_Duracell_April_Quantum_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626812263678-14721D3377-Dictamen_Certificate_Duracell_April_Quantum_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf

Stoneridge1626717199948-Certificate_Stoneridge_SM100_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626717199948-Certificate_Stoneridge_SM100_CRC_Colombia_2021.pdf

Industrial Scientific1626701396290-Certificate_Industrial Scientific_Ventis Pro 4_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626701396290-Certificate_Industrial%20Scientific_Ventis%20Pro%204_ENACOM_Argentina_2021.pdf

SATO1626698384695-Certificate_SATO_PW208NX(Bluestarlam)_HS Code Update_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626698384695-Certificate_SATO_PW208NX%28Bluestarlam%29_HS%20Code%20Update_NYCE_Mexico_2021.pdf

iRobot Corporation1626464016267-Certificate_iRobot_AXE-Y1 & RMA-Y1_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626464016267-Certificate_iRobot_AXE-Y1%20%26%20RMA-Y1_NYCE_Mexico_2021.pdf

BOSCH1626446779429-Certificate_BOSCH_GLM 50-27 CG_INDOTEL_Dominican Republic_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626446779429-Certificate_BOSCH_GLM%2050-27%20CG_INDOTEL_Dominican%20Republic_2021.pdf

Stoneridge1626441490937-CoH_STONERIDGE_SM100_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626441490937-CoH_STONERIDGE_SM100_ANATEL_Brazil_2021.pdf

Stoneridge1626441406675-Certificado_00127405_Stoneridge_SM100_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626441406675-Certificado_00127405_Stoneridge_SM100_Brazil_2021.pdf

DURACELL1626378912433-14721D3781-Dictamen_Certificate_Duracell_May_Optimum_AAA_1, 14, 6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626378912433-14721D3781-Dictamen_Certificate_Duracell_May_Optimum_AAA_1%2C%2014%2C%206Pz_INSPEC-UVA_Mexico_2021.pdf

iRobot Corporation1626360187335-Sound Power Certificate_iRobot_Roomba S9+_ICbr_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626360187335-Sound%20Power%20Certificate_iRobot_Roomba%20S9%2B_ICbr_Brazil_2021.pdf

BOSCH1626353275796-Certificate_BOSCH_GLM 50-27 CG_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626353275796-Certificate_BOSCH_GLM%2050-27%20CG_URSEC_Uruguay_2021.pdf

BOSCH1626276308556-Certificate_BOSCH_D-tect 200 C_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626276308556-Certificate_BOSCH_D-tect%20200%20C_SUBTEL_Chile_2021.pdf

DURACELL1626195267996-NYCE6787_Duracell_9V_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626195267996-NYCE6787_Duracell_9V_NYCE_Mexico_2021.pdf

DURACELL1626195189145-NYCE6786_Duracell_10_13_312_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626195189145-NYCE6786_Duracell_10_13_312_NYCE_Mexico_2021.pdf

DURACELL1626195045588-NYCE6785_Duracell_OPTAA_OPTAAA_C_D_QUAA_QUAAA_AA_AAA_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626195045588-NYCE6785_Duracell_OPTAA_OPTAAA_C_D_QUAA_QUAAA_AA_AAA_NYCE_Mexico_2021.pdf

SONY1626101215380-Certificate_SONY_CFI.1115B_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1626101215380-Certificate_SONY_CFI.1115B_SUBTEL_Chile_2021.pdf

SONY1626100312522-Certificate_SONY_CFI-1115A__SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1626100312522-Certificate_SONY_CFI-1115A__SUBTEL_Chile_2021.pdf

BOSCH1625854994486-Certificate_BOSCH_D-tect 200 C_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625854994486-Certificate_BOSCH_D-tect%20200%20C_SUTEL_Costa%20Rica_2021.pdf

NUSKIN1625845924776-Certificate_Nuskin_A86_ENACOM_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625845924776-Certificate_Nuskin_A86_ENACOM_Argentina_2021.pdf

Panasonic1625840028821-Certificate_Panasonic_ENW89837A5KF_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625840028821-Certificate_Panasonic_ENW89837A5KF_URSEC_Uruguay_2021.pdf

U-BLOX1625779353632-CoH_UBLOX_NORA-B_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625779353632-CoH_UBLOX_NORA-B_ANATEL_Brazil_2021.pdf

CASA1625772198458-Certificate_Casa Systems_LTE-2007-04_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625772198458-Certificate_Casa%20Systems_LTE-2007-04_INSPEC-UVA_Mexico_2021.pdf

ARISTA1625770641036-CoH_ARISTA_AN1737_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625770641036-CoH_ARISTA_AN1737_ANATEL_Brazil_2021.pdf

ARISTA1625752913937-CoH_ARISTA_AN1766_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625752913937-CoH_ARISTA_AN1766_ANATEL_Brazil_2021.pdf

BOSCH1625750747891-Certificate_BOSCH_D-tect 200 C_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625750747891-Certificate_BOSCH_D-tect%20200%20C_ATT_Bolivia_2021.pdf

DURACELL1625601450748-14721D4099-Dictamen_Certificate_Duracell_May_Optimum_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625601450748-14721D4099-Dictamen_Certificate_Duracell_May_Optimum_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625601298596-14721D4098-Dictamen_Certificate_Duracell_May_Optimum_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625601298596-14721D4098-Dictamen_Certificate_Duracell_May_Optimum_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625601104835-14721D3941-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_14Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625601104835-14721D3941-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_14Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625600929834-14721D3940-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625600929834-14721D3940-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625599351765-14721D3938-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625599351765-14721D3938-Dictamen_Certificate_Duracell_May_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625599188666-14721D3937-Dictamen_Certificate_Duracell_May_Coppertop_AA_4Pz_6PZ_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625599188666-14721D3937-Dictamen_Certificate_Duracell_May_Coppertop_AA_4Pz_6PZ_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625599055205-14721D3936-Dictamen_Certificate_Duracell_May_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625599055205-14721D3936-Dictamen_Certificate_Duracell_May_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625598917191-14721D3935-Dictamen_Certificate_Duracell_May_Coppertop_AA_1PZ_4Pz_6Pz_18Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625598917191-14721D3935-Dictamen_Certificate_Duracell_May_Coppertop_AA_1PZ_4Pz_6Pz_18Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625598662757-14721D3934-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625598662757-14721D3934-Dictamen_Certificate_Duracell_May_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625598441233-14721D3933-Dictamen_Certificate_Duracell_May_Coppertop_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625598441233-14721D3933-Dictamen_Certificate_Duracell_May_Coppertop_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625598258705-14721D3932-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625598258705-14721D3932-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625598126557-14721D3931-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625598126557-14721D3931-Dictamen_Certificate_Duracell_May_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625597984678-14721D3939-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625597984678-14721D3939-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625597807932-14721D3780-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625597807932-14721D3780-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625597608914-14721D3779-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625597608914-14721D3779-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625596975734-14721D3764-Dictamen_Certificate_Duracell_May_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625596975734-14721D3764-Dictamen_Certificate_Duracell_May_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625596789017-14721D3744-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625596789017-14721D3744-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625596570681-14721D3565-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625596570681-14721D3565-Dictamen_Certificate_Duracell_May_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1625592954218-14721D3211-Dictamen_Certificate_Duracell_April_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625592954218-14721D3211-Dictamen_Certificate_Duracell_April_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

SONY1625516457103-Renewal Certificate_SONY_CUH-ZCT2U_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625516457103-Renewal%20Certificate_SONY_CUH-ZCT2U_ATT_Bolivia_2021.pdf

BOSCH1625510483282-Certificate_BOSCH_GLM 50 C_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625510483282-Certificate_BOSCH_GLM%2050%20C_ASEP_Panama_2021.pdf

ROKU1625491860607-Certifciado_ROKU_3940X_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625491860607-Certifciado_ROKU_3940X_CONATEL_Honduras_2021.pdf

ALPS ALPINE1625491581876-Certificate_21147CC000556_ALPS_ALPINE_Lykaner_4_R2_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625491581876-Certificate_21147CC000556_ALPS_ALPINE_Lykaner_4_R2_UVA_Mexico_2021.pdf

BOSCH1625488500453-Certificate_BOSCH_D-tect 200 C_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625488500453-Certificate_BOSCH_D-tect%20200%20C_URSEC_Uruguay_2021.pdf

Lenovo1625487922478-Certificate_Lenovo_IdeaPad 3 17ADA6._SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625487922478-Certificate_Lenovo_IdeaPad%203%2017ADA6._SUBTEL_Chile_2021.pdf

Lenovo1625234212054-Certificate_Lenovo_IdeaPad 3 15ADA6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625234212054-Certificate_Lenovo_IdeaPad%203%2015ADA6_SUBTEL_Chile_2021.pdf

Lenovo1625233019530-Certificate_Lenovo_IdeaPad 3 14ADA6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625233019530-Certificate_Lenovo_IdeaPad%203%2014ADA6_SUBTEL_Chile_2021.pdf

CRADLEPOINT1625230983525-Certificate_CRADLEPOINT_S5A749A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625230983525-Certificate_CRADLEPOINT_S5A749A_INSPEC-UVA_Mexico_2021.pdf

CRADLEPOINT1625230768196-Certificate_CRADLEPOINT_S5A950A_INSPEC-UVA_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625230768196-Certificate_CRADLEPOINT_S5A950A_INSPEC-UVA_2021.pdf

CRADLEPOINT1625230669683-Certificate_CRADLEPOINT_S5A033A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625230669683-Certificate_CRADLEPOINT_S5A033A_INSPEC-UVA_Mexico_2021.pdf

CRADLEPOINT1625230567612-Certificate_CRADLEPOINT_S3A749A_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625230567612-Certificate_CRADLEPOINT_S3A749A_INSPEC-UVA_Mexico_2021.pdf

Kingston1625170585945-Dictamen (4)_Kingston_Headset_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625170585945-Dictamen%20%284%29_Kingston_Headset_NYCE_Mexico_2021.pdf

Kingston1625169668607-Dictamen (3)_Kingston_Headset_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625169668607-Dictamen%20%283%29_Kingston_Headset_NYCE_Mexico_2021.pdf

Kingston1625168937782-Dictamen 2_Kingston_Headset_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625168937782-Dictamen%202_Kingston_Headset_NYCE_Mexico_2021.pdf

Kingston1625167756264-Dictamen 1_Kingston_Headset_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625167756264-Dictamen%201_Kingston_Headset_NYCE_Mexico_2021.pdf

BTL1625157206520-Certificate_OJD_OJD-53_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625157206520-Certificate_OJD_OJD-53_INSPEC-UVA_Mexico_2021.pdf

BTL1625148682311-Certificate_RAZER_RZ01-0373_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625148682311-Certificate_RAZER_RZ01-0373_IFT_Mexico_2021.pdf

SONY1625081488260-Certificate_SONY_CFI-ZCT1W_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1625081488260-Certificate_SONY_CFI-ZCT1W_ATT_Bolivia_2021.pdf

Industrial Scientific1625056130271-Certificate_Industrial Scientific_Ventis Pro 5_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1625056130271-Certificate_Industrial%20Scientific_Ventis%20Pro%205_CRC_Colombia_2021.pdf

Cradlepoint1624998136485-Certificate_Cradlepoint_S5A950A_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624998136485-Certificate_Cradlepoint_S5A950A_IFT_Mexico_2021.pdf

Makerbot1624986591560-CoC_MAKERBOT_840-0010A_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624986591560-CoC_MAKERBOT_840-0010A_ANATEL_Brazil_2021.pdf

Makerbot1624986568434-CoC_MAKERBOT_WL18MODGI_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624986568434-CoC_MAKERBOT_WL18MODGI_ANATEL_Brazil_2021.pdf

CEI1624984307435-DICTUM_CEI_LYKANER 4 R2_NOM-019-SCFI-1998_NPMX_MEXICO_2021_____NOR21130DT0026-A1.pdf
https://orbiscompliance.s3.amazonaws.com/1624984307435-DICTUM_CEI_LYKANER%204%20R2_NOM-019-SCFI-1998_NPMX_MEXICO_2021_____NOR21130DT0026-A1.pdf

BOSCH1624888237846-Certificate_BOSCH_D-TECT 200 C_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624888237846-Certificate_BOSCH_D-TECT%20200%20C_CRC_Colombia_2021.pdf

NUSKIN1624885797587-Certificate_NUSKIN_ageLOC Galvanic Spa_INVIMA_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1624885797587-Certificate_NUSKIN_ageLOC%20Galvanic%20Spa_INVIMA_Colombia_2020.pdf

CRADLEPOINT1624641729529-DICTUM_CRADLEPOINT_S5A749A, S5A950A, S5A033A, S3A749A_NOM-001-SCFI-2018, NOM-016-SCFI-1993_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624641729529-DICTUM_CRADLEPOINT_S5A749A%2C%20S5A950A%2C%20S5A033A%2C%20S3A749A_NOM-001-SCFI-2018%2C%20NOM-016-SCFI-1993_NYCE_MEXICO_2021.pdf

CRADLEPOINT1624641691885-CERTIFICATE MODIFICATION HS CODE SUBSTRACTION_POLY_CCX 400_NOM-019-SCFI-1998_NYCE_MEXICO_2021____NYC-2102C1E08409-8110C0221.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624641691885-CERTIFICATE%20MODIFICATION%20HS%20CODE%20SUBSTRACTION_POLY_CCX%20400_NOM-019-SCFI-1998_NYCE_MEXICO_2021____NYC-2102C1E08409-8110C0221.pdf

BTL1624639671914-CERTIFICATE MODIFICATION HS CODE SUBSTRACTION_POLY_CCX 400_NOM-019-SCFI-1998_NYCE_MEXICO_2021____NYC-2102C1E08409-8110C0221.pdf
https://orbiscompliance.s3.amazonaws.com/1624639671914-CERTIFICATE%20MODIFICATION%20HS%20CODE%20SUBSTRACTION_POLY_CCX%20400_NOM-019-SCFI-1998_NYCE_MEXICO_2021____NYC-2102C1E08409-8110C0221.pdf

Cradlepoint1624567330638-Dictamen Técnico_NOM-221_Cradlepoint_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624567330638-Dictamen%20Te%CC%81cnico_NOM-221_Cradlepoint_NYCE_Mexico_2021.pdf

Cradlepoint1624567015790-Dictamen Técnico_NOM-218_Cradlepoint_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624567015790-Dictamen%20Te%CC%81cnico_NOM-218_Cradlepoint_NYCE_Mexico_2021.pdf

Cradlepoint1624566677418-Dictamen Técnico_NOM-196_Cradlepoint_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624566677418-Dictamen%20Te%CC%81cnico_NOM-196_Cradlepoint_NYCE_Mexico_2021.pdf

CEI1624566003147-Certificate_CEI_Lykaner 4 R2_NPMX_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624566003147-Certificate_CEI_Lykaner%204%20R2_NPMX_Mexico_2021.pdf

IROBOT1624565119326-CERTIFICATE_IROBOT_RVA-Y1 RVA-Y2_SAFETY_TUV_CHILE_2020____E-022-0 9-0140_0000000353106.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624565119326-CERTIFICATE_IROBOT_RVA-Y1%20RVA-Y2_SAFETY_TUV_CHILE_2020____E-022-0%209-0140_0000000353106.pdf

Lenovo1624545813191-Certificate_Lenovo_Lenovo ideapad D330-10IGL_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624545813191-Certificate_Lenovo_Lenovo%20ideapad%20D330-10IGL_SUBTEL_Chile_2021.pdf

iRobot Corporation1624465707128-Safety Certificate_iRobot_Roomba s9+_ICbr_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1624465707128-Safety%20Certificate_iRobot_Roomba%20s9%2B_ICbr_Brazil_2021.pdf

Lenovo1624376920690-Second Certificate Update_Lenovo_Yoga Slim 7 Pro 14ACH5 O_SUBTEL_Chile_2021.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624376920690-Second%20Certificate%20Update_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5%20O_SUBTEL_Chile_2021.pdf.pdf

BTL1624370039803-Certificate_RAZER_RZ04-0376_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1624370039803-Certificate_RAZER_RZ04-0376_NYCE_Mexico_2021.pdf

BTL1624369231754-Certificate_RAZER_RZ04-0376_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1624369231754-Certificate_RAZER_RZ04-0376_IFT_Mexico_2021.pdf

SONY1623850579907-Certificate_SONY_CF1-ZCT1W_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623850579907-Certificate_SONY_CF1-ZCT1W_CONATEL_Honduras_2021.pdf

Kingston1623850135591-Certificate_Kingston_CL004WA_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623850135591-Certificate_Kingston_CL004WA_SUBTEL_Chile_2021.pdf

Kingston1623850123188-Certificate_Kingston_CL004_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623850123188-Certificate_Kingston_CL004_SUBTEL_Chile_2021.pdf

LENOVO1623846803158-Certificate_Lenovo_Lenovo 100e Chromebook 2nd Gen MTK 2_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623846803158-Certificate_Lenovo_Lenovo%20100e%20Chromebook%202nd%20Gen%20MTK%202_SUBTEL_Chile_2021.pdf

DURACELL1623706351680-Certificate21147CC000455_Duracell_NOM-024-SCFI-2013-CR-CHINA_INSPEC_UVA_México_2021 .pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623706351680-Certificate21147CC000455_Duracell_NOM-024-SCFI-2013-CR-CHINA_INSPEC_UVA_Me%CC%81xico_2021%20.pdf.pdf

DURACELL1623705671739-Certificate21147CC000454_Duracell_NOM-024-SCFI-2013-CR-INDONESIA_INSPEC_UVA_México_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623705671739-Certificate21147CC000454_Duracell_NOM-024-SCFI-2013-CR-INDONESIA_INSPEC_UVA_Me%CC%81xico_2021%20.pdf

DURACELL1623705531975-Certificate21147CC000453_Duracell_NOM-024-SCFI-2013-C-MN1400_INSPEC_UVA_México_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623705531975-Certificate21147CC000453_Duracell_NOM-024-SCFI-2013-C-MN1400_INSPEC_UVA_Me%CC%81xico_2021%20.pdf

DURACELL1623705398729- Certificate21147CC000452_Duracell_NOM-024-SCFI-2013-AA-DX1500_INSPEC_UVA_México_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623705398729-%20Certificate21147CC000452_Duracell_NOM-024-SCFI-2013-AA-DX1500_INSPEC_UVA_Me%CC%81xico_2021%20.pdf

DURACELL1623705040316-Certificate21147CC000451_Duracell_NOM-024-SCFI-2013-AAA-DX2400_INSPEC_UVA_México_2021 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623705040316-Certificate21147CC000451_Duracell_NOM-024-SCFI-2013-AAA-DX2400_INSPEC_UVA_Me%CC%81xico_2021%20.pdf

DURACELL1623704887384-Certificate21147CC000450_Duracell_NOM-024-SCFI-2013-AAA-MN2400_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623704887384-Certificate21147CC000450_Duracell_NOM-024-SCFI-2013-AAA-MN2400_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623704576763-Certificate21147CC000449_Duracell_NOM-024-SCFI-2013-AA-MN1500 _INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623704576763-Certificate21147CC000449_Duracell_NOM-024-SCFI-2013-AA-MN1500+_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623704423241-Certificate21147CC000448_Duracell_NOM-024-SCFI-2013-AA&AAA MN1500&MN2400 _INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623704423241-Certificate21147CC000448_Duracell_NOM-024-SCFI-2013-AA%26AAA%20MN1500%26MN2400%20_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304932-Certificate21147CC000463_Duracell_NOM-024-SCFI-2013_312_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304932-Certificate21147CC000463_Duracell_NOM-024-SCFI-2013_312_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304937-Certificate21147CC000464_Duracell_NOM-024-SCFI-2013_675_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304937-Certificate21147CC000464_Duracell_NOM-024-SCFI-2013_675_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304917-Certificate21147CC000458_Duracell_NOM-024-SCFI-2013-21:23-8LR932:A23:MN21_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304917-Certificate21147CC000458_Duracell_NOM-024-SCFI-2013-21%3A23-8LR932%3AA23%3AMN21_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304925-Certificate21147CC000460_Duracell_NOM-024-SCFI-2013_123-CR123ABU_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304925-Certificate21147CC000460_Duracell_NOM-024-SCFI-2013_123-CR123ABU_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304928-Certificate21147CC000462_Duracell_NOM-024-SCFI-2013_13_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304928-Certificate21147CC000462_Duracell_NOM-024-SCFI-2013_13_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304921-Certificate21147CC000459_Duracell_NOM-024-SCFI-2013_LR44:A76:PX76A_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304921-Certificate21147CC000459_Duracell_NOM-024-SCFI-2013_LR44%3AA76%3APX76A_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304912-Certificate21147CC000456_Duracell_NOM-024-SCFI-2013-D-MN1300_INSPEC_UVA_México_2021 .pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304912-Certificate21147CC000456_Duracell_NOM-024-SCFI-2013-D-MN1300_INSPEC_UVA_Me%CC%81xico_2021%20.pdf.pdf

DURACELL1623699304907- Certificate21147CC000461_Duracell_NOM-024-SCFI-2013_10_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304907-%20Certificate21147CC000461_Duracell_NOM-024-SCFI-2013_10_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623699304900- Certificate21147CC000457_Duracell_NOM-024-SCFI-2013-9V-MN1604_MALAYSIA_INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623699304900-%20Certificate21147CC000457_Duracell_NOM-024-SCFI-2013-9V-MN1604_MALAYSIA_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623698390011-Certificate21147CC000447_Duracell_NOM-024-SCFI-2013- AAAA-LR8D425E96 _INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623698390011-Certificate21147CC000447_Duracell_NOM-024-SCFI-2013-%20AAAA-LR8D425E96%20_INSPEC_UVA_Me%CC%81xico_2021.pdf

DURACELL1623698165698-Certificate21147CC000446_Duracell_NOM-024-SCFI-2013-N LR1MN9100 _INSPEC_UVA_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623698165698-Certificate21147CC000446_Duracell_NOM-024-SCFI-2013-N%20LR1MN9100%20_INSPEC_UVA_Me%CC%81xico_2021.pdf

iRobot Corporation1623685305663-IBAMA Autorization_iRobot_614:675_Brazil_2021 .html
https://orbiscompliance.s3.amazonaws.com/1623685305663-IBAMA%20Autorization_iRobot_614%3A675_Brazil_2021%20.html

DURACELL1623440999421-14721D3221-Dictamen_Certificate_Duracell_April_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623440999421-14721D3221-Dictamen_Certificate_Duracell_April_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623440907093-14721D3220-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623440907093-14721D3220-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623440826162-14721D3219-Dictamen_Certificate_Duracell_April_Coppertop_AAA_1&14Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623440826162-14721D3219-Dictamen_Certificate_Duracell_April_Coppertop_AAA_1%2614Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623440239622-14721D3218-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623440239622-14721D3218-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623440036309-14721D3217-Dictamen_Certificate_Duracell_April_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623440036309-14721D3217-Dictamen_Certificate_Duracell_April_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439940797-14721D3216-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439940797-14721D3216-Dictamen_Certificate_Duracell_April_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439818936-14721D3215-Dictamen_Certificate_Duracell_April_Coppertop_AA_1&4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439818936-14721D3215-Dictamen_Certificate_Duracell_April_Coppertop_AA_1%264Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439735863-14721D3214-Dictamen_Certificate_Duracell_April_Coppertop_AA_1&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439735863-14721D3214-Dictamen_Certificate_Duracell_April_Coppertop_AA_1%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439653468-14721D3213-Dictamen_Certificate_Duracell_April_Coppertop_AAA_2&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439653468-14721D3213-Dictamen_Certificate_Duracell_April_Coppertop_AAA_2%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439584279-14721D3212-Dictamen_Certificate_Duracell_April_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439584279-14721D3212-Dictamen_Certificate_Duracell_April_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439521345-14721D3210-Dictamen_Certificate_Duracell_April_Coppertop_AA_6&30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439521345-14721D3210-Dictamen_Certificate_Duracell_April_Coppertop_AA_6%2630Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439445163-14721D3209-Dictamen_Certificate_Duracell_April_Coppertop_AAA_1&30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439445163-14721D3209-Dictamen_Certificate_Duracell_April_Coppertop_AAA_1%2630Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439351930-14721D3208-Dictamen_Certificate_Duracell_April_Coppertop_AA_30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439351930-14721D3208-Dictamen_Certificate_Duracell_April_Coppertop_AA_30Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439266421-14721D2342-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439266421-14721D2342-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439188532-14721D2341-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439188532-14721D2341-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439108803-14721D2340-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439108803-14721D2340-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623439024475-14721D2339-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623439024475-14721D2339-Dictamen_Certificate_Duracell_April_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1623438569552-14721D1741-Dictamen_Certificate_Duracell_March_HPL123_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623438569552-14721D1741-Dictamen_Certificate_Duracell_March_HPL123_1Pz_INSPEC-UVA_Mexico_2021.pdf

Lenovo1623417243325-Certificate_Lenovo_Yoga Slim 7 Pro 14ACH5 OD_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623417243325-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5%20OD_SUBTEL_Chile_2021.pdf

Lenovo1623416693755-Certificate_Lenovo_Yoga Slim 7 Pro 14ACH5 D_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623416693755-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5%20D_SUBTEL_Chile_2021.pdf

Lenovo1623415953244-Second Certificate Update_Lenovo_IdeaPad 3 17ALC6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1623415953244-Second%20Certificate%20Update_Lenovo_IdeaPad%203%2017ALC6_SUBTEL_Chile_2020.pdf

LOGITECH1623352253169-EXT-2021-1344 BT-ARG 4082272 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623352253169-EXT-2021-1344%20BT-ARG%204082272%20%28R1%29-signed.pdf

iRobot Corporation1623336484089-IBAMA Autorization_iRobot_Roombai7+_Brazil_2021.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623336484089-IBAMA%20Autorization_iRobot_Roombai7%2B_Brazil_2021.html

iRobot Corporation1623336426079-IBAMA Autorization_iRobot_Roomba 621:677:e5_Brazil_2021.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623336426079-IBAMA%20Autorization_iRobot_Roomba%20621%3A677%3Ae5_Brazil_2021.html

iRobot Corporation1623335143240-AUDIT REPORT_Huizhou BYD_iRobot_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623335143240-AUDIT%20REPORT_Huizhou%20BYD_iRobot_Brazil_2021.pdf

iRobot Corporation1623333720499-Safety Certificate_iRobot_960_ICbr_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623333720499-Safety%20Certificate_iRobot_960_ICbr_Brazil_2021.pdf

BOSCH1623251280393-Certificate_BOSCH_GLL 3-80 CG_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623251280393-Certificate_BOSCH_GLL%203-80%20CG_URSEC_Uruguay_2021.pdf

DURACELL1623190263820-Certificate-301-02666_Duracell_AAA_INTI_Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623190263820-Certificate-301-02666_Duracell_AAA_INTI_Argentina_2021.pdf

BTL1623070271837-Certificate_RAZER_382 & 382C_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623070271837-Certificate_RAZER_382%20%26%20382C_INSPEC-UVA_Mexico_2021.pdf

BTL1623069983729-Certificate_RAZER_382 & 382C_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1623069983729-Certificate_RAZER_382%20%26%20382C_INSPEC-UVA_Mexico_2021.pdf

BTL1623069857258-Certificate_RAZER_382 & 382C_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1623069857258-Certificate_RAZER_382%20%26%20382C_INSPEC-UVA_Mexico_2021.pdf

iRobot Corporation1622740153515-Safety Certificate_ iRobot_RMA-Y1_ICbr_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622740153515-Safety%20Certificate_%20iRobot_RMA-Y1_ICbr_Brazil_2021.pdf

Duracell1622737443114-Certificate_Duracell_CEF14_VyC_México_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622737443114-Certificate_Duracell_CEF14_VyC_Me%CC%81xico_2021.pdf

Duracell1622737434369-Certificate_Duracell_CEF14_VyC_México_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622737434369-Certificate_Duracell_CEF14_VyC_Me%CC%81xico_2021.pdf

BOSCH1622734666632-Certificate_BOSCH_D-tect 200 C_INDOTEL_Dominican Republic_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622734666632-Certificate_BOSCH_D-tect%20200%20C_INDOTEL_Dominican%20Republic_2021.pdf

LENOVO1622638074622-Certificate Update_Lenovo_TP00117E_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622638074622-Certificate%20Update_Lenovo_TP00117E_Chile_SUBTEL_2021.pdf

Roku1622637263793-Certificate_Roku_3940X_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622637263793-Certificate_Roku_3940X_SUBTEL_Chile_2021.pdf

SATO1622577588756-Certificate_SATO_CT4-LX(Bluestarlam)_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622577588756-Certificate_SATO_CT4-LX%28Bluestarlam%29_NYCE_Mexico_2021.pdf

ARISTA1622488015566-CoC_ARISTA_AN1766_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622488015566-CoC_ARISTA_AN1766_ANATEL_Brazil_2021.pdf

ARISTA1622487994772-CoC_ARISTA_AN1736_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622487994772-CoC_ARISTA_AN1736_ANATEL_Brazil_2021.pdf

KINGSTON1622483518607-CoC_KINGSTON_ChargePlayBase_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622483518607-CoC_KINGSTON_ChargePlayBase_ANATEL_Brazil_2021.pdf

ROKU1622465744347-Certificate_ROKU_3940X_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622465744347-Certificate_ROKU_3940X_ASEP_Panama_2021.pdf

1622234479839-CERTIFICATE_BTL_POLY_CCX 400_NOM-019-SCFI-1998_NYCE_MEXICO_2021_NYC-2102C0E08409.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622234479839-CERTIFICATE_BTL_POLY_CCX%20400_NOM-019-SCFI-1998_NYCE_MEXICO_2021_NYC-2102C0E08409.pdf

ROKU1622204430214-Certificate_Rku_940X (3940MX)_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622204430214-Certificate_Rku_940X%20%283940MX%29_MTC_Peru_2021.pdf

Lenovo1622151801509-Certificate_Lenovo_Legion S7 15ACH6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622151801509-Certificate_Lenovo_Legion%20S7%2015ACH6_SUBTEL_Chile_2021.pdf

Lenovo1622151800953-Certificate_Lenovo_Legion S7 15ACH6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622151800953-Certificate_Lenovo_Legion%20S7%2015ACH6_SUBTEL_Chile_2021.pdf

KINGSTONE1622143471824-Certificate_KINGSTON_CL004 (CL004WA)_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622143471824-Certificate_KINGSTON_CL004%20%28CL004WA%29_INSPEC-UVA_Mexico_2021.pdf

Lenovo1622122641355-Certificate Update_Lenovo_IdeaPad 3 17ITL6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1622122641355-Certificate%20Update_Lenovo_IdeaPad%203%2017ITL6_SUBTEL_Chile_2020.pdf

Lenovo1622118139375-Certificate_Lenovo_ThinkBook 13x ITG_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1622118139375-Certificate_Lenovo_ThinkBook%2013x%20ITG_Chile_SUBTEL_2021.pdf

NEDAP1621968410063-Certificate_NEDAP_VP4201_ENACOM_Argentina_2021..pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621968410063-Certificate_NEDAP_VP4201_ENACOM_Argentina_2021..pdf

RAZER1621964486371-Certificate_RAZER_RZ04-0380_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621964486371-Certificate_RAZER_RZ04-0380_SUBTEL_Chile_2021.pdf

BOSCH1621964292830-Certificate_BOSCH_D-tect 200 C_INDOTEL_Dominican Republic_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621964292830-Certificate_BOSCH_D-tect%20200%20C_INDOTEL_Dominican%20Republic_2021.pdf

ARISTA1621882791563-CoH_ARISTA_AN1764_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621882791563-CoH_ARISTA_AN1764_ANATEL_Brazil_2021.pdf

RAZER1621879244386-Certificate_RAZER_RC30-0380_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621879244386-Certificate_RAZER_RC30-0380_SUBTEL_Chile_2021.pdf

NUSKIN1621865609371-Certificate_NUSKIN_ageLOC Galvanic Body Spa_INVIMA_Colombia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621865609371-Certificate_NUSKIN_ageLOC%20Galvanic%20Body%20Spa_INVIMA_Colombia_2021.pdf

CRICUT1621860590522-Certificate_CRICUT_CXPL203_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621860590522-Certificate_CRICUT_CXPL203_TELCOR_Nicaragua_2021.pdf

DURACELL1621545206780-Certificate_301-02671_Duracell_AAA_INTI_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621545206780-Certificate_301-02671_Duracell_AAA_INTI_Argentina_2021.pdf

ORACLE1621544766572-CERTIFICATE HSE DICTUM_HEWLETT-PACKARD_HSTNS-2141_NOM-019-SCFI-1998_NPMX_MEXICO_2021__NOR21130C0012.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621544766572-CERTIFICATE%20HSE%20DICTUM_HEWLETT-PACKARD_HSTNS-2141_NOM-019-SCFI-1998_NPMX_MEXICO_2021__NOR21130C0012.pdf

ROKU1621540202268-Certificate_ROKU_3940X_SIT_Guatemala_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621540202268-Certificate_ROKU_3940X_SIT_Guatemala_2021.pdf

ROKU1621540153075-Certificate_ROKU_3940X_SIGET_El Salvador_2021.PDF
https://orbiscompliance.s3.amazonaws.com/1621540153075-Certificate_ROKU_3940X_SIGET_El%20Salvador_2021.PDF

KINGSTON1621536912729-CoC_KINGSTON_CL002WA_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912729-CoC_KINGSTON_CL002WA_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912722-CoC_KINGSTON_CF001_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912722-CoC_KINGSTON_CF001_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912725-CoC_KINGSTON_CL002_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912725-CoC_KINGSTON_CL002_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912720-CoC_KINGSTON_HXS-HSCFS-WA1_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912720-CoC_KINGSTON_HXS-HSCFS-WA1_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912718-CoC_KINGSTON_CS002_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912718-CoC_KINGSTON_CS002_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912712-CoC_KINGSTON_CS002-WA_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912712-CoC_KINGSTON_CS002-WA_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912716-CoC_KINGSTON_CF001WA_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912716-CoC_KINGSTON_CF001WA_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621536912692-CoC_KINGSTON_Cloud Flight S_ANATEL_Brazil_2021_rev1.pdf
https://orbiscompliance.s3.amazonaws.com/1621536912692-CoC_KINGSTON_Cloud%20Flight%20S_ANATEL_Brazil_2021_rev1.pdf

KINGSTON1621523186444-Certificate_Kingston_HXS-HSDG2_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621523186444-Certificate_Kingston_HXS-HSDG2_IFT_Mexico_2021.pdf

GOLD PEAK1621445348219-Certificate-GPI-15A&24A-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621445348219-Certificate-GPI-15A%2624A-Intertek-Colombia-2021.pdf

GOLD PEAK1621445334615-Certificate-GPI-15A&24A-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621445334615-Certificate-GPI-15A%2624A-Intertek-Colombia-2021.pdf

DURACELL1621443938402-Certificate-Duracell-AAAChanghongPlant-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621443938402-Certificate-Duracell-AAAChanghongPlant-Intertek-Colombia-2021.pdf

DURACELL1621443903429-Certificate-Duracell-AAAGPPlant-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621443903429-Certificate-Duracell-AAAGPPlant-Intertek-Colombia-2021.pdf

RAZER1621443642628-Certificate_RAZER_383 & 383C_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621443642628-Certificate_RAZER_383%20%26%20383C_INSPEC-UVA_Mexico_2021.pdf

Askey1621440932043-CoH_ASKEY_RG3110W_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621440932043-CoH_ASKEY_RG3110W_ANATEL_Brazil_2021.pdf

Askey1621440878892-CoC_ASKEY_RG3110W_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621440878892-CoC_ASKEY_RG3110W_ANATEL_Brazil_2021.pdf

ROKU1621431310059-Cetificate_Roku_3940X (3940MX)_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621431310059-Cetificate_Roku_3940X%20%283940MX%29_IFT_Mexico_2021.pdf

Lenovo1621346821940-Certificate Update_Lenovo_Yoga Slim 7 Pro 14ACH5_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1621346821940-Certificate%20Update_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5_SUBTEL_Chile_2021.pdf

Lenovo1621270101748-Certificate Update_Lenovo_TP00116E_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621270101748-Certificate%20Update_Lenovo_TP00116E_SUBTEL_Chile_2021.pdf

BOSCH1621257898676-Certificate_BOSCH_D-tect 200 C_SIGET_El Salvador_2021.PDF
https://orbiscompliance.s3.amazonaws.com/1621257898676-Certificate_BOSCH_D-tect%20200%20C_SIGET_El%20Salvador_2021.PDF

Lenovo1621022686930-Certificate_Lenovo_Yoga AIO 7 27ACH6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621022686930-Certificate_Lenovo_Yoga%20AIO%207%2027ACH6_SUBTEL_Chile_2021.pdf

Roku1621009376947-Certificate_Roku_3940X_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1621009376947-Certificate_Roku_3940X_SUTEL_Costa%20Rica_2021.pdf

KCTL1620998947548-CERTIFICATE_KCTL_SKYHD_MH01-500_NOM-001-SCFI-2018_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1620998947548-CERTIFICATE_KCTL_SKYHD_MH01-500_NOM-001-SCFI-2018_NYCE_MEXICO_2020.pdf

ARISTA1620940816845-CoC_ARISTA_CCS-755_CCS-758_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620940816845-CoC_ARISTA_CCS-755_CCS-758_ANATEL_Brazil_2021.pdf

ARISTA1620940798473-CoH_ARISTA_CCS-755_CCS-758_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620940798473-CoH_ARISTA_CCS-755_CCS-758_ANATEL_Brazil_2021.pdf

CEI1620939592137-CoC_ALPS_LYKANER_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620939592137-CoC_ALPS_LYKANER_ANATEL_Brazil_2021.pdf

BOSCH1620917450852-Certificate_BOSCH_D-tec 200 C_SIGET_El Salvador_2021.PDF
https://orbiscompliance.s3.amazonaws.com/1620917450852-Certificate_BOSCH_D-tec%20200%20C_SIGET_El%20Salvador_2021.PDF

ASKEY1620829665989-Certificate_ASKEY_RG3110W_ENACOM_Argentina.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620829665989-Certificate_ASKEY_RG3110W_ENACOM_Argentina.pdf

DURACELL1620824944168-14721D2117-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824944168-14721D2117-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824846119-14721D2115-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824846119-14721D2115-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824752531-14721D2114-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824752531-14721D2114-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824678592-14721D2113-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824678592-14721D2113-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824603072-14721D2112-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824603072-14721D2112-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824511487-14721D1969-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824511487-14721D1969-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824318506-14721D1968-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824318506-14721D1968-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824298887-14721D1967-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824298887-14721D1967-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824216030-14721D1967-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824216030-14721D1967-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620824146343-14721D1964-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620824146343-14721D1964-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620822064375-14721D1963-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620822064375-14721D1963-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821994874-14721D1962-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz-4Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821994874-14721D1962-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz-4Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821931975-14721D1862-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821931975-14721D1862-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821869907-14721D1961-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz&4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821869907-14721D1961-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz%264Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821800467-14721D1862-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821800467-14721D1862-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821719622-14721D1526-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821719622-14721D1526-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821664963-14721D1525-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821664963-14721D1525-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821609943-14721D1524-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821609943-14721D1524-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821524770-14721D1583-Dictamen_Certificate_Duracell_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821524770-14721D1583-Dictamen_Certificate_Duracell_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821457219-14721D1582-Dictamen_Certificate_Duracell_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821457219-14721D1582-Dictamen_Certificate_Duracell_Coppertop_AAA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821381094-14721D1549-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821381094-14721D1549-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821193163-14721D1548-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821193163-14721D1548-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821104309-14721D1547-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821104309-14721D1547-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620821036976-14721D1546-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz&18Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620821036976-14721D1546-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz%2618Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620820885791-14721D1545-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620820885791-14721D1545-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1620820809418-14721D1544-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620820809418-14721D1544-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

Lenovo1620763559245-Certificate_Lenovo_Legion 7 16ACHg6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620763559245-Certificate_Lenovo_Legion%207%2016ACHg6_SUBTEL_Chile_2021.pdf

DURACELL1620742311043-Surveillance_Resolution_Duracell__NOM-212-SCFI-2017-NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620742311043-Surveillance_Resolution_Duracell__NOM-212-SCFI-2017-NYCE_Mexico_2021.pdf

NUSKIN1620412654489-Certificate_N_3082_NuSkin_Ageloc Galvanic Body SPA_DIGEMID_Peru_-2021.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620412654489-Certificate_N_3082_NuSkin_Ageloc%20Galvanic%20Body%20SPA_DIGEMID_Peru_-2021.PDF

NUSKIN1620412499456-Certificate_N_3068_NuSkin_Ageloc Galvanic SPA_DIGEMID_Peru_-2021.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620412499456-Certificate_N_3068_NuSkin_Ageloc%20Galvanic%20SPA_DIGEMID_Peru_-2021.PDF

Lenovo1620396594308-Certificate Update_Lenovo_IdeaPad 3 17ALC6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620396594308-Certificate%20Update_Lenovo_IdeaPad%203%2017ALC6_SUBTEL_Chile_2021.pdf

BTL1620327857346-Certificate_RAZER_ RZ04-0380 & RC30-0380_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620327857346-Certificate_RAZER_%20RZ04-0380%20%26%20RC30-0380_INSPEC-UVA_Mexico_2021.pdf

SONY1620311342752-Certificate_SONY_CFI-ZCT1W_CONATEL_Paraguay_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620311342752-Certificate_SONY_CFI-ZCT1W_CONATEL_Paraguay_2021.pdf

iRobot Corporation1620235526740-430_Cert_21283-20.04_Irobot_614_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620235526740-430_Cert_21283-20.04_Irobot_614_Brazil_2021.pdf

iRobot Corporation1620226474691-430_Cert_21283-20.03_Irobot_675_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620226474691-430_Cert_21283-20.03_Irobot_675_Brazil_2021.pdf

u-blox1620154436838-CoH_UBLOX_NINA-Wxx_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620154436838-CoH_UBLOX_NINA-Wxx_ANATEL_Brazil_2021.pdf

Lenovo1620130988683-Certificate_RAZER_RZ04-0376_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620130988683-Certificate_RAZER_RZ04-0376_SUBTEL_Chile_2021.pdf

DURACELL1620062718081-802-21-0001-Surveillance_Certificate_Duracell_BT-ARG4082271_675_GER_TUV-Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620062718081-802-21-0001-Surveillance_Certificate_Duracell_BT-ARG4082271_675_GER_TUV-Argentina_2021.pdf

CRICUT1620055003904-Certificate_Cricut_CXPL203_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620055003904-Certificate_Cricut_CXPL203_IFT_Mexico_2021.pdf

CRICUT1620054972699-Certificate_Cricut_CXPL303_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620054972699-Certificate_Cricut_CXPL303_IFT_Mexico_2021.pdf

Lenovo1620048770648-Certificate_Lenovo_Yoga Slim 7 Pro 14IHU5 O_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620048770648-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014IHU5%20O_SUBTEL_Chile_2021.pdf

Lenovo1620048139248-Certificate_Lenovo_ThinkBook 16p G2 ACH_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1620048139248-Certificate_Lenovo_ThinkBook%2016p%20G2%20ACH_SUBTEL_Chile_2021.pdf

Lenovo1620047056446-Certificate_Lenovo_ThinkBook 14p G2 ACH_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1620047056446-Certificate_Lenovo_ThinkBook%2014p%20G2%20ACH_SUBTEL_Chile_2021.pdf

Lenovo1619807689358-Certificate Update_Lenovo_TP00116C_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1619807689358-Certificate%20Update_Lenovo_TP00116C_SUBTEL_Chile_2021.pdf

Lenovo1619716475018-Certificate Update_Lenovo_TP00117C_SUBTEL_Chile_2021.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619716475018-Certificate%20Update_Lenovo_TP00117C_SUBTEL_Chile_2021.pdf.pdf

CRICUT1619703307090-Certificate_CRICUT_CXPL203_V&C-UVA_Mexico_2021_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619703307090-Certificate_CRICUT_CXPL203_V%26C-UVA_Mexico_2021_Malaysia.pdf

CRICUT1619703224908-Certificate_CRICUT_CXPL203_V&C-UVA_Mexico_2021_China.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619703224908-Certificate_CRICUT_CXPL203_V%26C-UVA_Mexico_2021_China.pdf

CRICUT1619702681016-Certificate_CRICUT_CXPL303_V&C-UVA_Mexico_2021_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619702681016-Certificate_CRICUT_CXPL303_V%26C-UVA_Mexico_2021_Malaysia.pdf

CRICUT1619702642666-Certificate_CRICUT_CXPL303_V&C-UVA_Mexico_2021_China.pdf
https://orbiscompliance.s3.amazonaws.com/1619702642666-Certificate_CRICUT_CXPL303_V%26C-UVA_Mexico_2021_China.pdf

CRICUT1619534099261-Certificate_CRICUT_CXPL303_TELCOR_Nicaragua_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1619534099261-Certificate_CRICUT_CXPL303_TELCOR_Nicaragua_2021.pdf

DURACELL1619467077917-EXT-2021-852 BT-ARG 3983344 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619467077917-EXT-2021-852%20BT-ARG%203983344%20%28R1%29-signed.pdf

DURACELL1619466811390-EXT-2021-850 BT-ARG 4082268 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619466811390-EXT-2021-850%20BT-ARG%204082268%20%28R1%29-signed.pdf

DURACELL1619466544178-EXT-2021-848 BT-ARG 4082272 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619466544178-EXT-2021-848%20BT-ARG%204082272%20%28R1%29-signed.pdf

DURACELL1619466362114-EXT-2021-658 BT-ARG 4082272 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619466362114-EXT-2021-658%20BT-ARG%204082272%20%28R1%29-signed.pdf

PILISAR1619466235115-EXT-2021-658 BT-ARG 4082272 (R1)-signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619466235115-EXT-2021-658%20BT-ARG%204082272%20%28R1%29-signed.pdf

SONY1619439809219-SONY_CFI-ZCT1W_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1619439809219-SONY_CFI-ZCT1W_SUBTEL_Chile_2021.pdf

DURACELL1619208114643-Certificate_BT-ARG 4084262_Duracell_10:PR70_13:PR48_312:PR41_TÜV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619208114643-Certificate_BT-ARG%204084262_Duracell_10%3APR70_13%3APR48_312%3APR41_TU%CC%88V_Argentina_2021.pdf

DURACELL1619205216671-Certificate_BT-ARG 4084802_Duracell_OPTIMUM_AA&AAA_TÜV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619205216671-Certificate_BT-ARG%204084802_Duracell_OPTIMUM_AA%26AAA_TU%CC%88V_Argentina_2021.pdf

Lenovo1619202608473-Certificate Update_Lenovo_Yoga Slim 7 Pro 14ACH5_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619202608473-Certificate%20Update_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5_SUBTEL_Chile_2021.pdf

Lenovo1619186314699-Certificate_Lenovo_Legion 5 15ACH6A_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619186314699-Certificate_Lenovo_Legion%205%2015ACH6A_SUBTEL_Chile_2021.pdf

Lenovo1619184603209-Certificate_Lenovo_Legion 5 15IMH6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1619184603209-Certificate_Lenovo_Legion%205%2015IMH6_SUBTEL_Chile_2021.pdf

UBLOX1619103755721-CoH_UBLOX_SARA-R222x_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1619103755721-CoH_UBLOX_SARA-R222x_ANATEL_Brazil_2021.pdf

MAKERBOT1619101676691-CoC_MAKERBOT_ Brooklyn_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1619101676691-CoC_MAKERBOT_%20Brooklyn_ANATEL_Brazil_2021.pdf

CRICUT1618925733421-Certificate_CRICUT_CXPL203_V&C-UVA_Mexico_2021_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618925733421-Certificate_CRICUT_CXPL203_V%26C-UVA_Mexico_2021_Malaysia.pdf

CRICUT1618925674579-Certificate_CRICUT_CXPL203_V&C-UVA_Mexico_2021_China.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618925674579-Certificate_CRICUT_CXPL203_V%26C-UVA_Mexico_2021_China.pdf

CRICUT1618924775492-Certificate_CRICUT_CXPL303_V&C-UVA_Mexico_2021_Malaysia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618924775492-Certificate_CRICUT_CXPL303_V%26C-UVA_Mexico_2021_Malaysia.pdf

CRICUT1618924759428-Certificate_CRICUT_CXPL303_V&C-UVA_Mexico_2021_China.pdf
https://orbiscompliance.s3.amazonaws.com/1618924759428-Certificate_CRICUT_CXPL303_V%26C-UVA_Mexico_2021_China.pdf

Lenovo1618848070251-Certificate_Lenovo_ThinkCentre M90a Gen 2_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618848070251-Certificate_Lenovo_ThinkCentre%20M90a%20Gen%202_SUBTEL_Chile_2021.pdf

Keyssa1618848011551-Certificate_Keyssa_MT104RD-SR_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618848011551-Certificate_Keyssa_MT104RD-SR_IFT_Mexico_2021.pdf

Lenovo1618846331571-Certificate_Lenovo_ThinkBook Plus G2 ITG_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618846331571-Certificate_Lenovo_ThinkBook%20Plus%20G2%20ITG_SUBTEL_Chile_2021.pdf

DURACELL1618844831907-802-20-0026-Surveillance_Certificate_Duracell_BT-ARG4082268_C&D_USA_TUV-Argentina_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618844831907-802-20-0026-Surveillance_Certificate_Duracell_BT-ARG4082268_C%26D_USA_TUV-Argentina_2021.pdf

UBLOX1618605442227-CoC_UBLOX_SARA-R222x_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618605442227-CoC_UBLOX_SARA-R222x_ANATEL_Brazil_2021.pdf

DURACELL1618578044378-14721D0924-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618578044378-14721D0924-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618577970476-14721D0923-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618577970476-14721D0923-Dictamen_Certificate_Duracell_Coppertop_C_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618577776410-14721D0855-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-4Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618577776410-14721D0855-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-4Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618577676180-14721D0859-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-2Pz-4Pz-6Pz-14Pz&30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618577676180-14721D0859-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-2Pz-4Pz-6Pz-14Pz%2630Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618577593230-14721D0858-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz&8Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618577593230-14721D0858-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz%268Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618577468311-14721D0410-Dictamen_Certificate_Duracell_Coppertop_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618577468311-14721D0410-Dictamen_Certificate_Duracell_Coppertop_AA_4Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618576658464-14721D0004-Dictamen_Certificate_Duracell_Lithium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618576658464-14721D0004-Dictamen_Certificate_Duracell_Lithium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618576529371-14721D0003-Dictamen_Certificate_Duracell_Lithium_3V_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618576529371-14721D0003-Dictamen_Certificate_Duracell_Lithium_3V_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618576400552-14721D0002-Dictamen_Certificate_Duracell_Quantum_AA_2Pz&4PZ_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618576400552-14721D0002-Dictamen_Certificate_Duracell_Quantum_AA_2Pz%264PZ_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618576318623-14721D0001-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618576318623-14721D0001-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf

ROKU1618526981231-CERTIFICATE_ROKU_3940X (3940MX)_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618526981231-CERTIFICATE_ROKU_3940X%20%283940MX%29_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf

CRADLEPOINT1618526606454-CERTIFICATE_HS CODE ADDITION_ CRADLEPOINT_S5A950A_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618526606454-CERTIFICATE_HS%20CODE%20ADDITION_%20CRADLEPOINT_S5A950A_NYCE_MEXICO_2021.pdf

CRICUT1618523830367-CERTIFICATE EXTENSION TO LIDEART_CRICUT_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618523830367-CERTIFICATE%20EXTENSION%20TO%20LIDEART_CRICUT_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf

DURACELL1618515620795-14721D1348-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618515620795-14721D1348-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618515229823-14721D1347-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618515229823-14721D1347-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618515068936-14721D0922-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618515068936-14721D0922-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618514942154-14721D1144-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618514942154-14721D1144-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618514850184-14721D1143-Dictamen_Certificate_Duracell_Lythium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618514850184-14721D1143-Dictamen_Certificate_Duracell_Lythium_CR2_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618514373895-14721D0885-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618514373895-14721D0885-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618512669020-14721D0888-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-2Pz-4Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618512669020-14721D0888-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz-2Pz-4Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618512593097-14721D0887-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618512593097-14721D0887-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618512501115-14721D0886-Dictamen_Certificate_Duracell_Coppertop_AA_4Pz-6Pz-18Pz&30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618512501115-14721D0886-Dictamen_Certificate_Duracell_Coppertop_AA_4Pz-6Pz-18Pz%2630Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1618512358985-14721D0856-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618512358985-14721D0856-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

1618512309421-14721D0856-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618512309421-14721D0856-Dictamen_Certificate_Duracell_Coppertop_D_2Pz_INSPEC-UVA_Mexico_2021.pdf

LENOVO1618500904336-Certificate_Lenovo_IdeaCentre AIO 5 24IOB6._SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618500904336-Certificate_Lenovo_IdeaCentre%20AIO%205%2024IOB6._SUBTEL_Chile_2021.pdf

UBLOX1618348878679-CoC_UBLOX_NINA-Wxx_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618348878679-CoC_UBLOX_NINA-Wxx_ANATEL_Brazil_2021.pdf

BTL1618330467894-Certificate_RAZER_RZ04-0376_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618330467894-Certificate_RAZER_RZ04-0376_INSPEC-UVA_Mexico_2021.pdf

CRICUT1618254158765-CERTIFICATE_CRICUT_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618254158765-CERTIFICATE_CRICUT_CXPL203_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf

CRADLEPOINT1618253782443-CERTIFICATE_EXTENSION TO INGRAM_CRADLEPOINT_S5A950A_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618253782443-CERTIFICATE_EXTENSION%20TO%20INGRAM_CRADLEPOINT_S5A950A_NOM-019-SCFI-1998_NYCE_MEXICO_2021.pdf

CRADLEPOINT1618253644140-CERTIFICATE_CRADLEPOINT_S5A950A_NOM-019-SCFI-1998-NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618253644140-CERTIFICATE_CRADLEPOINT_S5A950A_NOM-019-SCFI-1998-NYCE_MEXICO_2020.pdf

ARISTA1618252466075-CoC_ARISTA_AN1764_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618252466075-CoC_ARISTA_AN1764_ANATEL_Brazil_2021.pdf

BOSCH1618236253841-Certificate_BOSCH_GLM 50C_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1618236253841-Certificate_BOSCH_GLM%2050C_SUTEL_Costa%20Rica_2021.pdf

oracle1618233947229-DICTAMEN_ORACLE_7601651_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1618233947229-DICTAMEN_ORACLE_7601651_NPMX_MEXICO_2021.pdf

1617911232022-Decl_21283-20.10 (19338-19.02_M2)Irobot_614-675_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617911232022-Decl_21283-20.10%20%2819338-19.02_M2%29Irobot_614-675_Brazil_2021.pdf

1617910973578-Decl_21283-20.12 (19548-19.05_M1)_iRobot_380T_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617910973578-Decl_21283-20.12%20%2819548-19.05_M1%29_iRobot_380T_Brazil_2021.pdf

u-blox1617898011976-CoH_UBLOX_NINA-B301_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617898011976-CoH_UBLOX_NINA-B301_ANATEL_Brazil_2021.pdf

u-blox1617897996161-CoH_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617897996161-CoH_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf

CRICUT1617886828658-Certificate_CRICUT_CXPL203_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617886828658-Certificate_CRICUT_CXPL203_CONATEL_Honduras_2021.pdf

SONY1617821847575-Certificate_SONY_CFI-1015A_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617821847575-Certificate_SONY_CFI-1015A_ATT_Bolivia_2020.pdf

SONY1617821819844-Certificate_SONY_CFI-1015B_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617821819844-Certificate_SONY_CFI-1015B_ATT_Bolivia_2020.pdf

SONY1617821792838-Certificate_SONY_DFI-T1000AA_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617821792838-Certificate_SONY_DFI-T1000AA_ATT_Bolivia_2020.pdf

TOPCON1617819527139-Certificate_TOPCON_NET-G5_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617819527139-Certificate_TOPCON_NET-G5_SUBTEL_Chile_2021.pdf

IROBOT1617819378063-Certificate_IROBOT_BRAAVA JET M6_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617819378063-Certificate_IROBOT_BRAAVA%20JET%20M6_V%26C-UVA_Mexico_2021.pdf

IROBOT1617802618748-Certificate_IROBOT_ROOMBA S9+_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617802618748-Certificate_IROBOT_ROOMBA%20S9%2B_V%26C-UVA_Mexico_2021.pdf

IROBOT1617802521285-Certificate_IROBOT_ROOMBA I1, ROOMBA I3+, ROOMBA I4, ROOMBA I4+, ROOMBA I7 (I715030), ROOMBA I7 (I755030)_V&C- UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617802521285-Certificate_IROBOT_ROOMBA%20I1%2C%20ROOMBA%20I3%2B%2C%20ROOMBA%20I4%2C%20ROOMBA%20I4%2B%2C%20ROOMBA%20I7%20%28I715030%29%2C%20ROOMBA%20I7%20%28I755030%29_V%26C-%20UVA_Mexico_2021.pdf

IROBOT1617802469143-Certificate_IROBOT_R960400_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617802469143-Certificate_IROBOT_R960400_V%26C-UVA_Mexico_2021.pdf

IROBOT1617802416281-Certificate_IROBOT_R614400, R621400, R671400, R675400, R677400_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617802416281-Certificate_IROBOT_R614400%2C%20R621400%2C%20R671400%2C%20R675400%2C%20R677400_V%26C-UVA_Mexico_2021.pdf

IROBOT1617802182214-Certificate_IROBOT_E515030, E517030, E613030_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617802182214-Certificate_IROBOT_E515030%2C%20E517030%2C%20E613030_V%26C-UVA_Mexico_2021.pdf

IROBOT1617802023921-Certificate_IROBOT_BRAAVA JET 240, BRAAVA JET 380_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617802023921-Certificate_IROBOT_BRAAVA%20JET%20240%2C%20BRAAVA%20JET%20380_V%26C-UVA_Mexico_2021.pdf

DURACELL1617744593689-802-20-0025-Surveillance_Certificate_Duracell_BT-ARG4082272_AA&AAA_CH_TUV-Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617744593689-802-20-0025-Surveillance_Certificate_Duracell_BT-ARG4082272_AA%26AAA_CH_TUV-Argentina_2021.pdf

DURACELL1617744396972-802-20-0026-Surveillance_Certificate_Duracell_BT-ARG4082268_C&D_USA_TUV-Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617744396972-802-20-0026-Surveillance_Certificate_Duracell_BT-ARG4082268_C%26D_USA_TUV-Argentina_2021.pdf

DURACELL1617744184570-802-20-0027-Surveillance_Certificate_Duracell_BT-ARG3983344_9V_MSIA_TUV-Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617744184570-802-20-0027-Surveillance_Certificate_Duracell_BT-ARG3983344_9V_MSIA_TUV-Argentina_2021.pdf

1617737320011-CoH_KINGSTON_CS005_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617737320011-CoH_KINGSTON_CS005_ANATEL_Brazil_2021.pdf

test1617724449783-7-Certificate Website Test-Safety Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724449783-7-Certificate%20Website%20Test-Safety%20Mexico.pdf

test1617724441628-6-Certificate Website Test-Indonesia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724441628-6-Certificate%20Website%20Test-Indonesia.pdf

test1617724433872-5-Certificate Website Test-Australia.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724433872-5-Certificate%20Website%20Test-Australia.pdf

test1617724409291-4-Certificate Website Test-Dominican Republic.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724409291-4-Certificate%20Website%20Test-Dominican%20Republic.pdf

test1617724401333-3-Certificate Website Test-Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724401333-3-Certificate%20Website%20%20Test-Mexico.pdf

test1617724393419-2-Certificate Website Test-Korea.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724393419-2-Certificate%20Website%20Test-Korea.pdf

test1617724383872-1-Certificate Website Test-Brazil.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617724383872-1-Certificate%20Website%20Test-Brazil.pdf

BTL1617716312275-Certificate_RAZER_RZ01-0373_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617716312275-Certificate_RAZER_RZ01-0373_INSPEC-UVA_Mexico_2021.pdf

CRICUT1617626744468-Certificate_CRICUT_CMP01100_V&C-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617626744468-Certificate_CRICUT_CMP01100_V%26C-UVA_Mexico_2021.pdf

LENOVO1617304034924-Certificate_Lenovo_IdeaCentre AIO 5 24ALC6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617304034924-Certificate_Lenovo_IdeaCentre%20AIO%205%2024ALC6_SUBTEL_Chile_2021.pdf

BOSCH1617204391230-Certificate_BOSCH_GLM 50 C_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617204391230-Certificate_BOSCH_GLM%2050%20C_MTC_Peru_2021.pdf

iRobot Corporation1617203652576-FINAL REPORT AUDIT- Kin Yat 2021_21283-20.08_12_14.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617203652576-FINAL%20REPORT%20AUDIT-%20Kin%20Yat%202021_21283-20.08_12_14.pdf

iRobot Corporation1617203617750-FINAL REPORT - Kin Yat 2021_21283-20.08_12_14.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617203617750-FINAL%20REPORT%20-%20Kin%20Yat%202021_21283-20.08_12_14.pdf

LENOVO1617197956977-Certificate_Lenovo_IdeaCentre AIO 5 27IOB6_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617197956977-Certificate_Lenovo_IdeaCentre%20AIO%205%2027IOB6_Chile_SUBTEL_2021.pdf

LENOVO1617197027442-Certificate_Lenovo_Yoga 7 14ACN6_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617197027442-Certificate_Lenovo_Yoga%207%2014ACN6_Chile_SUBTEL_2021.pdf

LENOVO1617196344430-Certificate_Lenovo_IdeaPad 5 Pro 16ACH6_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617196344430-Certificate_Lenovo_IdeaPad%205%20Pro%2016ACH6_Chile_SUBTEL_2021.pdf

iRobot Corporation1617128212960-IBAMA Autorization_8877266 (RVD-Y1-ROOMBA 960).html
https://orbiscompliance.s3.amazonaws.com/1617128212960-IBAMA%20Autorization_8877266%20%28RVD-Y1-ROOMBA%20960%29.html

UBLOX1617034948197-CoH_UBLOX_TOBY-R200_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617034948197-CoH_UBLOX_TOBY-R200_ANATEL_Brazil_2021.pdf

UBLOX1617018078809-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1617018078809-CoC_UBLOX_TOBY-R200_ANATEL_Brazil_2021.pdf

KINGSTON1617017996796-CoC_KINGSTON_TOBY-R200_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1617017996796-CoC_KINGSTON_TOBY-R200_ANATEL_Brazil_2021.pdf

LENOVO1616782573262-Certificate_Lenovo_TP00117E_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616782573262-Certificate_Lenovo_TP00117E_Chile_SUBTEL_2021.pdf

KINGSTON1616778971954-CoC_KINGSTON_CS005_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616778971954-CoC_KINGSTON_CS005_ANATEL_Brazil_2021.pdf

BOSCH1616773120742-Certificate_BOSCH_GLL 3-80 CG_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616773120742-Certificate_BOSCH_GLL%203-80%20CG_MTC_Peru_2021.pdf

ORACLE1616707269426-CERTIFICATE_FORM_C_EPSON_M235B_TAD_ARGENTINA_2021_CE-2021-23758654-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616707269426-CERTIFICATE_FORM_C_EPSON_M235B_TAD_ARGENTINA_2021_CE-2021-23758654-APN-DNRT%23MDP.pdf

ORACLE1616706983060-187842 - EXT DE SEG PARA ORACLE (16-03-2021) DC-E-E131-016.1.pdf
https://orbiscompliance.s3.amazonaws.com/1616706983060-187842%20-%20EXT%20DE%20SEG%20PARA%20ORACLE%20%2816-03-2021%29%20DC-E-E131-016.1.pdf

DURACELL1616438414420-Certificate-DURACELL-OptimumAA&AAA-Intertek-Colombia-2021.pdf
https://orbiscompliance.s3.amazonaws.com/1616438414420-Certificate-DURACELL-OptimumAA%26AAA-Intertek-Colombia-2021.pdf

NUSKIN1616159935767-Certificate_NUSKIN_ageLOC Galvanic Body Spa_INVIMA_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616159935767-Certificate_NUSKIN_ageLOC%20Galvanic%20Body%20Spa_INVIMA_Colombia_2021.pdf

iRobot Corporation1616093521170-430-21283-20.06_IROBOT_RVB-Y2_Jabil_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1616093521170-430-21283-20.06_IROBOT_RVB-Y2_Jabil_Brazil_2021.pdf

ROKU1615816735725-Certificate_Roku_3940X (3940MX)_Corrected_NPMX_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1615816735725-Certificate_Roku_3940X%20%283940MX%29_Corrected_NPMX_Mexico_2021.pdf

Cradlepoint1615566374682-Certificate_cradlepoint_S5A950A_NOM-208_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615566374682-Certificate_cradlepoint_S5A950A_NOM-208_NYCE_Mexico_2021.pdf

BTL1615563250840-Certificate_RAZER_Z01-0373_NOM-208_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1615563250840-Certificate_RAZER_Z01-0373_NOM-208_NYCE_Mexico_2021.pdf

CRICUT1615498361131-CERTIFICATE_COUNTRY ADDITION_CRICUT_CXPL303_NOM-019-SCFI-1998_MEXICO_NYCE_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615498361131-CERTIFICATE_COUNTRY%20ADDITION_CRICUT_CXPL303_NOM-019-SCFI-1998_MEXICO_NYCE_2021.pdf

ORACLE1615495176122-CERTIFICATE, ORACLE, AHP-1123HTT-C2-1010, NOM-019-SCFI-1998, NPMX, MEXICO, 2021.pdf
https://orbiscompliance.s3.amazonaws.com/1615495176122-CERTIFICATE%2C%20ORACLE%2C%20AHP-1123HTT-C2-1010%2C%20NOM-019-SCFI-1998%2C%20NPMX%2C%20MEXICO%2C%202021.pdf

Lenovo1615393669369-Certificate_Lenovo_ThinkCentre M70t Gen 2_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615393669369-Certificate_Lenovo_ThinkCentre%20M70t%20Gen%202_SUBTEL_Chile_2021.pdf

KINGSTON1615383467660-Certificate_KINGSTON_FY001_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615383467660-Certificate_KINGSTON_FY001_INSPEC-UVA_Mexico_2021.pdf

LENOVO1615382938538-Certificate_Lenovo_ThinkCentre M70s Gen 2_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615382938538-Certificate_Lenovo_ThinkCentre%20M70s%20Gen%202_SUBTEL_Chile_2021.pdf

ROKU1615381588285-Certificate_ROKU_3940X (3940MX)_INSPEC-UVA_Mexico_2021 (Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615381588285-Certificate_ROKU_3940X%20%283940MX%29_INSPEC-UVA_Mexico_2021%20%28Vietnam%29.pdf

ROKU1615381563360-Certificate_ROKU_3940X (3940MX)_INSPEC-UVA_Mexico_2021 (China).pdf
https://orbiscompliance.s3.amazonaws.com/1615381563360-Certificate_ROKU_3940X%20%283940MX%29_INSPEC-UVA_Mexico_2021%20%28China%29.pdf

KCTL1615299624915-Certificate_MIM-H04N_SAMSUNG_CONATEL_Venezuela_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1615299624915-Certificate_MIM-H04N_SAMSUNG_CONATEL_Venezuela_2021.pdf

DURACELL1615237714733-Certificate_21147CC000137_Duracell_OPTIMUM_AAA_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1615237714733-Certificate_21147CC000137_Duracell_OPTIMUM_AAA_UVA_Mexico_2021.pdf

DURACELL1615236953255-Certificate_21147CC000136_Duracell_OPTIMUM_AA_UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1615236953255-Certificate_21147CC000136_Duracell_OPTIMUM_AA_UVA_Mexico_2021.pdf

CRICUT1614978035515-Certificate_Cricut_CXPL303_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614978035515-Certificate_Cricut_CXPL303_NYCE_Mexico_2021.pdf

DURACELL1614974496686-20147UDCNOM-024-SCFI-2013004555-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614974496686-20147UDCNOM-024-SCFI-2013004555-Dictamen_Certificate_Duracell_Coppertop_AAA_2Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614974202740-20147UDCNOM-024-SCFI-2013004554-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614974202740-20147UDCNOM-024-SCFI-2013004554-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614974068856-14721D0571-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614974068856-14721D0571-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614973941564-14721D0412-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614973941564-14721D0412-Dictamen_Certificate_Duracell_Coppertop_AA_1Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614973816729-14721D0411-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz,2Pz,4Pz&6Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614973816729-14721D0411-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz%2C2Pz%2C4Pz%266Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614973620788-14721D0102-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz,4Pz,6PZ&30Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614973620788-14721D0102-Dictamen_Certificate_Duracell_Coppertop_AAA_1Pz%2C4Pz%2C6PZ%2630Pz_INSPEC-UVA_Mexico_2021.pdf

DURACELL1614973428543-14721D0101-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz&18Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614973428543-14721D0101-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz%2618Pz_INSPEC-UVA_Mexico_2021.pdf

1614973411803-14721D0101-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz&18Pz_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614973411803-14721D0101-Dictamen_Certificate_Duracell_Coppertop_AA_6Pz%2618Pz_INSPEC-UVA_Mexico_2021.pdf

u-blox1614894343165-CoC_UBLOX_NINA B3_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614894343165-CoC_UBLOX_NINA%20B3_ANATEL_Brazil_2021.pdf

u-blox1614894332103-CoC_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614894332103-CoC_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf

u-blox1614894327438-CoC_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614894327438-CoC_UBLOX_ANNA-112_ANATEL_Brazil_2021.pdf

Lenovo1614880949036-Certificate_Lenovo_IdeaPad Creator 5 16ACH6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614880949036-Certificate_Lenovo_IdeaPad%20Creator%205%2016ACH6_SUBTEL_Chile_2021.pdf

Lenovo1614880112107-Certificate_Lenovo_IdeaPad 5 Pro 16IHU6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614880112107-Certificate_Lenovo_IdeaPad%205%20Pro%2016IHU6_SUBTEL_Chile_2021.pdf

CRICUT1614794542464-Certificate_Cricut_CXPL203_NYSE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614794542464-Certificate_Cricut_CXPL203_NYSE_Mexico_2021.pdf

ROKU1614694709381-Certificate_ROKU_3940X (3940 MX)_INSPEC-UVA_Mexico_2021(Vietnam).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614694709381-Certificate_ROKU_3940X%20%283940%20MX%29_INSPEC-UVA_Mexico_2021%28Vietnam%29.pdf

ROKU1614694549327-Certificate_ROKU_3940X (3940MX)_INSPEC-UVA_Mexico_2021(China).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614694549327-Certificate_ROKU_3940X%20%283940MX%29_INSPEC-UVA_Mexico_2021%28China%29.pdf

CRICUT1614362663368-Certificate_CRICUT_CXPL203_SIT_Guatemala_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614362663368-Certificate_CRICUT_CXPL203_SIT_Guatemala_2021.pdf

KINGSTON1614259463025-Certificate_Kingston_HXS-HSDG2_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614259463025-Certificate_Kingston_HXS-HSDG2_NYCE_Mexico_2021.pdf

ROKU1614257877102-Certificate_Roku_3940MX_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614257877102-Certificate_Roku_3940MX_CRC_Colombia_2021.pdf

ROKU1614193294304-Certificate_Roku_3940X (3940MX)_NPMX_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614193294304-Certificate_Roku_3940X%20%283940MX%29_NPMX_Mexico_2021.pdf

CRICUT1614180260202-Certificate_CRICUT_CXPL303_CONATEL_Honduras_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614180260202-Certificate_CRICUT_CXPL303_CONATEL_Honduras_2021.pdf

LENOVO1614170095756-Certificate_Lenovo_Yoga Slim 7 13ACN5_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614170095756-Certificate_Lenovo_Yoga%20Slim%207%2013ACN5_SUBTEL_2021.pdf

KINGSTON1614101567547-Certificate_KINGSTON_Cloud Stinger S_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101567547-Certificate_KINGSTON_Cloud%20Stinger%20S_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101538933-Certificate_KINGSTON_Cloud Stinger Core_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101538933-Certificate_KINGSTON_Cloud%20Stinger%20Core_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101525270-Certificate_KINGSTON_Cloud Stinger_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101525270-Certificate_KINGSTON_Cloud%20Stinger_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101490774-Certificate_KINGSTON_Cloud Revolver & Revolver S_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101490774-Certificate_KINGSTON_Cloud%20Revolver%20%26%20Revolver%20S_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101474175-Certificate_kingston_Cloud Orbit & Chat_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101474175-Certificate_kingston_Cloud%20Orbit%20%26%20Chat_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101457776-Certificate_KINGSTON_Cloud Earbuds_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101457776-Certificate_KINGSTON_Cloud%20Earbuds_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101439035-Certificate_KINGSTON_Cloud Alpha S_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101439035-Certificate_KINGSTON_Cloud%20Alpha%20S_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101412028-Certificate_KINGSTON_Cloud Alpha_INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101412028-Certificate_KINGSTON_Cloud%20Alpha_INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614101261141-Certificate_KINGSTON_Cloud & Cloud II_ INSPEC-UVA_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614101261141-Certificate_KINGSTON_Cloud%20%26%20Cloud%20II_%20INSPEC-UVA_Mexico_2021.pdf

KINGSTON1614094037815-Certificate_KINGSTON_CS005_INSPEC_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1614094037815-Certificate_KINGSTON_CS005_INSPEC_Mexico_2021.pdf

TopCon1614020654312-Certificado_00100379_M3.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020654312-Certificado_00100379_M3.pdf

Ublox1614020334689-NCC_19218_21_M1_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020334689-NCC_19218_21_M1_Orbis.pdf

Ublox1614020282080-NCC_19217_21_M1_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020282080-NCC_19217_21_M1_Orbis.pdf

Ublox1614020222159-NCC_19216_21_M6_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020222159-NCC_19216_21_M6_Orbis.pdf

TopCon1614020137615-NCC_19218_21_M1_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020137615-NCC_19218_21_M1_Orbis.pdf

TopCon1614020088268-NCC_19217_21_M1_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020088268-NCC_19217_21_M1_Orbis.pdf

TopCon1614020012170-NCC_19216_21_M6_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614020012170-NCC_19216_21_M6_Orbis.pdf

1614019978776-NCC_19216_21_M6_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614019978776-NCC_19216_21_M6_Orbis.pdf

CRADLEPOINT1614005759493-Certificate_TELIT_LM960A18_CRC_Colombia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1614005759493-Certificate_TELIT_LM960A18_CRC_Colombia_2021.pdf

IROBOT1613767640220-Certificate_Irobot_RVA-Y2 (Roomba s9)_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613767640220-Certificate_Irobot_RVA-Y2%20%28Roomba%20s9%29_MTC_Peru_2021.pdf

iRobot Corporation1613763938445-Cert. 430_21283-20.02_Irobot_Roomba 677_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613763938445-Cert.%20430_21283-20.02_Irobot_Roomba%20677_Brazil_2021.pdf

iRobot Corporation1613763921440-Cert. 430_21283-20.01_Irobot_Roomba 621_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613763921440-Cert.%20430_21283-20.01_Irobot_Roomba%20621_Brazil_2021.pdf

iRobot Corporation1613763900779-Cert. 430_21283-20.05_Irobot_Roomba e5_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613763900779-Cert.%20430_21283-20.05_Irobot_Roomba%20e5_Brazil_2021.pdf

CRADLEPOINT1613739351717-Certificate_Cradlepoint_S5A950A_CRC_Colombia_2021..pdf
https://orbiscompliance.s3.amazonaws.com/1613739351717-Certificate_Cradlepoint_S5A950A_CRC_Colombia_2021..pdf

iRobot Corporation1613572073247-Decl_21283-20.01 (19752-19.01_M1)Irobot_Roombai7+_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613572073247-Decl_21283-20.01%20%2819752-19.01_M1%29Irobot_Roombai7%2B_Brazil_2021.pdf

iRobot Corporation1613572064760-Cert.371_19752-19.01_IROBOT_Roombai7+_BRAZIL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613572064760-Cert.371_19752-19.01_IROBOT_Roombai7%2B_BRAZIL_2021.pdf

Topcon1613571728213-CoC_Topcon_ GRX3_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613571728213-CoC_Topcon_%20GRX3_ANATEL_Brazil_2021.pdf

Topcon1613571694959-CoC_Topcon_ GRX3_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613571694959-CoC_Topcon_%20GRX3_ANATEL_Brazil_2021.pdf

Topcon1613571688391-CoC_Topcon_ GRX3_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1613571688391-CoC_Topcon_%20GRX3_ANATEL_Brazil_2021.pdf

BOSCH1613153016732-Certificate_BOSCH_GLM 120 C_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613153016732-Certificate_BOSCH_GLM%20120%20C_ATT_Bolivia_2021.pdf

TOPCON1613139814281-Audit Confirmation_Certificate_TOPCON_HIPer VR_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613139814281-Audit%20Confirmation_Certificate_TOPCON_HIPer%20VR_NYCE_Mexico_2021.pdf

TOPCON1613139743850-Audit Confirmation_Certificate_TOPCON_HIPer VR_NYCE_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613139743850-Audit%20Confirmation_Certificate_TOPCON_HIPer%20VR_NYCE_Mexico.pdf

CRICUT1613134561596-Certificate_CRICUT_CXPL203_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1613134561596-Certificate_CRICUT_CXPL203_ASEP_Panama_2021.pdf

CRICUT1613075251823-Certificate_Cricut_CXPL203_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613075251823-Certificate_Cricut_CXPL203_ATT_Bolivia_2021.pdf

CRICUT1613072471822-Certificate_Cricut_CXPL303_ATT_Bolivia_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1613072471822-Certificate_Cricut_CXPL303_ATT_Bolivia_2021.pdf

DNP1612791260309-Certificate_DNP_ORANGE PI ZERO LTS 512MB_ARCOTEL_Ecuador_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612791260309-Certificate_DNP_ORANGE%20PI%20ZERO%20LTS%20512MB_ARCOTEL_Ecuador_2021.pdf

BOSCH1612788589548-Certificate_BOSCH_GML 120 C_INDOTEL_Dominican Republic_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1612788589548-Certificate_BOSCH_GML%20120%20C_INDOTEL_Dominican%20Republic_2021.pdf

Roku1612550652543-CoC_Roku_3930x_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612550652543-CoC_Roku_3930x_ANATEL_Brazil_2021.pdf

CASA SYSTEMS1612532320859-Certificate_casa systems_LTE-1006-07_IFT_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1612532320859-Certificate_casa%20systems_LTE-1006-07_IFT_Mexico_2021.pdf

u-blox AG1612374608112-CoH_UBOX_BMD-350_ANATEL_Brazil_2021.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612374608112-CoH_UBOX_BMD-350_ANATEL_Brazil_2021.pdf.pdf

u-blox AG1612374570240-CoH_UBOX_BMD-300_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612374570240-CoH_UBOX_BMD-300_ANATEL_Brazil_2021.pdf

CRADLEPOINT1612371698368-Certificate_Cradlepoint_S5A950A_SUTEL_Costa Rica_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612371698368-Certificate_Cradlepoint_S5A950A_SUTEL_Costa%20Rica_2021.pdf

LENOVO1612282099004-Certificate_Lenovo_Yoga Slim 7 Pro 14ACH5_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612282099004-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5_SUBTEL_Chile_2021.pdf

LENOVO1612281975117-Certificate_Lenovo_Legion 7 16ACHg6_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612281975117-Certificate_Lenovo_Legion%207%2016ACHg6_SUBTEL_Chile_2021.pdf

LENOVO1612281819185-Certificate_Lenovo_Yoga Slim 7 Pro 14ACH5 O_SUBTEL_Chile_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1612281819185-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ACH5%20O_SUBTEL_Chile_2021.pdf

CRICUT1612281632417-Certificate_Cricut_CXPL203_Paraguay_CONATEL_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1612281632417-Certificate_Cricut_CXPL203_Paraguay_CONATEL_2021.pdf

iRobot Corporation1611952879048-Declaration of Maintenance_21283-20.11 (19141-19.01_M1)_ Roomba S9+.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611952879048-Declaration%20of%20Maintenance_21283-20.11%20%2819141-19.01_M1%29_%20Roomba%20S9%2B.pdf

iRobot Corporation1611952840607-19141-19.01_Irobot_Roomba S9+_Jabil_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611952840607-19141-19.01_Irobot_Roomba%20S9%2B_Jabil_Brazil_2021.pdf

CRICUT1611947268237-Certificate_Cricut_CXPL203_MTC_Peru_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611947268237-Certificate_Cricut_CXPL203_MTC_Peru_2021.pdf

CRICUT1611938306370-Certificate_Cricut_CXPL303_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1611938306370-Certificate_Cricut_CXPL303_MTC_Peru_2021.pdf

IROBOT1611873930192-CERTIFICATE_NESTEK DE MEXICO SA DE CV_IROBOT_RVD-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611873930192-CERTIFICATE_NESTEK%20DE%20MEXICO%20SA%20DE%20CV_IROBOT_RVD-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2021.pdf

iRobot Corporation1611860026412-RELATORIA FINAL - 20659-20 - Shezhen Kin Yat Power Electronic.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611860026412-RELATORIA%20%20FINAL%20-%20%2020659-20%20-%20Shezhen%20Kin%20Yat%20Power%20Electronic.pdf

iRobot Corporation1611859798990-RELATORIA FINAL - 21283-20 - Jabil Circuit (Guangzhou) Limited - 2020-12-09- Wantty Huang - icbr .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611859798990-RELATORIA%20%20FINAL%20-%20%2021283-20%20%20-%20%20Jabil%20Circuit%20%28Guangzhou%29%20Limited%20%20-%20%202020-12-09-%20Wantty%20Huang%20-%20icbr%20.pdf

iRobot Corporation1611859777056-RELATORIA FINAL - 19548-19 - HUIZHOU BYD ELECTRONIC CO., LTD.- 2020-07-13 - Wantty Huang - icbr .pdf
https://orbiscompliance.s3.amazonaws.com/1611859777056-RELATORIA%20%20FINAL%20-%2019548-19%20-%20HUIZHOU%20BYD%20ELECTRONIC%20CO.%2C%20LTD.-%202020-07-13%20-%20%20Wantty%20Huang%20-%20icbr%20.pdf

Duracell US Operations Inc.1611768655650-9V_Duracell:Procell_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611768655650-9V_Duracell%3AProcell_Brazil_2020.pdf

Duracell US Operations Inc.1611768644071-AAA-C-D_Duracell:Procell_Brazil_2020_.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611768644071-AAA-C-D_Duracell%3AProcell_Brazil_2020_.pdf

Duracell US Operations Inc.1611768630508-AA_Duracell:Procell_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611768630508-AA_Duracell%3AProcell_Brazil_2020.pdf

DNP1611759024773-Certificate_DNP_Orange Pi Zero LTS 512MB_Chile_SUBTEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611759024773-Certificate_DNP_Orange%20Pi%20Zero%20LTS%20512MB_Chile_SUBTEL_2021.pdf

Ublox1611685672873-CoC_UBOX_BMD-350_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611685672873-CoC_UBOX_BMD-350_ANATEL_Brazil_2021.pdf

Ublox1611685599862-CoC_UBOX_BMD-300_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611685599862-CoC_UBOX_BMD-300_ANATEL_Brazil_2021.pdf

BOSCH1611683132426-Certificate_BOSCH_GLM 120 C_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1611683132426-Certificate_BOSCH_GLM%20120%20C_MTC_Peru_2021.pdf

KINGSTON1611672628197-Certificate_Kingston_HXS-HSDG2_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611672628197-Certificate_Kingston_HXS-HSDG2_NYCE_Mexico_2021.pdf

IROBOT1611616117218-EXTENSION-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611616117218-EXTENSION-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf

IROBOT1611616117183-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611616117183-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf

DNP1611604186639-Certificate_DNP_Orange Pi Zero LTS 512MB_MTC_Peru_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1611604186639-Certificate_DNP_Orange%20Pi%20Zero%20LTS%20512MB_MTC_Peru_2021.pdf

LENOVO1611581536549-Certificate_Lenovo_ThinkEdge SE50_SUBTEL_Chile 2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611581536549-Certificate_Lenovo_ThinkEdge%20SE50_SUBTEL_Chile%202021.pdf

KINGSTON1611315941580-CoC_KINGSTON_HXS-MCWA1_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611315941580-CoC_KINGSTON_HXS-MCWA1_ANATEL_Brazil_2021.pdf

KINGSTON1611315930928-CoC_KINGSTON_HX-MC006B_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611315930928-CoC_KINGSTON_HX-MC006B_ANATEL_Brazil_2021.pdf

CRICUT1611257651513-Certificate_CRICUT_CXPL203_SIGET_El Salvador_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611257651513-Certificate_CRICUT_CXPL203_SIGET_El%20Salvador_2021.pdf

CRICUT1611256588570-Certificate_CRICUT_CXPL303_SIGET_El Salvador_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611256588570-Certificate_CRICUT_CXPL303_SIGET_El%20Salvador_2021.pdf

CRICUT1611256330614-Certificate_CRICUT_CXPL303_SIGET_Guatemala_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611256330614-Certificate_CRICUT_CXPL303_SIGET_Guatemala_2021.pdf

IROBOT1611252932143-TÜV APROBACION E-022-09-0209_QR-0000000363028.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611252932143-TU%CC%88V%20APROBACION%20E-022-09-0209_QR-0000000363028.pdf

CRICUT1611252905758-TÜV APROBACION E-022-09-0209_QR-0000000363028.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611252905758-TU%CC%88V%20APROBACION%20E-022-09-0209_QR-0000000363028.pdf

CRICUT1611252885956-TÜV APROBACION E-022-09-0209_QR-0000000363028.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611252885956-TU%CC%88V%20APROBACION%20E-022-09-0209_QR-0000000363028.pdf

CRICUT1611249731187-CERTIFICATE_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611249731187-CERTIFICATE_CRICUT_CMP01100_NOM-003-SCFI-2014_NYCE_MEXICO_2021.pdf

CRADLEPOINT1611247847029-CERTIFICATE_EXTENSION_HS CODE ADDITION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611247847029-CERTIFICATE_EXTENSION_HS%20CODE%20ADDITION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf

CRADLEPOINT1611247716569-CERTIFICATE_HS CODE ADDITION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611247716569-CERTIFICATE_HS%20CODE%20ADDITION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2021.pdf

DURACELL1611236532722-CoC_DURACELL_PB3_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611236532722-CoC_DURACELL_PB3_ANATEL_Brazil_2021.pdf

DURACELL1611236521946-CoC_DURACELL_PB2_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611236521946-CoC_DURACELL_PB2_ANATEL_Brazil_2021.pdf

DURACELL1611236508298-CoC_DURACELL_PB1_ANATEL_Brazil_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611236508298-CoC_DURACELL_PB1_ANATEL_Brazil_2021.pdf

CRICUT1611235019688-Certificate_Cricut_CXPL203_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1611235019688-Certificate_Cricut_CXPL203_SUBTEL_Chile_2020.pdf

DNP1611168622918-CoH_DNP_X8PRO_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611168622918-CoH_DNP_X8PRO_ANATEL_Brazil_2020.pdf

DNP1611168568144-CoC_DNP_X8PRO_ANATEL_Brazil_2020.PDF
https://orbiscompliance.s3.amazonaws.com/1611168568144-CoC_DNP_X8PRO_ANATEL_Brazil_2020.PDF

DURACELL1611078846986-BT-ARG 4084372-Certificate_Procell_9V_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611078846986-BT-ARG%204084372-Certificate_Procell_9V_TUV_Argentina_2021.pdf

DURACELL1611078820506-BT-ARG 4084374-Certificate_Procell_C&D_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611078820506-BT-ARG%204084374-Certificate_Procell_C%26D_TUV_Argentina_2021.pdf

DURACELL1611078802202-BT-ARG 4084373-Certificate_Procell_AA&AAA_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1611078802202-BT-ARG%204084373-Certificate_Procell_AA%26AAA_TUV_Argentina_2021.pdf

KINGSTON1611066465782-Certificate_Kingston_HX-HSCF-BK_NYCE_Mexico_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1611066465782-Certificate_Kingston_HX-HSCF-BK_NYCE_Mexico_2021.pdf

iRobot Corporation1610982685639-IBAMA Autorization_8877266 (RVD-Y1-ROOMBA 960).html
https://orbiscompliance.s3.amazonaws.com/1610982685639-IBAMA%20Autorization_8877266%20%28RVD-Y1-ROOMBA%20960%29.html

LENOVO1610737935540-Certificate_RAZER_RZ01-0373_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610737935540-Certificate_RAZER_RZ01-0373_SUBTEL_Chile_2020.pdf

CRICUT1610734099624-Certificate_CRICUT_CXPL303_SIT_Guatemala_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610734099624-Certificate_CRICUT_CXPL303_SIT_Guatemala_2021.pdf

CRICUT1610723983991-Certificate_Cricut_CXPL303_Paraguay_CONATEL_2020.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610723983991-Certificate_Cricut_CXPL303_Paraguay_CONATEL_2020.PDF

KCTL1610720880422-Certificate_Samsung_MIM-H04N_Telecommunications Agency_Guyana_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610720880422-Certificate_Samsung_MIM-H04N_Telecommunications%20Agency_Guyana_2020.pdf

IROBOT1610657202903-CERTIFICATE_FORM C_CE-2021-01316205-APN-DNRT#MDP_IROBOT_ADD-N1_TUV-ARGENTINA_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610657202903-CERTIFICATE_FORM%20C_CE-2021-01316205-APN-DNRT%23MDP_IROBOT_ADD-N1_TUV-ARGENTINA_2021.pdf

IROBOT1610657098784-CERTIFICATE_Constancia_800-20-5245_IROBOT_ADD-N1_TUV_ARGENTINA_2021.pdf
https://orbiscompliance.s3.amazonaws.com/1610657098784-CERTIFICATE_Constancia_800-20-5245_IROBOT_ADD-N1_TUV_ARGENTINA_2021.pdf

CASA SYSTEMS1610651221456-CERTIFICATE_CASA SYSTEMS_AS5916-54XKS_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610651221456-CERTIFICATE_CASA%20SYSTEMS_AS5916-54XKS_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

CASA SYSTEMS1610650397959-CERTIFICATE_CASA SYSTEMS_LTE-1006-07_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610650397959-CERTIFICATE_CASA%20SYSTEMS_LTE-1006-07_NPMX_MEXICO_2020.pdf

CRICUT1610649832660-Certificate_CRICUT_CXPL303_ASEP_Panama_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610649832660-Certificate_CRICUT_CXPL303_ASEP_Panama_2021.pdf

BOSCH1610635460514-Certificate_BOSCH_GLM 120 C_Paraguay_CONATEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610635460514-Certificate_BOSCH_GLM%20120%20C_Paraguay_CONATEL_2021.pdf

BOSCH1610635396593-Certificate_BOSCH_GLM 50 C_Paraguay_CONATEL_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610635396593-Certificate_BOSCH_GLM%2050%20C_Paraguay_CONATEL_2021.pdf

LENOVO1610628412770-Certificate_Lenovo_Yoga Slim 7 Pro 14IHU5_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1610628412770-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014IHU5_Chile_SUBTEL_2020.pdf

DURACELL1610394838579-V&C-NOM-024-SCFI-2013-DURACELL-2021.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610394838579-V%26C-NOM-024-SCFI-2013-DURACELL-2021.zip

DURACELL1610394249221-INSPEC-UVA-NOM-024-SCFI-2013-DURACELL-2021.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610394249221-INSPEC-UVA-NOM-024-SCFI-2013-DURACELL-2021.zip

BOSCH1610115471872-Certificate_BOSCH_GLM 120 C_URSEC_Uruguay_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610115471872-Certificate_BOSCH_GLM%20120%20C_URSEC_Uruguay_2021.pdf

DURACELL1610114804191-BT-ARG 4084374-Certificate_Duracell_C&D_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610114804191-BT-ARG%204084374-Certificate_Duracell_C%26D_TUV_Argentina_2021.pdf

DURACELL1610114761352-BT-ARG 4084373-Certificate_Duracell_AA&AAA_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610114761352-BT-ARG%204084373-Certificate_Duracell_AA%26AAA_TUV_Argentina_2021.pdf

DURACELL1610114665299-BT-ARG 4084372-Certificate_Duracell_9V_TUV_Argentina_2021.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610114665299-BT-ARG%204084372-Certificate_Duracell_9V_TUV_Argentina_2021.pdf

DURACELL1610111946246-CNCP6642_Certificate_Procell_9V_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610111946246-CNCP6642_Certificate_Procell_9V_CNCP_Mexico_2020.pdf

DURACELL1610111829121-CNCP6640_Certificate_Procell_C&D_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1610111829121-CNCP6640_Certificate_Procell_C%26D_CNCP_Mexico_2020.pdf

DURACELL1610111604696-CNCP6641_Certificate_Procell_AA&AAA_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1610111604696-CNCP6641_Certificate_Procell_AA%26AAA_CNCP_Mexico_2020.pdf

CASA SYSTEMS1610053693484-CERTIFICATE_FORM B_CASA SYSTEMS_DA800R_CE-2020-88218286-APN-DNRT#MDP_ARGENTINA_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1610053693484-CERTIFICATE_FORM%20B_CASA%20SYSTEMS_DA800R_CE-2020-88218286-APN-DNRT%23MDP_ARGENTINA_2020.pdf

TA1609868470580-CERTIFICATE_FLEX_FT205-LM0Q-AT_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609868470580-CERTIFICATE_FLEX_FT205-LM0Q-AT_IFT_MEXICO_2020.pdf

TA1609868365971-CERTIFICATE_FLEX_FT204-LM0Q-AT_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609868365971-CERTIFICATE_FLEX_FT204-LM0Q-AT_IFT_MEXICO_2020.pdf

TA1609868168216-CERTIFICATE_FLEX_FT204-LM0QT-AT_FT205-LM0QT-AT_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609868168216-CERTIFICATE_FLEX_FT204-LM0QT-AT_FT205-LM0QT-AT_NYCE_MEXICO_2020.pdf

KINGSTON1609854209561-Certificate_KINGSTON_HX-HSCFX-BK:WW (Add HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609854209561-Certificate_KINGSTON_HX-HSCFX-BK%3AWW%20%28Add%20HS%20Code%29_NYCE_Mexico_2020.pdf

KINGSTON1609853591775-Certficate_KINGSTON_CL002 (Add HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609853591775-Certficate_KINGSTON_CL002%20%28Add%20HS%20Code%29_NYCE_Mexico_2020.pdf

KINGSTON1609853325955-Certificate_KINGSTON_CF001 (Add HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609853325955-Certificate_KINGSTON_CF001%20%28Add%20HS%20Code%29_NYCE_Mexico_2020.pdf

KINGSTON1609852550028-Certificado_KINGSTON_CEB002 (Add HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1609852550028-Certificado_KINGSTON_CEB002%20%28Add%20HS%20Code%29_NYCE_Mexico_2020.pdf

MIKROTIK1609299087488-Certificate MIKROTIK RBD22UGS-5HPacD2HnD-15S (mANTBox 52 15s) IFT MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609299087488-Certificate%20MIKROTIK%20RBD22UGS-5HPacD2HnD-15S%20%28mANTBox%2052%2015s%29%20IFT%20MEXICO%202020.pdf

MIKROTIK1609299063677-Certificate MIKROTIK RBD53iG-5HacD2HnD (hAP ac3) IFT MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609299063677-Certificate%20MIKROTIK%20RBD53iG-5HacD2HnD%20%28hAP%20ac3%29%20IFT%20MEXICO%202020.pdf

NEDAP1609251128133-Certificate_Nedap_Convex MD80C_IFT_México_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609251128133-Certificate_Nedap_Convex%20MD80C_IFT_Me%CC%81xico_2020.pdf

DURACELL1609248886765-20147UCCNOM-024-SCFI-2013000877_Certificate_Procell_9V_12Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609248886765-20147UCCNOM-024-SCFI-2013000877_Certificate_Procell_9V_12Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1609248820043-20147UCCNOM-024-SCFI-2013000876_Certificate_Procell_D_12Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609248820043-20147UCCNOM-024-SCFI-2013000876_Certificate_Procell_D_12Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1609248747035-20147UCCNOM-024-SCFI-2013000875_Certificate_Procell_C_12Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609248747035-20147UCCNOM-024-SCFI-2013000875_Certificate_Procell_C_12Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1609248634762-20147UCCNOM-024-SCFI-2013000874_Certificate_Procell_AAA_24Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609248634762-20147UCCNOM-024-SCFI-2013000874_Certificate_Procell_AAA_24Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1609248548840-20147UCCNOM-024-SCFI-2013000873_Certificate_Procell_AA_24Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1609248548840-20147UCCNOM-024-SCFI-2013000873_Certificate_Procell_AA_24Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1609176073434-NOM-024-SCFI-2013_Dictamen_Certificates_Duracell_INSPEC_UVA_MEXICO_2020_2:2.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609176073434-NOM-024-SCFI-2013_Dictamen_Certificates_Duracell_INSPEC_UVA_MEXICO_2020_2%3A2.zip

DURACELL1609175111914-NOM-024-SCFI-2013_Dictamen_Certificates_Duracell_INSPEC_UVA_MEXICO_2020_1:2.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1609175111914-NOM-024-SCFI-2013_Dictamen_Certificates_Duracell_INSPEC_UVA_MEXICO_2020_1%3A2.zip

NUSKIN1609162152838-2020031338_Certificate_NuSkin_ageLOC_BOOST_INVIMA_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1609162152838-2020031338_Certificate_NuSkin_ageLOC_BOOST_INVIMA_Colombia_2020.pdf

DNP1608726658020-Certificate_DNP_ORANGE PI ZERO LTS 512MB_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1608726658020-Certificate_DNP_ORANGE%20PI%20ZERO%20LTS%20512MB_CRC_Colombia_2020.pdf

KCTL1608659292136-Certificate_Samsung_MIM-H04N_BURTEL_Curacao_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1608659292136-Certificate_Samsung_MIM-H04N_BURTEL_Curacao_2020.pdf

LENOVO1608576741600-Certificate_Lenovo_Yoga Duet 7 13ITL6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608576741600-Certificate_Lenovo_Yoga%20Duet%207%2013ITL6_SUBTEL_Chile_2020.pdf

LENOVO1608572860053-Certificate_Lenovo_Lenovo V15 G1 IML_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608572860053-Certificate_Lenovo_Lenovo%20V15%20G1%20IML_SUBTEL_Chile_2020.pdf

LENOVO1608570749640-Certificate_Lenovo_Lenovo V14 G1 IML_SUBTEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608570749640-Certificate_Lenovo_Lenovo%20V14%20G1%20IML_SUBTEL_2020.pdf

LENOVO1608563431359-Certificate_Lenovo_IdeaPad 3 17ITL6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608563431359-Certificate_Lenovo_IdeaPad%203%2017ITL6_SUBTEL_Chile_2020.pdf

BOSCH1608558334800-Certificate_BOSCH_GLM 120 C_ ASEP_Panama_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608558334800-Certificate_BOSCH_GLM%20120%20C_%20ASEP_Panama_2020.pdf

BOSCH1608558330216-Certificate_BOSCH_GLM 120 C_ ASEP_Panama_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1608558330216-Certificate_BOSCH_GLM%20120%20C_%20ASEP_Panama_2020.pdf

INDSCI1608300644894-CoH_INDSCI_RGX_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608300644894-CoH_INDSCI_RGX_ANATEL_Brazil_2020.pdf

KINGSTON1608297802217-Certificate_KINGSTON_CLOUD FLIGHT S (HS Code Added)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608297802217-Certificate_KINGSTON_CLOUD%20FLIGHT%20S%20%28HS%20Code%20%20Added%29_NYCE_Mexico_2020.pdf

ARISTA1608292730701-CoH_ARISTA_C-260_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1608292730701-CoH_ARISTA_C-260_ANATEL_Brazil_2020.pdf

ROKU1608239964181-CERTIFICATE_ROKU_PA-1120-42RU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608239964181-CERTIFICATE_ROKU_PA-1120-42RU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf

KINGSTON1608236219900-CERTIFICATE_HS CODE ADDITION 85044099_KINGSTON_CHARGLEPLAY DUO XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608236219900-CERTIFICATE_HS%20CODE%20ADDITION%2085044099_KINGSTON_CHARGLEPLAY%20DUO%20XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

KINGSTON1608236122224-CERTIFICATE_HS CODE ADDITION 85044099_KINGSTON_CHARGEPLAYDUO PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608236122224-CERTIFICATE_HS%20CODE%20ADDITION%2085044099_KINGSTON_CHARGEPLAYDUO%20PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

KINGSTON1608236116885-CERTIFICATE_HS CODE ADDITION 85044099_KINGSTON_CHARGEPLAYDUO PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608236116885-CERTIFICATE_HS%20CODE%20ADDITION%2085044099_KINGSTON_CHARGEPLAYDUO%20PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

Kingston1608228082399-CoH_Kingston_HX-HSCAM-GM_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1608228082399-CoH_Kingston_HX-HSCAM-GM_ANATEL_Brazil_2020.pdf

LENOVO1607975244023-Certificate_Lenovo_Yoga Slim 7 Pro 14ITL5_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607975244023-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ITL5_SUBTEL_Chile_2020.pdf

Kingston1607958237658-CoC_Kingston_HX-HSCAM-GM_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607958237658-CoC_Kingston_HX-HSCAM-GM_ANATEL_Brazil_2020.pdf

DURACELL1607716591268-GenommaConstancyLetter-DURACELL-Alkaline Batteries-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607716591268-GenommaConstancyLetter-DURACELL-Alkaline%20Batteries-INTERTEK-Colombia-2020.pdf

DURACELL1607716521961-PSMTConstancyLetter-DURACELL-Alkaline Batteries-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607716521961-PSMTConstancyLetter-DURACELL-Alkaline%20Batteries-INTERTEK-Colombia-2020.pdf

DURACELL1607716518164-PSMTConstancyLetter-DURACELL-Alkaline Batteries-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607716518164-PSMTConstancyLetter-DURACELL-Alkaline%20Batteries-INTERTEK-Colombia-2020.pdf

LENOVO1607695413217-Certificate_Lenovo_IdeaPad 3 17ALC6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607695413217-Certificate_Lenovo_IdeaPad%203%2017ALC6_SUBTEL_Chile_2020.pdf

SION S.A.1607693279312-Certificate_APD_WB-24J12R; WB-24J12FA_Lealtad Comercial_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607693279312-Certificate_APD_WB-24J12R%3B%20WB-24J12FA_Lealtad%20Comercial_Argentina_2020.pdf

KCTL1607612464350-Certificate_SAMSUNG_MIM-H04N_TATT_Trinidad & Tobago_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607612464350-Certificate_SAMSUNG_MIM-H04N_TATT_Trinidad%20%26%20Tobago_2020.pdf

SION S.A.1607607307857-Certificate_APD_WB-24J12R; WB-24J12FA_IRAM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607607307857-Certificate_APD_WB-24J12R%3B%20WB-24J12FA_IRAM_Argentina_2020.pdf

DURACELL1607549993264-Certificate-DURACELL-9V:Malaysia-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607549993264-Certificate-DURACELL-9V%3AMalaysia-INTERTEK-Colombia-2020.pdf

DURACELL1607549932785-Certificate-DURACELL-C&D:USA-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607549932785-Certificate-DURACELL-C%26D%3AUSA-INTERTEK-Colombia-2020.pdf

DURACELL1607549903224-Certificate-DURACELL-AA&AAA:USA-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607549903224-Certificate-DURACELL-AA%26AAA%3AUSA-INTERTEK-Colombia-2020.pdf

DURACELL1607549851022-Certificate-DURACELL-AA&AAA:China-INTERTEK-Colombia-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607549851022-Certificate-DURACELL-AA%26AAA%3AChina-INTERTEK-Colombia-2020.pdf

KCTL1607531977052-Certificate_Samsung_MIM-H04N_PUC_Belize_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607531977052-Certificate_Samsung_MIM-H04N_PUC_Belize_2020.pdf

KINGSTON1607524643698-Certificate_Kingston_CS002(Additional HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607524643698-Certificate_Kingston_CS002%28Additional%20HS%20Code%29_NYCE_Mexico_2020.pdf

KINGSTON1607524640051-Certificate_Kingston_CS002(Additional HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607524640051-Certificate_Kingston_CS002%28Additional%20HS%20Code%29_NYCE_Mexico_2020.pdf

KINGSTON1607523580460-Certificate_Kingston_CS002(Aditional HS Code)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607523580460-Certificate_Kingston_CS002%28Aditional%20HS%20Code%29_NYCE_Mexico_2020.pdf

SATO1607489877378-Certificate_SATO_ML-CHG06-01_NPMX_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607489877378-Certificate_SATO_ML-CHG06-01_NPMX_Mexico_2020.pdf

SATO1607488856157-Certificate Extension SATO CL4NX & CL4NX Plus NPMX 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607488856157-Certificate%20Extension%20SATO%20CL4NX%20%26%20CL4NX%20Plus%20NPMX%202020.pdf

KINGSTON1607431562909-20147UCCNOM-024-SCFI-2013000711_Certificate_Kingston_ HX-HSCFX-BK:WW & HXS-HSCFX-WA1_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607431562909-20147UCCNOM-024-SCFI-2013000711_Certificate_Kingston_%20HX-HSCFX-BK%3AWW%20%26%20HXS-HSCFX-WA1_INSPEC-UVA_Mexico_2020.pdf

KCTL1607351671161-Certifcate_SAMSUNG_MIM-H04N_OfReg_Cayman Islands_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607351671161-Certifcate_SAMSUNG_MIM-H04N_OfReg_Cayman%20Islands_2020.pdf

KINGSTON1607091835627-20147UCCNOM-024-SCFI-2013000711_Certificate_Kingston_ CF00 (CF001WA)_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607091835627-20147UCCNOM-024-SCFI-2013000711_Certificate_Kingston_%20CF00%20%28CF001WA%29_INSPEC-UVA_Mexico_2020.pdf

SONY1607028667547-Certificate_SONY_CFI-ZWD1_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607028667547-Certificate_SONY_CFI-ZWD1_ATT_Bolivia_2020.pdf

KINGSTON1607025322763-DICTAMEN_KINGSTON_HX-HSCF-BK_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607025322763-DICTAMEN_KINGSTON_HX-HSCF-BK_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

KINGSTON1607024885918-CERTIFICATE EXTENSION_HS CODE ADDITION_KINGSTON_CHARGEPLAY DUO FOR XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607024885918-CERTIFICATE%20EXTENSION_HS%20CODE%20ADDITION_KINGSTON_CHARGEPLAY%20DUO%20FOR%20XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

KINGSTON1607024623008-CERTIFICATE EXTENSION_HS CODE ADDITION_KINGSTON_CHARGEPLAYDUO FOR PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607024623008-CERTIFICATE%20EXTENSION_HS%20CODE%20ADDITION_KINGSTON_CHARGEPLAYDUO%20FOR%20PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

SONY1607013634740-Certificate-SONY-CFI-ZWD1-TELCOR-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1607013634740-Certificate-SONY-CFI-ZWD1-TELCOR-Nicaragua-2020.pdf

SONY1607013592018-Certificate-SONY-CFI-ZWH1-TELCOR-Nicaragua-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1607013592018-Certificate-SONY-CFI-ZWH1-TELCOR-Nicaragua-2020.pdf

KCTL1606914491795-Certificate_SAMSUNG_MIM-H04N_SMA_Jamaica_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606914491795-Certificate_SAMSUNG_MIM-H04N_SMA_Jamaica_2020.pdf

DURACELL1606749473222-BT-ARG 3983344 (R1)-Certificate_Duracell_9V_TUV_Argentina_2020 signed.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606749473222-BT-ARG%203983344%20%28R1%29-Certificate_Duracell_9V_TUV_Argentina_2020%20signed.pdf

DURACELL1606749459047-BT-ARG 4082268 (R1) Certificate_Duracell_C_D_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606749459047-BT-ARG%204082268%20%28R1%29%20Certificate_Duracell_C_D_TUV_Argentina_2020.pdf

DURACELL1606749442195-BT-ARG 4082271 (R1) Certificate_Duracell_675_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606749442195-BT-ARG%204082271%20%28R1%29%20Certificate_Duracell_675_TUV_Argentina_2020.pdf

DURACELL1606749422802-BT-ARG 4082272 (R1) Certificate_Duracell_AA_AAA_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606749422802-BT-ARG%204082272%20%28R1%29%20Certificate_Duracell_AA_AAA_TUV_Argentina_2020.pdf

DURACELL1606746574008-20147UDCNOM-024-SCFI-2013003477-Dictamen_Certificate_Duracell_Quantum_AA_2Pz, 4Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746574008-20147UDCNOM-024-SCFI-2013003477-Dictamen_Certificate_Duracell_Quantum_AA_2Pz%2C%204Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1606746574002-20147UDCNOM-024-SCFI-2013003197-Dictamen_Certificate_Duracell_123, 1Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746574002-20147UDCNOM-024-SCFI-2013003197-Dictamen_Certificate_Duracell_123%2C%201Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1606746573986-20147UDCNOM-024-SCFI-2013003475-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746573986-20147UDCNOM-024-SCFI-2013003475-Dictamen_Certificate_Duracell_Quantum_AAA_2Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1606746573975-20147UDCNOM-024-SCFI-2013003476-Dictamen_Certificate_Duracell_Quantum_AA_2Pz, 16Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746573975-20147UDCNOM-024-SCFI-2013003476-Dictamen_Certificate_Duracell_Quantum_AA_2Pz%2C%2016Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1606746573735-20147UDCNOM-024-SCFI-2013003195-Dictamen_Certificate_Duracell_Quantum_AAA_4Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746573735-20147UDCNOM-024-SCFI-2013003195-Dictamen_Certificate_Duracell_Quantum_AAA_4Pz_INSPEC-UVA_Mexico_2020.pdf

DURACELL1606746573965-20147UDCNOM-024-SCFI-2013003196-Dictamen_Certificate_Duracell_CR2-1Pz_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606746573965-20147UDCNOM-024-SCFI-2013003196-Dictamen_Certificate_Duracell_CR2-1Pz_INSPEC-UVA_Mexico_2020.pdf

Askey1606496406828-CoC_ASKEY_RTV9015VW_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606496406828-CoC_ASKEY_RTV9015VW_ANATEL_Brazil_2020.pdf

ROKU1606492893711-CERTIFICATE SEGUIMIENTO 2020_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606492893711-CERTIFICATE%20SEGUIMIENTO%202020_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

ROKU1606492675934-CERTIFICATE SEGUIMIENTO 2020_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606492675934-CERTIFICATE%20SEGUIMIENTO%202020_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

KINGSTON1606410009412-CoH-Kingston-CL002WA-Brazil-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606410009412-CoH-Kingston-CL002WA-Brazil-2020.pdf

KINGSTON1606409982786-CoH-Kingston-CL002-Brazil-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606409982786-CoH-Kingston-CL002-Brazil-2020.pdf

KINGSTON1606398607073-20147UCCNOM-024-SCFI-201300679-Certificate_Kingston_HX-HSCF-BK(HXS-HSDG2)_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1606398607073-20147UCCNOM-024-SCFI-201300679-Certificate_Kingston_HX-HSCF-BK%28HXS-HSDG2%29_INSPEC-UVA_Mexico_2020.pdf

KINGSTON1606398407337-20147UCCNOM-024-SCFI-201300679-Certificate_Kingston_HX-HSCF-BX_INSPEC-UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1606398407337-20147UCCNOM-024-SCFI-201300679-Certificate_Kingston_HX-HSCF-BX_INSPEC-UVA_Mexico_2020.pdf

KINGSTON1605898077897-Certificate_Kingston_HX-HSCF-BX_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605898077897-Certificate_Kingston_HX-HSCF-BX_NYCE_Mexico_2020.pdf

CRICUT1605887008048-Certificate_Cricut_CXPL303_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605887008048-Certificate_Cricut_CXPL303_SUBTEL_Chile_2020.pdf

SONY1605812933363-Certificate_SONY_CFI-ZWD1_CONATEL_Honduras_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605812933363-Certificate_SONY_CFI-ZWD1_CONATEL_Honduras_2020.pdf

SONY1605809818516-Certificate_SONY_CFI-ZWH1_CONATEL_Honduras_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605809818516-Certificate_SONY_CFI-ZWH1_CONATEL_Honduras_2020.pdf

SONY1605809629947-Certificate-SONY-CFI-ZWH1-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605809629947-Certificate-SONY-CFI-ZWH1-CONATEL-Honduras-2020.pdf

SONY1605799172589-Certificate_SONY_CFI-ZWD1_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605799172589-Certificate_SONY_CFI-ZWD1_ATT_Bolivia_2020.pdf

KINGSTON1605731176816-Certificate_Kingson_CL002WA_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605731176816-Certificate_Kingson_CL002WA_IFT_Mexico_2020.pdf

KINGSTON1605731146068-Certificate_Kingson_CL002_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605731146068-Certificate_Kingson_CL002_IFT_Mexico_2020.pdf

KINGSTON1605730957830-Certificate_Kingston_CEB002_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605730957830-Certificate_Kingston_CEB002_IFT_Mexico_2020.pdf

KINGSTON1605730943724-Certificate_Kingston_CEB002_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605730943724-Certificate_Kingston_CEB002_IFT_Mexico_2020.pdf

SCOSCHE1605728242187-NOM-050-SCOSCHE-MX-2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605728242187-NOM-050-SCOSCHE-MX-2020.zip

SCOSCHE1605728177087-NOM-024-SCOSCHE-MX-2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605728177087-NOM-024-SCOSCHE-MX-2020.zip

CRADLEPOINT1605717308837-CERTIFICATE EXTENSION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605717308837-CERTIFICATE%20EXTENSION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

CRADLEPOINT1605709556767-Certificate_Cradlepoint_S5A749A_SUTEL_Costa Rica_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605709556767-Certificate_Cradlepoint_S5A749A_SUTEL_Costa%20Rica_2020.pdf

BOSCH1605636336783-Certificate_BOSCH_GLM 120 C_SUTEL_Costa Rica.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605636336783-Certificate_BOSCH_GLM%20120%20C_SUTEL_Costa%20Rica.pdf

SONY1605622245408-Certificate-SONY-CFI-ZWH1-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605622245408-Certificate-SONY-CFI-ZWH1-CONATEL-Honduras-2020.pdf

iRobot Corporation1605281882221-Autorizacao_6994855 - Roomba 960.html
https://orbiscompliance.s3.amazonaws.com/1605281882221-Autorizacao_6994855%20-%20Roomba%20960.html

CRADLEPOINT1605217680708-CERTIFICATE EXTENSION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605217680708-CERTIFICATE%20EXTENSION_CRADLEPOINT_S5A749A_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

KINGSTON1605109140656-Certificate_Kingston_CL002WA_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605109140656-Certificate_Kingston_CL002WA_ENACOM_Argentina_2020.pdf

KINGSTON1605109019243-Certificate_Kingsto_CL002_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605109019243-Certificate_Kingsto_CL002_ENACOM_Argentina_2020.pdf

SONY1605032043181-Certificate-SONY-CFI-1015B-TELECOM-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1605032043181-Certificate-SONY-CFI-1015B-TELECOM-Nicaragua-2020.pdf

SONY1605032013723-Certificate-SONY-CFI-1015A-TELECOM-Nicaragua-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1605032013723-Certificate-SONY-CFI-1015A-TELECOM-Nicaragua-2020.pdf

SONY1604952770879-Certificate-SONY-DFI-T1000AA-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604952770879-Certificate-SONY-DFI-T1000AA-CONATEL-Honduras-2020.pdf

SONY1604952747281-Certificate-SONY-CFI-1510B-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604952747281-Certificate-SONY-CFI-1510B-CONATEL-Honduras-2020.pdf

SONY1604952724560-Certificate-SONY-CFI-1015A-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604952724560-Certificate-SONY-CFI-1015A-CONATEL-Honduras-2020.pdf

SONY1604950288460-Certificate-SONY-DFI-T1000AA-TELECOM-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604950288460-Certificate-SONY-DFI-T1000AA-TELECOM-Nicaragua-2020.pdf

SONY1604945848263-CertIificate-Sony-CFI-ZMR1-Conatel-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604945848263-CertIificate-Sony-CFI-ZMR1-Conatel-Honduras-2020.pdf

SONY1604945211003-Certificate-SONY- NCFI-ZMR1-TELECOM-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604945211003-Certificate-SONY-%20NCFI-ZMR1-TELECOM-Nicaragua-2020.pdf

U-BLOX1604931839853-CoC_UBLOX_-LISA-U201_SARA-U201_ANATEL_Brazil_2020.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604931839853-CoC_UBLOX_-LISA-U201_SARA-U201_ANATEL_Brazil_2020.pdf.pdf

U-BLOX1604931810046-CoC_UBLOX_-LISA-U200_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604931810046-CoC_UBLOX_-LISA-U200_ANATEL_Brazil_2020.pdf

U-BLOX1604931794364-CoC_UBLOX_TOBY-L280-MPCI-L280_ANATEL_Brazil_20200.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604931794364-CoC_UBLOX_TOBY-L280-MPCI-L280_ANATEL_Brazil_20200.pdf

U-BLOX1604931771758-CoC_UBLOX_SARA-G350_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604931771758-CoC_UBLOX_SARA-G350_ANATEL_Brazil_2020.pdf

CoC_UBLOX_SARA-G350_ANATEL_Brazil_20201604931734378-CoC_UBLOX_SARA-G350_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604931734378-CoC_UBLOX_SARA-G350_ANATEL_Brazil_2020.pdf

iRobot Corporation1604924866281-Cert. 430_20703-20.02_IROBOT_RVD-Y1_Jabil_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604924866281-Cert.%20430_20703-20.02_IROBOT_RVD-Y1_Jabil_Brazil_2020.pdf

DIGI1604665441003-CoC_DIGI_IX20W_IMDA_Singapore_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604665441003-CoC_DIGI_IX20W_IMDA_Singapore_2020.pdf

DIGI1604665429249-CoC_DIGI_IX20_IMDA_Singapore_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604665429249-CoC_DIGI_IX20_IMDA_Singapore_2020.pdf

CoC_DIGI_IX20_IMDA_Singapore_20201604665392237-CoC_DIGI_IX20_IMDA_Singapore_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604665392237-CoC_DIGI_IX20_IMDA_Singapore_2020.pdf

CoC_DIGI_IX20_IMDA_Singapore_20201604665349024-IMDA_IX20_regn.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604665349024-IMDA_IX20_regn.pdf

iRobot Corporation1604610613782-371. 19338-19.07_IROBOT_Roomba 621-677_BYD_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604610613782-371.%2019338-19.07_IROBOT_Roomba%20621-677_BYD_Brazil_2020.pdf

iRobot Corporation1604610613778-371. 19338-19.06_IROBOT-BRAAVAJET-240_KynYat_BRAZIL-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604610613778-371.%2019338-19.06_IROBOT-BRAAVAJET-240_KynYat_BRAZIL-2020.pdf

iRobot Corporation1604610613772-430. 20659-20.01_IROBOT_Roomba 960_KinYat_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604610613772-430.%2020659-20.01_IROBOT_Roomba%20960_KinYat_Brazil_2020.pdf

iRobot Corporation1604610613720-371. 19122-19.03_IROBOT_Roomba e5_KinYat_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604610613720-371.%2019122-19.03_IROBOT_Roomba%20e5_KinYat_Brazil_2020.pdf

iRobot Corporation1604603208003-19548-19.05_IROBOT_BJ380_Brasil_2020_Rev01.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604603208003-19548-19.05_IROBOT_BJ380_Brasil_2020_Rev01.pdf

iRobot Corporation1604597301200-IBAMA Autorizacao for Roomba 614-675_7817278.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604597301200-IBAMA%20Autorizacao%20for%20Roomba%20614-675_7817278.html

iRobot Corporation1604596386776-Cert.430-IROBOT-ROOMBA-E5_INMETRO-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604596386776-Cert.430-IROBOT-ROOMBA-E5_INMETRO-BRAZIL-2020.pdf

iRobot Corporation1604596096563-5. 19338-19.05_IROBOT_960_KynYat_BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604596096563-5.%2019338-19.05_IROBOT_960_KynYat_BRAZIL-2020.pdf

iRobot Corporation1604595129337-Cert.430-IROBOT-ROOMBA-677-INMETRO-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604595129337-Cert.430-IROBOT-ROOMBA-677-INMETRO-BRAZIL-2020.pdf

iRobot Corporation1604588482006-Autorizacao_7241376.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604588482006-Autorizacao_7241376.html

iRobot Corporation1604587677558-Cert.430 -IROBOT-ROOMBA-621-INMETRO-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604587677558-Cert.430%20-IROBOT-ROOMBA-621-INMETRO-BRAZIL-2020.pdf

iRobot Corporation1604516781338-20703-20.01_IROBOT_RVD-Y1_Jabil_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604516781338-20703-20.01_IROBOT_RVD-Y1_Jabil_Brazil_2020.pdf

Lenovo1604437013282-Certificate_RAZER_344_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604437013282-Certificate_RAZER_344_SUBTEL_Chile_2020.pdf

Lenovo1604082367413-Certificate_Lenovo_TP00116D_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1604082367413-Certificate_Lenovo_TP00116D_SUBTEL_Chile_2020.pdf

Lenovo1604076123002-Certificate_Lenovo_TP00117D_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1604076123002-Certificate_Lenovo_TP00117D_SUBTEL_Chile_2020.pdf

Kingston1603979398970-CoH_KINGSTON_CEB002_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603979398970-CoH_KINGSTON_CEB002_ANATEL_Brazil_2020.pdf

HME1603747057861-CoC_HME_1402_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603747057861-CoC_HME_1402_ANATEL_Brazil_2020.pdf

MIKROTIK1603715912246-Certificate_MikroTik_hAP ac3 LTE6 kit_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603715912246-Certificate_MikroTik_hAP%20ac3%20LTE6%20kit_IFT_Mexico_2020.pdf

MIKROTIK1603715821952-Certificate_MikroTik_RBwAPR-2nD&R11e-LR9_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603715821952-Certificate_MikroTik_RBwAPR-2nD%26R11e-LR9_IFT_Mexico_2020.pdf

MIKROTIK1603715782109-Certificate_MikroTik_RBD23UGS-5HPacD2HnD-NM (NetMetal ac2)_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603715782109-Certificate_MikroTik_RBD23UGS-5HPacD2HnD-NM%20%28NetMetal%20ac2%29_IFT_Mexico_2020.pdf

MIKROTIK1603715766397-Certificate_MikroTik_hAP ac LTE6 kit_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603715766397-Certificate_MikroTik_hAP%20ac%20LTE6%20kit_IFT_Mexico_2020.pdf

SONY1603488515969-Certificate_SONY_DFI-T1000AA_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603488515969-Certificate_SONY_DFI-T1000AA_ATT_Bolivia_2020.pdf

SONY1603464397086-Certificate_SONY_CFI-105A_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603464397086-Certificate_SONY_CFI-105A_ATT_Bolivia_2020.pdf

SONY1603464374670-Certificate_SONY_CFI-105B_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603464374670-Certificate_SONY_CFI-105B_ATT_Bolivia_2020.pdf

SONY1603464345866-Certificate_SONY_CFI-T1000AA_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603464345866-Certificate_SONY_CFI-T1000AA_ATT_Bolivia_2020.pdf

SONY1603464302757-Certificate_SONY_CFI-ZWH1_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603464302757-Certificate_SONY_CFI-ZWH1_ATT_Bolivia_2020.pdf

Roku1603463194909-Certificate_Roku_3810X_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603463194909-Certificate_Roku_3810X_ENACOM_Argentina_2020.pdf

Roku1603463067170-Certificate_Roku_3910X_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603463067170-Certificate_Roku_3910X_ENACOM_Argentina_2020.pdf

KINGSTON1603401257332-Certificate_KINGSTON_HyperX - HXS-MCWA1_URSEC_Uruguay_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603401257332-Certificate_KINGSTON_HyperX%20-%20HXS-MCWA1_URSEC_Uruguay_2019.pdf

KINGSTON1603401257323-Certificate_KINGSTON_ HyperX - HX-MC006B_URSEC_Uruguay_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603401257323-Certificate_KINGSTON_%20HyperX%20-%20HX-MC006B_URSEC_Uruguay_2019.pdf

KINGSTON1603400965257-Cert. HyperX - HXS-MCWA1.pdf
https://orbiscompliance.s3.amazonaws.com/1603400965257-Cert.%20HyperX%20-%20HXS-MCWA1.pdf

KINGSTON1603400965199-Cert. HyperX - HX-MC006B.pdf
https://orbiscompliance.s3.amazonaws.com/1603400965199-Cert.%20HyperX%20-%20HX-MC006B.pdf

KINGSTON1603305929327-CoC_KINGSTON_CEB002_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603305929327-CoC_KINGSTON_CEB002_ANATEL_Brazil_2020.pdf

Lenovo1603199664185-Certificate_Lenovo_Yoga Slim 7 Pro 14ARH5_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603199664185-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ARH5_Chile_SUBTEL_2020.pdf

Lenovo1603198337703-Certificate_Lenovo_Yoga Slim 7 Pro 14ITL5_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603198337703-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ITL5_SUBTEL_Chile_2020.pdf

Kingston1603198224264-Certificate_HYPERX_CEB002_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603198224264-Certificate_HYPERX_CEB002_SUBTEL_Chile_2020.pdf

DIGI1603114299326-CoC_DIGI_IX20_ANATEL_Malaysia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603114299326-CoC_DIGI_IX20_ANATEL_Malaysia_2020.pdf

Lenovo1603111730467-Certificate_vivo_XE W2_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603111730467-Certificate_vivo_XE%20W2_SUBTEL_Chile_2020.pdf

Arista1603111427220-CoH_ARISTA_AN1733_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1603111427220-CoH_ARISTA_AN1733_ANATEL_BRAZIL_2020.pdf

Arista1603111418745-CoC_ARISTA_AN1733_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1603111418745-CoC_ARISTA_AN1733_ANATEL_BRAZIL_2020.pdf

MIKROTIK1602907181553-Certificate MIKROTIK RBD22UGS-5HPacD2HnD-15S (mANTBox 52 15s) NYCE MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602907181553-Certificate%20MIKROTIK%20RBD22UGS-5HPacD2HnD-15S%20%28mANTBox%2052%2015s%29%20NYCE%20MEXICO%202020.pdf

MIKROTIK1602907098714-Certificate MIKROTIK RBD53iG-5HacD2HnD (hAP ac3) NYCE MEXICO 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602907098714-Certificate%20MIKROTIK%20RBD53iG-5HacD2HnD%20%28hAP%20ac3%29%20NYCE%20MEXICO%202020.pdf

IROBOT1602873849385-CERTIFICATE_IROBOT_RMA-Y1_CHILE_2020_E-022-09-0078_0000000353408.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602873849385-CERTIFICATE_IROBOT_RMA-Y1_CHILE_2020_E-022-09-0078_0000000353408.pdf

KINGSTON1602852070623-Certificate-Letter_Kingston_CL002WA_MTC_Peru_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602852070623-Certificate-Letter_Kingston_CL002WA_MTC_Peru_2020.pdf

KINGSTON1602852070604-Certificate-Letter_Kingston_CL002_MTC_Peru_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602852070604-Certificate-Letter_Kingston_CL002_MTC_Peru_2020.pdf

TA Technologies1602797905624-Certificate_Quectel_EC25-MX_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602797905624-Certificate_Quectel_EC25-MX_IFT_Mexico_2020.pdf

TA Technologies1602797905581-Certificate_Quectel_EC25-MX MINIPCIE_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602797905581-Certificate_Quectel_EC25-MX%20MINIPCIE_IFT_Mexico_2020.pdf

KINGSTON1602615850043-Certificate_Kingston_CL002_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602615850043-Certificate_Kingston_CL002_NYCE_Mexico_2020.pdf

Roku1602594515289-CERTIFICATE_ROKU_PA-1120-42RU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602594515289-CERTIFICATE_ROKU_PA-1120-42RU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf

TA Technologies1602532584257-CERTIFICATE_FLEX_TT401-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532584257-CERTIFICATE_FLEX_TT401-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532568875-CERTIFICATE_FLEX_TT400-LM0Q-GL_TT401-LM0Q-GL.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532568875-CERTIFICATE_FLEX_TT400-LM0Q-GL_TT401-LM0Q-GL.pdf

TA Technologies1602532552730-CERTIFICATE_FLEX_TT400-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532552730-CERTIFICATE_FLEX_TT400-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532539774-CERTIFICATE_FLEX_HT801-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532539774-CERTIFICATE_FLEX_HT801-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532526179-CERTIFICATE_FLEX_HT800-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532526179-CERTIFICATE_FLEX_HT800-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532506080-CERTIFICATE_FLEX_FT700-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532506080-CERTIFICATE_FLEX_FT700-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532468276-CERTIFICATE_flex_FT700-LM0Q-GL_HT800-LM0Q-GL_HT801-LM0Q-GL_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532468276-CERTIFICATE_flex_FT700-LM0Q-GL_HT800-LM0Q-GL_HT801-LM0Q-GL_NYCE_2020.pdf

TA Technologies1602532457508-CERTIFICATE_FLEX_FT500-LM0Q-GL_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532457508-CERTIFICATE_FLEX_FT500-LM0Q-GL_NYCE_MEXICO_2020.pdf

TA Technologies1602532438378-CERTIFICATE_FLEX_FT500-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532438378-CERTIFICATE_FLEX_FT500-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602532309323-CERTIFICATE_FLEX_FT205-LM0Q-AT_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602532309323-CERTIFICATE_FLEX_FT205-LM0Q-AT_IFT_MEXICO_2020.pdf

TA Technologies1602531180504-CERTIFICATE_FLEX_FT204-LM0QT-AT_FT205-LM0QT-AT_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602531180504-CERTIFICATE_FLEX_FT204-LM0QT-AT_FT205-LM0QT-AT_NYCE_MEXICO_2020.pdf

TA Technologies1602531123317-CERTIFICATE_FLEX_FT204-LM0Q-AT_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602531123317-CERTIFICATE_FLEX_FT204-LM0Q-AT_IFT_MEXICO_2020.pdf

TA Technologies1602531077038-CERTIFICATE_FLEX_AT130-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602531077038-CERTIFICATE_FLEX_AT130-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602531056766-CERTIFICATE_FLEX_AT100-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602531056766-CERTIFICATE_FLEX_AT100-LM0Q-GL_IFT_MEXICO_2020.pdf

TA Technologies1602531032091-CERTIFICATE_FLEX_AT100-LM0Q-GL_AT130-LM0Q-GL_NYCE_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602531032091-CERTIFICATE_FLEX_AT100-LM0Q-GL_AT130-LM0Q-GL_NYCE_2020.pdf

KINGSTON1602510563789-Certificate_KINGSTON_CEB002_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602510563789-Certificate_KINGSTON_CEB002_NYCE_Mexico_2020.pdf

Nuskin1602510543180-Exemption Letter_Nuskin_Magnetic Charger_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602510543180-Exemption%20Letter_Nuskin_Magnetic%20Charger_MTC_Peru_2020.pdf

KINGSTON1602270313589-Certificate_Kingston_CL002WA_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602270313589-Certificate_Kingston_CL002WA_NYCE_Mexico_2020.pdf

Kingston1602102693252-Certificate_Kingston_HX-HSCFX-BK:WW_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602102693252-Certificate_Kingston_HX-HSCFX-BK%3AWW_IFT_Mexico_2020.pdf

KIngston1602102650634-Certificate_Kingston_HX-HSCFX-BK:WW_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602102650634-Certificate_Kingston_HX-HSCFX-BK%3AWW_IFT_Mexico_2020.pdf

Cricut1602002164054-Certificate-Cricut-CXPL301-Conatel-Honduras-2020 2-10-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602002164054-Certificate-Cricut-CXPL301-Conatel-Honduras-2020%202-10-2020.pdf

Kingston1602001563072-Certificate_Kingston_HXS-HSCFX-WA1_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602001563072-Certificate_Kingston_HXS-HSCFX-WA1_IFT_Mexico_2020.pdf

Kingston1602001498998-Certificate_Kingston_CS002-WA_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602001498998-Certificate_Kingston_CS002-WA_IFT_Mexico_2020.pdf

Kingston1602001480312-Certificate_Kingston_CS002_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602001480312-Certificate_Kingston_CS002_IFT_Mexico_2020.pdf

Kingston1602001448348-Certificate_Kingston_CF001WA_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602001448348-Certificate_Kingston_CF001WA_IFT_Mexico_2020.pdf

Kingston1602001436454-Certificate_Kingston_CF001_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1602001436454-Certificate_Kingston_CF001_IFT_Mexico_2020.pdf

Cricut1602001367151-Certificate-Cricut-CXPL202-Conatel-Honduras-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1602001367151-Certificate-Cricut-CXPL202-Conatel-Honduras-2020.pdf

Roku1601984324901-Certificate_Roku_RC-AL2_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1601984324901-Certificate_Roku_RC-AL2_ENACOM_Argentina_2020.pdf

Kingston1601668380062-Certificate_Kingston_CL002WA_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601668380062-Certificate_Kingston_CL002WA_SUBTEL_Chile_2020.pdf

Kingston1601668371703-Certificate_Kingston_CL002_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601668371703-Certificate_Kingston_CL002_Chile_SUBTEL_2020.pdf

iRobot1601655762570-CERTIFICATE_IROBOT_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601655762570-CERTIFICATE_IROBOT_RMA-Y1_NOM-003-SCFI-2014_NYCE_MEXICO_2020.pdf

Oracle1601655741845-CERTIFICATE_ORACLE_ALM85US15_ARGENTINA_202020AR00392.1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601655741845-CERTIFICATE_ORACLE_ALM85US15_ARGENTINA_202020AR00392.1.pdf

Oracle1601655728516-CERTIFICATE FORM C_ORACLE_MICROS EXPRESS STATION STATION 4_ARGENTINA_2020_CE-2020-59394264-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601655728516-CERTIFICATE%20FORM%20C_ORACLE_MICROS%20EXPRESS%20STATION%20STATION%204_ARGENTINA_2020_CE-2020-59394264-APN-DNRT%23MDP.pdf

Oracle1601655716513-CERTIFICATE FORM C_ORACLE_ALM85US15_ARGENTINA_2020_CE-2020-63500976-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.amazonaws.com/1601655716513-CERTIFICATE%20FORM%20C_ORACLE_ALM85US15_ARGENTINA_2020_CE-2020-63500976-APN-DNRT%23MDP.pdf

ROKU1601561311178-Certificate Roku 9102X IFT Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1601561311178-Certificate%20Roku%209102X%20IFT%20Mexico%202020.pdf

test1601555505203-Bosch.png
https://orbiscompliance.s3.amazonaws.com/1601555505203-Bosch.png

Kingston1601498512782-Certificate_Lenovo_Yoga Slim 7 Pro 14ITL5_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601498512782-Certificate_Lenovo_Yoga%20Slim%207%20Pro%2014ITL5_SUBTEL_Chile_2020.pdf

Kingston1601498501678-Certificate_HYPERX_CEB002_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1601498501678-Certificate_HYPERX_CEB002_SUBTEL_Chile_2020.pdf

Cricut1601392294903-Certificate_Cricut_CXPL202_Telcor_Nicaragua_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601392294903-Certificate_Cricut_CXPL202_Telcor_Nicaragua_2020.pdf

CRICUT1601322767790-Certificate_Cricut_CXPL301_Telcor_Nicaragua_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601322767790-Certificate_Cricut_CXPL301_Telcor_Nicaragua_2020.pdf

NEDAP1601322750380-Certificate_NEDAP_ASSY AD46R RF+RFID_ASEP_Panamá_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601322750380-Certificate_NEDAP_ASSY%20AD46R%20%20RF%2BRFID_ASEP_Panama%CC%81_2020.pdf

SONY1601318499291-Certificate_PlayStation_CFI-ZWH1_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601318499291-Certificate_PlayStation_CFI-ZWH1_Chile_SUBTEL_2020.pdf

SONY1601318489475-Certificate_PlayStation_CFI-ZWD1_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601318489475-Certificate_PlayStation_CFI-ZWD1_Chile_SUBTEL_2020.pdf

NEDAP1601305047462-Certificate_NEDAP_SMARTTAG NECK_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601305047462-Certificate_NEDAP_SMARTTAG%20NECK_ENACOM_Argentina_2020.pdf

Makerbot1601056023220-Certificate FORMC_Makerbot_Method_CE-2020-60731672-APN-DNRT#MDP-1_ARGENTINA_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601056023220-Certificate%20FORMC_Makerbot_Method_CE-2020-60731672-APN-DNRT%23MDP-1_ARGENTINA_2020.pdf

Kingston1601048851349-Certificate_Kingston_CS002-WA Perito_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601048851349-Certificate_Kingston_CS002-WA%20Perito_IFT_Mexico_2020.pdf

Kingston1601048838789-Certificate_Kingston_CS002 Perito_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1601048838789-Certificate_Kingston_CS002%20Perito_IFT_Mexico_2020.pdf

ASKEY1600957229326-CoC_ASKEY_RTA9227W_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600957229326-CoC_ASKEY_RTA9227W_ANATEL_Brazil_2020.pdf

NEDAP1600877403161-Certificate_NEDAP_VP4011_IFT_Mexico_2020(Corrected).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600877403161-Certificate_NEDAP_VP4011_IFT_Mexico_2020%28Corrected%29.pdf

SATO1600833632256-Certificate SATO PW208NX IFT Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1600833632256-Certificate%20SATO%20PW208NX%20IFT%20Mexico%202020.pdf

KINGSTON1600791994588-CoC-Kingston-CL002WA-Brazil-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600791994588-CoC-Kingston-CL002WA-Brazil-2020.pdf

SONY1600780173565-Certificate_PlayStation_CFI-ZWD1_CONATEL_Paraguay2020.pdf
https://orbiscompliance.s3.amazonaws.com/1600780173565-Certificate_PlayStation_CFI-ZWD1_CONATEL_Paraguay2020.pdf

SONY1600719203125-Certificate_PlayStation_CFI-ZWH1_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600719203125-Certificate_PlayStation_CFI-ZWH1_CONATEL_Paraguay_2020.pdf

KINGSTON1600718474059-CoC-Kingston-CL002-Brazil-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600718474059-CoC-Kingston-CL002-Brazil-2020.pdf

ARISTA1600700260977-CoC_ARISTA_C-260_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600700260977-CoC_ARISTA_C-260_ANATEL_Brazil_2020.pdf

MORLAB1600444320076-Certificate_JVC_KD-M56BT_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600444320076-Certificate_JVC_KD-M56BT_IFT_Mexico_2020.pdf

Cricut1600433216057-Certificate_CXPL202_Cricut_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600433216057-Certificate_CXPL202_Cricut_CONATEL_Paraguay_2020.pdf

Cricut1600432346184-Certificate_CXPL301_Cricut_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1600432346184-Certificate_CXPL301_Cricut_CONATEL_Paraguay_2020.pdf

SONY1600289594034-Certificaet_SONY_CFI-ZMR1_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1600289594034-Certificaet_SONY_CFI-ZMR1_ATT_Bolivia_2020.pdf

Lenovo1600202536857-Certificate_Lenovo_ThinkCentre M60e_SUBTEL_Chile_2020 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1600202536857-Certificate_Lenovo_ThinkCentre%20M60e_SUBTEL_Chile_2020%20.pdf

Razer1600174936120-Certificate_Razer_RC30-026902_SUBTEL_CHILE_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1600174936120-Certificate_Razer_RC30-026902_SUBTEL_CHILE_2020.pdf

Lenovo1599852753013-Certificate_RAZER_RZ04-0322_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599852753013-Certificate_RAZER_RZ04-0322_SUBTEL_Chile_2020.pdf

Lenovo1599852742639-Certificate_RAZER_RZ04-0322_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599852742639-Certificate_RAZER_RZ04-0322_SUBTEL_Chile_2020.pdf

CRADLEPOINT1599839252821-NOR20130C0366.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599839252821-NOR20130C0366.pdf

NUSKIN1599829451181-Letter_NuSkin_AgeLOCBoost_DIGEMID_Peru_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599829451181-Letter_NuSkin_AgeLOCBoost_DIGEMID_Peru_2020.pdf

SATO1599798383482-Certificate_SATO_CL4NX PLUS_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599798383482-Certificate_SATO_CL4NX%20PLUS_IFT_Mexico_2020.pdf

SATO1599798383298-Certificate_SATO_CL6NX PLUS_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599798383298-Certificate_SATO_CL6NX%20PLUS_IFT_Mexico_2020.pdf

SATEL1599771095929-CoH_SATEL-TR49 SnapOn_ANATEL_Brazil_2020.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599771095929-CoH_SATEL-TR49%20SnapOn_ANATEL_Brazil_2020.pdf.pdf

SATEL1599771051775-CoC_SATEL-TR49 SnapOn_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599771051775-CoC_SATEL-TR49%20SnapOn_ANATEL_Brazil_2020.pdf

U-blox1599763242886-CoH_Ublox_SARA-G450_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599763242886-CoH_Ublox_SARA-G450_ANATEL_Brazil_2020.pdf

ROKU1599761530706-Certificate_ROKU_RC-EL1_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599761530706-Certificate_ROKU_RC-EL1_IFT_Mexico_2020.pdf

SONY1599747827015-Certificate_SONY_CFI-1015A_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599747827015-Certificate_SONY_CFI-1015A_SUBTEL_Chile_2020.pdf

SONY1599747808209-Certificate_SONY_CFI-1015B_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599747808209-Certificate_SONY_CFI-1015B_SUBTEL_Chile_2020.pdf

SONY1599747783327-Certificate_SONY_DFI-T1000AA_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599747783327-Certificate_SONY_DFI-T1000AA_SUBTEL_Chile_2020.pdf

KINGSTON1599687847993-Certificate_KINGSTON_ CS002-WA_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599687847993-Certificate_KINGSTON_%20CS002-WA_NYCE_Mexico_2020.pdf

KINGSTON1599576890268-Certificate_KINGSTON_ CS002_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599576890268-Certificate_KINGSTON_%20CS002_NYCE_Mexico_2020.pdf

SATO1599530081570-CERTIFICATE_EXTENSION_SATO_CL6NX-CL6NX-PLUS_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599530081570-CERTIFICATE_EXTENSION_SATO_CL6NX-CL6NX-PLUS_NPMX_MEXICO_2020.pdf

SATO1599517358545-Certificate Extension SATO PW208NX NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599517358545-Certificate%20Extension%20SATO%20PW208NX%20NPMX%20Mexico%202020.pdf

SATO1599514964265-Certificate SATO PW208NX NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599514964265-Certificate%20SATO%20PW208NX%20NPMX%20Mexico%202020.pdf

SATO1599507253354-CERTIFICATE_SATO_CL6NX-CL6NX-PLUS_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599507253354-CERTIFICATE_SATO_CL6NX-CL6NX-PLUS_NPMX_MEXICO_2020.pdf

Kingston1599506121415-Certificate_Kingston_CL002_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599506121415-Certificate_Kingston_CL002_CRC_Colombia_2020.pdf

Kingston1599506098519-Certificate_Kingston_CL002WA_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599506098519-Certificate_Kingston_CL002WA_CRC_Colombia_2020.pdf

SATO1599281123625-Certificate Extension SATO M-84Pro NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599281123625-Certificate%20Extension%20SATO%20M-84Pro%20NPMX%20Mexico%202020.pdf

SATO1599281123608-Certificate Extension SATO M-84Pro(New PSU) NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599281123608-Certificate%20Extension%20SATO%20M-84Pro%28New%20PSU%29%20NPMX%20Mexico%202020.pdf

SATO1599281123590-Certificate Extension SATO CG2xx NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599281123590-Certificate%20Extension%20SATO%20CG2xx%20NPMX%20Mexico%202020.pdf

SATO1599281123488-Certificate Extension SATO WS4DT NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599281123488-Certificate%20Extension%20SATO%20WS4DT%20NPMX%20Mexico%202020.pdf

ORACLE1599254825315-CE-2020-58285639-APN-DNRT#MDP.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599254825315-CE-2020-58285639-APN-DNRT%23MDP.pdf

ORACLE1599253964890-19AR00166.1A.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599253964890-19AR00166.1A.pdf

DURACELL1599247998969-Certificates_Duracell_Project10743_UVA_Mexico_2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599247998969-Certificates_Duracell_Project10743_UVA_Mexico_2020.zip

DURACELL1599247972565-Certificate_Duracell_Project11400_UVA_Mexico_2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599247972565-Certificate_Duracell_Project11400_UVA_Mexico_2020.zip

KINGSTON1599245084862-D.T._KINGSTON_Six-Headsets_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599245084862-D.T._KINGSTON_Six-Headsets_NYCE_Mexico_2020.pdf

KINGSTON1599245084855-D.T. KINGSTON_Five-Adapters_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599245084855-D.T.%20KINGSTON_Five-Adapters_NYCE_Mexico_2020.pdf

SONY1599240105035-Certificate_SONY_CFI-ZMR1_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599240105035-Certificate_SONY_CFI-ZMR1_CONATEL_Paraguay_2020.pdf

ORACLE1599235104397-CERTIFICATE_ORACLE_MICROS EXPRESS STATION 4_ NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599235104397-CERTIFICATE_ORACLE_MICROS%20EXPRESS%20STATION%204_%20NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

DURACELL1599228820315-Certificates_Duracell_Project11622_UVA_Mexico_2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599228820315-Certificates_Duracell_Project11622_UVA_Mexico_2020.zip

DURACELL1599228820268-Certificates_Duracell_Project11622_UVA_Mexico_2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599228820268-Certificates_Duracell_Project11622_UVA_Mexico_2020.zip

SONY1599228506801-Certificate_SONY_DFI-T1000AA_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599228506801-Certificate_SONY_DFI-T1000AA_CONATEL_Paraguay_2020.pdf

SONY1599228483319-Certificate_SONY_CFI-1015B_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599228483319-Certificate_SONY_CFI-1015B_CONATEL_Paraguay_2020.pdf

SONY1599228460746-Certificate_SONY_CFI-1015A_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599228460746-Certificate_SONY_CFI-1015A_CONATEL_Paraguay_2020.pdf

DURACELL1599226351482-Certificates_Duracell_Project11397_UVA_Mexico_2020.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1599226351482-Certificates_Duracell_Project11397_UVA_Mexico_2020.zip

Kingston1599160659834-Certificate_Kingston_CL002(CL002WA)_UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1599160659834-Certificate_Kingston_CL002%28CL002WA%29_UVA_Mexico_2020.pdf

KINGSTON1598994974411-CERTIFICATE_KINGSTON_WIRELESS ADAPTERS_DT NOM-019_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598994974411-CERTIFICATE_KINGSTON_WIRELESS%20ADAPTERS_DT%20NOM-019_NPMX_MEXICO_2020.pdf

KINGSTON1598994701889-CERTIFICATE_KINGSTON_HEADSETS_DT NOM-019_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598994701889-CERTIFICATE_KINGSTON_HEADSETS_DT%20NOM-019_NPMX_MEXICO_2020.pdf

KINGSTON1598993716350-CERTIFICATE_Shenzhen Tianhangxing Electronics Co_THX-050200KE_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598993716350-CERTIFICATE_Shenzhen%20Tianhangxing%20Electronics%20Co_THX-050200KE_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf

KINGSTON1598993201840-CERTIFICATE_KUANTEN_KT12W050200US_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598993201840-CERTIFICATE_KUANTEN_KT12W050200US_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf

KINGSTON1598559289935-Certificate_KINGSTON_CF001WA_NYSE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598559289935-Certificate_KINGSTON_CF001WA_NYSE_Mexico_2020.pdf

KINGSTON1598559289764-Certificate_KINGSTON_CF001_NYSE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598559289764-Certificate_KINGSTON_CF001_NYSE_Mexico_2020.pdf

ROKU1598474223619-CERTIFICATE CORRECTION_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598474223619-CERTIFICATE%20CORRECTION_ROKU_3910MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

ROKU1598473787614-CERTIFICATE CORRECTION_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598473787614-CERTIFICATE%20CORRECTION_ROKU_3810MX_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

IROBOT1598387491233-Certificate_IROBOT_RVA-Y2_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598387491233-Certificate_IROBOT_RVA-Y2_ATT_Bolivia_2020.pdf

SATO1598329185641-Certificate SATO M-84Pro(New PSU) NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598329185641-Certificate%20SATO%20M-84Pro%28New%20PSU%29%20NPMX%20Mexico%202020.pdf

SATO1598328988504-Certificate SATO M-84Pro NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598328988504-Certificate%20SATO%20M-84Pro%20NPMX%20Mexico%202020.pdf

SATO1598328921530-Certificate SATO CL6NX NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598328921530-Certificate%20SATO%20CL6NX%20NPMX%20Mexico%202020.pdf

SATO1598328860273-Certificate SATO CG2xx NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598328860273-Certificate%20SATO%20CG2xx%20NPMX%20Mexico%202020.pdf

SATO1598328801972-Certificate SATO WS4DT NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598328801972-Certificate%20SATO%20WS4DT%20NPMX%20Mexico%202020.pdf

KINGSTON1598302382866-Certificate_KINGSTON_HXS-HSCFX-WA1_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598302382866-Certificate_KINGSTON_HXS-HSCFX-WA1_NYCE_Mexico_2020.pdf

KINGSTON1598302382810-Certificate_KINGSTON_HX-HSCFX-BK:WW_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598302382810-Certificate_KINGSTON_HX-HSCFX-BK%3AWW_NYCE_Mexico_2020.pdf

MORLAB-1021598044137519-Certificate_JVC_KW-M560BT_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1598044137519-Certificate_JVC_KW-M560BT_IFT_Mexico_2020.pdf

KINGSTON1598016313901-Certificate_Kingston_CS002-WA_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598016313901-Certificate_Kingston_CS002-WA_IFT_Mexico_2020.pdf

KINGSTON1598016313730-Certificate_Kingston_CS002_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1598016313730-Certificate_Kingston_CS002_IFT_Mexico_2020.pdf

Kingston1597951115547-Certificate_Kingston_CS002 (CS002-WA)_UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597951115547-Certificate_Kingston_CS002%20%28CS002-WA%29_UVA_Mexico_2020.pdf

KCTL1597942827873-Certificate_Samsung_CWAP210M_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597942827873-Certificate_Samsung_CWAP210M_ENACOM_Argentina_2020.pdf

Cricut1597858077131-NCC_18713_20_Orbis.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597858077131-NCC_18713_20_Orbis.pdf

ROKU1597856050560-CERTIFICATE_ROKU_ADS-6RA-06 05050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597856050560-CERTIFICATE_ROKU_ADS-6RA-06%2005050EPCU_NOM-029-ENER-2017_NYCE_MEXICO_2020.pdf

roku1597855366734-CERTIFICATE_ROKU_3700X; 3710X_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597855366734-CERTIFICATE_ROKU_3700X%3B%203710X_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

iRobot Corporation1597853600911-20121-20.01_430_IROBOT-RVA-Y2_Jabil_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597853600911-20121-20.01_430_IROBOT-RVA-Y2_Jabil_Brazil_2020.pdf

iRobot Corporation1597853186346-IBAMA Code - RVA-Y2-.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597853186346-IBAMA%20Code%20-%20RVA-Y2-.html

1597845430353-CoC_HME_1401_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597845430353-CoC_HME_1401_ANATEL_Brazil_2020.pdf

NEDAP1597693719994-Certificate_ NEDAP_ VP4011_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597693719994-Certificate_%20NEDAP_%20VP4011_ENACOM_Argentina_2020.pdf

Razer1597675299304-Certificate_Razer_RZ01-0342_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597675299304-Certificate_Razer_RZ01-0342_SUBTEL_Chile_2020.pdf

Lenovo1597674362936-Certificate_Razer_RC30-026902_SUBTEL_CHILE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597674362936-Certificate_Razer_RC30-026902_SUBTEL_CHILE_2020.pdf

KINGSTON1597670966928-CERTIFICATE_KINGSTON_HXS-HSCFS-WA1_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1597670966928-CERTIFICATE_KINGSTON_HXS-HSCFS-WA1_NYCE_MEXICO_2019.pdf

Razer1597431282395-Certificate_RAZER_DGRFG7_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597431282395-Certificate_RAZER_DGRFG7_SUBTEL_Chile_2020.pdf

Lenovo1597409229515-Certificate_Lenovo_TP00103H_Chile_SUBTEL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597409229515-Certificate_Lenovo_TP00103H_Chile_SUBTEL_2020.pdf

ROKU1597358101528-CERTIFICATE_ROKU_ 9102X (9102MX)_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597358101528-CERTIFICATE_ROKU_%209102X%20%289102MX%29_NOM-019-SCFI-1998_NYCE_MEXICO_2020.pdf

UBLOX1597324130255-CoC_Ublox_SARA-G450_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597324130255-CoC_Ublox_SARA-G450_ANATEL_Brazil_2020.pdf

KINGSTON1597320457175-Certificate_Kingston_ChargePlayDuoXboxOne_UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597320457175-Certificate_Kingston_ChargePlayDuoXboxOne_UVA_Mexico_2020.pdf

KINGSTON1597320438079-Certificate_Kingston_ChargePlayDuoPS4_UVA_Mexico_2020.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597320438079-Certificate_Kingston_ChargePlayDuoPS4_UVA_Mexico_2020.pdf.pdf

ROKU1597263456516-Certificate_ROKU_9102X (9102MX)_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597263456516-Certificate_ROKU_9102X%20%289102MX%29_NYCE_Mexico_2020.pdf

ROKU1597253898251-Certificate_ROKU_ 9102X (9102MX)China_UVA_ Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597253898251-Certificate_ROKU_%209102X%20%289102MX%29China_UVA_%20Mexico_2020.pdf

ROKU1597253898241-Certificate_ROKU_ 9102X (9102MX)Vietnam_UVA_ Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597253898241-Certificate_ROKU_%209102X%20%289102MX%29Vietnam_UVA_%20Mexico_2020.pdf

ROKU1597253826969-Certificate_Roku_3810X(3810MX)_UVA_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597253826969-Certificate_Roku_3810X%283810MX%29_UVA_Mexico_2020.pdf

KINGSTON1597234759732-Certificate_Kingston_ CEB002_UVA_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597234759732-Certificate_Kingston_%20CEB002_UVA_Mexico_2020.pdf

KINGSTON1597166006185-CERTIFICATE EXTENSION_KINGSTON_CHARGEPLAY DUO FOR XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597166006185-CERTIFICATE%20EXTENSION_KINGSTON_CHARGEPLAY%20DUO%20FOR%20XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

KINGSTON1597165664692-CERTIFICATE EXTENSION_KINGSTON_CHARGEPLAY DUO FOR PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597165664692-CERTIFICATE%20EXTENSION_KINGSTON_CHARGEPLAY%20DUO%20FOR%20PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

ROKU1597154823012-Certificate-Roku-RC-EL1-TELECOM-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597154823012-Certificate-Roku-RC-EL1-TELECOM-Nicaragua-2020.pdf

SONY1597154498241-Certificate-SONY-CFI-ZCT1W-TELCOR-Nicaragua-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597154498241-Certificate-SONY-CFI-ZCT1W-TELCOR-Nicaragua-2020.pdf

TOPCON1597089668103-CoH_TOPCON_HIPER_VR-_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597089668103-CoH_TOPCON_HIPER_VR-_ANATEL_BRAZIL_2020.pdf

NEDAP1597071475153-CoC_NEDAP_Neck_Tag_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597071475153-CoC_NEDAP_Neck_Tag_ANATEL_Brazil_2020.pdf

NEDAP1597071452154-CoC_NEDAP_LACTIVATOR_REALTIME_NEDAP_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1597071452154-CoC_NEDAP_LACTIVATOR_REALTIME_NEDAP_ANATEL_Brazil_2020.pdf

KCTL1597061711060-Certificate_KCLT_MIM-H04N_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1597061711060-Certificate_KCLT_MIM-H04N_IFT_Mexico_2020.pdf

SATO1596752256163-Certificate_Silex_SX-SDMAC_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596752256163-Certificate_Silex_SX-SDMAC_IFT_Mexico_2020.pdf

SONY1596746397857-Certificate_SONY_CFI-ZCT1W_CONATEL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596746397857-Certificate_SONY_CFI-ZCT1W_CONATEL_2020.pdf

SONY1596742247648-Certificate_SONY_CFI-ZMR1_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596742247648-Certificate_SONY_CFI-ZMR1_SUBTEL_Chile_2020.pdf

KINGSTON1596643023251-CERTIFICATE_KINGSTON_CHARGEPLAY DUO FOR XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596643023251-CERTIFICATE_KINGSTON_CHARGEPLAY%20DUO%20FOR%20XBOX_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

KINGSTON1596642742545-CERTIFICATE_KINGSTON_CHARGEPLAY DUO FOR PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596642742545-CERTIFICATE_KINGSTON_CHARGEPLAY%20DUO%20FOR%20PS4_NOM-001-SCFI-1993_NPMX_MEXICO_2020.pdf

BALUN Technology Co. Ltd.1596568294138-Certificate_Lenovo_IdeaPad Duet 3 10IGL5_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596568294138-Certificate_Lenovo_IdeaPad%20Duet%203%2010IGL5_SUBTEL_Chile_2020.pdf

NEDAP1596560627074-CERTIFICATE_EXTENSION_LA FORTALEZA_NEDAP_SMART DEACT_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596560627074-CERTIFICATE_EXTENSION_LA%20FORTALEZA_NEDAP_SMART%20DEACT_NOM-019-SCFI-1998_NPMX_MEXICO_2020.pdf

DURACELL1596474387069-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-1993_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596474387069-CERTIFICATE_DURACELL_CEF14NA4_NOM-001-SCFI-1993_NYCE_MEXICO_2020.pdf

SATO1596225913309-Certificate Extension SATO CL4NX & CL4NX Plus NPMX 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596225913309-Certificate%20Extension%20SATO%20CL4NX%20%26%20CL4NX%20Plus%20NPMX%202020.pdf

CRCICUT1596205361956-Certificate_CRICUT_CXPL202_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596205361956-Certificate_CRICUT_CXPL202_ATT_Bolivia_2020.pdf

CRCICUT1596205330417-Certificate_CRICUT_CXPL301_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596205330417-Certificate_CRICUT_CXPL301_ATT_Bolivia_2020.pdf

ROKU1596137544030-CERTIFICATE_ROKU_ADS-65CJ-12-2 12060E_NOM-029_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596137544030-CERTIFICATE_ROKU_ADS-65CJ-12-2%2012060E_NOM-029_MEXICO_2020.pdf

ROKU1596134013578-NOM-029-ENER-2017 W16-005N1A.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596134013578-NOM-029-ENER-2017%20W16-005N1A.pdf

ROKU1596131670520-NOM-029-ENER-2017 ADS-6RA-05050EPCU-L.pdf
https://orbiscompliance.s3.amazonaws.com/1596131670520-NOM-029-ENER-2017%20ADS-6RA-05050EPCU-L.pdf

TOPCON1596035324006-CoC_TOPCON_HIPER_VR-_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1596035324006-CoC_TOPCON_HIPER_VR-_ANATEL_BRAZIL_2020.pdf

iRobot Corporation1596035288817-19002-19.01_M1_Irobot_Braavajet M6_BYD_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1596035288817-19002-19.01_M1_Irobot_Braavajet%20M6_BYD_Brazil_2020.pdf

Nu Skin1595940139595-Certificate_Nu Skin_Magnetic Charger_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595940139595-Certificate_Nu%20Skin_Magnetic%20Charger_CRC_Colombia_2020.pdf

ROKU1595939912025-Certificate_Roku_RC-EL1_CONATEL_Honduras_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595939912025-Certificate_Roku_RC-EL1_CONATEL_Honduras_2020.pdf

iROBOT1595939118200-Certificate_iRobot _RVA-Y2_CONATEL_Honduras_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595939118200-Certificate_iRobot%20_RVA-Y2_CONATEL_Honduras_2020.pdf

SATO1595714796338-Certificate Extension SATO CG408-412 NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595714796338-Certificate%20Extension%20SATO%20CG408-412%20NPMX%20Mexico%202020.pdf

ORACLE1595623395143-DICTAMEN ORACLE 541-0481-05 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595623395143-DICTAMEN%20ORACLE%20541-0481-05%20NPMX%20MEXICO%202020.pdf

ROKU1595588772487-Certificate_ROKU_RC-EL1_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595588772487-Certificate_ROKU_RC-EL1_NYCE_Mexico_2020.pdf

ORACLE1595525648064-DICTAMEN ORACLE PU1SLT NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595525648064-DICTAMEN%20ORACLE%20PU1SLT%20NPMX%20MEXICO%202020.pdf

ORACLE1595525519715-DICTAMEN ORACLE T82 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595525519715-DICTAMEN%20ORACLE%20T82%20NPMX%20MEXICO%202020.pdf

ORACLE1595525393230-DICTAMEN ORACLE 9600 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595525393230-DICTAMEN%20ORACLE%209600%20NPMX%20MEXICO%202020.pdf

ORACLE1595525297804-DICTAMEN ORACLE PU2SL NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595525297804-DICTAMEN%20ORACLE%20PU2SL%20NPMX%20MEXICO%202020.pdf

ORACLE1595524858429-DICTAMEN ORACLE SNMA-2 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595524858429-DICTAMEN%20ORACLE%20SNMA-2%20NPMX%20MEXICO%202020.pdf

ORACLE1595524684292-DICTAMEN ORACLE T-84 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595524684292-DICTAMEN%20ORACLE%20T-84%20NPMX%20MEXICO%202020.pdf

ORACLE1595524489795-DICTAMEN ORACLE SNMA-1 NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595524489795-DICTAMEN%20ORACLE%20SNMA-1%20NPMX%20MEXICO%202020.pdf

ORACLE1595524354621-DICTAMEN ORACLE PU2SL NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595524354621-DICTAMEN%20ORACLE%20PU2SL%20NPMX%20MEXICO%202020.pdf

ORACLE1595524241476-DICTAMEN ORACLE PU1SL NPMX MEXICO 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595524241476-DICTAMEN%20ORACLE%20PU1SL%20NPMX%20MEXICO%202020.pdf

KINGSTON1595451373288-Certificate_KINGSTON_Cloud Flight S_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595451373288-Certificate_KINGSTON_Cloud%20Flight%20S_NYCE_Mexico_2020.pdf

SATO1595451357850-Certificate SATO CG408-412 NPMX Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595451357850-Certificate%20SATO%20CG408-412%20NPMX%20Mexico%202020.pdf

SATO1595348944313-Certificate Extension SATO WS412TT- STD NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595348944313-Certificate%20Extension%20SATO%20WS412TT-%20STD%20NPMX%20Mexico%202020.pdf

SATO1595348874041-Certificate SATO WS412TT- STD NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595348874041-Certificate%20SATO%20WS412TT-%20STD%20NPMX%20Mexico%202020.pdf

SATO1595348522824-Certificate SATO CL4NX & CL4NX Plus NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595348522824-Certificate%20SATO%20CL4NX%20%26%20CL4NX%20Plus%20NPMX%20Mexico%202020.pdf

SATO1595348468122-Certificate SATO CL4NX NPMX Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595348468122-Certificate%20SATO%20CL4NX%20NPMX%20Mexico%202020.pdf

SATO1595347476882-Certificate Extension SATO CL4NX & CL4NX Plus NPMX 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595347476882-Certificate%20Extension%20SATO%20CL4NX%20%26%20CL4NX%20Plus%20NPMX%202020.pdf

SATO1595345653482-Certificate SATO PW208NX NYCE MEXICO 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595345653482-Certificate%20SATO%20PW208NX%20NYCE%20MEXICO%202020.pdf

SONY1595343814328-Certificate_SONY_CFI-ZCT1W_CONATEL_Paraguay_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595343814328-Certificate_SONY_CFI-ZCT1W_CONATEL_Paraguay_2020.pdf

NOVATEL1595098840688-CoC_Novatel_AG-STAR_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1595098840688-CoC_Novatel_AG-STAR_ANATEL_Brazil_2020.pdf

NOVATEL1595098380401-CoC_Novatel_SMART7_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1595098380401-CoC_Novatel_SMART7_ANATEL_Brazil_2020.pdf

CRICUT1594902837493-Certificate_CRICUT_CXPL301 (Maker)_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594902837493-Certificate_CRICUT_CXPL301%20%28Maker%29_MTC_Peru_2020.pdf

KINGSTON1594746026676-CoC_Kingston_ChargePlay Base_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594746026676-CoC_Kingston_ChargePlay%20Base_ANATEL_BRAZIL_2020.pdf

NEDAP1594742516026-CERTIFICATE_NEDAP_SMARTTAGNECK_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594742516026-CERTIFICATE_NEDAP_SMARTTAGNECK_IFT_MEXICO_2020.pdf

SATO1594736916568-Certificate_SATO_CL4NX PLUS & CL6NX PLUS_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594736916568-Certificate_SATO_CL4NX%20PLUS%20%26%20CL6NX%20PLUS_NYCE_Mexico_2020.pdf

DURACELL1594649981504-Certificate_Duracell_9V_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594649981504-Certificate_Duracell_9V_CNCP_Mexico_2020.pdf

DURACELL1594649835692-Certificate_Duracell_Family-B_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594649835692-Certificate_Duracell_Family-B_CNCP_Mexico_2020.pdf

DURACELL1594649557096-Certificate_Duracell_Family-A_CNCP_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594649557096-Certificate_Duracell_Family-A_CNCP_Mexico_2020.pdf

ROKU1594398533715-Certificate_ROKU_RC-EL1_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594398533715-Certificate_ROKU_RC-EL1_IFT_Mexico_2020.pdf

NEDAP1594394268326-ESD-2022795C_Certificate_Nedap_VP4011_NTC_ Philippines_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594394268326-ESD-2022795C_Certificate_Nedap_VP4011_NTC_%20Philippines_2020.pdf

KINGSTON1594324553098-Certificate_KINGSTON_CS002-WA_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594324553098-Certificate_KINGSTON_CS002-WA_NYCE_Mexico_2020.pdf

KINGSTON1594324553093-Certificate_KINGSTON_CS002_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594324553093-Certificate_KINGSTON_CS002_NYCE_Mexico_2020.pdf

KCTL1594319661794-Certificate_KCTL_MIM-H04N_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594319661794-Certificate_KCTL_MIM-H04N_MTC_Peru_2020.pdf

Roku1594213610545-Certificate_Roku_RC-EL1_SIT_Guatemala_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594213610545-Certificate_Roku_RC-EL1_SIT_Guatemala_2020.pdf

Lenovo1594213215472-Certificate_Lenovo_Lenovo V17-IIL_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594213215472-Certificate_Lenovo_Lenovo%20V17-IIL_SUBTEL_Chile_2020.pdf

SONY1594146142009-Certificate_SONY_CFI-ZCT1W_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594146142009-Certificate_SONY_CFI-ZCT1W_ATT_Bolivia_2020.pdf

ROKU1594072257544-NOM-019 3930MX (3930X).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594072257544-NOM-019%203930MX%20%283930X%29.pdf

ROKU1594071761027-NOM-019 3920MX (3920X).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594071761027-NOM-019%203920MX%20%283920X%29.pdf

ECRIN1594071743874-Certificate_Extension_ECRIN_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1594071743874-Certificate_Extension_ECRIN_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

BLACK DIAMOND1594071399771-Certificate_Extension_BRONI_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1594071399771-Certificate_Extension_BRONI_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

NEDAP1593725513705-NOM-019 SMART DEACT (2).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593725513705-NOM-019%20%20%20%20SMART%20DEACT%20%282%29.pdf

Kingston1593715878065-Certificate_Kingsto_CF001WA_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593715878065-Certificate_Kingsto_CF001WA_ENACOM_Argentina_2020.pdf

ROKU1593705389634-CE-2020-39072770-APN-DLC#MPYT.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593705389634-CE-2020-39072770-APN-DLC%23MPYT.pdf

ROKU1593695268432-Ampliación de Pais NOM-029 2019 ADS-6RA-06 05050EPCU.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593695268432-Ampliacio%CC%81n%20de%20Pais%20NOM-029%202019%20ADS-6RA-06%2005050EPCU.pdf

ROKU1593692960769-Ampliación NOM-019 3810MX.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593692960769-Ampliacio%CC%81n%20NOM-019%203810MX.pdf

KCTL1593690671205-Certificate_SAMSUNG_MIM-H04_URSEC_Uruguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593690671205-Certificate_SAMSUNG_MIM-H04_URSEC_Uruguay_2020.pdf

1593648548282-3810X NOM-208 additional Countries 2020 .pdf
https://orbiscompliance.s3.amazonaws.com/1593648548282-3810X%20NOM-208%20additional%20Countries%202020%20.pdf

IROBOT1593622043192-Certificate-IROBOT-RVA-Y2(Roomba s9)-TELCOR-Nicaragua-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593622043192-Certificate-IROBOT-RVA-Y2%28Roomba%20s9%29-TELCOR-Nicaragua-2020.pdf

ROKU1593609551983-Certificate_ROKU_RC-EL1_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593609551983-Certificate_ROKU_RC-EL1_ENACOM_Argentina_2020.pdf

iRobot Corporation1593556397087-19122-19.03_IROBOT_Roomba e5_KynYat_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593556397087-19122-19.03_IROBOT_Roomba%20e5_KynYat_BRAZIL_2019.pdf

iRobot Corporation1593555023339-19002-19.01_IROBOT- RMA-Y1 Brava Jet M6_KinYat_ BRAZIL 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1593555023339-19002-19.01_IROBOT-%20RMA-Y1%20Brava%20Jet%20M6_KinYat_%20BRAZIL%202019.pdf

Kingston1593530552674-Certificate_Kingsto_CF001_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593530552674-Certificate_Kingsto_CF001_ENACOM_Argentina_2020.pdf

Lenovo1593194953922-Certificate_Lenovo_.IdeaPad Gaming 3 15ARH05_SUBTEL_Chile_2020pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593194953922-Certificate_Lenovo_.IdeaPad%20Gaming%203%2015ARH05_SUBTEL_Chile_2020pdf.pdf

ROKU1593185054290-Certificate_Extension_Juegos_de_video_Argentina_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593185054290-Certificate_Extension_Juegos_de_video_Argentina_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

FLUKE1593184155149-Certificate_Extension_VIDITEC_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593184155149-Certificate_Extension_VIDITEC_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

MICROSOFT1593183876163-Certificate_Extension_INTERMACO_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593183876163-Certificate_Extension_INTERMACO_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593183635309-Certificate_Extension_JUKEBOX_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593183635309-Certificate_Extension_JUKEBOX_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593183451718-Certificate_Extension_DISTECNA_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593183451718-Certificate_Extension_DISTECNA_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593183138837-Certificate_Extension_GYP_NEW_TREE_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593183138837-Certificate_Extension_GYP_NEW_TREE_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593181807142-Certificate_Extension_CORCISA_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593181807142-Certificate_Extension_CORCISA_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593181306210-Certificate_Extension_ELIT_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593181306210-Certificate_Extension_ELIT_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593181012534-Certificate_Extension_SZEME_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593181012534-Certificate_Extension_SZEME_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593180678005-Certificate_Extension_GRUPO_NUCLEO_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593180678005-Certificate_Extension_GRUPO_NUCLEO_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593180297921-Certificate_Extension_LONDON_SUPPLY_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593180297921-Certificate_Extension_LONDON_SUPPLY_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593179560060-Certificate_Extension_CEVEN_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593179560060-Certificate_Extension_CEVEN_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593179335744-Certificate_Extension_STYLUS_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593179335744-Certificate_Extension_STYLUS_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

LOGITECH1593178963046-Certificate_Extension_INTERBAIRES_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593178963046-Certificate_Extension_INTERBAIRES_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

Duracell1593178410064-L2799001_DURACE02_Multiple models_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593178410064-L2799001_DURACE02_Multiple%20models_Brazil_2020.pdf

SONY1593171205348-Certificate_SONY_CFI-ZCT1W_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1593171205348-Certificate_SONY_CFI-ZCT1W_SUBTEL_Chile_2020.pdf

ROKU1593020301124-Certificate_Roku_RC-EL1_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593020301124-Certificate_Roku_RC-EL1_SUBTEL_Chile_2020.pdf

Lenovo1593007137132-Certificate_Lenovo_TP00117C_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1593007137132-Certificate_Lenovo_TP00117C_SUBTEL_Chile_2020.pdf

ROKU1592997203045-Certificate_Roku_RC-EL1_ASEP_Panama_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592997203045-Certificate_Roku_RC-EL1_ASEP_Panama_2020.pdf

CRICUT1592911670109-Certificate_Cricut_CXPL301_ASEP_Panama_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592911670109-Certificate_Cricut_CXPL301_ASEP_Panama_2020.pdf

CRICUT1592911642751-Certificate_Cricut_CXPL202_ASEP_Panama_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592911642751-Certificate_Cricut_CXPL202_ASEP_Panama_2020.pdf

MIKROTIK1592667258517-Certificate_MikroTik_ RBwAPR-2nD&R11e-LR9_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592667258517-Certificate_MikroTik_%20RBwAPR-2nD%26R11e-LR9_NYCE_Mexico_2020.pdf

Lenovo1592588849225-Certificate_Lenovo_Yoga Duet 7 13IML05_SUBTEL_Chile_2020 copy.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592588849225-Certificate_Lenovo_Yoga%20Duet%207%2013IML05_SUBTEL_Chile_2020%20copy.pdf

Lenovo1592586621058-Certificate_Lenovo_TP00106D_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592586621058-Certificate_Lenovo_TP00106D_SUBTEL_Chile_2020.pdf

SATO1592512655697-CERTIFICATE_SATO_CL4NX_CL4NX_PLUS_NPMX_2020_BLUESTAR.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592512655697-CERTIFICATE_SATO_CL4NX_CL4NX_PLUS_NPMX_2020_BLUESTAR.pdf

SATO1592512639158-CERTIFICATE_SATO_CL4NX_CL4NX_PLUS_NPMX_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592512639158-CERTIFICATE_SATO_CL4NX_CL4NX_PLUS_NPMX_2020.pdf

SATO1592512615266-CERTIFICATE_SATO_CL4NX_NPMX_2020_RENEWED.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592512615266-CERTIFICATE_SATO_CL4NX_NPMX_2020_RENEWED.pdf

DURACELL1592486439601-Certificate_Duracell_675_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592486439601-Certificate_Duracell_675_TU%CC%88V_Argentina_2020.pdf

iRobot Corporation1592400756048-20120-20.01_IROBOT_RMA-Y1_KinYat_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592400756048-20120-20.01_IROBOT_RMA-Y1_KinYat_BRAZIL_2020.pdf

iRrobot Corporation1592400730902-20120-20.01_IROBOT_RMA-Y1_KinYat_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592400730902-20120-20.01_IROBOT_RMA-Y1_KinYat_BRAZIL_2020.pdf

CRADLEPOINT1592400288310-Certificate_cradlepoint_S5A749A_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592400288310-Certificate_cradlepoint_S5A749A_SUBTEL_Chile_2020.pdf

CRICUT1592341972416-Certificate_CRICUT_CXPL202_MTC_Peru_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592341972416-Certificate_CRICUT_CXPL202_MTC_Peru_2020.pdf

UBLOX1592332657231-Certificate_u-blox AG_TOBY-L200_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592332657231-Certificate_u-blox%20AG_TOBY-L200_IFT_Mexico_2020.pdf

ROKU1592327699321-CERTIFICATE_VIGILANCIA_ADS-6RA-06_TUV_ARGENTINA_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592327699321-CERTIFICATE_VIGILANCIA_ADS-6RA-06_TUV_ARGENTINA_2020.pdf

Lenovo1592323408923-Certificate_Lenovo_IdeaPad 3 17IIL05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592323408923-Certificate_Lenovo_IdeaPad%203%2017IIL05_SUBTEL_Chile_2020.pdf

Lenovo1592313190036-Certificate_Lenovo_TP00105D_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592313190036-Certificate_Lenovo_TP00105D_SUBTEL_Chile_2020.pdf

IROBOT1592308807181-Certificate_iRobot_RVA-Y2_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1592308807181-Certificate_iRobot_RVA-Y2_SUBTEL_Chile_2020.pdf

CRICUT1592221773027-Certificate_Cricut_CXPL301_SIT_Guatemala_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592221773027-Certificate_Cricut_CXPL301_SIT_Guatemala_2020.pdf

CRICUT1592221762014-Certificate_Cricut_CXPL202_SIT_Guatemala_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1592221762014-Certificate_Cricut_CXPL202_SIT_Guatemala_2020.pdf

MORLAB1591919251969-Certificate_JVC_KW-M560BT_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591919251969-Certificate_JVC_KW-M560BT_NYCE_Mexico_2020.pdf

ROKU1591911756554-Certificate_Roku_RC-EL1_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591911756554-Certificate_Roku_RC-EL1_MTC_Peru_2020.pdf

CRADLEPOINT1591793866749-Certificate_Telit_LM940_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591793866749-Certificate_Telit_LM940_CRC_Colombia_2020.pdf

CRADLEPOINT1591793858135-Certificate_cradlepoint_S5A749A_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591793858135-Certificate_cradlepoint_S5A749A_CRC_Colombia_2020.pdf

ROKU1591713778617-Certificate-Roku-RC-EL1-SIGET-El Salvador-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591713778617-Certificate-Roku-RC-EL1-SIGET-El%20Salvador-2020.pdf

IROBOT1591628319830-EXTENSIONCERTIFICATE_IROBOT_RVA-Y1 RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591628319830-EXTENSIONCERTIFICATE_IROBOT_RVA-Y1%20RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO.pdf

Lenovo1591627066915-Certificate_Lenovo_TP00103G_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591627066915-Certificate_Lenovo_TP00103G_SUBTEL_Chile_2020.pdf

KINGSTON1591379050987-Certificate_Kingston_CS002-WA_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591379050987-Certificate_Kingston_CS002-WA_ENACOM_Argentina_2020.pdf

KINGSTON1591379022930-Certificate_Kingston_CS002_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591379022930-Certificate_Kingston_CS002_ENACOM_Argentina_2020.pdf

iRobot Corporation1591377573634-Certificate_iRobot_RVA-Y2_ASEP_Panama_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591377573634-Certificate_iRobot_RVA-Y2_ASEP_Panama_2020.pdf

iRobot Corporatation1591377393533-Autorizacao_7510915_IBAMA_RVA-Y2.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591377393533-Autorizacao_7510915_IBAMA_RVA-Y2.html

KCTL1591369544190-Certificate_KCTL_MIM-H04N_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591369544190-Certificate_KCTL_MIM-H04N_NYCE_Mexico_2020.pdf

ROKU1591277509614-Certificate_RC-EL1_Roku_SUTEL_CostaRica_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591277509614-Certificate_RC-EL1_Roku_SUTEL_CostaRica_2020.pdf

ASKEY1591272813189-CoC_ASKEY_RG3110W_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591272813189-CoC_ASKEY_RG3110W_ANATEL_BRAZIL_2020.pdf

iRobot Corporation1591213482506-19141-19.01_IROBOT_RVA-Y1:Y2_Jabil_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591213482506-19141-19.01_IROBOT_RVA-Y1%3AY2_Jabil_Brazil_2020.pdf

ARISTA1591099582802-CoH_ARISTA_DCS-7804_DCS-7808_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591099582802-CoH_ARISTA_DCS-7804_DCS-7808_ANATEL_BRAZIL_2020.pdf

KINGSTON1591097797802-CoH_Kingston_CF001WA_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591097797802-CoH_Kingston_CF001WA_ANATEL_BRAZIL_2020.pdf

CRICUT1591045215122-Certificate-Cricut-CXPL301-SIGET-El Salvador-2020.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591045215122-Certificate-Cricut-CXPL301-SIGET-El%20Salvador-2020.PDF

CRICUT1591045083164-Certificate-Cricut-CXPL202-SIGET-El Salvador-2020.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1591045083164-Certificate-Cricut-CXPL202-SIGET-El%20Salvador-2020.PDF

IROBOT1591040043236-Certificate_iRobot_RVA-Y2_SUTEL_CostaRica_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1591040043236-Certificate_iRobot_RVA-Y2_SUTEL_CostaRica_2020.pdf

iROBOT1590758838769-Certificate_iRobot_RVA-Y2_SIT_Guatemala_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1590758838769-Certificate_iRobot_RVA-Y2_SIT_Guatemala_2020.pdf

IROBOT1590668269185-Certificate_iRobot_RVA-Y2_ARCOTEL_Ecuador_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1590668269185-Certificate_iRobot_RVA-Y2_ARCOTEL_Ecuador_2020.pdf

Duracell1590580450747-Certificate_Duracell_C&D_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1590580450747-Certificate_Duracell_C%26D_TU%CC%88V_Argentina_2020.pdf

Duracell1590580152352-Certificate_Duracell_AA&AAA_TÜV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1590580152352-Certificate_Duracell_AA%26AAA_TU%CC%88V_Argentina_2020.pdf

Lenovo1590432861306-Certificate_Lenovo_TP00116C_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1590432861306-Certificate_Lenovo_TP00116C_SUBTEL_Chile_2020.pdf

IROBOT1590069539942-CERTIFICATE_IROBOT_RVA-Y1 RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO.pdf
https://orbiscompliance.s3.amazonaws.com/1590069539942-CERTIFICATE_IROBOT_RVA-Y1%20RVA-Y2_NOM-003-SCFI-2014_NYCE_MEXICO.pdf

SATO1589985657948-Certificate_SATO_ML-CHG06-01_NPMX(Ampliacion)_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589985657948-Certificate_SATO_ML-CHG06-01_NPMX%28Ampliacion%29_Mexico_2020.pdf

SATO1589985657939-Certificate_SATO_ML-CHG01-01_NPMX(Ampliacion)_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589985657939-Certificate_SATO_ML-CHG01-01_NPMX%28Ampliacion%29_Mexico_2020.pdf

SATO1589985657929-Certificate_SATO_4BAY_CHARGING_CRADLE_NPMX(Ampliacion)_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589985657929-Certificate_SATO_4BAY_CHARGING_CRADLE_NPMX%28Ampliacion%29_Mexico_2020.pdf

SATO1589985657795-Certificate_SATO_1BAY_CHARGING_CRADLE_NPMX(Ampliacion)_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589985657795-Certificate_SATO_1BAY_CHARGING_CRADLE_NPMX%28Ampliacion%29_Mexico_2020.pdf

ROKU1589903766496-Certificate_Roku_RC-EL1_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589903766496-Certificate_Roku_RC-EL1_CRC_Colombia_2020.pdf

iRobot1589806238803-Autorizacao_6994855.html
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589806238803-Autorizacao_6994855.html

iRobot1589805542309-Autorizacao_7241376.html
https://orbiscompliance.s3.amazonaws.com/1589805542309-Autorizacao_7241376.html

IROBOT1589556475630-EXTENSION-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589556475630-EXTENSION-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf

IROBOT1589556475618-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589556475618-CERTIFICATE_IROBOT_ADD-N1_NOM-001-SCFI-1993_MEXICO_2020.pdf

SATO1589546698874-Certificate_SATO_ML-CHG06-01_NPMX_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589546698874-Certificate_SATO_ML-CHG06-01_NPMX_Mexico_2020.pdf

SATO1589546657178-Certificate_SATO_ML-CHG01-01_NPMX_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589546657178-Certificate_SATO_ML-CHG01-01_NPMX_Mexico_2020.pdf

KINGSTON1589383959122-Certificate_Kingston_CF001WA_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589383959122-Certificate_Kingston_CF001WA_SUBTEL_Chile_2020.pdf

KINGSTON1589383681902-Certificate_Kingston_CF001_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589383681902-Certificate_Kingston_CF001_SUBTEL_Chile_2020.pdf

IROBOT1589381856728-Certificate_iRobot_RVA-Y2_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589381856728-Certificate_iRobot_RVA-Y2_CRC_Colombia_2020.pdf

SATO1589294927200-Certificate_SATO_4BAY_CHARGING_CRADLE_NPMX_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589294927200-Certificate_SATO_4BAY_CHARGING_CRADLE_NPMX_Mexico_2020.pdf

SATO1589294903927-Certificate_SATO_1BAY_CHARGING_CRADLE_NPMX_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589294903927-Certificate_SATO_1BAY_CHARGING_CRADLE_NPMX_Mexico_2020.pdf

NEDAP1589227766497-Certificate_NEDAP_Nedap N.V._ASSY AD46R RF+RFID_Panamá_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589227766497-Certificate_NEDAP_Nedap%20N.V._ASSY%20AD46R%20RF%2BRFID_Panama%CC%81_2020.pdf

NEDAP1589227629502-Certificate_NEDAP_Nedap N.V._SMARTDEACT_Panamá_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589227629502-Certificate_NEDAP_Nedap%20N.V._SMARTDEACT_Panama%CC%81_2020.pdf

KCTL1589226534020-Certificate_Samsung_MIM-H04N_ASEP_Panamá_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589226534020-Certificate_Samsung_MIM-H04N_ASEP_Panama%CC%81_2020.pdf

ORACLE1589198317021-Certificate_FSP_FSP060-DHAN3_LealtadComercial_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589198317021-Certificate_FSP_FSP060-DHAN3_LealtadComercial_Argentina_2020.pdf

ORACLE1589198285830-CERTIFICATE_ORACLE_FSP_FSP060-DHAN3_IRAM_ARGENTINA.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1589198285830-CERTIFICATE_ORACLE_FSP_FSP060-DHAN3_IRAM_ARGENTINA.pdf

KCTL1589196855959-Certificate_SAMSUNG_MIM-H04N_ARCOTEL_Ecuador_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1589196855959-Certificate_SAMSUNG_MIM-H04N_ARCOTEL_Ecuador_2020.pdf

FSP1588972284380-Certificate_FSP_FSP060-DHAN3_LealtadComercial_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588972284380-Certificate_FSP_FSP060-DHAN3_LealtadComercial_Argentina_2020.pdf

FSP1588972199631-Certificate_FSP_FSP120-AHAN3_LealtadComercial_Argentina_2020
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588972199631-Certificate_FSP_FSP120-AHAN3_LealtadComercial_Argentina_2020%20

iRobot1588853356168-19338-19.07_M1_-Irobot_Roomba 621-677_Brazil_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1588853356168-19338-19.07_M1_-Irobot_Roomba%20621-677_Brazil_2019.pdf

ORACLE1588771312545-DICTAMEN_HEWLETT-PACKARD_HSTNS-2141_NPMX_MEXICO_2020.PDF
https://orbiscompliance.s3.amazonaws.com/1588771312545-DICTAMEN_HEWLETT-PACKARD_HSTNS-2141_NPMX_MEXICO_2020.PDF

KCTL1588712131280-Certificate_SAMSUNG_MIM-H04N_INDOTEL_RepublicaDominicana_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588712131280-Certificate_SAMSUNG_MIM-H04N_INDOTEL_RepublicaDominicana_2020.pdf

KCTL1588712120763-Certificate_SAMSUNG_MIM-H04N_INDOTEL_RepublicaDominicana_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588712120763-Certificate_SAMSUNG_MIM-H04N_INDOTEL_RepublicaDominicana_2020.pdf

MIKROTIK1588699812949-CERTIFICATE_MIKROTIK_R11e-LTE6_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588699812949-CERTIFICATE_MIKROTIK_R11e-LTE6_IFT_MEXICO_2020.pdf

MIKROTIK1588699812944-CERTIFICATE_MIKROTIK_R11e-LTE-US_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588699812944-CERTIFICATE_MIKROTIK_R11e-LTE-US_IFT_MEXICO_2020.pdf

MIKROTIK1588699812934-CERTIFICATE_MIKROTIK_R11e-LTE_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588699812934-CERTIFICATE_MIKROTIK_R11e-LTE_IFT_MEXICO_2020.pdf

Lenovo1588697482706-Certificate_Lenovo_IdeaPad Gaming 3 15IMH05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1588697482706-Certificate_Lenovo_IdeaPad%20Gaming%203%2015IMH05_SUBTEL_Chile_2020.pdf

IROBOT1588261890563-Certificate-iRobot-RVA-Y2(Roombas9)-SIGET-El Salvador-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588261890563-Certificate-iRobot-RVA-Y2%28Roombas9%29-SIGET-El%20Salvador-2020.pdf

MIKROTIK1588257982475-Certificate_MikroTik_RBD23UGS-5HPacD2HnD-NM (NetMetal ac²)-hAP ac³ LTE6 kit_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588257982475-Certificate_MikroTik_RBD23UGS-5HPacD2HnD-NM%20%28NetMetal%20ac%C2%B2%29-hAP%20ac%C2%B3%20LTE6%20kit_NYCE_Mexico_2020.pdf

KCTL1588088865928-Certificate_SAMSUNG_MIM-H04N_TAS_Suriname_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588088865928-Certificate_SAMSUNG_MIM-H04N_TAS_Suriname_2020.pdf

NEDAP1588079947731-CERTIFICATE_NEDAP_ASSY_AD46R_RF+RFID_SUBTEL_CHILE_2020
https://orbiscompliance.s3.us-west-2.amazonaws.com/1588079947731-CERTIFICATE_NEDAP_ASSY_AD46R_RF%2BRFID_SUBTEL_CHILE_2020

INDSCI1587993381215-CoH-Industrias Cientific Corporation-RADIUS_BZ1-ANATEL-BRAZIL-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1587993381215-CoH-Industrias%20Cientific%20Corporation-RADIUS_BZ1-ANATEL-BRAZIL-2020.pdf

ALARM1587755169533-CERTIFICATE_ALARM_ADS018K-X120150_NYCE_NOM-029.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587755169533-CERTIFICATE_ALARM_ADS018K-X120150_NYCE_NOM-029.pdf

ALARM1587755169527-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587755169527-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf

ASKEY1587750558961-CERTIFICATE_APD_WB-24J12FA_WB-24J12R_LealtadComercial_Argentina_2020
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587750558961-CERTIFICATE_APD_WB-24J12FA_WB-24J12R_LealtadComercial_Argentina_2020%20

ASKEY1587750526212-CERTIFICATE_APD_WB-12G12FA_LealtadComercial_Argentina_2020
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587750526212-CERTIFICATE_APD_WB-12G12FA_LealtadComercial_Argentina_2020%20

ASKEY1587750349615-CERTIFICATE_APD_WB-12G12FA_WB-24J12FA_WB-24J12R_IRAM_ARGENTINA_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1587750349615-CERTIFICATE_APD_WB-12G12FA_WB-24J12FA_WB-24J12R_IRAM_ARGENTINA_2020.pdf

KCTL1587738935556-CERTIFICATE_SAMSUNG_MIM-H04N_SIT_GUATEMALA_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587738935556-CERTIFICATE_SAMSUNG_MIM-H04N_SIT_GUATEMALA_2020.pdf

ROKU1587735106568-Certificate_ROKU_RC-EL1_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587735106568-Certificate_ROKU_RC-EL1_NYCE_Mexico_2020.pdf

NEDAP1587579890170-2563_Certificate_Nedap_VP4011_NBTC_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587579890170-2563_Certificate_Nedap_VP4011_NBTC_2020.pdf

Lenovo1587570830671-Certificate_Lenovo_ IdeaPad Creator 5 15IMH05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1587570830671-Certificate_Lenovo_%20IdeaPad%20Creator%205%2015IMH05_SUBTEL_Chile_2020.pdf

ORACLE1587481071836-CERTIFICATE_ORACLE_FSP_FSP120-AHAN3_ARGENTINA_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1587481071836-CERTIFICATE_ORACLE_FSP_FSP120-AHAN3_ARGENTINA_2020.pdf

INDSC1587383317058-CoH-Industrias Cientific-Ventis Pro 5;4-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1587383317058-CoH-Industrias%20Cientific-Ventis%20Pro%205%3B4-IBRACE-BRAZIL-2019.pdf

Lenovo1586870468595-Certificate_Lenovo_Lenovo 10e Chromebook Tablet_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1586870468595-Certificate_Lenovo_Lenovo%2010e%20Chromebook%20Tablet_SUBTEL_Chile_2020.pdf

u-blox1586804822451-Certificate_u-blox_SARA-U260_IFT_Mexico_ 2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1586804822451-Certificate_u-blox_SARA-U260_IFT_Mexico_%202016.pdf

u-blox1586804788808-Certificate_u-blox_SARA-U260_IFT_Mexico_ 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1586804788808-Certificate_u-blox_SARA-U260_IFT_Mexico_%202015.pdf

Alarm1585941197382-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585941197382-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf

Alarm1585941194518-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585941194518-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf

Alarm1585941194089-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585941194089-CERTIFICATE_ALARM_ADC-SVR122E_NYCE_NOM-019.pdf

KCTL1585837008901-Certificate_SAMSUNG_MIM-H04N_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585837008901-Certificate_SAMSUNG_MIM-H04N_SUBTEL_Chile_2020.pdf

Nedap1585833336318-Certificate_Nedap_VP4011_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1585833336318-Certificate_Nedap_VP4011_SUBTEL_Chile_2020.pdf

Roku1585594894815-CoH_Roku_3930x_ANATEL_BRAZIL_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1585594894815-CoH_Roku_3930x_ANATEL_BRAZIL_2020.pdf

Novatel1585338136739-CoC_00107869_M1_PWPAK7_Renewal_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1585338136739-CoC_00107869_M1_PWPAK7_Renewal_Brazil_2020.pdf

DURACELL1585237902290-CoC_00114563_M1_PB3_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585237902290-CoC_00114563_M1_PB3_Brazil_2020.pdf

DURACELL1585237893976-CoC_00114561_M1_PB2_Brazil_-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585237893976-CoC_00114561_M1_PB2_Brazil_-2020.pdf

DURACELL1585237885304-CoC_00114560_M1_PB1_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585237885304-CoC_00114560_M1_PB1_Brazil_2020.pdf

iRobot1585235647064-430_CCT_iRobot_RVB-Y2_Inicial Certification_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585235647064-430_CCT_iRobot_RVB-Y2_Inicial%20Certification_Brazil_2020.pdf

iRobot1585235633151-371_CCT_iRrobot_RVB-Y2_Initial Certification_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1585235633151-371_CCT_iRrobot_RVB-Y2_Initial%20Certification_Brazil_2020.pdf

KCTL1585225943124-Certificate_SAMSUNG_MIM-H04N_URSEC_Uruguay_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1585225943124-Certificate_SAMSUNG_MIM-H04N_URSEC_Uruguay_2020.pdf

TA1584627390950-CERTIFICATE_flex_TT603-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1584627390950-CERTIFICATE_flex_TT603-LM0Q-GL_IFT_MEXICO_2020.pdf

TA1584625996792-CERTIFICATE_FLEX_TT603-LM0Q-GL_TT600-LM0Q-GL_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1584625996792-CERTIFICATE_FLEX_TT603-LM0Q-GL_TT600-LM0Q-GL_NYCE_MEXICO_2020.pdf

TA1584625468184-CERTIFICATE_flex_TT600-LM0Q-GL_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1584625468184-CERTIFICATE_flex_TT600-LM0Q-GL_IFT_MEXICO_2020.pdf

KINGSTON1584457832877-02366-20-07196_CoC_Kingstone_CS002_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1584457832877-02366-20-07196_CoC_Kingstone_CS002_ANATEL_Brazil_2020.pdf

KINGSTON1584457589374-º 02363-20-07196_CoC_Kingston_CS002-WA_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1584457589374-%C2%BA%2002363-20-07196_CoC_Kingston_CS002-WA_ANATEL_Brazil_2020.pdf

Nedap1584370584591-Certificate_Nedap_VP4011_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1584370584591-Certificate_Nedap_VP4011_CRC_Colombia_2020.pdf

KCTL1584366951001-Certificate_SAMSUNG_MIM-H04N_SUTEL_Costa Rica_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1584366951001-Certificate_SAMSUNG_MIM-H04N_SUTEL_Costa%20Rica_2020.pdf

SATO1584053165308-Certificate_Silex_SX-SDMAC_NYCE_Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1584053165308-Certificate_Silex_SX-SDMAC_NYCE_Mexico%202020.pdf

NEDAP1584025394752-CERTIFICATE_NEDAP_SMART_DEACT_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1584025394752-CERTIFICATE_NEDAP_SMART_DEACT_IFT_MEXICO_2020.pdf

SATO1583954892097-Certificate_SATO_M6E-NANO_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583954892097-Certificate_SATO_M6E-NANO_IFT_Mexico_2020.pdf

SATO1583951079957-Certificate_SATO_M6E-MICRO_IFT_Mexico_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583951079957-Certificate_SATO_M6E-MICRO_IFT_Mexico_2020.pdf

KCTL1583874665697-Certificate_SAMSUNG_MIM-H04N_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583874665697-Certificate_SAMSUNG_MIM-H04N_CRC_Colombia_2020.pdf

KINGSTON1583868668719-Certificate_Kingston_CS002-WA_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583868668719-Certificate_Kingston_CS002-WA_SUBTEL_Chile_2020.pdf

KINGSTON1583868652169-Certificate_Kingston_CS002_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583868652169-Certificate_Kingston_CS002_SUBTEL_Chile_2020.pdf

1583764708432-CoC_Kingstone_CS002_IBRACE_Brazil_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583764708432-CoC_Kingstone_CS002_IBRACE_Brazil_2020.pdf

ALIEN1583520117686-Certificate-ALIEN-ALR-F800-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583520117686-Certificate-ALIEN-ALR-F800-CONATEL-Honduras-2020.pdf

KCTL1583510986979-Certificate_Samsung_CWAP210M_URSEC_Uruguay_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583510986979-Certificate_Samsung_CWAP210M_URSEC_Uruguay_2020.pdf

KCTL1583501339742-Certificate_Samsung_CWAP210M_ASEP_Panama_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583501339742-Certificate_Samsung_CWAP210M_ASEP_Panama_2020.pdf

iRobot1583441039623-371-CCT_iROBOT_BRAAVAJET240_INMETRO_Brazil_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583441039623-371-CCT_iROBOT_BRAAVAJET240_INMETRO_Brazil_2019.pdf

Lenovo Chile1583430442707-Certificate_Lenovo_Lenovo 100e Chromebook 2nd Gen AST_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583430442707-Certificate_Lenovo_Lenovo%20100e%20Chromebook%202nd%20Gen%20AST_SUBTEL_Chile_2020.pdf

Lenovo Chile1583430420394-Certificate_Lenovo_Lenovo 300e Chromebook 2nd Gen AST_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583430420394-Certificate_Lenovo_Lenovo%20300e%20Chromebook%202nd%20Gen%20AST_SUBTEL_Chile_2020.pdf

iRobot1583427186969-430-iROBOT_ROOMBA_E5_INMETRO_BRAZIL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583427186969-430-iROBOT_ROOMBA_E5_INMETRO_BRAZIL_2020.pdf

iRobot1583425792268-430-CCT_iROBOT_ROOMBA-677-INMETRO-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583425792268-430-CCT_iROBOT_ROOMBA-677-INMETRO-BRAZIL-2020.pdf

iRobot1583424782846-430-CCT -IROBOT-ROOMBA-621-INMETRO-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583424782846-430-CCT%20-IROBOT-ROOMBA-621-INMETRO-BRAZIL-2020.pdf

iRobot1583423294309-Certificate_iRobot_RVA-Y1_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583423294309-Certificate_iRobot_RVA-Y1_SUBTEL_Chile_2020.pdf

iRobot1583422650314-430-Cert_19122-19.07_Rev00.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583422650314-430-Cert_19122-19.07_Rev00.pdf

iRobot1583422644112-430-Cert_19122-19.07_Rev00.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583422644112-430-Cert_19122-19.07_Rev00.pdf

iRobot1583422275691-CCT_ IROBOT_960-ICBR-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1583422275691-CCT_%20IROBOT_960-ICBR-BRAZIL-2019.pdf

Roku1583407737839-Certificate_Roku_3930x_ANATEL_Brazil_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583407737839-Certificate_Roku_3930x_ANATEL_Brazil_2020.pdf

Lenovo Chile1583355183910-Certificate_Lenovo_ Lenovo ThinkBook Plus_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583355183910-Certificate_Lenovo_%20Lenovo%20ThinkBook%20Plus_SUBTEL_Chile_2020.pdf

KINGSTON1583354598367-Certificate_Lenovo_HXS-HSCFS-WA1_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583354598367-Certificate_Lenovo_HXS-HSCFS-WA1_SUBTEL_Chile_2020.pdf

KINGSTON1583354570009-Certificate_Kingston_CLOUD FLIGHT S_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583354570009-Certificate_Kingston_CLOUD%20FLIGHT%20S_SUBTEL_Chile_2020.pdf

KINGSTON1583354052144-Certificate_Kingston_HyperX ChargePlay Base_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583354052144-Certificate_Kingston_HyperX%20ChargePlay%20Base_SUBTEL_Chile_2020.pdf

GOOGLE1583350325128-CERTIFICATE_GOOGLE_G021A_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583350325128-CERTIFICATE_GOOGLE_G021A_IFT_MEXICO_2020.pdf

Lenovo Chile1583263451517-Certificate_Lenovo_ IdeaPad 3 17ARE05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583263451517-Certificate_Lenovo_%20IdeaPad%203%2017ARE05_SUBTEL_Chile_2020.pdf

DURACELL1583253185542-CertificateExtension_Duracell_ QuantumAAA_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583253185542-CertificateExtension_Duracell_%20QuantumAAA_TUV_Argentina_2020.pdf

DURACELL1583253068444-Certificate_Duracell_ QuantumAAA_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1583253068444-Certificate_Duracell_%20QuantumAAA_TUV_Argentina_2020.pdf

DNP1583239264900-ExtensionCertificate DNP DS-Tmini NYCE Mexico 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583239264900-ExtensionCertificate%20DNP%20DS-Tmini%20NYCE%20Mexico%202020.pdf

KINGSTON1583157842909-Certificate_Kingston_CS002_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583157842909-Certificate_Kingston_CS002_MTC_Peru_2020.pdf

KINGSTON1583157842814-Certificate_Kingston_CS002-WA_MTC_Peru_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1583157842814-Certificate_Kingston_CS002-WA_MTC_Peru_2020.pdf

KINGSTON1582899538031-Certificate_Kingston_HXS-HSCFS-WA1_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582899538031-Certificate_Kingston_HXS-HSCFS-WA1_SUBTEL_Chile_2020.pdf

KINGSTON1582899525781-Certificate_Kingston_CLOUD FLIGHT S_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582899525781-Certificate_Kingston_CLOUD%20FLIGHT%20S_SUBTEL_Chile_2020.pdf

SATO1582899154805-EXTENSIONCERTIFICATE_SATO_FX3-LX_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582899154805-EXTENSIONCERTIFICATE_SATO_FX3-LX_NYCE_MEXICO_2020.pdf

SATO1582899145519-EXTENSIONCERTIFICATE_SATO_FX3-LX_NYCE_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582899145519-EXTENSIONCERTIFICATE_SATO_FX3-LX_NYCE_MEXICO_2020.pdf

Kingstone1582897435955-CoC-Kingstone-CS002-WA-Brazil-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582897435955-CoC-Kingstone-CS002-WA-Brazil-2020.pdf

Kingstone1582895806483-CoC-Kingstone-CS002-WA-Brazil-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582895806483-CoC-Kingstone-CS002-WA-Brazil-2020.pdf

iRobot1582834356301-Cert.430-IROBOT-RVA-Y1-INMETRO-IBAMA-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582834356301-Cert.430-IROBOT-RVA-Y1-INMETRO-IBAMA-BRAZIL-2019.pdf

iRobot1582834336517-Cert.371-IROBOT-RVA-Y1-INMETRO-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582834336517-Cert.371-IROBOT-RVA-Y1-INMETRO-BRAZIL-2019.pdf

Novatel1582827456699-CoH-Novatel-PwrPak7-ANATEL-Brazil 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582827456699-CoH-Novatel-PwrPak7-ANATEL-Brazil%202020.pdf

Alien Technology1582729049069-CCT-ALIEN TECH. - ALR-F800-BRA-IBRACE-BRAZIL2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582729049069-CCT-ALIEN%20TECH.%20-%20ALR-F800-BRA-IBRACE-BRAZIL2020.pdf

SATO1582723022503-Certificate-SATO-FX3 LX-NYCE-Mexico-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582723022503-Certificate-SATO-FX3%20LX-NYCE-Mexico-2020.pdf

SATO1582722799197-Certificate-SATO-FX3 LX-NYCE-Mexico-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582722799197-Certificate-SATO-FX3%20LX-NYCE-Mexico-2020.pdf

Lenovo Chile1582233671257-Certificate_Lenovo_IdeaPad 5 15IIL05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582233671257-Certificate_Lenovo_IdeaPad%205%2015IIL05_SUBTEL_Chile_2020.pdf

Lenovo Chile1582233472096-Certificate_Lenovo_ IdeaPad 3 17IML05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1582233472096-Certificate_Lenovo_%20IdeaPad%203%2017IML05_SUBTEL_Chile_2020.pdf

TRIMBLE1582211285708-COH-TRIMBLE-SNR434-ANATEL-BRAZIL-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582211285708-COH-TRIMBLE-SNR434-ANATEL-BRAZIL-2020.pdf

GOOGLE1582143301916-Certificate_Google_G021A_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582143301916-Certificate_Google_G021A_SUBTEL_Chile_2020.pdf

TOPCON1582055742409-CERTIFICATE_TOPCON_HIPERVR_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1582055742409-CERTIFICATE_TOPCON_HIPERVR_IFT_MEXICO_2020.pdf

Lenovo Chile1581964687002-Certificate_Lenovo_IdeaPad Flex 3 11IGL05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581964687002-Certificate_Lenovo_IdeaPad%20Flex%203%2011IGL05_SUBTEL_Chile_2020.pdf

Nedap1581953384302-Certificate_Nedap_CONVEXS MD80G_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581953384302-Certificate_Nedap_CONVEXS%20MD80G_CRC_Colombia_2020.pdf

Nedap1581953362473-Certificate_Nedap_CONVEXS MD80FG_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581953362473-Certificate_Nedap_CONVEXS%20MD80FG_CRC_Colombia_2020.pdf

Nedap1581953345774-Certificate_Nedap_CONVEXS MD80FC_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581953345774-Certificate_Nedap_CONVEXS%20MD80FC_CRC_Colombia_2020.pdf

Nedap1581953325390-Certificate_Nedap_CONVEXS MD80C_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581953325390-Certificate_Nedap_CONVEXS%20MD80C_CRC_Colombia_2020.pdf

KINGSTON1581622382630-CERTIFICATE_KINGSTON_CS002_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581622382630-CERTIFICATE_KINGSTON_CS002_CRC_Colombia_2020.pdf

KINGSTON1581622266439-CERTIFICATE_KINGSTON_CS002-WA_CRC_Colombia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581622266439-CERTIFICATE_KINGSTON_CS002-WA_CRC_Colombia_2020.pdf

IROBOT1581440171778-Certificate-IROBOT-RVA-Y1-CONATEL-Honduras-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1581440171778-Certificate-IROBOT-RVA-Y1-CONATEL-Honduras-2020.pdf

TA1581346778629-CERTIFICATE_flex_TRINITY_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1581346778629-CERTIFICATE_flex_TRINITY_NYCE_2020.pdf

NOVATEL1580837635388-CoH-SATEL-SATELLINE-EASy Pro 35W:SRL-35-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580837635388-CoH-SATEL-SATELLINE-EASy%20Pro%2035W%3ASRL-35-ANATEL-BRAZIL-2019.pdf

NOVATEL1580837624856-CoH-SATEL-SATEL-EASy-Proof-(SATEL EASy-Proof)-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580837624856-CoH-SATEL-SATEL-EASy-Proof-%28SATEL%20EASy-Proof%29-ANATEL-BRAZIL-2019.pdf

NOVATEL1580835291231-CCT-NOVATEL-SRL-35; SATELLINE-EASy Pro 35W-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580835291231-CCT-NOVATEL-SRL-35%3B%20SATELLINE-EASy%20Pro%2035W-IBRACE-BRAZIL-2019.pdf

SATO1580831267370-CERTIFICATE_SATO_SX-PCEGN_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580831267370-CERTIFICATE_SATO_SX-PCEGN_IFT_MEXICO_2020.pdf

SATO1580831155033-CERTIFICATE_SATO_BT301(VRB4123-0102E)_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580831155033-CERTIFICATE_SATO_BT301%28VRB4123-0102E%29_IFT_MEXICO_2020.pdf

KINGSTON1580740024992-CERTIFICATE_KINGSTON_HXS-HSCFS_IFT_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580740024992-CERTIFICATE_KINGSTON_HXS-HSCFS_IFT_2020.pdf

KINGSTON1580740024874-CERTIFICATE_KINGSTON_CLOUD_FLICHT_S_IFT_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580740024874-CERTIFICATE_KINGSTON_CLOUD_FLICHT_S_IFT_2020.pdf

MIKROTIK1580496067314-CERTIFICATE_MIKROTIK_CCR1009-7G-1C-1S_PC_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580496067314-CERTIFICATE_MIKROTIK_CCR1009-7G-1C-1S_PC_NYCE_2020.pdf

MIKROTIK1580495361287-CERTIFICATE_MIKROTIK_RB750Gr3_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580495361287-CERTIFICATE_MIKROTIK_RB750Gr3_NYCE_2020.pdf

MIKROTIK1580495009701-CERTIFICATE_MIKROTIK_RB3011UiAS-RM_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580495009701-CERTIFICATE_MIKROTIK_RB3011UiAS-RM_NYCE_2020.pdf

MIKROTIK1580494998720-CERTIFICATE_MIKROTIK_RB2011iLS-IN_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494998720-CERTIFICATE_MIKROTIK_RB2011iLS-IN_NYCE_2020.pdf

MIKROTIK1580494986091-CERTIFICATE_MIKROTIK_RB1100Dx4_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494986091-CERTIFICATE_MIKROTIK_RB1100Dx4_NYCE_2020.pdf

MIKROTIK1580494947960-CERTIFICATE_MIKROTIK_CSS106-5G-1S_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494947960-CERTIFICATE_MIKROTIK_CSS106-5G-1S_NYCE_2020.pdf

MIKROTIK1580494929950-CERTIFICATE_MIKROTIK_CRS328-24P-4S+RM_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494929950-CERTIFICATE_MIKROTIK_CRS328-24P-4S%2BRM_NYCE_2020.pdf

MIKROTIK1580494901353-CERTIFICATE_MIKROTIK_CRS326-24G-2S+RM_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494901353-CERTIFICATE_MIKROTIK_CRS326-24G-2S%2BRM_NYCE_2020.pdf

MIKROTIK1580494535726-CERTIFICATE_MIKROTIK_CCR1036-12G-4S-EM_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494535726-CERTIFICATE_MIKROTIK_CCR1036-12G-4S-EM_NYCE_2020.pdf

MIKROTIK1580494521427-CERTIFICATE_MIKROTIK_CCR1036-8G-2S+EM_NYCE_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580494521427-CERTIFICATE_MIKROTIK_CCR1036-8G-2S%2BEM_NYCE_2020.pdf

MIKROTIK1580490395175-CERTIFICATE_QUALCOMM_QCA9531_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580490395175-CERTIFICATE_QUALCOMM_QCA9531_IFT_MEXICO_2020.pdf

MIKROTIK1580490388498-CERTIFICATE_QUALCOMM_ATHEROS_AR9382_IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580490388498-CERTIFICATE_QUALCOMM_ATHEROS_AR9382_IFT_MEXICO_2020.pdf

MIKROTIK1580490380095-CERTIFICATE_MikroTik_RB4011iGS+5HacQ2HnD-IN_ IFT_MEXICO_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580490380095-CERTIFICATE_MikroTik_RB4011iGS%2B5HacQ2HnD-IN_%20IFT_MEXICO_2020.pdf

ASKEY1580401552493-00007-20-01110-CoH-ASKEY-RTV9015VW-ANATEL-BRAZIL-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580401552493-00007-20-01110-CoH-ASKEY-RTV9015VW-ANATEL-BRAZIL-2020.pdf

ROKU1580331927027-Certificate-ROKU-3600X-NYCE-Mexico-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580331927027-Certificate-ROKU-3600X-NYCE-Mexico-2020.pdf

Lenovo Chile1580327281384-Certificate_Lenovo_IdeaPad 3 17ADA05_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580327281384-Certificate_Lenovo_IdeaPad%203%2017ADA05_SUBTEL_Chile_2020.pdf

DNP1580155130708-Certificate DNP DS-Tmini NYCE Mexico 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580155130708-Certificate%20DNP%20DS-Tmini%20NYCE%20Mexico%202020.pdf

TOPCON1580145738840-Form C Topcon PSAC60M-120 UL Argentina 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1580145738840-Form%20C%20Topcon%20PSAC60M-120%20UL%20Argentina%202020.pdf

Google1580139442607-CoH-GOOGLE-G021A-ANATEL-BRAZIL-2020.pdf
https://orbiscompliance.s3.amazonaws.com/1580139442607-CoH-GOOGLE-G021A-ANATEL-BRAZIL-2020.pdf

TOPCON1579634869383-Certificate Topcon PSAC60M-120 UL Argentina 2020.jpg
https://orbiscompliance.s3.amazonaws.com/1579634869383-Certificate%20Topcon%20PSAC60M-120%20UL%20Argentina%202020.jpg

IROBOT1579619961644-QR Code iRobot RVA-Y1 TUV Chile 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579619961644-QR%20Code%20iRobot%20RVA-Y1%20TUV%20Chile%202020.pdf

IROBOT1579619954751-QR Code iRobot ADB-N2 TUV Chile 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579619954751-QR%20Code%20iRobot%20ADB-N2%20TUV%20Chile%202020.pdf

IROBOT1579619948727-Certificate iRobot RVA-Y1 TUV Chile 2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579619948727-Certificate%20iRobot%20RVA-Y1%20TUV%20Chile%202020.pdf

IROBOT1579619929526-Certificate iRobot ADB-N2 TUV Chile 2020.pdf
https://orbiscompliance.s3.amazonaws.com/1579619929526-Certificate%20iRobot%20ADB-N2%20TUV%20Chile%202020.pdf

ORACLE1579184305543-Maintenance Certificate ORACLE Workstation 5A-6Adj. TUV_Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579184305543-Maintenance%20Certificate%20ORACLE%20Workstation%205A-6Adj.%20TUV_Argentina%202019.pdf

ORACLE1579181442282-FORM C_ORACLE_WORKSTATION 5A-6ADJ_LEALTAD COMERCIAL_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579181442282-FORM%20C_ORACLE_WORKSTATION%205A-6ADJ_LEALTAD%20COMERCIAL_2020.pdf

GOOGLE1579115697246-Certificate_Google_G021A_ENACOM_Argentina_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1579115697246-Certificate_Google_G021A_ENACOM_Argentina_2020.pdf

Industrias Cientific1579094121180-CCT-00116503-Industrias Cientific-Ventis Pro 5;4-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579094121180-CCT-00116503-Industrias%20Cientific-Ventis%20Pro%205%3B4-IBRACE-BRAZIL-2019.pdf

QUECTEL1579027732133-CERTIFICATE_QUECTEL_EC25-MX_IFT_2019_CORRECTED.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1579027732133-CERTIFICATE_QUECTEL_EC25-MX_IFT_2019_CORRECTED.PDF

QUECTEL1579027724066-CERTIFICATE_QUECTEL_EC25-MX_ MINIPCIE_IFT_2019_CORRECTED.PDF
https://orbiscompliance.s3.amazonaws.com/1579027724066-CERTIFICATE_QUECTEL_EC25-MX_%20MINIPCIE_IFT_2019_CORRECTED.PDF

NOVATEL1578948591859-CCT_00107869_-NOVATEL-PwrPak7-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1578948591859-CCT_00107869_-NOVATEL-PwrPak7-IBRACE-BRAZIL-2019.pdf

Lenovo Chile1578939344280-Certificate_RAZER_RC30-031501_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1578939344280-Certificate_RAZER_RC30-031501_SUBTEL_Chile_2020.pdf

ROKU1578691536741-Certificate-ROKU-3930MX-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578691536741-Certificate-ROKU-3930MX-IFT-Mexico-2019.pdf

ROKU1578690369723-Telecom Certificate-ROKU-3930MX-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578690369723-Telecom%20Certificate-ROKU-3930MX-NYCE-Mexico-2019.pdf

ROKU1578688328868-Certificate-ROKU-3920MX-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578688328868-Certificate-ROKU-3920MX-IFT-Mexico-2019.pdf

ROKU1578686926564-Telecom Certificate-ROKU-3920MX-NYCE-Mexico2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578686926564-Telecom%20Certificate-ROKU-3920MX-NYCE-Mexico2019.pdf

Lenovo Chile1578686078167-Certificate_RAZER_DGRFG6_SUBTEL_Chile_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578686078167-Certificate_RAZER_DGRFG6_SUBTEL_Chile_2020.pdf

GOOGLE1578663334947-CoC-00120389-GOOGLE-G021A-IBRACE-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578663334947-CoC-00120389-GOOGLE-G021A-IBRACE-BRAZIL-2020.pdf

MIKROTIK1578660879518-CERTIFICATE_MIKROTIK_RBLHGG-5HPacD2HPnD-XL_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578660879518-CERTIFICATE_MIKROTIK_RBLHGG-5HPacD2HPnD-XL_NYCE_MEXICO_2019.pdf

MIKROTIK1578660516849-CERTIFICATE_MIKROTIK_RB4011iGS+5HacQ2HnD-IN_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578660516849-CERTIFICATE_MIKROTIK_RB4011iGS%2B5HacQ2HnD-IN_NYCE_MEXICO_2019.pdf

MIKROTIK1578660384862-CERTIFICATE_QUALCOMM_IPQ-4018_NYCE_MEXICO_2019 .pdf
https://orbiscompliance.s3.amazonaws.com/1578660384862-CERTIFICATE_QUALCOMM_IPQ-4018_NYCE_MEXICO_2019%20.pdf

KCTL1578600950441-Certificate_HUMAX_MH01-500_NYCE_Mexico_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1578600950441-Certificate_HUMAX_MH01-500_NYCE_Mexico_2020.pdf

ROKU1578590002645-Certificate-ROKU-RC-AL7-SIGET-El Salvador-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578590002645-Certificate-ROKU-RC-AL7-SIGET-El%20Salvador-2019.pdf

ROKU1578588931431-Certificate-ROKU-3930MX-SIGET-El Salvador-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578588931431-Certificate-ROKU-3930MX-SIGET-El%20Salvador-2019.pdf

ORACLE1578587740873-Certificate_ORACLE_Workstation5-6_TUV_Argentina_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578587740873-Certificate_ORACLE_Workstation5-6_TUV_Argentina_2020.pdf

KCTL1578584202639-CoH- 09053-19-03269-KCTL-CWAP210M-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578584202639-CoH-%2009053-19-03269-KCTL-CWAP210M-ANATEL-BRAZIL-2019.pdf

ROKU1578524192254-Certificate-ROKU-3930MX-ASEP-Panama-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578524192254-Certificate-ROKU-3930MX-ASEP-Panama-2019.pdf

ROKU1578523193693-Certificate-ROKU-3930MX-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578523193693-Certificate-ROKU-3930MX-TELCOR-Nicaragua-2019.pdf

ROKU1578518417410-Certificate-ROKU-3930X-CONATEL-Honduras-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578518417410-Certificate-ROKU-3930X-CONATEL-Honduras-2019.pdf

ROKU1578515633214-Certificate-ROKU-3920MX-ASEP-Panama-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578515633214-Certificate-ROKU-3920MX-ASEP-Panama-2019.pdf

ROKU1578513103526-Certificate-Roku-3920MX-TELCOR-Nicaragua-2019 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578513103526-Certificate-Roku-3920MX-TELCOR-Nicaragua-2019%20.pdf

ROKU1578511460022-Certificate-ROKU-3920X-CONATEL-Honduras-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578511460022-Certificate-ROKU-3920X-CONATEL-Honduras-2019.pdf

ROKU1578509501588-Certificate-ROKU-RC-AL7-ASEP-Panama-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578509501588-Certificate-ROKU-RC-AL7-ASEP-Panama-2019.pdf

ROKU1578508406705-Certificate-ROKU-RC-AL7-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1578508406705-Certificate-ROKU-RC-AL7-TELCOR-Nicaragua-2019.pdf

ROKU1578502756249-Certificate-ROKU-RC-AL7-CONATEL-Honduras-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578502756249-Certificate-ROKU-RC-AL7-CONATEL-Honduras-2019.pdf

GOOGLE1578498457140-Certificate_Google_G021A_MTC_Peru_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578498457140-Certificate_Google_G021A_MTC_Peru_2019.pdf

IROBOT1578424988003-Certificate_iRobot_RVA-Y1_ATT_Bolivia_2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578424988003-Certificate_iRobot_RVA-Y1_ATT_Bolivia_2020.pdf

IROBOT1578424666910-Certificate_iRobot_RVA-Y1_Arcotel_Ecuador_2020.pdf
https://orbiscompliance.s3.amazonaws.com/1578424666910-Certificate_iRobot_RVA-Y1_Arcotel_Ecuador_2020.pdf

Sato1578412228063-Certificate Silex technology SX-PCEGN NYCE Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578412228063-Certificate%20Silex%20technology%20SX-PCEGN%20NYCE%20Mexico%202019.pdf

Sato1578412202444-Certificate SATO BT301 (VRB4123-0102E) NYCE Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578412202444-Certificate%20SATO%20BT301%20%28VRB4123-0102E%29%20NYCE%20Mexico%202019.pdf

KINGSTON1578344440409-19147UCS00010_Certificate-Kingston-HyperX Cloud Flight S-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578344440409-19147UCS00010_Certificate-Kingston-HyperX%20Cloud%20Flight%20S-UVA-Mexico-2019.pdf

ASKEY1578334849914-CCT_00121764-ASKEY-RTV9015-IBRACE-BRAZIL-2020.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578334849914-CCT_00121764-ASKEY-RTV9015-IBRACE-BRAZIL-2020.pdf

ROKU1578332483038-Certificate-ROKU-PA-1120-42RU-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578332483038-Certificate-ROKU-PA-1120-42RU-NYCE-Mexico-2019.pdf

ROKU1578331543111-Extension Certificate-ROKU-3810MX019-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1578331543111-Extension%20Certificate-ROKU-3810MX019-NYCE-Mexico-2019.pdf

KCTL1578323926416-Certificate_Samsung_CWAP210M_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1578323926416-Certificate_Samsung_CWAP210M_CRC_Colombia_2019.pdf

GOOGLE1578321444972-CERTIFICATE_GOOGLE_G021A_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1578321444972-CERTIFICATE_GOOGLE_G021A_NYCE_MEXICO_2019.pdf

Industrias Cientific Corporation1576877247422-CoH-Industrias Cientific Corporation-RADIUSBZ1-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576877247422-CoH-Industrias%20Cientific%20Corporation-RADIUSBZ1-ANATEL-BRAZIL-2019.pdf

Industrias Cientific Corporation1576877238923-CCT_00116495-Industrias Cientific Corporation-RADIUZBZ1-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576877238923-CCT_00116495-Industrias%20Cientific%20Corporation-RADIUZBZ1-IBRACE-BRAZIL-2019.pdf

IROBOT1576868022511-Certificate_iRobot_ RVA-Y1_MTC_Peru_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1576868022511-Certificate_iRobot_%20RVA-Y1_MTC_Peru_2019.pdf

IROBOT1576793181387-Certificate-IROBOT-RVA-Y1(Roomba s9)-ASEP-Panama-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576793181387-Certificate-IROBOT-RVA-Y1%28Roomba%20s9%29-ASEP-Panama-2019.pdf

SATEL1576783350468-07820-19-01451-CoH-SATEL- SATELLINE-EASy Pro 35W :SRL-35-ANATEL-BRAZIL-2019 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576783350468-07820-19-01451-CoH-SATEL-%20SATELLINE-EASy%20Pro%2035W%20%3ASRL-35-ANATEL-BRAZIL-2019%20.pdf

SATEL1576783340882-07769-19-01451-CoH-SATEL- SATELLINE-EASy-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576783340882-07769-19-01451-CoH-SATEL-%20SATELLINE-EASy-ANATEL-BRAZIL-2019.pdf

SATO1576779146935-Certificate Extension SATO CT4-LX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576779146935-Certificate%20Extension%20SATO%20%20CT4-LX%20NPMX%20%20Mexico%202019.pdf

SATO1576778954797-Certificate SATO CT4-LX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576778954797-Certificate%20SATO%20CT4-LX%20NPMX%20Mexico%202019.pdf

SATO1576778078135-Certificate Extension SATO S84-ex & S86-ex NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576778078135-Certificate%20Extension%20SATO%20%20S84-ex%20%26%20S86-ex%20NPMX%20Mexico%202019.pdf

SATO1576777443553-Certificate SATO S84-ex & S86-ex NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576777443553-Certificate%20SATO%20%20S84-ex%20%26%20S86-ex%20NPMX%20%20Mexico%202019.pdf

MAKERBOT1576768106995-Certificate_MakerBot_METHOD_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1576768106995-Certificate_MakerBot_METHOD_SUBTEL_Chile_2019.pdf

GOOGLE1576698977219-Letter of Clearance-Google-G021A-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1576698977219-Letter%20of%20Clearance-Google-G021A-SIT-Guatemala-2019.pdf

IROBOT1576614515971-Certificate Review Checklist Roomba s9 - Nicaragua.pdf
https://orbiscompliance.s3.amazonaws.com/1576614515971-Certificate%20Review%20Checklist%20Roomba%20s9%20-%20Nicaragua.pdf

Trimble1576086394119-CoH-TD520-Trimble-ANATEL-Brazil-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576086394119-CoH-TD520-Trimble-ANATEL-Brazil-2019.pdf

Kingston Technology1576073638664-Certificate_Kingston_HX-MC006B _MTC_Peru_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576073638664-Certificate_Kingston_HX-MC006B%20_MTC_Peru_2019.pdf

Kingston Technology1576073482177-Certificate_Kingston_HXS-MCWA1_MTC_Peru_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576073482177-Certificate_Kingston_HXS-MCWA1_MTC_Peru_2019.pdf

iROBOT1576010528923-Certificate_iRobot_ADB-N2_Lealtad Comercial_Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576010528923-Certificate_iRobot_ADB-N2_Lealtad%20Comercial_Argentina%202019.pdf

iROBOT1576010511659-Certificate iRobot ADB-N2 TUV Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1576010511659-Certificate%20iRobot%20ADB-N2%20TUV%20Argentina%202019.pdf

IROBOT1575994225473-Certificate_iRobot_RVA-Y1_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575994225473-Certificate_iRobot_RVA-Y1_SUTEL_Costa%20Rica_2019.pdf

IROBOT1575911423480-Certificate-iRobot-RVA-Y1 (Roomba s9) SIGET-El Salvador-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575911423480-Certificate-iRobot-RVA-Y1%20%28Roomba%20s9%29%20SIGET-El%20Salvador-2019.pdf

Motorola Solutions Inc.1575558810029-Certificate-Motorola-LEX L11a-SUTEL-Costa Rica-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575558810029-Certificate-Motorola-LEX%20L11a-SUTEL-Costa%20Rica-2019.pdf

KCTL1575472795740-CCT-KCTL_CWAP210M-IBRACE-BRAZIL-2019 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575472795740-CCT-KCTL_CWAP210M-IBRACE-BRAZIL-2019%20%20.pdf

Askey1575394250234-Certificate_ASKEY_RTF8115VW_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575394250234-Certificate_ASKEY_RTF8115VW_SUBTEL_Chile_2019.pdf

Kingston Technology1575378547790-Certificate_Kingston_CLOUD FLIGHT S_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575378547790-Certificate_Kingston_CLOUD%20FLIGHT%20S_ENACOM_Argentina_2019.pdf

Kingston Technology1575378521089-Certificate_Kingston_ HXS-HSCFS-WA1_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575378521089-Certificate_Kingston_%20HXS-HSCFS-WA1_ENACOM_Argentina_2019.pdf

iRobot1575303865916-Letter of Clearance-IROBOT-RVA-Y1(Roomba s9)-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575303865916-Letter%20of%20Clearance-IROBOT-RVA-Y1%28Roomba%20s9%29-SIT-Guatemala-2019.pdf

BTL1575036847808-Certificate_RAZER_RC30-031701_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575036847808-Certificate_RAZER_RC30-031701_SUBTEL_Chile_2019.pdf

BTL1575036831452-Certificate_RAZER_RC30-031501_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575036831452-Certificate_RAZER_RC30-031501_SUBTEL_Chile_2019.pdf

MIKROTIK1575032728218-CERTIFICATE_QUALCOMM_QCA9531_NYCE_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1575032728218-CERTIFICATE_QUALCOMM_QCA9531_NYCE_2019.pdf

MIKROTIK1575032424655-CERTIFICATE_Qualcomm_Atheros_AR9382_NYCE_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1575032424655-CERTIFICATE_Qualcomm_Atheros_AR9382_NYCE_2019.pdf

ROKU1574794845020-Certificate_ROKU_RC-AL7_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1574794845020-Certificate_ROKU_RC-AL7_SUBTEL_Chile_2019.pdf

BTL1574779816902-CERTIFICATE_LG_SI01_IFT_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1574779816902-CERTIFICATE_LG_SI01_IFT_2019.pdf

BTL1574779441282-CERTIFICATE_LG_SI01_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1574779441282-CERTIFICATE_LG_SI01_NYCE_MEXICO_2019.pdf

ORACLE1574364850405-FORMC Certificate -Oracle-M235B-Lealtad Comercial- Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1574364850405-FORMC%20Certificate%20-Oracle-M235B-Lealtad%20Comercial-%20Argentina%202019.pdf

ORACLE1574364773851-Extension Certificate Oracle M235B IRAM Argentina 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1574364773851-Extension%20Certificate%20Oracle%20M235B%20IRAM%20Argentina%202019.pdf

IROBOT1574100550367-Certificate_iRobot_ RVA-Y1_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1574100550367-Certificate_iRobot_%20RVA-Y1_CRC_Colombia_2019.pdf

SATO1574091961680-Notification SATO BT-1022 NYCE Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1574091961680-Notification%20SATO%20BT-1022%20NYCE%20Mexico%202019.pdf

SATO1574091860761-Notification SATO SX-570 NYCE Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1574091860761-Notification%20SATO%20SX-570%20NYCE%20Mexico%202019.pdf

Kingston Technology1573843829896-Certificate_Kingston_CLOUD FLIGHT, HXS-HSDG2_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1573843829896-Certificate_Kingston_CLOUD%20FLIGHT%2C%20HXS-HSDG2_SUBTEL_Chile_2019.pdf

Kingston Technology1573843709311-Certificate_Kingston_CLOUD FLIGHT_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1573843709311-Certificate_Kingston_CLOUD%20FLIGHT_SUBTEL_Chile_2019.pdf

Askey1573843127676-Certificate_Askey_RTV9015VW_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1573843127676-Certificate_Askey_RTV9015VW_ENACOM_Argentina_2019.pdf

iRobot1573659191785-Certificate_iRobot_RMA-Y1_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1573659191785-Certificate_iRobot_RMA-Y1_SUBTEL_Chile_2019.pdf

Google Inc.1573656272446-Certificate_Google_G021A_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1573656272446-Certificate_Google_G021A_CRC_Colombia_2019.pdf

ROKU1573568933111-CERTIFICATE_Roku_3920MX_MTC_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1573568933111-CERTIFICATE_Roku_3920MX_MTC_2019.pdf

ROKU1573568387404-CERTIFICATE_Roku_3920MX_SIGET_EL_SALVADOR_2019.PDF
https://orbiscompliance.s3.amazonaws.com/1573568387404-CERTIFICATE_Roku_3920MX_SIGET_EL_SALVADOR_2019.PDF

IROBOT1572966974401-CCT-IROBOT-380-ICBR-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1572966974401-CCT-IROBOT-380-ICBR-BRAZIL-2019.pdf

Lenovo Chile1572450601692-Certificate_Lenovo_Lenovo ThinkBook 13s-IML_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1572450601692-Certificate_Lenovo_Lenovo%20ThinkBook%2013s-IML_SUBTEL_Chile_2019.pdf

Nedap1572268201107-Certification_NEDAP_ASSY FLR RF+RFID_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1572268201107-Certification_NEDAP_ASSY%20FLR%20RF%2BRFID_CRC_Colombia_2019.pdf

Lenovo Chile1571922519681-Certificate_Lenovo_ Lenovo IdeaPad S540-13IML_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1571922519681-Certificate_Lenovo_%20Lenovo%20IdeaPad%20S540-13IML_SUBTEL_Chile_2019.pdf

Intel Corporation1571673150377-Certificate_ECSELITEGROUP_GWS-CSCG Tag_SIRIM_MALAYSIA_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571673150377-Certificate_ECSELITEGROUP_GWS-CSCG%20Tag_SIRIM_MALAYSIA_2019.pdf

Intel Corporation1571673138953-Certificate_ECSELITEGROUP_GWS-CSCG_SIRIM_MALAYSIA_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1571673138953-Certificate_ECSELITEGROUP_GWS-CSCG_SIRIM_MALAYSIA_2019.pdf

iROBOT1571413945030-Extension Certificate iRobot RMA-Y1 NYCE Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571413945030-Extension%20Certificate%20iRobot%20RMA-Y1%20NYCE%20Mexico%202019.pdf

iROBOT1571413857646-Certificate iRobot RMA-Y1 NYCE Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1571413857646-Certificate%20iRobot%20RMA-Y1%20NYCE%20Mexico%202019.pdf

TOPCON1571322017334-CERTIFICATE_SOKKIA_GRX3_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571322017334-CERTIFICATE_SOKKIA_GRX3_NYCE_MEXICO_2019.pdf

TOPCON1571321990628-CERTIFICATE_SOKKIA_GRX3_IFT_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571321990628-CERTIFICATE_SOKKIA_GRX3_IFT_MEXICO_2019.pdf

TOPCON1571320759866-CERTIFICATE_SOKKIA_GRX3_LTE_NYCE_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571320759866-CERTIFICATE_SOKKIA_GRX3_LTE_NYCE_MEXICO_2019.pdf

TOPCON1571320697038-CERTIFICATE_SOKKIA_GRX3_LTE_IFT_MEXICO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571320697038-CERTIFICATE_SOKKIA_GRX3_LTE_IFT_MEXICO_2019.pdf

SATEL1571318957247-CCT_00117739_SATEL_SATELLINE-4Pro_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571318957247-CCT_00117739_SATEL_SATELLINE-4Pro_IBRACE_BRAZIL_2019.pdf

SATEL1571318946605-Certificado_00117799_R1.pdf
https://orbiscompliance.s3.amazonaws.com/1571318946605-Certificado_00117799_R1.pdf

ASKEY1571144908866-04275-19-01110-CoH-8117-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1571144908866-04275-19-01110-CoH-8117-ANATEL-BRAZIL-2019.pdf

ROKU1571070408482-Certificate-ROKU-4210X2&4230X2019-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571070408482-Certificate-ROKU-4210X2%264230X2019-NYCE-Mexico-2019.pdf

ROKU1571070337772-Certificate-ROKU-3910MX019-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1571070337772-Certificate-ROKU-3910MX019-NYCE-Mexico-2019.pdf

ROKU1571067586838-Certificate-ROKU-3810MX019-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1571067586838-Certificate-ROKU-3810MX019-NYCE-Mexico-2019.pdf

iROBOT1570809560212-Certificate iRobot RMA-Y1 TUV-SEC Chile 2019.zip
https://orbiscompliance.s3.amazonaws.com/1570809560212-Certificate%20iRobot%20RMA-Y1%20TUV-SEC%20Chile%202019.zip

SATEL1570711687137-CoH_06770-19-01451_SATEL_SATELLINE-3AS VHF :SATELLINE-3ASd VHF_ANATEL_BRAZIL_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570711687137-CoH_06770-19-01451_SATEL_SATELLINE-3AS%20VHF%20%3ASATELLINE-3ASd%20VHF_ANATEL_BRAZIL_2019.pdf

SATEL1570648783565-CCT_00117739_SATEL_SATELLINE-4Pro_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570648783565-CCT_00117739_SATEL_SATELLINE-4Pro_IBRACE_BRAZIL_2019.pdf

SATEL1570648101016-06778-19-01451_CoH_SATEL_SATELLINE-4Pro_ANATEL_BRASIL.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570648101016-06778-19-01451_CoH_SATEL_SATELLINE-4Pro_ANATEL_BRASIL.pdf

SCOSCHE1570642816533-Certificate-Scosche-Magic Mount-UVA-NOM050-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570642816533-Certificate-Scosche-Magic%20Mount-UVA-NOM050-Mexico-2019.pdf

SCOSCHE1570642735583-Certificate-Scosche-Magic Mount-UVA-NOM024-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570642735583-Certificate-Scosche-Magic%20Mount-UVA-NOM024-Mexico-2019.pdf

Lenovo Chile1570636142911-Certificate_Lenovo_Lenovo ThinkBook 14S-IML_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570636142911-Certificate_Lenovo_Lenovo%20ThinkBook%2014S-IML_SUBTEL_Chile_2019.pdf

MakerBot1570635852264-Certificate_MakerBot_840-0010A_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570635852264-Certificate_MakerBot_840-0010A_ENACOM_Argentina_2019.pdf

Novatel1570635687470-Certificate_Novatel_BT121_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570635687470-Certificate_Novatel_BT121_ENACOM_Argentina_2019.pdf

DURACELL1570634156450-Certificate-Duracell-Project 8408-UVA-Mexico-2019.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570634156450-Certificate-Duracell-Project+8408-UVA-Mexico-2019.zip

DURACELL1570633956073-Certificate-Duracell-Project 5864-UVA-Mexico-2019.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633956073-Certificate-Duracell-Project+5864-UVA-Mexico-2019.zip

DURACELL1570633819823-Certificate-Duracell-Project 5891-UVA-Mexico-2019.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633819823-Certificate-Duracell-Project+5891-UVA-Mexico-2019.zip

DURACELL1570633764588-Certificate-Duracell-Project 5891-UVA-Mexico-2019.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633764588-Certificate-Duracell-Project+5891-UVA-Mexico-2019.zip

DURACELL1570633156101-Certificate-Duracell-AAA China-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633156101-Certificate-Duracell-AAA%20China-UVA-Mexico-2019.pdf

DURACELL1570633141537-Certificate-Duracell-AAA Belgium-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633141537-Certificate-Duracell-AAA%20Belgium-UVA-Mexico-2019.pdf

DURACELL1570633110016-Certificate-Duracell-AA China-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633110016-Certificate-Duracell-AA%20China-UVA-Mexico-2019.pdf

DURACELL1570633092533-Certificate-Duracell-AA Belgium-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570633092533-Certificate-Duracell-AA%20Belgium-UVA-Mexico-2019.pdf

DURACELL1570633059596-Certificate-Duracell-CEF14 Charger-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570633059596-Certificate-Duracell-CEF14%20Charger-UVA-Mexico-2019.pdf

SATEL1570556229156-CoH_SATEL_SATELLINE_M3_TR4_ANATEL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570556229156-CoH_SATEL_SATELLINE_M3_TR4_ANATEL_2019.pdf

KINGSTON1570556024808-Certificate-Kingston-HyperX Charge Play Clutch-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570556024808-Certificate-Kingston-HyperX%20Charge%20Play%20Clutch-UVA-Mexico-2019.pdf

ORACLE1570219597255-Certificate Oracle FSP060-DIBAN2 Lealtad Comercial Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570219597255-Certificate%20Oracle%20FSP060-DIBAN2%20Lealtad%20Comercial%20Argentina%202019.pdf

ORACLE1570219351293-Certificate Oracle FSP060-DIBAN2 IRAM Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570219351293-Certificate%20Oracle%20FSP060-DIBAN2%20IRAM%20Argentina%202019.pdf

NEDAP1570216503903-Certificate_Nedap_SMART DEACT_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570216503903-Certificate_Nedap_SMART%20DEACT_CRC_Colombia_2019.pdf

SATO1570108656715-Extension Certificate SATO WS4DT NPMX Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570108656715-Extension%20Certificate%20SATO%20WS4DT%20NPMX%20Mexico%202019.pdf

KINGSTON1570044110893-Certificate_HyperX:KINGSTON_HXS-MCWA1_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570044110893-Certificate_HyperX%3AKINGSTON_HXS-MCWA1_CRC_Colombia_2019.pdf

KINGSTON1570044091032-Certificate_HyperX:KINGSTON_HX-MC006B_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1570044091032-Certificate_HyperX%3AKINGSTON_HX-MC006B_CRC_Colombia_2019.pdf

Trimble Inc.1570024423565-CCT_00115449_TRIMBLE_TD510-TD520_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1570024423565-CCT_00115449_TRIMBLE_TD510-TD520_IBRACE_BRAZIL_2019.pdf

IROBOT1569594240075-CERTIFICATE_iRobot_RMY-Y1_BTZ_CURACAO_5GHz_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569594240075-CERTIFICATE_iRobot_RMY-Y1_BTZ_CURACAO_5GHz_2019.pdf

IROBOT1569594230673-CERTIFICATE_iRobot_RMY-Y1_BTZ_CURACAO_2.4GHz_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1569594230673-CERTIFICATE_iRobot_RMY-Y1_BTZ_CURACAO_2.4GHz_2019.pdf

ROKU1569524186394-Certificate_ROKU_3930MX_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1569524186394-Certificate_ROKU_3930MX_SUTEL_Costa%20Rica_2019.pdf

Askey Brasil1569356480963-02245-19-01110_CoH_ASKEY_RTF8115VW_ANATEL_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569356480963-02245-19-01110_CoH_ASKEY_RTF8115VW_ANATEL_BRAZIL_2019.pdf

Askey Brasil1569356469538-CoC_00115700_ASKEY_8115_IBRACE_BRAZIL_2019 (1).pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569356469538-CoC_00115700_ASKEY_8115_IBRACE_BRAZIL_2019%20%281%29.pdf

Trimble Inc.1569351929053-CCT_TRIMBLE_SNR343_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1569351929053-CCT_TRIMBLE_SNR343_IBRACE_BRAZIL_2019.pdf

DURACELL1569007013282-Certificate-Duracell-AAA Rechargeables-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569007013282-Certificate-Duracell-AAA%20Rechargeables-UVA-Mexico-2019.pdf

DURACELL1569006621363-Certificate-Duracell-AA Rechargeables-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569006621363-Certificate-Duracell-AA%20Rechargeables-UVA-Mexico-2019.pdf

DURACELL1569006494049-Certificate-Duracell-Zinc Air-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569006494049-Certificate-Duracell-Zinc%20Air-UVA-Mexico-2019.pdf

DURACELL1569006395878-Certificate-Duracell-2016-2025-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569006395878-Certificate-Duracell-2016-2025-UVA-Mexico-2019.pdf

DURACELL1569006270838-Certificate-Duracell-21-23-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569006270838-Certificate-Duracell-21-23-UVA-Mexico-2019.pdf

DURACELL1569006189198-Certificate-Duracell-2032-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569006189198-Certificate-Duracell-2032-UVA-Mexico-2019.pdf

DURACELL1569005778642-Certificate-Duracell-UVA-CR2-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005778642-Certificate-Duracell-UVA-CR2-Mexico-2019.pdf

DURACELL1569005670338-Certificate-Duracell-123-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005670338-Certificate-Duracell-123-UVA-Mexico-2019.pdf

DURACELL1569005239810-Certificate-Duracell-D-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005239810-Certificate-Duracell-D-UVA-Mexico-2019.pdf

DURACELL1569005131443-Certificate-Duracell-C-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005131443-Certificate-Duracell-C-UVA-Mexico-2019.pdf

DURACELL1569005124200-Certificate-Duracell-C-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005124200-Certificate-Duracell-C-UVA-Mexico-2019.pdf

DURACELL1569005034218-Certificate-Duracell-AAA-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569005034218-Certificate-Duracell-AAA-UVA-Mexico-2019.pdf

DURACELL1569004872710-Certificate-Duracell-AA-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1569004872710-Certificate-Duracell-AA-UVA-Mexico-2019.pdf

DURACELL1568996717195-Certificate-Duracell-PB1-PB2-PB3-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568996717195-Certificate-Duracell-PB1-PB2-PB3-UVA-Mexico-2019.pdf

Nedap1568995133100-certificate_Nedap_ASSY AD46R RF+RFID_Uruguay_URSEC_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568995133100-certificate_Nedap_ASSY%20AD46R%20RF%2BRFID_Uruguay_URSEC_2019.pdf

Kingston Technology1568990812104-CoH_kingston_ChargePlay Base_ibrace_Brazil_2019 rev00.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568990812104-CoH_kingston_ChargePlay%20Base_ibrace_Brazil_2019%20rev00.pdf

Kingston Technology1568923147818-CoH_KINGSTON_ HXS-HSCFS_ibrace_BRAZIL_2019WA1 - .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568923147818-CoH_KINGSTON_%20HXS-HSCFS_ibrace_BRAZIL_2019WA1%20-%20.pdf

DURACELL1568921808543-Certificate Duracell CEF14NA4 NYCE Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568921808543-Certificate%20Duracell%20CEF14NA4%20NYCE%20Mexico%202019.pdf

Kingston Technology1568900316723-05575-19-07196_CoH_KINGSTON_CloudFligh S_ANATEL_BRAZIL_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568900316723-05575-19-07196_CoH_KINGSTON_CloudFligh%20S_ANATEL_BRAZIL_2019.pdf

ASKEY1568735194028-07404-17-01110_CoH_ASKEY_RTA9227VW_ANATEL_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568735194028-07404-17-01110_CoH_ASKEY_RTA9227VW_ANATEL_BRAZIL_2019.pdf

JLG Industries1568666507523-CERTIFICATE JLG RFID KEYPAD IFT MEXICO 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568666507523-CERTIFICATE%20JLG%20RFID%20KEYPAD%20IFT%20MEXICO%202019.pdf

MakerBot1568656135383-Certificate_MakeerBot_WL18MODGI_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568656135383-Certificate_MakeerBot_WL18MODGI_ENACOM_Argentina_2019.pdf

ORACLE1568655943115-DICTAMEN_ORACLE_T82_NOR19130AE0069_NPMX_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568655943115-DICTAMEN_ORACLE_T82_NOR19130AE0069_NPMX_2019.pdf

ORACLE1568655341455-DICTAMEN_ORACLE_9600_NOR19130AE0070_NPMX_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568655341455-DICTAMEN_ORACLE_9600_NOR19130AE0070_NPMX_2019.pdf

ORACLE1568655074450-DICTAMEN_ORACLE_ PU2SL_NOR19130AE0063_NPMX_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568655074450-DICTAMEN_ORACLE_%20PU2SL_NOR19130AE0063_NPMX_2019.pdf

ROKU1568404303643-Certificate_ROKU:JVLAT_3920X_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568404303643-Certificate_ROKU%3AJVLAT_3920X_ENACOM_Argentina_2019.pdf

MAKERBOT1568400296925-Commercialization Permit MakerBot METHOD TAD Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568400296925-Commercialization%20Permit%20MakerBot%20METHOD%20TAD%20Argentina%202019.pdf

ROKU1568398568984-Certificate_ROKU:JVLAT_3930X_ENACOM_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568398568984-Certificate_ROKU%3AJVLAT_3930X_ENACOM_2019.pdf

OTICON1568317619204-CERTIFICATE_OTICON_MEDICAL_PONTO_3_SUPERPOWER_MEXICO_IFT_2019.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568317619204-CERTIFICATE_OTICON_MEDICAL_PONTO_3_SUPERPOWER_MEXICO_IFT_2019.PDF

OTICON1568317477874-CERTIFICATE_OTICON_MEDICAL_PONTO_3_POWER_MEXICO_IFT_2019.PDF
https://orbiscompliance.s3.amazonaws.com/1568317477874-CERTIFICATE_OTICON_MEDICAL_PONTO_3_POWER_MEXICO_IFT_2019.PDF

IROBOT1568295210993-CERTIFICATE_IROBOT_RMA-Y1(Braava jet m6)_URSEC_URUGUAY_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568295210993-CERTIFICATE_IROBOT_RMA-Y1%28Braava%20jet%20m6%29_URSEC_URUGUAY_2019.pdf

NOVATEL1568209704588-Certificate_NovAtel_BT121_Uruguay_URSEC_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568209704588-Certificate_NovAtel_BT121_Uruguay_URSEC_2019.pdf

ROKU1568140365635-Letter of Clearance-ROKU-3930MX-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568140365635-Letter%20of%20Clearance-ROKU-3930MX-SIT-Guatemala-2019.pdf

ORACLE1568139213656-DictamenOracleHSE PU1SLT-mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1568139213656-DictamenOracleHSE%20PU1SLT-mexico-2019.pdf

ORACLE1568138041097-DictamenOracleHSE PU1SL-mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1568138041097-DictamenOracleHSE%20PU1SL-mexico-2019.pdf

ROKU1567802192182-Letter of Clearance-ROKU-RC-AL7-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567802192182-Letter%20of%20Clearance-ROKU-RC-AL7-SIT-Guatemala-2019.pdf

ROKU1567802004087-Letter of Clearance-ROKU-3920MX-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567802004087-Letter%20of%20Clearance-ROKU-3920MX-SIT-Guatemala-2019.pdf

IROBOT1567794490744-Certificate-IROBOT-AXE-Y1-DTZ-Aruba-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567794490744-Certificate-IROBOT-AXE-Y1-DTZ-Aruba-2019.pdf

Industrial Scientific Corporation1567793297243-Certificate _Industrial Scientific_RADIUS_BZ1_MEXICO_ITF_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567793297243-Certificate%20_Industrial%20Scientific_RADIUS_BZ1_MEXICO_ITF_2019.pdf

ASKEY1567792469261-CCT_00106162_RTV9227VW_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567792469261-CCT_00106162_RTV9227VW_IBRACE_BRAZIL%10_2019.pdf

Industrial Scientific Corporation1567792061677-CERTIFiCATE _Industrial Scientific Corporation_VENTIS PRO4_MEXICO_ITF_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567792061677-CERTIFiCATE%20_Industrial%20Scientific%20Corporation_VENTIS%20PRO4_MEXICO_ITF_2019.pdf

Industrial Scientific Corporation1567792046805-CERTIFiCATE _Industrial Scientific Corporation_VENTIS PRO5_MEXICO_ITF_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567792046805-CERTIFiCATE%20_Industrial%20Scientific%20Corporation_VENTIS%20PRO5_MEXICO_ITF_2019.pdf

SATO1567195288466-Extension Certificate SATO CG408-412 NPMX Mexico 2019 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567195288466-Extension%20Certificate%20SATO%20CG408-412%20NPMX%20Mexico%202019%20.pdf

SATO1567195274900-Extension Certificate SATO CG408-412 NPMX Mexico 2019 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567195274900-Extension%20Certificate%20SATO%20CG408-412%20NPMX%20Mexico%202019%20.pdf

SATO1567195141317-Certificate SATO CG408-412 NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567195141317-Certificate%20SATO%20CG408-412%20NPMX%20Mexico%202019.pdf

SATO1567194659101-Extension Certificate SATO WS4TT NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567194659101-Extension%20Certificate%20SATO%20WS4TT%20NPMX%20Mexico%202019.pdf

SATO1567194585334-Certificate SATO WS4TT NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567194585334-Certificate%20SATO%20WS4TT%20NPMX%20Mexico%202019.pdf

SATO1567193451674-Extension Certificate SATO CL4NX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567193451674-Extension%20Certificate%20SATO%20CL4NX%20NPMX%20Mexico%202019.pdf

SATO1567193320240-Certificate SATO CL4NX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567193320240-Certificate%20SATO%20CL4NX%20NPMX%20Mexico%202019.pdf

SATO1567192143663-Extension Certificate SATO CG2xx NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567192143663-Extension%20Certificate%20SATO%20CG2xx%20NPMX%20Mexico%202019.pdf

SATO1567191740486-Extension Certificate SATO M-84Pro NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567191740486-Extension%20Certificate%20SATO%20M-84Pro%20NPMX%20Mexico%202019.pdf

SATO1567191513710-Extension Certificate SATO M-84Pro(New PSU) NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567191513710-Extension%20Certificate%20SATO%20M-84Pro%28New%20PSU%29%20NPMX%20Mexico%202019.pdf

DURACELL1567191076456-Certificate-Duracell-Genomma-QuantumAAA-BureauVeritas-Colombia-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567191076456-Certificate-Duracell-Genomma-QuantumAAA-BureauVeritas-Colombia-2019.pdf

SATO1567190668181-Certificate SATO CL6NX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567190668181-Certificate%20SATO%20CL6NX%20NPMX%20Mexico%202019.pdf

KINGSTON1567190238911-CCT-KINGSTON-CHARGEPLAYBASE-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567190238911-CCT-KINGSTON-CHARGEPLAYBASE-IBRACE-BRAZIL-2019.pdf

IROBOT TRANSFER1567176453000-Certificates Transfer-IROBOT-INMETRO-BRAZIL-2019.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567176453000-Certificates+Transfer-IROBOT-INMETRO-BRAZIL-2019.zip

ROKU1567110029924-Certificate_Roku_3920X_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567110029924-Certificate_Roku_3920X_SUBTEL_Chile_2019.pdf

Lenovo1567106166307-Certificate_BTL_Lenovo IdeaPad S540-15IML_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567106166307-Certificate_BTL_Lenovo%20IdeaPad%20S540-15IML_SUBTEL_Chile_2019.pdf

ROKU1567105368029-Certificate_ROKU_3930X_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567105368029-Certificate_ROKU_3930X_SUBTEL_Chile_2019.pdf

KCTL1567096386040-Certificate_Humax Co.,Ltd_PTT-1000W_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1567096386040-Certificate_Humax%20Co.%2CLtd_PTT-1000W_SUBTEL_Chile_2019.pdf

Oticon1567027091768-CERTIFICATE_OTICON_MEDICAL_PONTO_3_MEXICO_IFT_2019.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567027091768-CERTIFICATE_OTICON_MEDICAL_PONTO_3_MEXICO_IFT_2019.PDF

TA Technology1567005390938-CERTIFICATE_QUECTEL_EC25-MX_MNIPCIE_MEXICO_IFT_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1567005390938-CERTIFICATE_QUECTEL_EC25-MX_MNIPCIE_MEXICO_IFT_2019.pdf

TA Technology1567005366786-CERTIFICATE_QUECTEL_EC25-MX_MEXICO_IFT_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1567005366786-CERTIFICATE_QUECTEL_EC25-MX_MEXICO_IFT_2019.pdf

SATO1566932995219-Certificate SATO WS4DT NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566932995219-Certificate%20SATO%20WS4DT%20NPMX%20Mexico%202019.pdf

SATO1566932981693-Certificate SATO M-84Pro(New PSU) NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566932981693-Certificate%20SATO%20M-84Pro%28New%20PSU%29%20NPMX%20Mexico%202019.pdf

SATO1566932963017-Certificate SATO M-84Pro NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566932963017-Certificate%20SATO%20M-84Pro%20NPMX%20Mexico%202019.pdf

SATO1566932948018-Certificate SATO CL6NX NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566932948018-Certificate%20SATO%20CL6NX%20NPMX%20Mexico%202019.pdf

SATO1566932929080-Certificate SATO CG2xx NPMX Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1566932929080-Certificate%20SATO%20CG2xx%20NPMX%20Mexico%202019.pdf

IROBOT1566831884869-Certificate-IROBOT-AXE-Y1-CONATEL-Honduras-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566831884869-Certificate-IROBOT-AXE-Y1-CONATEL-Honduras-2019.pdf

IROBOT1566831884518-Certificate-IROBOT-AXE-Y1-CONATEL-Honduras-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566831884518-Certificate-IROBOT-AXE-Y1-CONATEL-Honduras-2019.pdf

IROBOT1566831610999-Certificate-iRobot-Braava jet m6-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566831610999-Certificate-iRobot-Braava%20jet%20m6-TELCOR-Nicaragua-2019.pdf

ORACLE1566587336094-Certificate_Oracle_M159E_Lealtad Comercial_Argentina_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1566587336094-Certificate_Oracle_M159E_Lealtad%20Comercial_Argentina_2019.pdf

ROKU1566502807424-Certificate_ROKU_3920MX_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1566502807424-Certificate_ROKU_3920MX_SUTEL_Costa%20Rica_2019.pdf

SATEL1566400821807-05587-19-01451_CoH_SATEL_EASy-proof_ANATEL_BRAZIL_2019pdf.pdf
https://orbiscompliance.s3.amazonaws.com/1566400821807-05587-19-01451_CoH_SATEL_EASy-proof_ANATEL_BRAZIL_2019pdf.pdf

ASKEY1566312193750-02745-16-01110_CoH_ASKEY_RTV9015VW_IBRACE_BRAZIL_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566312193750-02745-16-01110_CoH_ASKEY_RTV9015VW_IBRACE_BRAZIL_2019.pdf

IROBOT1566230883282-Certificate_Irobot_RMA-Y1 (Braava jet m6)_ATT_Bolivia_2019.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1566230883282-Certificate_Irobot_RMA-Y1%20%28Braava%20jet%20m6%29_ATT_Bolivia_2019.PDF

KINGSTON1566221110419-Certificate of Conformity-KINGSTON-HXS-HSCFS-WA-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1566221110419-Certificate%20of%20Conformity-KINGSTON-HXS-HSCFS-WA-IBRACE-BRAZIL-2019.pdf

MAKERBOT1566057085427-Certificate MakerBot METHOD ULAR Argentina 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1566057085427-Certificate%20MakerBot%20METHOD%20ULAR%20Argentina%202019.pdf

ROKU1565978929194-Certificate_ROKU_3930X_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565978929194-Certificate_ROKU_3930X_ENACOM_Argentina_2019.pdf

ROKU1565978918585-Certificate_ROKU_3920X_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565978918585-Certificate_ROKU_3920X_ENACOM_Argentina_2019.pdf

Topcon1565964709475-Certificate-Topcon-HIPER VR+LTE-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565964709475-Certificate-Topcon-HIPER%20VR%2BLTE-ENACOM-Argentina-2019.pdf

ROKU1565964211815-Certificate_ROKU_3930MX_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565964211815-Certificate_ROKU_3930MX_CRC_Colombia_2019.pdf

ROKU1565963160779-Certificate_ROKU_RC-AL7-CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565963160779-Certificate_ROKU_RC-AL7-CRC_Colombia_2019.pdf

Kingston Technology1565963137356-Certificate of Conformity- KINGSTON-Cloud fligth S - IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1565963137356-Certificate%20of%20Conformity-%20KINGSTON-Cloud%20fligth%20S%20-%20IBRACE-BRAZIL-2019.pdf

ASKEY1565883425144-Certificate of Conformity-ASKEY-JABIL-RTF8117VW-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565883425144-Certificate%20of%20Conformity-ASKEY-JABIL-RTF8117VW-IBRACE-BRAZIL-2019.pdf

ORACLE1565791278243-Follow up Certificate ORACLE M159E TUV Argentina 2019 .pdf
https://orbiscompliance.s3.amazonaws.com/1565791278243-Follow%20up%20Certificate%20ORACLE%20M159E%20TUV%20Argentina%202019%20.pdf

ORACLE1565619241895-DICTAMEN_Oracle_ T84_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565619241895-DICTAMEN_Oracle_%20T84_Server_NPMX_Mexico.pdf

ORACLE1565619206536-DICTAMEN_Oracle_ SMNA-2_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565619206536-DICTAMEN_Oracle_%20SMNA-2_Server_NPMX_Mexico.pdf

ORACLE1565619001287-DICTAMEN_Oracle_ SMNA-1_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565619001287-DICTAMEN_Oracle_%20SMNA-1_Server_NPMX_Mexico.pdf

ORACLE1565618855964-DICTAMEN_Oracle_ PU2SL_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565618855964-DICTAMEN_Oracle_%20PU2SL_Server_NPMX_Mexico.pdf

ORACLE1565618840361-DICTAMEN_Oracle_ PU2SL_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565618840361-DICTAMEN_Oracle_%20PU2SL_Server_NPMX_Mexico.pdf

ORACLE1565618406388-DICTAMEN_Oracle_ PU1SL_Server_NPMX_Mexico.pdf
https://orbiscompliance.s3.amazonaws.com/1565618406388-DICTAMEN_Oracle_%20PU1SL_Server_NPMX_Mexico.pdf

Industrial Scientific Corporation1565382730086-Certificate-Industrial Scientific-iAssign-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565382730086-Certificate-Industrial%20Scientific-iAssign-SUBTEL-Chile-2019.pdf

HME1565375674532-Certificate of Homolation-HME-1404-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1565375674532-Certificate%20of%20Homolation-HME-1404-IBRACE-BRAZIL-2019.pdf

ROKU1565282491701-Safety Certificate-ROKU-3930MX-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565282491701-Safety%20Certificate-ROKU-3930MX-NYCE-Mexico-2019.pdf

ROKU1565278594875-Safety Certificate-ROKU-3920MX-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565278594875-Safety%20Certificate-ROKU-3920MX-NYCE-Mexico-2019.pdf

ASKEY1565040005261-Certificate of Conformity-ASKEY-RTF8117VVW-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565040005261-Certificate%20of%20Conformity-ASKEY-RTF8117VVW-IBRACE-BRAZIL-2019.pdf

Kingston Technology1565034131816-Certificate-HyperX-HXS-HSWA-CSW-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565034131816-Certificate-HyperX-HXS-HSWA-CSW-SUBTEL-Chile-2019.pdf

Kingston Technology1565034114826-Certificate-HyperX-HX-HSCSW(HX-HSCSW2-BK:WW)-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1565034114826-Certificate-HyperX-HX-HSCSW%28HX-HSCSW2-BK%3AWW%29-SUBTEL-Chile-2019.pdf

Kingston Technology1565034084057-Certificate-HyperX-HX-HSCAM-GM-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1565034084057-Certificate-HyperX-HX-HSCAM-GM-SUBTEL-Chile-2019.pdf

Lenovo Chile1564754684882-Certificate-Lenovo-Y540-17IRH-PG0-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564754684882-Certificate-Lenovo-Y540-17IRH-PG0-SUBTEL-Chile-2019.pdf

Lenovo Chile1564754319117-Certificate-Lenovo-Legion Y540-17IRH-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564754319117-Certificate-Lenovo-Legion%20Y540-17IRH-SUBTEL-Chile-2019.pdf

Lenovo Chile1564754028532-Certificate-Lenovo-Legion Y540-15IRH-PG0-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564754028532-Certificate-Lenovo-Legion%20Y540-15IRH-PG0-SUBTEL-Chile-2019.pdf

Lenovo Chile1564753447739-Certificate-Lenovo-Legion Y540-15IRH-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1564753447739-Certificate-Lenovo-Legion%20Y540-15IRH-SUBTEL-Chile-2019.pdf

IROBOT1564161220834-Letter of Clearance-IROBOT-RMA-Y1(Braava jet m6)-SIT-Guatemala-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564161220834-Letter%20of%20Clearance-IROBOT-RMA-Y1%28Braava%20jet%20m6%29-SIT-Guatemala-2019.pdf

IROBOT1564153058620-Certificate-iRobot-RMA-Y1(Braava jet m6)-ASEP-Panama-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564153058620-Certificate-iRobot-RMA-Y1%28Braava%20jet%20m6%29-ASEP-Panama-2019.pdf

IROBOT1564149257419-CERTIFICATE_iRobot_AXE-Y1_TTAT_TRINIDAD_AND_TOBAGO_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564149257419-CERTIFICATE_iRobot_AXE-Y1_TTAT_TRINIDAD_AND_TOBAGO_2019.pdf

IROBOT1564147271568-CERTIFICATE_iRobot_RMA-Y1_(Braava_jet_m6)_ASEP_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1564147271568-CERTIFICATE_iRobot_RMA-Y1_%28Braava_jet_m6%29_ASEP_2019.pdf

TUV China1564084487538-Certificate_Lenovo_MOBTCMO_ENACOM_Argentina_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564084487538-Certificate_Lenovo_MOBTCMO_ENACOM_Argentina_2019.pdf

ROKU1564066803554-Certificate_ROKU_3810MX_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564066803554-Certificate_ROKU_3810MX_SUTEL_Costa%20Rica_2019.pdf

ROKU1564066517516-Certificate_ROKU-RC-AL7_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564066517516-Certificate_ROKU-RC-AL7_SUTEL_Costa%20Rica_2019.pdf

ROKU1564066350392-Certificate_ROKU_3920MX_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1564066350392-Certificate_ROKU_3920MX_CRC_Colombia_2019.pdf

iRobot Corporation1563994888210-Certificate iRobot ADD-N1 NPMX Mexico 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563994888210-Certificate%20iRobot%20ADD-N1%20NPMX%20Mexico%202019.pdf

iRobot Corporation1563992687214-FormC Certificate iRobot ADD-N1 Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563992687214-FormC%20Certificate%20iRobot%20ADD-N1%20Argentina%202019.pdf

iRobot Corporation1563992357577-Certificate iRobot ADD-N1 TUV Argentina 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563992357577-Certificate%20iRobot%20ADD-N1%20TUV%20Argentina%202019.pdf

ASKEY1563979959480-Certificate of Conformity-ASKEY-RTF8117VVW-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1563979959480-Certificate%20of%20Conformity-ASKEY-RTF8117VVW-IBRACE-BRAZIL-2019.pdf

ALARM.COM1563293970752-Certificate-Climax-SD-8EL_SUTEL_Costa Rica-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563293970752-Certificate-Climax-SD-8EL_SUTEL_Costa%20Rica-2019.pdf

ALARM.COM1563293914754-Certificate-Climax-VST-862P-IL-SUTEL-Costa Rica-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563293914754-Certificate-Climax-VST-862P-IL-SUTEL-Costa%20Rica-2019.pdf

SATEL1563282478220-Certificate of homologation-SATEL-PROF-TR9-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1563282478220-Certificate%20of%20homologation-SATEL-PROF-TR9-ANATEL-BRAZIL-2019.pdf

iRobot Corporation1563209449541-Certificate_iRobot_RMA-Y1(Braava m6)_CRC_Colombia_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1563209449541-Certificate_iRobot_RMA-Y1%28Braava%20m6%29_CRC_Colombia_2019.pdf

MAKERBOT1562957917262-Certificate of Homologation-MAKERBOT-WL18MODGI-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562957917262-Certificate%20of%20Homologation-MAKERBOT-WL18MODGI-IBRACE-BRAZIL-2019.pdf

iRobot1562957228459-Certificate-iRobot-Braava jet m6-SIGET-El Salvador-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562957228459-Certificate-iRobot-Braava%20jet%20m6-SIGET-El%20Salvador-2019.pdf

ALARM.COM1562787712955-Certificate_Alarm.com_ADC-V722W_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1562787712955-Certificate_Alarm.com_ADC-V722W_SUTEL_Costa%20Rica_2019.pdf

iRobot Corporation1562697317779-Certificate_iRobot_RMA-Y1(Braava jet m6)_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562697317779-Certificate_iRobot_RMA-Y1%28Braava%20jet%20m6%29_Costa%20Rica_2019.pdf

ALARM.COM1562695944724-Certificate_Climax_RC-16_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562695944724-Certificate_Climax_RC-16_SUTEL_Costa%20Rica_2019.pdf

ALARM.COM1562695550960-Certificate_Climax_DC-23_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562695550960-Certificate_Climax_DC-23_SUTEL_Costa%20Rica_2019.pdf

ALARM.COM1562694901077-Certificate_Alarm.com_ADC-V522IR_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1562694901077-Certificate_Alarm.com_ADC-V522IR_SUTEL_Costa%20Rica_2019.pdf

iRobot Corporation1562616632793-Certificate_iRobot_AXE-Y1_TU_Barbados_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1562616632793-Certificate_iRobot_AXE-Y1_TU_Barbados_2019.pdf

BALUN Technology Co. Ltd.1562349392178-Certificate_Lenovo_IdeaPadL340-17IRH_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562349392178-Certificate_Lenovo_IdeaPadL340-17IRH_SUBTEL_Chile_2019.pdf

BALUN Technology Co. Ltd.1562349155555-Certificate_Lenovo_IdeaPadL340-15IRH_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562349155555-Certificate_Lenovo_IdeaPadL340-15IRH_SUBTEL_Chile_2019.pdf

NOVATEL1562272562560-Certificate_NOVATEL_SMART7-i_SUBTEL_Chile_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562272562560-Certificate_NOVATEL_SMART7-i_SUBTEL_Chile_2019.pdf

NOVATEL1562272470324-Certificate-NOVATEL-SMART7-SPi-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562272470324-Certificate-NOVATEL-SMART7-SPi-SUBTEL-Chile-2019.pdf

DURACELL1562272389527-Certificate of Conformity-DURACELL-PB1-IBRACE-BRAZIL-2019-MODIFIEDpdf.pdf
https://orbiscompliance.s3.amazonaws.com/1562272389527-Certificate%20of%20Conformity-DURACELL-PB1-IBRACE-BRAZIL-2019-MODIFIEDpdf.pdf

SATEL1562267956599-Cert. of Homologation-SATEL-SATELPROF-TR4-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562267956599-Cert.%20of%20Homologation-SATEL-SATELPROF-TR4-ANATEL-BRAZIL-2019.pdf

SATEL1562267931723-Cert. of Homologation-SATEL-SATELLINE-M3-TR3-TR4-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562267931723-Cert.%20of%20Homologation-SATEL-SATELLINE-M3-TR3-TR4-ANATEL-BRAZIL-2019.pdf

SATEL1562267918163-Cert. of Homologation-SATEL-SATEL-TR49-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562267918163-Cert.%20of%20Homologation-SATEL-SATEL-TR49-ANATEL-BRAZIL-2019.pdf

SATEL1562267905147-Cert. of Homologation- SATEL-SATELLINE-M3-TR9-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562267905147-Cert.%20of%20Homologation-%20SATEL-SATELLINE-M3-TR9-ANATEL-BRAZIL-2019.pdf

Industrial Scientific Corporation1562188308944-Certificate-Industrial Scientific-iAssign-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562188308944-Certificate-Industrial%20Scientific-iAssign-SUBTEL-Chile-2019.pdf

ALARM.COM1562185871276-Certificate_Climax_IRP-16SL_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562185871276-Certificate_Climax_IRP-16SL_SUTEL_Costa%20Rica_2019.pdf

ALARM.COM1562185840855-Certificate_Clima_KP-39B_SUTEL_Costa Rica_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1562185840855-Certificate_Clima_KP-39B_SUTEL_Costa%20Rica_2019.pdf

IROBOT1562013031994-CERTIFICATE_IROBOT_RMA-Y1(Braava jet m6)_MTC_PERU_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1562013031994-CERTIFICATE_IROBOT_RMA-Y1%28Braava%20jet%20m6%29_MTC_PERU_2019.pdf

S&C1561994018826-Certificate-S&C-TSII-CONTRL3-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561994018826-Certificate-S%26C-TSII-CONTRL3-ENACOM-Argentina-2019.pdf

S&C1561991485566-Certificate-S&C-TSII-CONTRL2-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561991485566-Certificate-S%26C-TSII-CONTRL2-ENACOM-Argentina-2019.pdf

S&C1561990959905-Certificate-S&C-TSII-DONGLE2-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561990959905-Certificate-S%26C-TSII-DONGLE2-ENACOM-Argentina-2019.pdf

TOPCON1561989200673-CERTIFICATE_TOPCON_AGI-4_ENACOM_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1561989200673-CERTIFICATE_TOPCON_AGI-4_ENACOM_2019.pdf

COBHAM1561662254508-Certificate of Homologation- COBHAM-RT7000PMR-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561662254508-Certificate%20of%20Homologation-%20COBHAM-RT7000PMR-ANATEL-BRAZIL-2019.pdf

ASKEY1561657377309-Certificate of Homologation-ASKEY-RTV9015VW-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561657377309-Certificate%20of%20Homologation-ASKEY-RTV9015VW-IBRACE-BRAZIL-2019.pdf

ASKEY1561654522136-Certificate of Conformity- ASKEY-RTV9015-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561654522136-Certificate%20of%20Conformity-%20ASKEY-RTV9015-IBRACE-BRAZIL-2019.pdf

TOPCON1561558370539-Certificate of Homologation-TOPCON-SRL-35-IBRACE-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1561558370539-Certificate%20of%20Homologation-TOPCON-SRL-35-IBRACE-2019.pdf

ASKEY1561472687156-Certificate of Homologation-ASKEY-RTF8115VW-ANATEL-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561472687156-Certificate%20of%20Homologation-ASKEY-RTF8115VW-ANATEL-BRAZIL-2019.pdf

ASKEY1561407765327-Certificado-ASKEY-RTV9015VW-IBRACE-BRAZIL-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1561407765327-Certificado-ASKEY-RTV9015VW-IBRACE-BRAZIL-2019.pdf

TOPCON1560360392733-Certificate_TOPCON_HiperVR+LTE_IFT_Mexico_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1560360392733-Certificate_TOPCON_HiperVR%2BLTE_IFT_Mexico_2019.pdf

Satel Oy1560272162739-Certificate-SATEL-SATELLINE-EASY-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1560272162739-Certificate-SATEL-SATELLINE-EASY-ENACOM-Argentina-2019.pdf

BALUN Technology Co. Ltd.1559327221939-Certificate-Lenovo-Lenovo ThinkBook 13s-IWL-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1559327221939-Certificate-Lenovo-Lenovo%20ThinkBook%2013s-IWL-SUBTEL-Chile-2019.pdf

TOPCON1558979272063-Certificate_SOKKIA_GRX3_IFT_Mexico_2019.pdf
https://orbiscompliance.s3.amazonaws.com/1558979272063-Certificate_SOKKIA_GRX3_IFT_Mexico_2019.pdf

COLEMAN1558620283675-Acuse of Authorization Coleman Propane Tanks SAT Mexico 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1558620283675-Acuse%20of%20Authorization%20Coleman%20Propane%20Tanks%20SAT%20Mexico%202019.pdf

TOPCON1558016268865-Certificate_TOPCON_GRX3_NYCE_Mexico_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1558016268865-Certificate_TOPCON_GRX3_NYCE_Mexico_2019.pdf

TOPCON1558015911477-Certificate_TOPCON_HiperVR+LTE_NYCE_Mexico_2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1558015911477-Certificate_TOPCON_HiperVR%2BLTE_NYCE_Mexico_2019.pdf

DURACELL1557868815469-Certificate-Duracell-Genomma-QuantumAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1557868815469-Certificate-Duracell-Genomma-QuantumAA-BureauVeritas-Colombia-2018.pdf

DURACELL1557868511454-Certificate-Duracell-Genomma-9V-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1557868511454-Certificate-Duracell-Genomma-9V-BureauVeritas-Colombia-2018.pdf

DURACELL1557868459366-Certificate-Duracell-Pricesmart-9V-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1557868459366-Certificate-Duracell-Pricesmart-9V-BureauVeritas-Colombia-2018.pdf

Industrial Scientific Corporation1557517416813-Certificate-RADIUZ BZ1-INDUSTRIAL SCIENTIFIC-Subtel-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1557517416813-Certificate-RADIUZ%20BZ1-INDUSTRIAL%20SCIENTIFIC-Subtel-Chile-2019.pdf

Industrial Scientific Corporation1557517397315-Certificate-Industrial Scientific-Ventis Pro4-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1557517397315-Certificate-Industrial%20Scientific-Ventis%20Pro4-SUBTEL-Chile-2019.pdf

Industrial Scientific Corporation1557517375231-Certificate-Industrial Scientific-Ventis Pro5-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1557517375231-Certificate-Industrial%20Scientific-Ventis%20Pro5-SUBTEL-Chile-2019.pdf

u-blox1557330268708-Certificate-u blox-TOBY L200-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1557330268708-Certificate-u%20blox-TOBY%20L200-IFT-Mexico-2019.pdf

DURACELL1556903756376-Certificate-Duracell-Pricesmart-QuantumAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903756376-Certificate-Duracell-Pricesmart-QuantumAA-BureauVeritas-Colombia-2018.pdf

DURACELL1556903708578-Certificate-Duracell-Pricesmart-AA&AAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903708578-Certificate-Duracell-Pricesmart-AA%26AAA-BureauVeritas-Colombia-2018.pdf

DURACELL1556903656303-Certificate-Duracell-Pricesmart-AA, AAA,9V&QuantumAAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903656303-Certificate-Duracell-Pricesmart-AA%2C%20AAA%2C9V%26QuantumAAA-BureauVeritas-Colombia-2018.pdf

DURACELL1556903607167-Certificate-Duracell-Pricesmart-C&D-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903607167-Certificate-Duracell-Pricesmart-C%26D-BureauVeritas-Colombia-2018.pdf

DURACELL1556903530042-Certificate-Duracell-Genomma-AA&AAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903530042-Certificate-Duracell-Genomma-AA%26AAA-BureauVeritas-Colombia-2018.pdf

DURACELL1556903478898-Certificate-Duracell-Genomma-AA,AAA,9V&QuantumAAA-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903478898-Certificate-Duracell-Genomma-AA%2CAAA%2C9V%26QuantumAAA-BureauVeritas-Colombia-2018.pdf

DURACELL1556903355653-Certificate-Duracell-Genomma-C&D-BureauVeritas-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556903355653-Certificate-Duracell-Genomma-C%26D-BureauVeritas-Colombia-2018.pdf

DURACELL1556037047089-Certificate-Duracell-AAAQ-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1556037047089-Certificate-Duracell-AAAQ-UVA-Mexico-2019.pdf

DURACELL1556037016392-Certificate-Duracell-AAQ-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1556037016392-Certificate-Duracell-AAQ-UVA-Mexico-2019.pdf

DURACELL1555965102539-Certificate-Duracell-PB-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1555965102539-Certificate-Duracell-PB-UVA-Mexico-2019.pdf

NOVATEL1553886174901-CERTIFICATE NOVATEL PwrPak7-E2 MTC PERU 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553886174901-CERTIFICATE%20NOVATEL%20PwrPak7-E2%20MTC%20PERU%202019.pdf

NOVATEL1553886021674-CERTIFICATE NOVATEL PwrPak7 MTC PERU 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553886021674-CERTIFICATE%20NOVATEL%20PwrPak7%20MTC%20PERU%202019.pdf

NOVATEL1553885749227-CERTIFICATE NOVATEL PwrPak7-E1 MTC PERU 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553885749227-CERTIFICATE%20NOVATEL%20PwrPak7-E1%20MTC%20PERU%202019.pdf

NOVATEL1553718520093-Certificate-NOVATEL-SMART7-W-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553718520093-Certificate-NOVATEL-SMART7-W-TELCOR-Nicaragua-2019.pdf

NOVATEL1553718370285-Certificate-NOVATEL-SMART7-SPi-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553718370285-Certificate-NOVATEL-SMART7-SPi-TELCOR-Nicaragua-2019.pdf

NOVATEL1553718051103-Certificate-NOVATEL-SMART7-i-TELCOR-Nicaragua-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553718051103-Certificate-NOVATEL-SMART7-i-TELCOR-Nicaragua-2019.pdf

NOVATEL1553286322580-CERTIFICATE NOVATEL PwrPak7D-E2 MTC PERU 2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1553286322580-CERTIFICATE%20NOVATEL%20PwrPak7D-E2%20MTC%20PERU%202019.pdf

NOVATEL1553286228754-CERTIFICATE NOVATEL PwrPak7D MTC PERU 2019.pdf
https://orbiscompliance.s3.amazonaws.com/1553286228754-CERTIFICATE%20NOVATEL%20PwrPak7D%20MTC%20PERU%202019.pdf

Nedap1553106120169-Cartificate-NEDAP-SMART DEACT-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1553106120169-Cartificate-NEDAP-SMART%20DEACT-IFT-Mexico-2019.pdf

NOVATEL1552494373964-Certificate-NOVATEL-RS9113-N00-S0C-ENACOM-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1552494373964-Certificate-NOVATEL-RS9113-N00-S0C-ENACOM-Argentina-2019.pdf

NOVATEL1551882514876-CERTIFICATE-NOVATEL-PwrPak7D-E1-MTC-PERU-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1551882514876-CERTIFICATE-NOVATEL-PwrPak7D-E1-MTC-PERU-2019.pdf

SATO1551450315520-Certificate-SATO-FX3 LX-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1551450315520-Certificate-SATO-FX3%20LX-NYCE-Mexico-2019.pdf

Alarm.com1550850675741-Certificate-ALARM.com-ADC-SVR122E-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1550850675741-Certificate-ALARM.com-ADC-SVR122E-NYCE-Mexico-2019.pdf

NOVATEL1550767017793-Certificate-NOVATEL-SMART7-W-CONATEL-Paraguay-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550767017793-Certificate-NOVATEL-SMART7-W-CONATEL-Paraguay-2019.pdf

NOVATEL1550766566588-Certificate-NOVATEL-SMART7-SPi-CONATEL-Paraguay-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550766566588-Certificate-NOVATEL-SMART7-SPi-CONATEL-Paraguay-2019.pdf

NOVATEL1550765828011-Certificate-NOVATEL-SMART7-i-CONATEL-Paraguay-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550765828011-Certificate-NOVATEL-SMART7-i-CONATEL-Paraguay-2019.pdf

TOPCON1550761672423-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550761672423-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf

TOPCON1550761581997-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550761581997-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf

TOPCON1550761579168-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1550761579168-Certificate-TOPCON-FC-5000-MTC-Peru-2019.pdf

Alarm.com1550588006507-Certificate-ALARM.com-ADS018K-X120150-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1550588006507-Certificate-ALARM.com-ADS018K-X120150-NYCE-Mexico-2019.pdf

NOVATEL1550154797767-Certificate-NOVATEL-SMART7-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550154797767-Certificate-NOVATEL-SMART7-IFT-Mexico-2019.pdf

DURACELL1550087003880-Certificate-Duracell-AAA-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550087003880-Certificate-Duracell-AAA-UVA-Mexico-2019.pdf

DURACELL1550086983045-Certificate-Duracell-AA-UVA-Mexico-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1550086983045-Certificate-Duracell-AA-UVA-Mexico-2019.pdf

Duracell1549468956706-Extension-Duracelll-MN21-INTI-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1549468956706-Extension-Duracelll-MN21-INTI-Argentina-2019.pdf

Duracell1549466663839-Extension-Duracell-A76-INTi-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1549466663839-Extension-Duracell-A76-INTi-Argentina-2019.pdf

Duracell1549399463448-Extension-Duracell-Air Zinc(10-13-312)-INTI-Argentina-2019. pdf. pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1549399463448-Extension-Duracell-Air%20Zinc%2810-13-312%29-INTI-Argentina-2019.%20pdf.%20pdf.pdf

NEDAP1548855169755-NEDAP-ASSY-AD46R-RF-SUBTEL-Chile-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1548855169755-NEDAP-ASSY-AD46R-RF-SUBTEL-Chile-2019.pdf

Topcon1547743975120-Certificate-TOPCON-Hiper VR-IFT-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1547743975120-Certificate-TOPCON-Hiper%20VR-IFT-Mexico-2019.pdf

NOVATEL1547584125197-Attached Certificate-Novatel-Smart7-NYCE-Mexico-2019.pdf
https://orbiscompliance.s3.amazonaws.com/1547584125197-Attached%20Certificate-Novatel-Smart7-NYCE-Mexico-2019.pdf

ASKEY1547040320856-Certificate-APD-WB.12G12FA-Lealtad Comercial-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1547040320856-Certificate-APD-WB.12G12FA-Lealtad%20Comercial-Argentina-2019.pdf

ASKEY1547040264188-Certificate-APD-WB.24J12R-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1547040264188-Certificate-APD-WB.24J12R-Lealtad%20Comercial-Argentina-2018.pdf

ASKEY1547040222874-TADCover-APD-WB.12G12FA-Lealtad Comercial-Argentina-2019.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1547040222874-TADCover-APD-WB.12G12FA-Lealtad%20Comercial-Argentina-2019.pdf

ASKEY1547040188645-TADCover-APD-WB.24J12R-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1547040188645-TADCover-APD-WB.24J12R-Lealtad%20Comercial-Argentina-2018.pdf

Energous1546889624476-Certificate-ENERGOUS-NF-230-NFMU-Guyana-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1546889624476-Certificate-ENERGOUS-NF-230-NFMU-Guyana-2018.pdf

ASKEY1546882636156-Certificate-MOVISTAR-RTL0055VW-D112-ENACOM-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1546882636156-Certificate-MOVISTAR-RTL0055VW-D112-ENACOM-Argentina-2018.pdf

NOVATEL1546529993519-Certificate-Novatel-SMART7-ATT-Bolivia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1546529993519-Certificate-Novatel-SMART7-ATT-Bolivia-2018.pdf

NOVATEL1546520084772-Certificate-NovAtel-RS9113-N00-S0C-URSEC-Uruguay-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1546520084772-Certificate-NovAtel-RS9113-N00-S0C-URSEC-Uruguay-2018.pdf

ASKEY1545336462259-Certificate-APD-WB.12G12FA-WB.24J12R-IRAM-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545336462259-Certificate-APD-WB.12G12FA-WB.24J12R-IRAM-Argentina-2018.pdf

DURACELL1545317091236-Certificate-Duracell-AAA-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545317091236-Certificate-Duracell-AAA-UVA-Mexico-2018.pdf

DURACELL1545317069418-Certificate-Duracell-AA-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545317069418-Certificate-Duracell-AA-UVA-Mexico-2018.pdf

duracell1545314713576-Certificate-NEDAP-iL45-MTC-Peru-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1545314713576-Certificate-NEDAP-iL45-MTC-Peru-2018.pdf

NOVATEL1545162479550-Letter of Clearance-NovAtel-SMART7-i-SIT-Guatemala-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545162479550-Letter%20of%20Clearance-NovAtel-SMART7-i-SIT-Guatemala-2018.pdf

NOVATEL1545162466124-Letter of Clearance-NovAtel-SMART7-SPi-SIT-Guatemala-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545162466124-Letter%20of%20Clearance-NovAtel-SMART7-SPi-SIT-Guatemala-2018.pdf

NOVATEL1545162444777-Letter of Clearance-NovAtel-SMART7-W-SIT-Guatemala-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1545162444777-Letter%20of%20Clearance-NovAtel-SMART7-W-SIT-Guatemala-2018.pdf

Nedap1544560718516-Certificate-NEDAP-iL45-MTC-Peru-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1544560718516-Certificate-NEDAP-iL45-MTC-Peru-2018.pdf

Topcon1544539493239-Attached Certificate-TOPCON-Hiper VR-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1544539493239-Attached%20Certificate-TOPCON-Hiper%20VR-NYCE-Mexico-2018.pdf

Duracell1544537505457-Duracell-A76-China-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1544537505457-Duracell-A76-China-INTI-Argentina-2018.pdf

DURACELL1543591174905-Certificate-Duracell-QuantumAABelgium-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1543591174905-Certificate-Duracell-QuantumAABelgium-UVA-Mexico-2018.pdf

JVLAT1542635482870-TADCover-Nintendo-HAC.002-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1542635482870-TADCover-Nintendo-HAC.002-Lealtad%20Comercial-Argentina-2018.pdf

JVLAT1542634931994-Certificate-Nintendo-HAC-002-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1542634931994-Certificate-Nintendo-HAC-002-Lealtad%20Comercial-Argentina-2018.pdf

Duracell1542634718601-Cerfiticate-Duracell-CEF14NA4-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1542634718601-Cerfiticate-Duracell-CEF14NA4-NYCE-Mexico-2018.pdf

SATO1542226830394-Certificate-SATO-M84Pro-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1542226830394-Certificate-SATO-M84Pro-NYCE-Mexico-2018.pdf

Duracell1541615502972-Certificate-Duracell AA QU1500XXLR6-INTI_Argentina_2018 pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1541615502972-Certificate-Duracell%20AA%20QU1500XXLR6-INTI_Argentina_2018%20pdf.pdf

Duracell1541613509568-Certificate- Duracell MN21_A23-12V-INTI -2018 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1541613509568-Certificate-%20Duracell%20MN21_A23-12V-INTI%20-2018%20.pdf

Duracell1541612717808-Ext-Duracell-C (MN1400)LR14_D(MN1300)LR20-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1541612717808-Ext-Duracell-C%20%28MN1400%29LR14_D%28MN1300%29LR20-INTI-Argentina-2018.pdf

Duracell1541612702506-Ext-Duracell-AA(MN1500)LR6_AAA(MN2400)LR03-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1541612702506-Ext-Duracell-AA%28MN1500%29LR6_AAA%28MN2400%29LR03-INTI-Argentina-2018.pdf

Duracell1541612679287-Ext-Duracell-9v(MN1604)6LR61-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1541612679287-Ext-Duracell-9v%28MN1604%296LR61-INTI-Argentina-2018.pdf

Duracell1541612655772-Ext-Duracell-9v_MN1604XX_6LR61-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1541612655772-Ext-Duracell-9v_MN1604XX_6LR61-INTI-Argentina-2018.pdf

BIAMP1540920649153-Certificate-BIAMP-TESIRA EX UBT- OFCA-HONG KONG-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540920649153-Certificate-BIAMP-TESIRA%20EX%20UBT-%20OFCA-HONG%20KONG-2018.pdf

BIAMP1540920631709-Certificate-BIAMP-TESIRA EX UBT- OFCA-HONG KONG-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540920631709-Certificate-BIAMP-TESIRA%20EX%20UBT-%20OFCA-HONG%20KONG-2018.pdf

ENERGOUS1540841516566-Certificate(918 MHz)-ENERGOUS-NF-230-SUBTEL-Chile-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540841516566-Certificate%28918%20MHz%29-ENERGOUS-NF-230-SUBTEL-Chile-2018.pdf

NEDAP1540831696004-Certificate-NEDAP-ASSY AD46R RF+MD+RFID-CRC-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540831696004-Certificate-NEDAP-ASSY%20AD46R%20RF%2BMD%2BRFID-CRC-Colombia-2018.pdf

NEDAP1540831579991-Certificate-NEDAP-ASSY AD46R RF+RFID-CRC-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540831579991-Certificate-NEDAP-ASSY%20AD46R%20RF%2BRFID-CRC-Colombia-2018.pdf

NEDAP1540831455334-Certificate-NEDAP-ASSY AD46R RF+MD-CRC-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540831455334-Certificate-NEDAP-ASSY%20AD46R%20RF%2BMD-CRC-Colombia-2018.pdf

NEDAP1540831318100-Certificate-NEDAP-ASSY AD46R RF-CRC-Colombia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540831318100-Certificate-NEDAP-ASSY%20AD46R%20RF-CRC-Colombia-2018.pdf

ENERGOUS1540828825162-Certificate (918 MHz)-ENERGOUS-NF-230-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1540828825162-Certificate%20%28918%20MHz%29-ENERGOUS-NF-230-Argentina-2018.pdf

BIAMP1540564433827-Certificate-BIAMP-TESIRA EX UBT- WPC-India-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540564433827-Certificate-BIAMP-TESIRA%20EX%20UBT-%20WPC-India-2018.pdf

BIAMP1540564404910-Certificate-BIAMP-TESIRA EX UBT- WPC-India-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540564404910-Certificate-BIAMP-TESIRA%20EX%20UBT-%20WPC-India-2018.pdf

SATO1540301246811-Certificate-SATO-SX 570-IFT-Mexico-2018 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540301246811-Certificate-SATO-SX%20570-IFT-Mexico-2018%20.pdf

SATO1540301212484-Certificate-SATO-SX 570-IFT-Mexico-2018 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1540301212484-Certificate-SATO-SX%20570-IFT-Mexico-2018%20.pdf

SATO1540301146094-Certificate-SATO-BT 1022-IFT-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1540301146094-Certificate-SATO-BT%201022-IFT-Mexico-2018.pdf

Duracell1540232489443-Certificate-Duracell-Quantum AA-MINSALUD-CostaRica-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1540232489443-Certificate-Duracell-Quantum%20AA-MINSALUD-CostaRica-2018.pdf

Duracell1539612950256-Certificate-Duracell-9VBatteries-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1539612950256-Certificate-Duracell-9VBatteries-UVA-Mexico-2018.pdf

Duracell1539612929558-Certificate-Duracell-9VBatteries-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1539612929558-Certificate-Duracell-9VBatteries-UVA-Mexico-2018.pdf

UBISENSE1539198515632-Certificate-UBISENSE-UBIMOD30-IFT-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1539198515632-Certificate-UBISENSE-UBIMOD30-IFT-Mexico-2018.pdf

ROKU1539181129949-Certificate-Shenzen-ROKU-ADS6RA06;ADS6RC06-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1539181129949-Certificate-Shenzen-ROKU-ADS6RA06%3BADS6RC06-Lealtad%20Comercial-Argentina-2018.pdf

ROKU1539180998488-TADCover-Shenzen-ROKU-ADS6RA06;ADS6RC06-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1539180998488-TADCover-Shenzen-ROKU-ADS6RA06%3BADS6RC06-Lealtad%20Comercial-Argentina-2018.pdf

ROKU1539178931792-Certificate-Shenzen-ROKU-ADS6RA06;ADS6RC06-TUV-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1539178931792-Certificate-Shenzen-ROKU-ADS6RA06%3BADS6RC06-TUV-Argentina-2018.pdf

Duracell1539029547738-DURACELL-9V-China-INTI-Argentina-2018 .pdf
https://orbiscompliance.s3.amazonaws.com/1539029547738-DURACELL-9V-China-INTI-Argentina-2018%20.pdf

ASKEY1538573216599-Certificate-FRECOM-F12L30-120yyySPAA-Lealtad Comercial- Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1538573216599-Certificate-FRECOM-F12L30-120yyySPAA-Lealtad%20Comercial-%20Argentina-2018.pdf

ASKEY1538573066370-Certificate-APD-WB-12G12FA-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1538573066370-Certificate-APD-WB-12G12FA-Lealtad%20Comercial-Argentina-2018.pdf

SONY1538061362443-Certificate-SONY-CUH-7215B-TELCOR-Nicaragua-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1538061362443-Certificate-SONY-CUH-7215B-TELCOR-Nicaragua-2018.pdf

ENERGOUS1537454698812-Certificate-ENERGOUS-NF-230-ENACOM-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1537454698812-Certificate-ENERGOUS-NF-230-ENACOM-Argentina-2018.pdf

ROKU1537292296902-Certificate-ROKU-ADS-6RA-06 05050EPCU-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1537292296902-Certificate-ROKU-ADS-6RA-06%2005050EPCU-NYCE-Mexico-2018.pdf

SATO1537200458037-Certificate-SATO-WS4:EA11013C 240-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1537200458037-Certificate-SATO-WS4%3AEA11013C%20240-NYCE-Mexico-2018.pdf

SATO1537200408776-Certificate-SATO-WS4:EA10681P 240-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1537200408776-Certificate-SATO-WS4%3AEA10681P%20240-NYCE-Mexico-2018.pdf

ROKU1536779986144-Certificate-ROKU-3700X-3710X-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1536779986144-Certificate-ROKU-3700X-3710X-NYCE-Mexico-2018.pdf

SATO1536766170037-Certificate-SATO-M84Pro-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1536766170037-Certificate-SATO-M84Pro-NYCE-Mexico-2018.pdf

SATO1536766148195-Certificate-SATO-CL6NX-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1536766148195-Certificate-SATO-CL6NX-NYCE-Mexico-2018.pdf

SATO1536766111870-Certificate-SATO-CL4NX-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1536766111870-Certificate-SATO-CL4NX-NYCE-Mexico-2018.pdf

SATO1536766065553-Certificate-SATO-CG408:CG412-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1536766065553-Certificate-SATO-CG408%3ACG412-NYCE-Mexico-2018.pdf

SATO1536765987823-Certificate-SATO-CG208:CG212-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1536765987823-Certificate-SATO-CG208%3ACG212-NYCE-Mexico-2018.pdf

Scosche1536176138311-Certificate-Scosche-Audio Cable-UVA-Mexico-2018pdf.pdf
https://orbiscompliance.s3.amazonaws.com/1536176138311-Certificate-Scosche-Audio%20Cable-UVA-Mexico-2018pdf.pdf

Scosche1535660378251-Certificate-Scosche-Antenna Cable-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535660378251-Certificate-Scosche-Antenna%20Cable-UVA-Mexico-2018.pdf

Scosche1535660297995-Certificate-Scosche-Car Antenna-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535660297995-Certificate-Scosche-Car%20Antenna-UVA-Mexico-2018.pdf

Scosche1535660176622-Certificate-Scosche-Wiring Kit-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535660176622-Certificate-Scosche-Wiring%20Kit-UVA-Mexico-2018.pdf

Scosche1535660096581-Certificate-Scosche-Metal Tool-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535660096581-Certificate-Scosche-Metal%20Tool-UVA-Mexico-2018.pdf

Scosche1535660002972-Certificate-Scosche-Wiring Harness2-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535660002972-Certificate-Scosche-Wiring%20Harness2-UVA-Mexico-2018.pdf

Scosche1535659562737-Certificate-Scosche-Wiring Harness-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535659562737-Certificate-Scosche-Wiring%20Harness-UVA-Mexico-2018.pdf

Scosche1535659100319-Certificate-Scosche-Dash Kit-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1535659100319-Certificate-Scosche-Dash%20Kit-UVA-Mexico-2018.pdf

SONY1535645866100-Certificate-SONY-CUH-7215B- CONATEL-HONDURAS2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535645866100-Certificate-SONY-CUH-7215B-+CONATEL-HONDURAS2018.pdf

Sony1535645761586-Certificate-SONY-CUH-7215B- CONATEL-HONDURAS2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535645761586-Certificate-SONY-CUH-7215B-+CONATEL-HONDURAS2018.pdf

ASKEY1535551669419-Certificate-FRECOM-F12L30-120yyySPAA-IRAM-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1535551669419-Certificate-FRECOM-F12L30-120yyySPAA-IRAM-Argentina-2018.pdf

ASKEY1535040315140-Certificate-APD-WB-12G12FA-IRAM-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1535040315140-Certificate-APD-WB-12G12FA-IRAM-Argentina-2018.pdf

DURACELL1534966687121-Certificate-Duracell-Project4359:Quantum-UVA-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1534966687121-Certificate-Duracell-Project4359%3AQuantum-UVA-Mexico-2018.pdf

ROKU1534861853409-Certificate-ROKU-ADS-6RA-06 050050EPCU-L-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1534861853409-Certificate-ROKU-ADS-6RA-06%20050050EPCU-L-NYCE-Mexico-2018.pdf

ROKU1534861796590-Certificate-ROKU-W16-005N1A-NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1534861796590-Certificate-ROKU-W16-005N1A-NYCE-Mexico-2018.pdf

SONY1534342213075-Certificate-SONY-CUH-7215B-CONATEL-Paraguay-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1534342213075-Certificate-SONY-CUH-7215B-CONATEL-Paraguay-2018.pdf

SONY1533845535234-Certificate-SONY-DUH-T7200AA-SUBTEL-Chile-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533845535234-Certificate-SONY-DUH-T7200AA-SUBTEL-Chile-2018.pdf

SONY1533845429354-Certificate-SONY-CUH-7215B-SUBTEL-Chile-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533845429354-Certificate-SONY-CUH-7215B-SUBTEL-Chile-2018.pdf

SATO1533824516435-Certificate SATO-ANCE M-84Pro-2; M-84Pro-3; M-84Pro-6 NOM-121 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533824516435-Certificate%20SATO-ANCE%20M-84Pro-2%3B%20M-84Pro-3%3B%20M-84Pro-6%20NOM-121%202015.pdf

SATO1533822894168-Certificate SATO-IFT Mexico CL6NX . 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822894168-Certificate%20SATO-IFT%20Mexico%20CL6NX%20.%202015.pdf

SATO1533822880057-Certificate SATO-IFT Mexico CL4NX. 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822880057-Certificate%20SATO-IFT%20Mexico%20CL4NX.%202015.pdf

SATO1533822859958-Certificate SATO-ANCE CL4NX 7 CL6NX P2015TEL02095A.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822859958-Certificate%20SATO-ANCE%20CL4NX%207%20CL6NX%20P2015TEL02095A.pdf

SATO1533822839906-Certificate SATO-NYCE Mexico CL6NX NOM-019 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822839906-Certificate%20SATO-NYCE%20Mexico%20CL6NX%20NOM-019%202015.pdf

SATO1533822827843-Certificate SATO-NYCE Mexico1502CE11325-11338C0215-1.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822827843-Certificate%20SATO-NYCE%20Mexico1502CE11325-11338C0215-1.pdf

SATO1533822808021-Certificate SATO-NYCE Mexico CG2SERIES FAM NOM-019 2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822808021-Certificate%20SATO-NYCE%20Mexico%20CG2SERIES%20FAM%20NOM-019%202015.pdf

SATO1533822782151-Certificate SATO-IFT Mexico M-84Pro-6 Cert. IFT Def-2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822782151-Certificate%20SATO-IFT%20Mexico%20M-84Pro-6%20Cert.%20IFT%20Def-2015.pdf

SATO1533822772934-Certificate SATO-IFT Mexico M-84Pro-3 Cert. IFT Def-2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822772934-Certificate%20SATO-IFT%20Mexico%20M-84Pro-3%20Cert.%20IFT%20Def-2015.pdf

SATO1533822764460-Certificate SATO-IFT Mexico M-84Pro-2 Cert. IFT Def-2015.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533822764460-Certificate%20SATO-IFT%20Mexico%20M-84Pro-2%20Cert.%20IFT%20Def-2015.pdf

Nedap1533255189237-Certificate-Nedap-ASSY AD46R RF-Uruguay-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533255189237-Certificate-Nedap-ASSY%20AD46R%20RF-Uruguay-2018.pdf

Neap1533255177946-Certificate-Nedap-ASSY AD46R RF-Uruguay-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533255177946-Certificate-Nedap-ASSY%20AD46R%20RF-Uruguay-2018.pdf

Neap1533255175463-Certificate-Nedap-ASSY AD46R RF-Uruguay-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533255175463-Certificate-Nedap-ASSY%20AD46R%20RF-Uruguay-2018.pdf

ASKEY1533255141733-Certificate-ASKEY-RTF8115VW-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533255141733-Certificate-ASKEY-RTF8115VW-Argentina-2018.pdf

nedap1533254345889-Certificate-Nedap - ASSY AD46RRF - Ursec- Uruguay - 2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254345889-Certificate-Nedap%20-%20ASSY%20AD46RRF%20-%20Ursec-%20Uruguay%20-%202018.pdf

Askey1533254193686-Certificate, ASKEY-RTF8115VW,ENACOM,Argentina,2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254193686-Certificate%2C%20ASKEY-RTF8115VW%2CENACOM%2CArgentina%2C2018.pdf

NEDAP1533254188909-Certificate -Nedap - ASSY AD46RRF - Ursec- Uruguay - 2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254188909-Certificate%20-Nedap%20-%20ASSY%20AD46RRF%20-%20Ursec-%20Uruguay%20-%202018.pdf

NEDAP1533254182554-Certificate -Nedap - ASSY AD46RRF - Ursec- Uruguay - 2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254182554-Certificate%20-Nedap%20-%20ASSY%20AD46RRF%20-%20Ursec-%20Uruguay%20-%202018.pdf

Askey1533254175980-Certificate, ASKEY-RTF8115VW,ENACOM,Argentina,2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254175980-Certificate%2C%20ASKEY-RTF8115VW%2CENACOM%2CArgentina%2C2018.pdf

Nedap1533254117723-Certificate.Nedap-ASSYAD46RRF.URSEC.Uruguay.018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254117723-Certificate.Nedap-ASSYAD46RRF.URSEC.Uruguay.018.pdf

ASKEY1533254029876-Certificate - Askey-RTF815VW-ENACOM- Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533254029876-Certificate%20-%20Askey-RTF815VW-ENACOM-%20Argentina-2018.pdf

duracell1533054697061-Certificate-duracell-Project4716-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054697061-Certificate-duracell-Project4716-UVA-Mexico-2018.zip

duracell1533054640366-Certificate-duracell-Project4683-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054640366-Certificate-duracell-Project4683-UVA-Mexico-2018.zip

duracell1533054598542-Certificate-duracell-Project4359-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054598542-Certificate-duracell-Project4359-UVA-Mexico-2018.zip

duracell1533054341369-Certificate-duracell-Project4419-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054341369-Certificate-duracell-Project4419-UVA-Mexico-2018.zip

duracell1533054162746-Certificate-duracell-Project4242-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054162746-Certificate-duracell-Project4242-UVA-Mexico-2018.zip

duracell1533054045501-Certificate-duracell-Project4212-UVA-Mexico-2018.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1533054045501-Certificate-duracell-Project4212-UVA-Mexico-2018.zip

SONY1531927518991-Certificate-SONY-CUH-2215B-TELCOR-Nicaragua-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1531927518991-Certificate-SONY-CUH-2215B-TELCOR-Nicaragua-2018.pdf

SONY1531927493711-Certifiacte-SONY-CUH-2215A-TELCOR-Nicaragua-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1531927493711-Certifiacte-SONY-CUH-2215A-TELCOR-Nicaragua-2018.pdf

Sony1531337705836-Certificate-SONY-CUH-2215A-CONATEL-Paraguay-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1531337705836-Certificate-SONY-CUH-2215A-CONATEL-Paraguay-2018.pdf

Sony Interactive Entertainment Inc.1530907219508-Certificate-SONY-DUH-T7200AA-ATT-Bolivia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530907219508-Certificate-SONY-DUH-T7200AA-ATT-Bolivia-2018.pdf

Sony Interactive Entertainment Inc.1530906980695-Certificate-SONY-CUH-7215B-ATT-Bolivia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530906980695-Certificate-SONY-CUH-7215B-ATT-Bolivia-2018.pdf

Duracell1530647578206-Certificate of Conformity-Duracell-StarWars-1005758-1005759-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647578206-Certificate%20of%20Conformity-Duracell-StarWars-1005758-1005759-2017.pdf

Duracell1530647566240-Certificate of Conformity-Duracell-StarWars-1005756-1005757-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647566240-Certificate%20of%20Conformity-Duracell-StarWars-1005756-1005757-2017.pdf

Duracell1530647549094-Certificate of Conformity-Duracell-StarWars-1005463-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647549094-Certificate%20of%20Conformity-Duracell-StarWars-1005463-2017.pdf

Duracell1530647537578-Certificate of Conformity-Duracell-StarWars-1005313-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647537578-Certificate%20of%20Conformity-Duracell-StarWars-1005313-2017.pdf

Duracell1530647523446-Certificate of Conformity-Duracell-StarWars-1005312-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647523446-Certificate%20of%20Conformity-Duracell-StarWars-1005312-2017.pdf

Duracell1530647487127-Certificate of Conformity-Duracell-StarWars-1004957-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647487127-Certificate%20of%20Conformity-Duracell-StarWars-1004957-2017.pdf

Duracell1530647450607-Certificate of Conformity-Duracell-StarWars-1004955-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530647450607-Certificate%20of%20Conformity-Duracell-StarWars-1004955-2017.pdf

Duracell1530641262744-C SOL 2370-2 NOM-024.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530641262744-C%20SOL%202370-2%20NOM-024.pdf

Duracell1530641253179-C SOL 2370-1 NOM-024.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530641253179-C%20SOL%202370-1%20NOM-024.pdf

Duracell1530640327919-AAA Batteries Certificate C SOL 0458-2 NOM-024.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530640327919-AAA%20Batteries%20Certificate%20C%20SOL%200458-2%20NOM-024.pdf

Duracell1530640317500-AA Batteries Certificate C SOL 0458-1 NOM-024.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530640317500-AA%20Batteries%20Certificate%20C%20SOL%200458-1%20NOM-024.pdf

Duracell1530639610720-V&C-Constancia-Conformidad-Salsa Project.zip
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530639610720-V%26C-Constancia-Conformidad-Salsa+Project.zip

Duracell1530630912004-Certificate Conformity-Quantum AA & AAA Argentina.pdf
https://orbiscompliance.s3.amazonaws.com/1530630912004-Certificate%20Conformity-Quantum%20AA%20%26%20AAA%20Argentina.pdf

Sony1530304762161-Certificate-SONY-CUH-2215B-CONATEL-Paraguay-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530304762161-Certificate-SONY-CUH-2215B-CONATEL-Paraguay-2018.pdf

Duracell1530217579494-Certificate Quantum AAA INTI Argentina.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530217579494-Certificate%20Quantum%20AAA%20INTI%20Argentina.pdf

Duracell1530217563579-Certificate Quantum AA INTI Argentina.pdf
https://orbiscompliance.s3.amazonaws.com/1530217563579-Certificate%20Quantum%20AA%20INTI%20Argentina.pdf

NEDAP1530107792766-Certificate-Nedap-ASSY AD46R RF-URSEC-URUGUAY-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530107792766-Certificate-Nedap-ASSY%20AD46R%20RF-URSEC-URUGUAY-2018.pdf

NEDAP1530107747338-Certificate-Nedap-ASSY AD46R RF-URSEC-URUGUAY-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1530107747338-Certificate-Nedap-ASSY%20AD46R%20RF-URSEC-URUGUAY-2018.pdf

NEDAP1530107736983-Certificate-Nedap-ASSY AD46R RF-URSEC-URUGUAY-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1530107736983-Certificate-Nedap-ASSY%20AD46R%20RF-URSEC-URUGUAY-2018.pdf

NOVATEL1529685145535-NOVATEL Homologation Cert.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529685145535-NOVATEL%20Homologation%20Cert.pdf

NOVATEL1529685135187-NOVATEL Homologation Cert.pdf
https://orbiscompliance.s3.amazonaws.com/1529685135187-NOVATEL%20Homologation%20Cert.pdf

Duracell1529442072166-Certificate-Duracell-9V-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529442072166-Certificate-Duracell-9V-INTI-Argentina-2018.pdf

Duracell1529442048634-Certificate-Duracell-C&D-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529442048634-Certificate-Duracell-C%26D-INTI-Argentina-2018.pdf

Duracell1529442005527-Certificate-Duracell-AA&AAA-INTI-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529442005527-Certificate-Duracell-AA%26AAA-INTI-Argentina-2018.pdf

Duracell1529439450147-04.2017 -Certificate IBAMA quarter head quarter. pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529439450147-04.2017%20-Certificate%20IBAMA%20quarter%20head%20quarter.%20pdf.pdf

Duracell1529439402115-04.2017 -Certificate IBAMA quarter subsidiary. pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529439402115-04.2017%20-Certificate%20IBAMA%20quarter%20subsidiary.%20pdf.pdf

Duracell1529439397274-04.2017 -Certificate IBAMA quarter subsidiary. pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529439397274-04.2017%20-Certificate%20IBAMA%20quarter%20subsidiary.%20pdf.pdf

DURACELL1529437965873-CERTIFICATE DURACELL 9V Brazil 2017.PDF
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529437965873-CERTIFICATE%20DURACELL%209V%20Brazil%202017.PDF

s&c company1529334786154-LetterofClearance-S&C-TSIICONTRL2&3,TSIIDONGLE2-MTC-Peru-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1529334786154-LetterofClearance-S%26C-TSIICONTRL2%263%2CTSIIDONGLE2-MTC-Peru-2018.pdf

sony1529089401031-Certificate-SONY-CUH2215B-CONATEL-Honduras-2018pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1529089401031-Certificate-SONY-CUH2215B-CONATEL-Honduras-2018pdf.pdf

sony1529089341902-Certificate-SONY-CUH2215A-CONATEL-Honduras-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1529089341902-Certificate-SONY-CUH2215A-CONATEL-Honduras-2018.pdf

Industrial Scientific Corporation1528828746011-Certificate-IndustrialScientific-VentisPro5-IFT-Mexico-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1528828746011-Certificate-IndustrialScientific-VentisPro5-IFT-Mexico-2018.pdf

Industrial Scientific Corporation1528828488011-Certificate-IndustrialScientific-VentisPro4-IFT-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1528828488011-Certificate-IndustrialScientific-VentisPro4-IFT-Mexico-2018.pdf

Industrial Scientific Corporation1528816631398-Certificate-IndustrialScientific-RadiusBZ1-IFT-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1528816631398-Certificate-IndustrialScientific-RadiusBZ1-IFT-Mexico-2018.pdf

SONY1528309428279-Certificate-SONY-CUHYA-0081-ATT-BOLIVIA-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1528309428279-Certificate-SONY-CUHYA-0081-ATT-BOLIVIA-2017.pdf

SONY1528309359593-Certificate-SONY-CUHYA-0080-ATT-BOLIVIA-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1528309359593-Certificate-SONY-CUHYA-0080-ATT-BOLIVIA-2017.pdf

ASKEY TECHNOLOGY(JIANGSU) LTD1526669229710-Certificate-ASKEY-RG3110W-ENACOM-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1526669229710-Certificate-ASKEY-RG3110W-ENACOM-Argentina-2018.pdf

Sony1526399680691-Certificate-Sony-DUH-T2200AA-SUBTEL-Chile-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1526399680691-Certificate-Sony-DUH-T2200AA-SUBTEL-Chile-2018.pdf

SONY1525791240443-Certificate-SONY-CUH2215B-ATT-Bolivia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1525791240443-Certificate-SONY-CUH2215B-ATT-Bolivia-2018.pdf

SONY1525791201008-Certificate-SONY-CUH2215A-ATT-Bolivia-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1525791201008-Certificate-SONY-CUH2215A-ATT-Bolivia-2018.pdf

Askey Computer Corporation (Taiwan )1525093146112-Certificate-Askey-RTF8115VW-MTC-Peru-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1525093146112-Certificate-Askey-RTF8115VW-MTC-Peru-2018.pdf

Industrial Scientific Corporation1524768477625-Certificate-INDUSTRIAL SCIENTIFIC-VentisPro4, Ventis Pro5NYCE-Mexico-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1524768477625-Certificate-INDUSTRIAL%20SCIENTIFIC-VentisPro4%2C%20Ventis%20Pro5NYCE-Mexico-2018.pdf

Arista1521073695060-Arista AN1705, CoC, Brazil 2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1521073695060-Arista%20AN1705%2C%20CoC%2C%20Brazil%202018.pdf

Alien1520349557600-Certificate,ALR-F800,TRSS36197,Peru.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1520349557600-Certificate%2CALR-F800%2CTRSS36197%2CPeru.pdf

Alien1520349520764-Publication-Alien-ALR-F800-Conatel-Venezuela-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1520349520764-Publication-Alien-ALR-F800-Conatel-Venezuela-2016.pdf

Alien1520349487379-Certificate-Alien-ALR-F800-ATT-Bolivia-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1520349487379-Certificate-Alien-ALR-F800-ATT-Bolivia-2016.pdf

Alien1520349476928-Certificate-Alien-ALR-F800-ATT-Bolivia-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1520349476928-Certificate-Alien-ALR-F800-ATT-Bolivia-2016.pdf

Alien1520349400403-Certificate-Alien-ALR-F800-IRSEC-Uruguay-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1520349400403-Certificate-Alien-ALR-F800-IRSEC-Uruguay-2016.pdf

Alien1520349342607-Certificate-Alien-ALR-F800-ASEP-Panama-2016.pdf
https://orbiscompliance.s3.amazonaws.com/1520349342607-Certificate-Alien-ALR-F800-ASEP-Panama-2016.pdf

ASKEY1519663705127-Certificate-ASKEY-APD-WB12G12FA-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1519663705127-Certificate-ASKEY-APD-WB12G12FA-Lealtad%20Comercial-Argentina-2018.pdf

ASKEY1519660421847-Certificate Askey-APD-WB-24J12R-WB24J12FA-Lealtad Comercial-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1519660421847-Certificate%20Askey-APD-WB-24J12R-WB24J12FA-Lealtad%20Comercial-Argentina-2018.pdf

ASKEY1519415998456-Certificate-Askey-APD-F18L10-120yyySPAA-and others-Lealtad Comercial-Argentina-2018.pdf.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1519415998456-Certificate-Askey-APD-F18L10-120yyySPAA-and%20others-Lealtad%20Comercial-Argentina-2018.pdf.pdf

Askey1519055919229-Certificate-ASKEY-RTF8115VW-ENACOM-Argentina-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1519055919229-Certificate-ASKEY-RTF8115VW-ENACOM-Argentina-2018.pdf

ASKEY1519055649742-Certificate-ASKEY-RTF8115VW-ENACOM-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1519055649742-Certificate-ASKEY-RTF8115VW-ENACOM-Argentina-2018.pdf

Sony Interactive Entertainment Inc.1519046921762-Certificate-Sony-CUHYA-0081-CONATEL-Paraguay-2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1519046921762-Certificate-Sony-CUHYA-0081-CONATEL-Paraguay-2018.pdf

Sony Interactive Entertainment Inc.1518812973607-Certificate-Sony-CUHYA-0080-CONATEL-Paraguay-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1518812973607-Certificate-Sony-CUHYA-0080-CONATEL-Paraguay-2018.pdf

ASKEY1518707069618-Certificate Askey-APD-WB-24J12R-WB24J12FA-IRAM-Argentina-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1518707069618-Certificate%20Askey-APD-WB-24J12R-WB24J12FA-IRAM-Argentina-2018.pdf

Duracell1518550003748-Certificate-Duracel-Quantum AA & AAA-Bureau Veritas-2016.pdf
https://orbiscompliance.s3.amazonaws.com/1518550003748-Certificate-Duracel-Quantum%20AA%20%26%20AAA-Bureau%20Veritas-2016.pdf

Roku1518459435326-Certificate Roku 3910MX TELCOR Nicaragua 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459435326-Certificate%20Roku%203910MX%20TELCOR%20Nicaragua%202017.pdf

Roku1518459379653-CertificateRoku 3910MX SUTEL Costa Rica -2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459379653-CertificateRoku%203910MX%20SUTEL%20Costa%20Rica%20-2017.pdf

Roku1518459338833-Certifiacte Roku RC-AL2 TELCOR Nicaragua 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459338833-Certifiacte%20Roku%20RC-AL2%20TELCOR%20Nicaragua%202017.pdf

Roku1518459292027-Corrected Certificate Roku 3810MX & RC-AL2 SUTEL Costa Rica 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459292027-Corrected%20Certificate%20Roku%203810MX%20%26%20RC-AL2%20SUTEL%20Costa%20Rica%202017.pdf

Roku1518459239767-Certificate Roku 3810MX TELCOR Nicaragua 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459239767-Certificate%20Roku%203810MX%20TELCOR%20Nicaragua%202017.pdf

Sony1518459111010-Certificate Sony CUHYA-0080 SUBTEL Chile 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459111010-Certificate%20Sony%20CUHYA-0080%20SUBTEL%20Chile%202017.pdf

Duracell1518459020198-Certificate Lancaster - Qnt AA, US AA - CP 5862-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459020198-Certificate%20%20Lancaster%20-%20Qnt%20AA%2C%20US%20AA%20-%20CP%205862-2017.pdf

Duracell1518459006628-Certificate La Grange - AAA, 9V -CP 5863-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518459006628-Certificate%20La%20Grange%20-%20AAA%2C%209V%20-CP%205863-2017.pdf

Duracell1518458996686-Certificate GP, 9V - CP 5864-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458996686-Certificate%20GP%2C%209V%20-%20CP%205864-2017.pdf

Duracell1518458979341-Certificate Cleveland - C, D -CP 5865-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458979341-Certificate%20Cleveland%20-%20C%2C%20D%20-CP%205865-2017.pdf

Duracell1518458966068-Certificate China AA, AAA -CP 5681-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458966068-Certificate%20China%20AA%2C%20AAA%20-CP%205681-2017.pdf

Duracell1518458885988-PriceSmart Letter of Extension.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458885988-PriceSmart%20Letter%20of%20Extension.pdf

Duracell1518458864039-John Restreto Letter of Extension.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458864039-John%20Restreto%20Letter%20of%20Extension.pdf

Sony1518458788524-Certificate-Sony-CUHYA-0081-Telcor-Nicaragua-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458788524-Certificate-Sony-CUHYA-0081-Telcor-Nicaragua-2017.pdf

Sony1518458773457-Certificate-Sony-CUHYA-0080-Telcor-Nicaragua-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458773457-Certificate-Sony-CUHYA-0080-Telcor-Nicaragua-2017.pdf

Duracell1518458702776-Certificate-DDIBatteriesMexico-GEN2.0-NYCE-Mexico-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458702776-Certificate-DDIBatteriesMexico-GEN2.0-NYCE-Mexico-2017.pdf

Askey1518458532630-Certificate-ASKEY-RTV9015VW-Enacom-Argentina-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458532630-Certificate-ASKEY-RTV9015VW-Enacom-Argentina-2016.pdf

Askey1518458491092-Certificate-Askey-WA12M12FA-IRAM-Argentina-2017 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458491092-Certificate-Askey-WA12M12FA-IRAM-Argentina-2017%20.pdf

Duracell1518458429318-Certificate-DURACELL-9V-INTI-Argentina-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458429318-Certificate-DURACELL-9V-INTI-Argentina-2017.pdf

Duracell1518458192512-Certificate-John Restrepo-Alkaline Batteries-Bureau Veritas-Colombia 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458192512-Certificate-John%20Restrepo-Alkaline%20Batteries-Bureau%20Veritas-Colombia%202017.pdf

Duracell1518458127039-Certificate-Pricesmart-Alkalina Batteries- Bureau Veritas-Colombia-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458127039-Certificate-Pricesmart-Alkalina%20Batteries-%20Bureau%20Veritas-Colombia-2017.pdf

Duracell1518458051840-Certificate-Feduro-9V-Health Ministry-Costa Rica-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518458051840-Certificate-Feduro-9V-Health%20Ministry-Costa%20Rica-2017.pdf

Duracell1518457992889-Letter of Authorization Duracell Genomma Labs 2018.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457992889-Letter%20of%20Authorization%20Duracell%20Genomma%20Labs%202018.pdf

Duracell1518457864697-Certificate-Newsan-AA&AAA-INTI-Argentina-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457864697-Certificate-Newsan-AA%26AAA-INTI-Argentina-2016.pdf

Duracell1518457834373-Certificate-Newsan-C&D-INTI-Argentina-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457834373-Certificate-Newsan-C%26D-INTI-Argentina-2016.pdf

Duracell1518457799816-Certificate-Newsan-9V-INTI-Argentina-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457799816-Certificate-Newsan-9V-INTI-Argentina-2016.pdf

3M1518457594797-Letter of Clearance-3M-SX4-SIT-Guatemala-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457594797-Letter%20of%20Clearance-3M-SX4-SIT-Guatemala-2017.pdf

3M1518457557464-Certificate-3M-SX4-SUBTEL-Chile-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457557464-Certificate-3M-SX4-SUBTEL-Chile-2017.pdf

Scosche1518457501249-Certificate-Scosche-RTHM19-NYCE-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457501249-Certificate-Scosche-RTHM19-NYCE-2017.pdf

Alien1518457442544-Certificate-ALIEN-ALR-H450-Enacom-Argentina-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457442544-Certificate-ALIEN-ALR-H450-Enacom-Argentina-2017.pdf

Alien1518457396428-Certificate-Alien-ALR-F800-ENACOM-Argentina2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457396428-Certificate-Alien-ALR-F800-ENACOM-Argentina2017.pdf

HCT/Mitsubishi1518457302819-Certificate-Mitsubishi-NTG5.HUE-URSEC-Uruguay-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457302819-Certificate-Mitsubishi-NTG5.HUE-URSEC-Uruguay-2017.pdf

HCT/Mitsubishi1518457273549-Certificate-Mitsubishi-NTG5.5HUE-SUBTEL-Chile-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457273549-Certificate-Mitsubishi-NTG5.5HUE-SUBTEL-Chile-2017.pdf

HCT/Mitsubishi1518457243091-Certificate-Mitsubishi-NTG5.5HUE-Telecommunications-Barbados-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457243091-Certificate-Mitsubishi-NTG5.5HUE-Telecommunications-Barbados-2017.pdf

HCT/Mitsubishi1518457210694-Certificate-Mitsubishi-NTG5.5HUE-Conatel-Honduras-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457210694-Certificate-Mitsubishi-NTG5.5HUE-Conatel-Honduras-2017.pdf

HCT/Mitsubishi1518457167367-Publication-Mitsubishi-NTG5.5HUE-Conatel-Venezuela-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457167367-Publication-Mitsubishi-NTG5.5HUE-Conatel-Venezuela-2017.pdf

HCT/Mitsubishi1518457105496-Certificate-Mitsubishi-NTG5.5HUE-MinisterofTraffic-Curacao-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457105496-Certificate-Mitsubishi-NTG5.5HUE-MinisterofTraffic-Curacao-2017.pdf

HCT/Mitsubishi1518457053878-Amendment Certificate- Mitsubishi-NTG5.5HUE-Conatel-Paraguay-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518457053878-Amendment%20Certificate-%20Mitsubishi-NTG5.5HUE-Conatel-Paraguay-2017.pdf

Duracell/Roku1518456932959-Extended Certificate-Newsan:Juegos de Video Argentina-AA:AAA-INTI-Argentina2017 .pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518456932959-Extended%20Certificate-Newsan%3AJuegos%20de%20Video%20Argentina-AA%3AAAA-INTI-Argentina2017%20.pdf

Duracell1518456697348-Certificate-Duracell-Batteries-Bureau Veritas Colombia-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518456697348-Certificate-Duracell-Batteries-Bureau%20Veritas%20Colombia-2016.pdf

Duracell1518456330990-Certificate-Duracell-Alkaline AAA-Bureau Veritas-Colombia-2016.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518456330990-Certificate-Duracell-Alkaline%20AAA-Bureau%20Veritas-Colombia-2016.pdf

Duracell1518456261032-Certificate-Duracell-Alkaline AA-Bureau Veritas-Colombia-2016.pdf
https://orbiscompliance.s3.amazonaws.com/1518456261032-Certificate-Duracell-Alkaline%20AA-Bureau%20Veritas-Colombia-2016.pdf

DURACELL1518212921834-Certificate-Duracell-Batteries-BureauVeritas-Colombia-2016.pdf
https://orbiscompliance.s3.amazonaws.com/1518212921834-Certificate-Duracell-Batteries-BureauVeritas-Colombia-2016.pdf

ASKEY1518105267679-Certificate-ASKEY-APD-WB-12G12FA-IRAM-Argentina-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1518105267679-Certificate-ASKEY-APD-WB-12G12FA-IRAM-Argentina-2017.pdf

ROKU1516118062759-Certificate-Roku 3810Mx-Conatel-Honduras-2018.pdf
https://orbiscompliance.s3.amazonaws.com/1516118062759-Certificate-Roku%203810Mx-Conatel-Honduras-2018.pdf

Sony Interactive Entertainment Inc.1513627043563-Certificate SONY CUHYA-0081 Conatel Honduras 2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1513627043563-Certificate%20SONY%20CUHYA-0081%20Conatel%20Honduras%202017.pdf

Sony Interactive Entertainment Inc.1513626852041-Certificate- Sony CUHYA-0080- Conatel-Honduras-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1513626852041-Certificate-%20Sony%20CUHYA-0080-%20Conatel-Honduras-2017.pdf

ROKU1512505765152-Certificate-ROKU-3910MX-CONATEL-HONDURAS-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1512505765152-Certificate-ROKU-3910MX-CONATEL-HONDURAS-2017.pdf

ROKU1511800264437-Certificate-ROKU-RC-AL2-ASEP-Panama-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1511800264437-Certificate-ROKU-RC-AL2-ASEP-Panama-2017.pdf

DURACELL1511531179982-Certificate DURACELL-CEF14NA4-NYCE-MEXICO-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1511531179982-Certificate%20DURACELL-CEF14NA4-NYCE-MEXICO-2017.pdf

ROKU1511196224579-Certificate-ROKU-RC-AL2-CONATEL-Honduras-2017.pdf
https://orbiscompliance.s3.us-west-2.amazonaws.com/1511196224579-Certificate-ROKU-RC-AL2-CONATEL-Honduras-2017.pdf

ROKU1511193501449-Certificate-ROKU-3810MX:RC-AL2-SIGET-El Salvador-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1511193501449-Certificate-ROKU-3810MX%3ARC-AL2-SIGET-El%20Salvador-2017.pdf

ROKU1510672082842-Certificate-ROKU-3910MX-SIGET-El Salvador-2017.PDF
https://orbiscompliance.s3-us-west-2.amazonaws.com/1510672082842-Certificate-ROKU-3910MX-SIGET-El%20Salvador-2017.PDF

ROKU1510672070689-Certificate-ROKU-3910MX-SIGET-El Salvador-2017.PDF
https://orbiscompliance.s3-us-west-2.amazonaws.com/1510672070689-Certificate-ROKU-3910MX-SIGET-El%20Salvador-2017.PDF

SONY1510666715414-Certificate-SONY-CUHYA-0081-SUBTEL-CHILE-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1510666715414-Certificate-SONY-CUHYA-0081-SUBTEL-CHILE-2017.pdf

ROKU1510242156614-Certificate-ROKU 3910MX-ASEP-Panama-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1510242156614-Certificate-ROKU%203910MX-ASEP-Panama-2017.pdf

ROKU1510241823356-Certificate-ROKU-3810MX-ASEP-Panama-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1510241823356-Certificate-ROKU-3810MX-ASEP-Panama-2017.pdf

ASKEY1509721828434-Acta de homologacion RTV9025VW.pdf
https://orbiscompliance.s3.amazonaws.com/1509721828434-Acta%20de%20homologacion%20RTV9025VW.pdf

Sato1508337310251-Certificate Sato M-84Pro-2, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508337310251-Certificate%20%20Sato%20%20M-84Pro-2%2C%20NYCE%20Mexico%202017.pdf

Sato1508337117117-Certificate Sato CL6NX, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508337117117-Certificate%20%20Sato%20%20CL6NX%2C%20NYCE%20Mexico%202017.pdf

Sato1508336635769-Certificate Sato CL4NX, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508336635769-Certificate%20%20Sato%20%20CL4NX%2C%20NYCE%20Mexico%202017.pdf

Sato1508336349192-Certificate Sato CG408DT-LAN, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508336349192-Certificate%20%20Sato%20%20CG408DT-LAN%2C%20NYCE%20Mexico%202017.pdf

Sato1508335874147-Certificate Sato CG208DT-LAN, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508335874147-Certificate%20Sato%20CG208DT-LAN%2C%20NYCE%20Mexico%202017.pdf

u-blox1508335829360-Certificate Sato CG208DT-LAN, NYCE Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508335829360-Certificate%20Sato%20CG208DT-LAN%2C%20NYCE%20Mexico%202017.pdf

u-blox1508333972557-Certificate u-blox SARA-R410M, IFT Mexico 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1508333972557-Certificate%20%20u-blox%20SARA-R410M%2C%20IFT%20Mexico%202017.pdf

UBISENSE1508332233299-Certificate Ubisense UBIMOD30, IFT Mexico 2017.pdf
https://orbiscompliance.s3.amazonaws.com/1508332233299-Certificate%20Ubisense%20UBIMOD30%2C%20IFT%20Mexico%202017.pdf

ROKU Inc.1507925361563-Letter of Clearance-ROKU-3810MX-SIT-Guatemala-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1507925361563-Letter+of+Clearance-ROKU-3810MX-SIT-Guatemala-2017.pdf

ROKU Inc.1507921188710-Letter of Clearance-ROKU-3910MX-SIT-Guatemala-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1507921188710-Letter+of+Clearance-ROKU-3910MX-SIT-Guatemala-2017.pdf

ROKU Inc.1507920752536-Letter of Clerance-ROKU-3910MX-CRC-Colombia- 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1507920752536-Letter%20of%20Clerance-ROKU-3910MX-CRC-Colombia-%202017.pdf

ROKU Inc.1507917049084-Letter of Clearance-ROKU-3810MX-CRC-Colombia-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1507917049084-Letter%20of%20Clearance-ROKU-3810MX-CRC-Colombia-2017.pdf

Arista1507310629204-Certificate- Arista-.1RU-Anatel-Brazil-2017.pdf
https://orbiscompliance.s3.amazonaws.com/1507310629204-Certificate-%20Arista-.1RU-Anatel-Brazil-2017.pdf

Arista1507216035684-Certificate of Conformity-Arista-Anatel 00104141-Brazil 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1507216035684-Certificate%20of%20Conformity-Arista-Anatel%2000104141-Brazil%202017.pdf

Sony Interactive Entertainment Inc.1506450273481-Certificate- SONY-CUH-ZCT2U TELCOR-Nicaragua 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506450273481-Certificate-%20SONY-CUH-ZCT2U%20TELCOR-Nicaragua%202017.pdf

Sony Interactive Entertainment Inc.1506449935984-Certificate-SONY-CUH-ZCT2U-CONATEL-Paraguay- 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506449935984-Certificate-SONY-CUH-ZCT2U-CONATEL-Paraguay-%202017.pdf

Sony Interactive Entertainment Inc.1506448480337-Certificate SONY-CUH-ZCT2U-CONATEL-Honduras-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506448480337-Certificate%20SONY-CUH-ZCT2U-CONATEL-Honduras-2017.pdf

Sony Interactive Entertainment Inc.1506443184201-Certificate-SONY-CECH-ZCM2U-CONATEL-Paraguay- 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506443184201-Certificate-SONY-CECH-ZCM2U-CONATEL-Paraguay-%202017.pdf

Sony Interactive Entertainment Inc.1506442515032-Certificate-SONY-CECH-ZCM2U-TELCOR-Nicaragua-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506442515032-Certificate-SONY-CECH-ZCM2U-TELCOR-Nicaragua-2017.pdf

Sony Interactive Entertainment Inc.1506439018858-Certificate-SONY-CECH-ZCM2U-CONATEL-Honduras-2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506439018858-Certificate-SONY-CECH-ZCM2U-CONATEL-Honduras-2017.pdf

Sony Interactive Entertainment Inc.1506437752302-Certificate-SONY-CECH-ZCM2U-ATT-Boliva 2017.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506437752302-Certificate-SONY-CECH-ZCM2U-ATT-Boliva%202017.pdf

Sony Interactive Entertainment Inc.1506362000412-Certificate CUH-7115B Subtel Chile.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506362000412-Certificate%20CUH-7115B%20Subtel%20Chile.pdf

Sony Interactive Entertainment Inc.1506355940223-Certificate CUH-2115B Subtel Chile.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506355940223-Certificate%20CUH-2115B%20Subtel%20Chile.pdf

Sony Interactive Entertainment Inc.1506355901713-Certificate CUH-2115A Subtel Chile.pdf
https://orbiscompliance.s3.amazonaws.com/1506355901713-Certificate%20CUH-2115A%20Subtel%20Chile.pdf

TEST1506351961657-Archive.zip
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506351961657-Archive.zip

ASKEY COMPUTER CORPORATION1506351195217-Certificate TCG220-xGMTC PeruTRSS39856.pdf.pdf
https://orbiscompliance.s3-us-west-2.amazonaws.com/1506351195217-Certificate%20TCG220-xGMTC%20PeruTRSS39856.pdf.pdf

test1504730847575-Screen Shot 2017-09-06 at 12.20.41 PM.png
https://orbiscompliance.s3.amazonaws.com/1504730847575-Screen%20Shot%202017-09-06%20at%2012.20.41%20PM.png

