package com.crudjspjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crudjspjava.bean.Usuario;

public class UsuarioDao {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjspjava", "aldecir", "123456");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Usuario> getAllUsuarios() {
		List<Usuario> list = new ArrayList<Usuario>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM usuario");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSobrenome(rs.getString("sobrenome"));;
				usuario.setSexo(rs.getString("sexo"));
				usuario.setPais(rs.getString("pais"));
				list.add(usuario);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

}
