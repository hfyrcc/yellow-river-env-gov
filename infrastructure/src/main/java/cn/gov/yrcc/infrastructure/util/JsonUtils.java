package cn.gov.yrcc.infrastructure.util;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.MapType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Json utils base on jackson
 *
 * @Author wylu
 * @Date 2023/2/20 下午 09:31
 */
@Slf4j
public class JsonUtils {

	private JsonUtils() {
		// privatization construction method
	}

	private static final ObjectMapper MAPPER = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
			.setSerializationInclusion(JsonInclude.Include.NON_NULL)
			.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);


	/**
	 * convert data to JsonNode with Jackson
	 *
	 * @param data
	 * @return
	 */
	public static JsonNode toJsonNode(String data) {
		try {
			return MAPPER.readTree(data);
		} catch (JsonProcessingException e) {
			log.error("[JsonUtils] toJsonNode() called with Params: data = {}, Error message = {}",
					data, ExceptionUtils.getStackTrace(e));
		}
		return null;
	}

	public static String toJsonString(Object object) {
		try {

			return MAPPER.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			log.error("[JsonUtils] toJsonString() called with Params: object = {}, Error message = {}",
					object, ExceptionUtils.getStackTrace(e));
		}
		return null;
	}

	/**
	 * create an empty ObjectNode
	 *
	 * @return
	 */
	public static ObjectNode createNode() {
		return MAPPER.createObjectNode();
	}

	/**
	 * convert json to specify bean
	 *
	 * @param json json
	 * @param clazz clazz
	 * @return T
	 * @param <T> generic
	 */
	public static <T> T toBean(String json, Class<T> clazz) {
		try {
			return MAPPER.readValue(json, clazz);
		} catch (JsonProcessingException e) {
			log.error("[JsonUtils] toBean() called with Params: json = {}, clazz = {}, Error message = {}",
					json, clazz, ExceptionUtils.getStackTrace(e));
		}
		return null;
	}

	/**
	 * convert json to List
	 *
	 * @param json
	 * @param clazz
	 * @return
	 * @param <T>
	 */
	public static <T> List<T> toList(String json, Class<T> clazz) {
		JavaType type = MAPPER.getTypeFactory().constructParametricType(List.class, clazz);
		try {
			return MAPPER.readValue(json, type);
		} catch (Exception e) {
			log.error("[JsonUtils] toList() called with Params: json = {}, clazz = {}, Error message = {}",
					json, clazz, ExceptionUtils.getStackTrace(e));
		}
		return Collections.emptyList();
	}

	/**
	 * convert json to map
	 *
	 * @param json
	 * @param keyClass
	 * @param valueClass
	 * @return
	 * @param <K>
	 * @param <V>
	 */
	public static <K, V> Map<K, V> toMap(String json, Class<K> keyClass, Class<V> valueClass) {
		MapType type = MAPPER.getTypeFactory().constructMapType(Map.class, keyClass, valueClass);
		try {
			return MAPPER.readValue(json, type);
		} catch (JsonProcessingException e) {
			log.error("[JsonUtils] toMap() called with Params: json = {}, keyClass = {}, valueClass = {}, " +
					"Error message = {}", json, keyClass, valueClass, ExceptionUtils.getStackTrace(e));
		}
		return Collections.emptyMap();
	}
}
