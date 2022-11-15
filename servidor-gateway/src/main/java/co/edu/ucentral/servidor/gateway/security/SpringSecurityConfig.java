package co.edu.ucentral.servidor.gateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SpringSecurityConfig {

	@Autowired
	private JwtAuthenticationFilter athenticatioFilter;
	
	@Bean
	public SecurityWebFilterChain configure(ServerHttpSecurity http) {
				return http.authorizeExchange()
						.pathMatchers("/api/security/oauth/**","/api/envio/**","/api/parametro/**","/api/oficina/**","/api/tarifa/**","/api/usuario/**","/api/tipo_producto/**","/api/categoria/**","/api/estado/**","/api/tipoDocumento/**",
								"/api/marca/**","/api/medioTransporte/**","/api/vehiculo/**","/api/ciudad/**","api/tipo_producto/**","/api/despachos/**").permitAll()
				//.pathMatchers(HttpMethod.POST,"/api/usuario/").permitAll()
				//.pathMatchers(HttpMethod.GET,"/api/envio/{id}","/api/tipoDocumento","/api/estado","/api/ciudad").permitAll()
				//.pathMatchers("/api/despachos/**","/api/envio/**").hasAnyRole("ADMIN","EMPLEADO")
				//.pathMatchers("/api/parametro/**","/api/oficina/**","/api/tarifa/**",
				//		"/api/usuario/**","/api/tipo_producto/**","/api/categoria/**","/api/estado/**","/api/tipoDocumento/**",
			//			"/api/marca/**").hasRole("ADMIN")
				.anyExchange()
				.authenticated()
				.and()
				.addFilterAt(athenticatioFilter, SecurityWebFiltersOrder.AUTHENTICATION)
				.csrf()
				.disable()
				.build();
	}
}
