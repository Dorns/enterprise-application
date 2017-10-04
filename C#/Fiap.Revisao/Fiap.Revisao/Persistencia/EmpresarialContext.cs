using Fiap.Revisao.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace Fiap.Revisao.Persistencia
{
    public class EmpresarialContext : DbContext
    {
        public DbSet<Funcionario> Funcionarios { get; set; }
        public DbSet<Empresa> Empresas { get; set; }
    }
}