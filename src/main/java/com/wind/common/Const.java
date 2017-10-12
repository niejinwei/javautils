package com.wind.common;

import java.io.File;

/**
 * 常量字符集合
 * @author wind
 */
public interface Const {

    /**********************************************分隔符常量************************************************/

    String POINT_STR = ".";

    String BLANK_STR = "";

    String SPACE_STR = " ";

    String SYS_SEPARATOR = File.separator;

    String FILE_SEPARATOR = "/";

    /**********************************************日期时间常量************************************************/

    String DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    String DATE_STR = "yyyy-MM-dd";

    int SECOND = 1000;

    int MINUTE = 60 * SECOND;

    int HOUR = 60 * MINUTE;

    int DAY = 24 * HOUR;

    /**********************************************编码格式************************************************/

    String UTF8 = "UTF-8";


    /**********************************************加密格式************************************************/

    String MD5_KEY = "MD5";

    String SHA_KEY = "SHA1";

    String DES_KEY = "DES";

    String AES_KEY = "AES";


    /**********************************************正则表达式************************************************/

    String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    String PHONE_NUM = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

    /**中文正则表达式验证*/
    String CHINESE = "^[\u4e00-\u9fa5]*$";

    String NUMBER = "^[0-9]*$";

    String FLOAT = "^\\d+\\.\\d+$";

    String IDCARD = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{4}$";

    /**********************************************进制常量************************************************/

    /**十六进制常量*/
    String HEX_STR = "0123456789ABCDEF";


    /**********************************************文件后缀************************************************/

    String EXCEL_XLS = ".xls";

    String EXCEL_XLSX = ".xlsx";

    String IMAGE_PNG = "png";

    String IMAGE_JPG = "jpg";

    String FILE_ZIP = ".zip";
    String FILE_GZ = ".gz";


    /**********************************************io流************************************************/

    int BUFFER_1024 = 1024;

    String USER_DIR = "user.dir";

    /**********************************************tesseract for java语言字库************************************************/

    String ENG = "eng";

    String CHI_SIM = "chi_sim";

}