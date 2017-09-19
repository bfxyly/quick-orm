package kim.zkp.quick.orm.register;

import kim.zkp.quick.orm.sql.convert.FieldConvert;
import kim.zkp.quick.orm.sql.convert.FieldConvertProcessor;

/**
 * class       :  Register
 * @author     :  zhukaipeng
 * @version    :  1.0  
 * description :  通用组件注册类
 * @see        :                        
 */
public class QuickRegister {
	
	/**
	 * method name   : registerSqlBuilder 
	 * description   : 注册sql生成器
	 * @return       : void
	 * @param        : @param sBType
	 * @param        : @param sqlBuilder
	 * modified      : zhukaipeng ,  2017年8月21日 
	 * @see          : 
	 */
//	public static void registerSqlBuilder(SqlBuilder.SBType sBType,SqlBuilder sqlBuilder) {
//		SqlBuilderProcessor.registerSqlBuilder(sBType, sqlBuilder);
//	}
	/**
	 * method name   : registerConvert 
	 * description   : 注册类型转换器（java to db, db to java）
	 * @return       : void
	 * @param        : @param clzz
	 * @param        : @param ac
	 * modified      : zhukaipeng ,  2017年8月21日 
	 * @see          : 
	 */
	public static void registerConvert(Class<?> clzz,FieldConvert ac){
		FieldConvertProcessor.registerConvert(clzz, ac);
	}
}