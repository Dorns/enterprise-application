using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace ProjetoFinalMVC.Models
{
    public class Empresa
    {
        public int EmpresaId { get; set; }

        [Required]
        public int Cnpj { get; set; }

        [Required]
        [StringLength(200, ErrorMessage = "Máximo de 200 Caracteres")]
        public string RazaoSocial { get; set; }

        //Relacionamento
        public List<Funcionario> Funcionarios { get; set; }
    }
}