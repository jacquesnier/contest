package ufc.quixada.npi.contest.util;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Constants {
	// LDAP - atributos presentes no arquivo application.properties
	public static final String LDAP_URL = "ldap.url";
	public static final String LDAP_BASE = "ldap.base";
	public static final String LDAP_USER = "ldap.user";
	public static final String LDAP_PASSWORD = "ldap.password";
	public static final String LDAP_OU = "ldap.ou";
	public static final String BASE = LDAP_URL;

	public static final String TEMPLATE_ADICIONAR_OU_EDITAR_EVENTO_ADMIN = "evento/admin_cadastrar";
	public static final String TEMPLATE_LISTAR_EVENTOS_ATIVOS_ADMIN = "evento/admin_lista_ativos";
	public static final String TEMPLATE_LISTAR_EVENTOS_INATIVOS_ADMIN = "evento/admin_lista_inativos";

	public static final String TEMPLATE_ATIVAR_EVENTO_ORG = "organizador/org_ativar_eventos";
	public static final String TEMPLATE_EDITAR_EVENTO_ORG = "organizador/org_editar_eventos";
	public static final String TEMPLATE_LISTAR_EVENTOS_ATIVOS_ORG = "organizador/org_eventos_listar_ativos";
	public static final String TEMPLATE_LISTAR_EVENTOS_INATIVOS_ORG = "organizador/org_eventos_listar_inativos";
	
	public static final String TEMPLATE_INDEX_AUTOR = "autor/autor_index";
	public static final String TEMPLATE_MEUS_TRABALHOS_AUTOR = "autor/autor_meus_trabalhos";
}